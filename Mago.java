public class Mago extends Personagem
{
    //Criando um constructor para armazenar os atributos que serão passados
    public Mago(String nome, int level){
        super(nome, level); //Referenciando o constructor da classe mãe
    }
    
    public void usarHabilidade(){
        
        System.out.println("\nUsou a Habilidade: Bola de Fogo");
        System.out.println("*--------------------------------*\n");
    }
}
