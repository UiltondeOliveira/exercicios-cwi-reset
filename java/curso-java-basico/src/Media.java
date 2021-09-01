import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner dadosTeclado = new Scanner(System.in);

        System.out.println("Olá, iremos calcular a média e quatro notas que você digitar.");

        System.out.println("Digite a primeira nota: ");
        double nota1 = dadosTeclado.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double  nota2 = dadosTeclado.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = dadosTeclado.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = dadosTeclado.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média calculada é: " + media);


    }
}
