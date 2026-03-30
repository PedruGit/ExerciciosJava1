// Faça um programa que solicite ao usuário o seu primeiro  nome, seu nome do meio, seu sobrenome, sua idade e depois imprima todos estes dados.

import java.util.Scanner;
public class C04ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu primeiro nome: ");
        String primeiroNome = teclado.nextLine();
        System.out.print("Digite seu nome do meio: ");
        String nomeMeio = teclado.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = teclado.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();

        System.out.println("Seu nome completo é " + primeiroNome + " " + nomeMeio + " " + sobrenome);
        System.out.println("E você tem " + idade + " anos");
        teclado.close();
    }
}