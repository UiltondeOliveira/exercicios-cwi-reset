import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner dadosTeclado = new Scanner(System.in);

        System.out.println("Olá, vamos calcular o seu salário do mês de acordo com a quantidade de horas trabalhadas.");

        System.out.println("Quanto você recebe por hora trabalhada? ");
        double valorPorHora = dadosTeclado.nextDouble();
        System.out.println("Quantas horas você trabalhou no mês? ");
        double horasTrabalhadas = dadosTeclado.nextDouble();

        double salario = valorPorHora * horasTrabalhadas;

        System.out.println("Seu salário é R$ " + salario);

    }
}
