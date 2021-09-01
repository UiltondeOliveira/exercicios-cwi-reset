import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
        Scanner dadosTeclado = new Scanner(System.in);

        System.out.println("Olá, vamos calcular a média final do aluno e saber se ele foi aprovado ou não.");

        System.out.println("Digite a primeira nota: ");
        double nota1 = dadosTeclado.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = dadosTeclado.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = dadosTeclado.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = dadosTeclado.nextDouble();

        double resultado = (nota1 + nota2 + nota3 + nota4) / 4;

        if (resultado == 10.0) {
            System.out.println("Aluno aprovado com louvores");
        } else if (resultado >= 7.0) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}