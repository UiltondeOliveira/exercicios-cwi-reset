package com.uilton.cursojava;

import java.awt.*;
import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

/*      System.out.println("Digite seu nome compelto: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);*/

/*        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);*/

/*        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade + " anos");*/

/*        System.out.println("Digite a sua altura: ");
        double altura = Double.parseDouble(scan.next());
        System.out.println("Sua altura é: " + altura + " m");*/

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e tem animal de estimação");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = Float.parseFloat(scan.next());
        boolean temPet = scan.nextBoolean();

        System.out.println("Você digitou os seguintes valores:");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura + "m");
        System.out.println("Tem pet?  " + temPet);





    }
}
