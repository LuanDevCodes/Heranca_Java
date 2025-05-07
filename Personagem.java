public abstract class Personagem
{
    private String nome;
    private int level;
    
    //Criando um constructor para armazenar os dados dos personagens
    //Sem ele mesmo que eu tenha os atributos, eles não são usados
    public Personagem(String nome, int level){
        this.nome = nome;
        this.level = level;
    }
    
    public abstract void usarHabilidade();
    
    public void exibirStatus(){
        
        System.out.println("\n*--------------------------------*");
        System.out.println("Nome: " + nome);
        System.out.println("Level: " + level);
    }
}
