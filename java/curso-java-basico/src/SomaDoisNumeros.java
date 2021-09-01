import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner dadosTeclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = dadosTeclado.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = dadosTeclado.nextInt();

        int resultado = primeiroNumero + segundoNumero;
        System.out.println("A somma é: " + resultado);

    }
}
