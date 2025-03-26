public class Personagem {

    public String nome;
    public int vida;
    public int forcaAtaqueMagico;
    public int forcaAtaqueFisico;

    public void atacar(){
        System.out.println("Atacar! " + this.nome);
    }

    public void movimentar(){
        System.out.println("Movimentar!");
    }

}