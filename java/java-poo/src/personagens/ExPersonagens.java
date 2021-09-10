package personagens;

public class ExPersonagens {
    public static void main(String[] args) {

    /*
        Personagens[] personagem = new Personagens[2];
        System.out.println("Teste Mário");
        System.out.println("-------------------------------------------");
        personagem[0] = new Personagens("Mario",40,1.60);
        System.out.println("-------------------------------------------");
        System.out.println("");
        System.out.println("Teste Luigi");
        System.out.println("-------------------------------------------");
        personagem[1] = new Personagens("Luigi",40,1.80);
        System.out.println("-------------------------------------------");
    */
        Personagens jogador1 = new Personagens("Mario",40,1.60);
        Personagens jogador2  = new Personagens("Luigi",40,1.80);


        Jogo jogo = new Jogo(jogador1,jogador2);
        //jogo.imprimirDados();
        jogo.jogar();


    }
}
