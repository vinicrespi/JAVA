/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exemploclasse;

import javax.swing.JOptionPane;

/**
 *
 * @author 110000827
 */
public class ObjPessoa {

    public static void main(String[] args) {
		// TODO Auto-generated method stub


		//criando objeto do tipo pessoa
		Pessoa p = new Pessoa();

		//atribuindo valor para os atributos através dos métodos
		p.setRG(Integer.parseInt(JOptionPane.showInputDialog("Digite o seu RG")));
		p.setNome(JOptionPane.showInputDialog("Digite o seu nome"));
		p.setIdade( Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade")));
		p.setSexo(JOptionPane.showInputDialog("Digite o seu sexo (M para masculino e F para feminino)"));


	JOptionPane.showMessageDialog(null, "O nome da pessoa é "+p.getNome()+"\n O Rg é "+p.getRg()+"\n A idade é "+p.getIdade()+"\n e o sexo é "+p.getSexo()+"");
        JOptionPane.showMessageDialog(null, p.MaiorIdade());
	}

}
