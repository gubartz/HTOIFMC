public class JogoLOL {

    public static void main(String[] args) {
        Personagem p1 = new Personagem();
        p1.nome = "Yasuo";
        p1.vida = 100;
        p1.forcaAtaqueMagico = 1;
        p1.forcaAtaqueFisico = 50;

        p1.atacar();

        Personagem p2 = new Personagem();
        p2.nome = "Veigar";
        p2.vida = 100;
        p2.forcaAtaqueMagico = 50;
        p2.forcaAtaqueFisico = 1;        

        p2.atacar();
    }

}