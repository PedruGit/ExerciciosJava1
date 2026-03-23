// Faça um programa que solicite ao usuário o seu primeiro  nome, seu nome do meio, seu sobrenome, sua idade e depois imprima todos estes dados.

import java.util.Scanner;
public class C04ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite seu nome do meio: ");
        String nome2 = teclado.nextLine();
        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = teclado.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = teclado.nextInt();

        System.out.print("O seu nome completo é: " + nome + " " + nome2 + " " + sobrenome + " e você tem " + idade + " anos");
        teclado.close();
    }
}
