import javax.swing.JOptionPane;


public class ObjetoPessoa {
	public static void main(String[] args) {
		Pessoa person = new Pessoa();
		person.setRg(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o RG da pessoa:")));
		person.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade da pessoa:")));
		person.setNome(JOptionPane.showInputDialog(null, "Infome o nome:"));
		person.setEndereco(JOptionPane.showInputDialog(null, "Informe o Endere�o da pessoa:"));
		person.setSexo(JOptionPane.showInputDialog(null, "Informe o sexo da pessoa:"));
		JOptionPane.showMessageDialog(null, "O RG da pessoa e : "+person.getRg());
		JOptionPane.showMessageDialog(null, "A idade da pessoa �: "+person.getIdade());
		JOptionPane.showMessageDialog(null, "O nome do cara e : "+person.getNome());
		JOptionPane.showMessageDialog(null, "O endre�o da pessoa �:\n"+person.getEndereco());
		JOptionPane.showMessageDialog(null, "O sexo do cara e : "+person.getSexo());
		JOptionPane.showMessageDialog(null, person.MaiorIdade());
	}

}
