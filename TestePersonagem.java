public class TestePersonagem
{
    public static void main(String[] args){
        
        Personagem[] personagens = new Personagem[3];
        
        personagens[0] = new Arqueiro("Legolas", 1000);
        personagens[1] = new Guerreiro("Arthur Morgan", 36);
        personagens[2] = new Mago("Patolino, O Mago", 100);
        
        //Classe, variável que vai acumular os dados e a lista
        for(Personagem personagem : personagens){
            
            personagem.exibirStatus();
            personagem.usarHabilidade();
        }
    }
}
