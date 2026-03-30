// Faça um programa que solicite ao usuário o seu nome, CPF, endereço, telefone, salário e o nome da empresa em que trabalha, e depois imprima a sua FICHA FUNCIONAL.
// UTILIZE CAIXAS DE DIÁLOGO PARA A SAÍDA DE DADOS.

import javax.swing.JOptionPane;
public class C04ex05 {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite seu nome completo:");
        String cpf = JOptionPane.showInputDialog("Digite seu CPF:");
        String endereco = JOptionPane.showInputDialog("Digite seu endereço:");
        String telefone = JOptionPane.showInputDialog("Digite seu telefone:");
        String salarioTexto = JOptionPane.showInputDialog("Digite seu salário:");
        String empresa = JOptionPane.showInputDialog("Digite o nome da empresa:");
        double salario = Double.parseDouble(salarioTexto.replace(",", "."));

        String ficha = "--- FICHA FUNCIONAL ---\n\n" +
                "NOME: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "ENDEREÇO: " + endereco + "\n" +
                "TELEFONE: " + telefone + "\n" +
                "EMPRESA: " + empresa + "\n" +
                "SALÁRIO: R$" + String.format("%.2f", salario);
        JOptionPane.showMessageDialog(null, ficha, "Cadastro de Funcionário", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}