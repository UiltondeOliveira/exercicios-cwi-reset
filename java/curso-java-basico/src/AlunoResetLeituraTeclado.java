import java.util.Scanner;

public class AlunoResetLeituraTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Olá, digite o seu nome por favor: ");
        String nome = scan.next();
        System.out.println("Sou aluno do Level 1 do CWI Reset! Me chamo " + nome);
    }
}
