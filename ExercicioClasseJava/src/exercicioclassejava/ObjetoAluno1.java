/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioclassejava;

/**
 *
 * @author 110000636
 */
import javax.swing.JOptionPane;

public class ObjetoAluno1 {

 public static void main(String[] args) {
 Aluno person = new Aluno();

 person.setNome(JOptionPane.showInputDialog(null, "Infome o nome: "));
 person.setNota1(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Nota 1: ")););

}
}
