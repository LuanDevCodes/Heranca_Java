public class Guerreiro extends Personagem
{
    //Criando um constructor para armazenar os atributos que serão passados
    public Guerreiro(String nome, int level){
        super(nome, level); //Referenciando o constructor da classe mãe
    }

    public void usarHabilidade(){
        
        System.out.println("\nUsou a Habilidade: Golpe de Espada");
        System.out.println("*--------------------------------*\n");
    }
}
