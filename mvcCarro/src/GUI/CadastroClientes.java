/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadastroClientes.java
 *
 * Created on 21/06/2012, 16:07:48
 */

package GUI;

import BO.ClientesBO;
import DTO.ClientesDTO;
import com.sun.org.apache.xpath.internal.operations.Equals;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.DataUtil;

/**
 *
 * @author 110000636
 */
public class CadastroClientes extends javax.swing.JFrame {

    List<ClientesDTO> listObj = new ArrayList<ClientesDTO>();
    ClientesBO clientesBO;

    /** Creates new form CadastroClientes */
    public CadastroClientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        clientesBO = new ClientesBO();
        listObj = clientesBO.PesquisarTodos();
        if(listObj.size() > 0)
            carregarTela(listObj.get(0));
    }

    public ClientesDTO carregarDTO(){
        ClientesDTO clientesDTO = new ClientesDTO();
        if("".equals(jTextField1.getText()))
            clientesDTO.setCli_cod(0);
        else
            clientesDTO.setCli_cod(Integer.parseInt(jTextField1.getText()));
        clientesDTO.setCli_nome(jTextField2.getText());
        clientesDTO.setCli_end(jTextField3.getText());
        clientesDTO.setCli_bairro(jTextField4.getText());
        clientesDTO.setCli_cidade(jTextField5.getText());
        clientesDTO.setCli_cep(jTextField6.getText());
        clientesDTO.setCli_uf(jComboBox2.getSelectedItem().toString());
        clientesDTO.setCli_fone(jTextField7.getText());
        clientesDTO.setCli_email(jTextField8.getText());
        try{
            clientesDTO.setCli_datanasc(DataUtil.StringParaData(jTextField9.getText()));
        }catch(ParseException ex){
            Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);

        }
        if("Masculino".equals(jComboBox1.getSelectedItem().toString()))
                clientesDTO.setCli_sexo("M");
        else
            clientesDTO.setCli_sexo("F");
        return clientesDTO;

    }

    public void carregarTela(ClientesDTO clientesDTO){
        jTextField1.setText(String.valueOf(clientesDTO.getCli_cod()));
        jTextField2.setText(clientesDTO.getCli_nome());
        jTextField3.setText(clientesDTO.getCli_end());
        jTextField4.setText(clientesDTO.getCli_bairro());
        jTextField5.setText(clientesDTO.getCli_cidade());
        jTextField6.setText(clientesDTO.getCli_cep());
        jComboBox2.setSelectedItem(clientesDTO.getCli_uf());
        jTextField7.setText(clientesDTO.getCli_fone());
        jTextField8.setText(clientesDTO.getCli_email());
        jTextField9.setText(DataUtil.DiaMesAnoStringBarra(clientesDTO.getCli_datanasc()));
        if("M".equals(clientesDTO.getCli_sexo()))
            jComboBox1.setSelectedItem("Masculino");
        else
            jComboBox1.setSelectedItem("Feminino");

    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jbtnNovo = new javax.swing.JButton();
        jbtnProximo = new javax.swing.JButton();
        jbtnUltimo1 = new javax.swing.JButton();
        jtbnPrimeiro = new javax.swing.JButton();
        jbtnAnterior = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField9 = new javax.swing.JTextField();
        jbtnSalvar = new javax.swing.JButton();
        jbtnExcluir = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código");

        jLabel2.setText("Nome");

        jLabel3.setText("Endereço");

        jLabel4.setText("Bairro");

        jLabel5.setText("Cidade");

        jLabel6.setText("CEP");

        jLabel7.setText("Telefone");

        jLabel8.setText("E-mail");

        jLabel9.setText("Data de Nascimento");

        jLabel10.setText("Sexo");

        jTextField1.setEnabled(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));

        jbtnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo.png"))); // NOI18N
        jbtnNovo.setText("Novo");
        jbtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNovoActionPerformed(evt);
            }
        });

        jbtnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/proximo.png"))); // NOI18N
        jbtnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnProximoActionPerformed(evt);
            }
        });

        jbtnUltimo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ultimo.png"))); // NOI18N
        jbtnUltimo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUltimo1ActionPerformed(evt);
            }
        });

        jtbnPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/primeiro.png"))); // NOI18N
        jtbnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnPrimeiroActionPerformed(evt);
            }
        });

        jbtnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anterior.png"))); // NOI18N
        jbtnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAnteriorActionPerformed(evt);
            }
        });

        jLabel11.setText("UF");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SC", "PR", "SP", "RS", "BA", "MG", "GO", "DF" }));

        jbtnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        jbtnSalvar.setText("Salvar");
        jbtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalvarActionPerformed(evt);
            }
        });

        jbtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exlcuir.jpg"))); // NOI18N
        jbtnExcluir.setText("Excluir");
        jbtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExcluirActionPerformed(evt);
            }
        });

        jbtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtbnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnUltimo1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(202, 202, 202)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)))))
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnExcluir)
                        .addGap(125, 125, 125))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jbtnUltimo1, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                        .addComponent(jtbnPrimeiro, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnAnterior, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnProximo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNovoActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jComboBox2.setSelectedItem("SC");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jComboBox1.setSelectedItem("Masculino");
    }//GEN-LAST:event_jbtnNovoActionPerformed

    private void jbtnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProximoActionPerformed
       if(!"".equals(jTextField1.getText())){
        int codigo = Integer.parseInt(jTextField1.getText());
        for(int x = 0; x < listObj.size(); x++)
            if(listObj.get(x).getCli_cod() == codigo){
                if(x + 1 < listObj.size()){
                    carregarTela(listObj.get(x + 1));
                }
            }
    }

}//GEN-LAST:event_jbtnProximoActionPerformed

    private void jtbnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnPrimeiroActionPerformed
     if(listObj.size() > 0)
            carregarTela(listObj.get(0));
}//GEN-LAST:event_jtbnPrimeiroActionPerformed

    private void jbtnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAnteriorActionPerformed

        if(!"".equals(jTextField1.getText())){
        int codigo = Integer.parseInt(jTextField1.getText());
        for(int x = 0; x < listObj.size(); x++)
            if(listObj.get(x).getCli_cod() == codigo){
                if(x - 1 >= 0){
                    carregarTela(listObj.get(x - 1));
                }
            }
        }
}//GEN-LAST:event_jbtnAnteriorActionPerformed

    private void jbtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalvarActionPerformed
        if(!"".equals(jTextField1.getText())) {
            clientesBO = new ClientesBO();
            clientesBO.alterar(carregarDTO());
        } else {
            clientesBO = new ClientesBO();
            clientesBO.inserir(carregarDTO());
            clientesBO = new ClientesBO();
            listObj = clientesBO.PesquisarTodos();
            carregarTela(listObj.get(listObj.size() - 1));
        }
        clientesBO = new ClientesBO();
        listObj = clientesBO.PesquisarTodos();

    }//GEN-LAST:event_jbtnSalvarActionPerformed

    private void jbtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExcluirActionPerformed
        Object[] options = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null, "Confirmar exclusão do resgistro?", "Aviso de exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if(i == JOptionPane.YES_OPTION) {
            if(!"".equals(jTextField1.getText())) {
                clientesBO = new ClientesBO();
                clientesBO.excluir(carregarDTO());
            }
            listObj = clientesBO.PesquisarTodos();
            if(listObj.size() == 0) {
                JOptionPane.showMessageDialog(null, "Não existem dados cadastrados", "Aviso", JOptionPane.PLAIN_MESSAGE);
            } else{
                carregarTela(listObj.get(0));
            }
        } else {
            JOptionPane.showConfirmDialog(null, "Registro não será excluido", "Aviso", JOptionPane.PLAIN_MESSAGE);
        }
}//GEN-LAST:event_jbtnExcluirActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        if(listObj.size() > 0)
            carregarTela(listObj.get(0));
}//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnUltimo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUltimo1ActionPerformed
                 if(listObj.size() > 0)
            carregarTela(listObj.get(listObj.size() - 1));
}//GEN-LAST:event_jbtnUltimo1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton jbtnAnterior;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnExcluir;
    private javax.swing.JButton jbtnNovo;
    private javax.swing.JButton jbtnProximo;
    private javax.swing.JButton jbtnSalvar;
    private javax.swing.JButton jbtnUltimo;
    private javax.swing.JButton jbtnUltimo1;
    private javax.swing.JButton jtbnPrimeiro;
    // End of variables declaration//GEN-END:variables

}
