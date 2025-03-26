public class JogoLOL {

    public static void main(String[] args) {
        Personagem p1 = new Personagem();
        p1.nome = "p1";
        p1.vida = 100;
        p1.forcaAtaqueMagico = 1;
        p1.forcaAtaqueFisico = 50;

        p1.atacar();
    }

}