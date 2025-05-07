public class Arqueiro extends Personagem
{
    //Criando um constructor para armazenar os atributos que serão passados
    public Arqueiro(String nome, int level){
        super(nome, level); //Referenciando o constructor da classe mãe
    }
    
    public void usarHabilidade(){
        
        System.out.println("\nUsou a Habilidade: Flecha Veloz");
        System.out.println("*--------------------------------*\n");
    }
}
