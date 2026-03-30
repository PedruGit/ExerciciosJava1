// A Secretaria do Meio Ambiente mediu a quantidade de poluentes atmosféricos emitidos por uma empresa. Dependendo do valor obtido, a empresa foi multada em? Faça um programa que monte esta tabela, solicitando as informações variáveis (xxx) para o usuário:

import java.util.Scanner;
public class C04ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Configuração da Tabela de Multas ---");

        System.out.print("Digite o primeiro limite de poluente: ");
        double limite1 = teclado.nextDouble();
        System.out.print("Digite o segundo limite de poluente: ");
        double limite2 = teclado.nextDouble();
        System.out.print("Digite o valor da multa para até o 1º limite: R$ ");
        double multa1 = teclado.nextDouble();
        System.out.print("Digite o valor da multa para o intervalo entre limites: R$ ");
        double multa2 = teclado.nextDouble();
        System.out.print("Digite o valor da multa por poluente acima do 2º limite: R$ ");
        double multaPorPoluente = teclado.nextDouble();

        System.out.println(" -----Quantidade de Poluente Emitido x Valor da Multa----- ");
        System.out.printf("Até %.2f multa de R$ %.2f\n", limite1, multa1);
        System.out.printf("Entre %.2f e %.2f multa de R$ %.2f\n", limite1, limite2, multa2);
        System.out.printf("Acima de %.2f multa de R$ %.2f por poluente emitido\n", limite2, multaPorPoluente);
        teclado.close();
    }
}