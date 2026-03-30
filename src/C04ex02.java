// Faça um programa que solicite ao usuário o seu nome, CPF, endereço, telefone, salário e o nome da empresa em que trabalha, e depois imprima a sua FICHA FUNCIONAL.

import java.util.Scanner;
public class C04ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- SISTEMA DE CADASTRO FUNCIONAL ---");

        System.out.print("Digite seu nome completo: ");
        String nome = teclado.nextLine();
        System.out.print("Digite seu CPF: ");
        String cpf = teclado.nextLine();
        System.out.print("Digite seu endereço: ");
        String endereco = teclado.nextLine();
        System.out.print("Digite seu telefone: ");
        String telefone = teclado.nextLine();
        System.out.print("Digite o nome da empresa: ");
        String empresa = teclado.nextLine();
        System.out.print("Digite seu salário: ");
        double salario = teclado.nextDouble();

        System.out.println(" -----FICHA FUNCIONAL----- ");
        System.out.println("NOME:      " + nome);
        System.out.println("CPF:       " + cpf);
        System.out.println("ENDEREÇO:  " + endereco);
        System.out.println("TELEFONE:  " + telefone);
        System.out.println("EMPRESA:   " + empresa);
        System.out.println("SALÁRIO:   R$" + salario);
        teclado.close();
    }
}