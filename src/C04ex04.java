// Faça um programa que solicite ao usuário o seu primeiro  nome, seu nome do meio, seu sobrenome, sua idade e depois imprima todos estes dados.
// UTILIZE CAIXAS DE DIÁLOGO PARA INTERAÇÃO COM  O USUÁRIO

import javax.swing.JOptionPane;
public class C04ex04 {
    public static void main(String[] args) {

        String primeiroNome = JOptionPane.showInputDialog("Digite seu primeiro nome:");
        String nomeMeio = JOptionPane.showInputDialog("Digite seu nome do meio:");
        String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome:");
        String idadeAux = JOptionPane.showInputDialog("Digite sua idade:");
        int idade = Integer.parseInt(idadeAux);

        String mensagem = "--- FICHA PESSOAL ---\n" +
                "Seu nome completo é " + primeiroNome + " " + nomeMeio + " " + sobrenome + "\n" +
                "E você tem " + idade + " anos";
        JOptionPane.showMessageDialog(null, mensagem);
        System.exit(0);
    }
}