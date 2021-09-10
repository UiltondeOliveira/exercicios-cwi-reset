package personagens;

import java.util.Random;

public class Jogo {
    //Atributos
    private Personagens jogador1;
    private Personagens jogador2;

    //Métodos

    public Jogo(Personagens jogador1, Personagens jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public void imprimirDados() {
        System.out.println("Jogador 01");
        System.out.println("===================================");
        this.jogador1.status();
        System.out.println("");
        System.out.println("Jogador 02");
        System.out.println("===================================");
        this.jogador2.status();

    }

    public void jogar() {
        Random aleatorio = new Random();

        int moedasColetadasJogador01 = aleatorio.nextInt(30);
        for (int i = 0; i < moedasColetadasJogador01; i++) {
        this.jogador1.coletarMoeda();
        }

        int moedasColetadasJogador02 = aleatorio.nextInt(30);
        for (int i = 0; i < moedasColetadasJogador02; i++) {
            this.jogador2.coletarMoeda();
        }
        System.out.println("O jogador 01 coletou moedas " + moedasColetadasJogador01 + " vezes");
        this.jogador1.status();
        System.out.println("");
        System.out.println("O jogador 02 coletou moedas " + moedasColetadasJogador02 + " vezes");
        this.jogador2.status();

    }
}
