/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadastroFuncionario.java
 *
 * Created on 31/05/2012, 16:36:00
 */

package GUI;

import BO.FuncionariosBO;
import DTO.FuncionariosDTO;
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
public class CadastroFuncionario extends javax.swing.JFrame {

    List<FuncionariosDTO> listObj = new ArrayList<FuncionariosDTO>();
    FuncionariosBO funcionariosBO;

    /** Creates new form CadastroFuncionario */
    public CadastroFuncionario() {
        initComponents();
        this.setLocationRelativeTo(null);
        funcionariosBO = new FuncionariosBO();
        listObj = funcionariosBO.PesquisarTodos();
        if(listObj.size() > 0)
            carregarTela(listObj.get(0));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    public FuncionariosDTO carregarDTO(){
        FuncionariosDTO funcionariosDTO = new FuncionariosDTO();
        if("".equals(jtxfCod.getText()))
            funcionariosDTO.setFunc_cod(0);
        else
                funcionariosDTO.setFunc_cod(Integer.parseInt(jtxfCod.getText()));
        funcionariosDTO.setFunc_nome(jtxfNome.getText());
        funcionariosDTO.setFunc_end(jtxfEnd.getText());
        funcionariosDTO.setFunc_bairro(jtxfBairro.getText());
        funcionariosDTO.setFunc_cidade(jtxfCid.getText());
        funcionariosDTO.setFun_cep(jtxfCep.getText());
        funcionariosDTO.setFun_uf(jCBUf.getSelectedItem().toString());
        funcionariosDTO.setFunc_fone(jtxfFone.getText());
        funcionariosDTO.setFunc_email(jtxfMail.getText());
            try{
                funcionariosDTO.setFunc_datanasc(DataUtil.StringParaData(jtxfNasc.getText()));
            }catch(ParseException ex){
                Logger.getLogger(CadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
            }
            if("Masculino".equals(jCBSexo.getSelectedItem().toString()))
                funcionariosDTO.setFunc_sexo("M");
            else
                funcionariosDTO.setFunc_sexo("F");
            
        return funcionariosDTO;


    }

    public void carregarTela(FuncionariosDTO funcionariosDTO){
        jtxfCod.setText(String.valueOf(funcionariosDTO.getFunc_cod()));
        jtxfNome.setText(funcionariosDTO.getFunc_nome());
        jtxfEnd.setText(funcionariosDTO.getFunc_end());
        jtxfBairro.setText(funcionariosDTO.getFunc_bairro());
        jtxfCid.setText(funcionariosDTO.getFunc_cidade());
        jtxfCep.setText(funcionariosDTO.getFun_cep());
        jCBUf.setSelectedItem(funcionariosDTO.getFun_uf());
        jtxfFone.setText(funcionariosDTO.getFunc_fone());
        jtxfMail.setText(funcionariosDTO.getFunc_email());
        jtxfNasc.setText(DataUtil.DiaMesAnoStringBarra(funcionariosDTO.getFunc_datanasc()));
    if("M".equals(funcionariosDTO.getFunc_sexo()))
        jCBSexo.setSelectedItem("Masculino");
    else
        jCBSexo.setSelectedItem("Feminino");

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblCod = new javax.swing.JLabel();
        jlblNome = new javax.swing.JLabel();
        jtxfCod = new javax.swing.JTextField();
        jtxfNome = new javax.swing.JTextField();
        jlblEnd = new javax.swing.JLabel();
        jlblBairro = new javax.swing.JLabel();
        jlblCid = new javax.swing.JLabel();
        jlblCep = new javax.swing.JLabel();
        jlblFone = new javax.swing.JLabel();
        jlblMail = new javax.swing.JLabel();
        jlblNasc = new javax.swing.JLabel();
        jlblSexo = new javax.swing.JLabel();
        jtxfEnd = new javax.swing.JTextField();
        jtxfFone = new javax.swing.JTextField();
        jtxfCep = new javax.swing.JTextField();
        jtxfCid = new javax.swing.JTextField();
        jtxfBairro = new javax.swing.JTextField();
        jtxfMail = new javax.swing.JTextField();
        jtxfNasc = new javax.swing.JTextField();
        jlblUf = new javax.swing.JLabel();
        jtbnPrimeiro = new javax.swing.JButton();
        jbtnAnterior = new javax.swing.JButton();
        jbtnProximo = new javax.swing.JButton();
        jbtnUltimo = new javax.swing.JButton();
        jCBUf = new javax.swing.JComboBox();
        jCBSexo = new javax.swing.JComboBox();
        jbtnNovo = new javax.swing.JButton();
        jbtnSalvar = new javax.swing.JButton();
        jbtnExcluir = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblCod.setText("Código:");

        jlblNome.setText("Nome:");

        jtxfCod.setEditable(false);

        jlblEnd.setText("Endereço:");

        jlblBairro.setText("Bairro:");

        jlblCid.setText("Cidade:");

        jlblCep.setText("CEP:");

        jlblFone.setText("Telefone:");

        jlblMail.setText("E-mail:");

        jlblNasc.setText("Data de Nascimento:");

        jlblSexo.setText("Sexo:");

        jlblUf.setText("UF:");

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

        jbtnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/proximo.png"))); // NOI18N
        jbtnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnProximoActionPerformed(evt);
            }
        });

        jbtnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ultimo.png"))); // NOI18N
        jbtnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUltimoActionPerformed(evt);
            }
        });

        jCBUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MG", "PA", "SP", "PR", "RS", "SC" }));

        jCBSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));

        jbtnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo.png"))); // NOI18N
        jbtnNovo.setText("Novo");
        jbtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNovoActionPerformed(evt);
            }
        });

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
                        .addComponent(jlblCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxfCod, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtbnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlblNome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtxfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlblEnd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtxfEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlblBairro)
                            .addGap(18, 18, 18)
                            .addComponent(jtxfBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlblMail)
                            .addGap(18, 18, 18)
                            .addComponent(jtxfMail, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlblNasc)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtxfNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jlblFone)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlblCid)
                                .addComponent(jlblCep))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxfCid, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtxfFone, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtxfCep, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                                    .addComponent(jlblUf)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCBUf, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlblSexo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(77, 77, 77))))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jbtnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnSalvar)
                .addGap(6, 6, 6)
                .addComponent(jbtnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxfCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jbtnUltimo, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                        .addComponent(jtbnPrimeiro, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnAnterior, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnProximo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE))
                    .addComponent(jlblCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNome)
                    .addComponent(jtxfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblEnd)
                    .addComponent(jtxfEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblBairro)
                    .addComponent(jtxfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblCid)
                    .addComponent(jtxfCid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblCep)
                            .addComponent(jtxfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblFone)
                            .addComponent(jtxfFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblUf)
                        .addComponent(jCBUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblMail)
                    .addComponent(jtxfMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblNasc)
                    .addComponent(jtxfNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSexo)
                    .addComponent(jCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtbnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnPrimeiroActionPerformed
        if(listObj.size() > 0)
            carregarTela(listObj.get(0));
    }//GEN-LAST:event_jtbnPrimeiroActionPerformed

    private void jbtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNovoActionPerformed
        jtxfCod.setText("");
        jtxfNome.setText("");
        jtxfEnd.setText("");
        jtxfBairro.setText("");
        jtxfCid.setText("");
        jtxfCep.setText("");
        jtxfNasc.setText("");
        jtxfFone.setText("");
        jtxfMail.setText("");
        jCBSexo.setSelectedItem("Masculino");
        jCBUf.setSelectedItem("SC");

    }//GEN-LAST:event_jbtnNovoActionPerformed

    private void jbtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalvarActionPerformed
        funcionariosBO = new FuncionariosBO();
        if(!"".equals(jtxfCod.getText()))
        {
            funcionariosBO.alterar(carregarDTO());
        }
        else{
            funcionariosBO.inserir(carregarDTO());
            listObj = funcionariosBO.PesquisarTodos();
            carregarTela(listObj.get(listObj.size() - 1));

            JOptionPane.showMessageDialog(null, "else - inserir");
        }
        funcionariosBO = new FuncionariosBO();
        listObj = funcionariosBO.PesquisarTodos();
    }//GEN-LAST:event_jbtnSalvarActionPerformed

    private void jbtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExcluirActionPerformed
        Object[] options = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null, "Confirma exclusão do registro?", "Aviso de exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
       if(i == JOptionPane.YES_OPTION)
       {
           if(!"".equals(jtxfCod.getText()))
           {
               funcionariosBO = new FuncionariosBO();
               funcionariosBO.excluir(carregarDTO());
           }
           funcionariosBO = new FuncionariosBO();
           listObj = funcionariosBO.PesquisarTodos();
           if(listObj.isEmpty())
           {
               JOptionPane.showMessageDialog(null, "Não existem dados cadastrados", "Aviso", JOptionPane.PLAIN_MESSAGE);
           }
            else
           {
               carregarTela(listObj.get(0));
           }
       }
        else{
            JOptionPane.showMessageDialog(null, "Registro não será excluído", "Aviso", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jbtnExcluirActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        if(listObj.size() > 0)
            carregarTela(listObj.get(0));
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAnteriorActionPerformed
        if(!"".equals(jtxfCod.getText()))
        {
            int codigo = Integer.parseInt(jtxfCod.getText());
            for(int x = 0; x < listObj.size(); x++)
            {
                if(listObj.get(x).getFunc_cod() == codigo)
                {
                    if(x - 1 >= 0)
                    {
                        carregarTela(listObj.get(x - 1));
                    }
                }
            }
        }
    }//GEN-LAST:event_jbtnAnteriorActionPerformed

    private void jbtnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProximoActionPerformed
        if(!"".equals(jtxfCod.getText()))
        {
            int codigo = Integer.parseInt(jtxfCod.getText());
            for(int x = 0; x < listObj.size(); x++)
            {
                if(listObj.get(x).getFunc_cod() == codigo)
                {
                    if(x + 1 < listObj.size())
                    {
                        carregarTela(listObj.get(x + 1));
                    }
                }
            }
        }
    }//GEN-LAST:event_jbtnProximoActionPerformed

    private void jbtnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUltimoActionPerformed
        if(listObj.size() > 0)
            carregarTela((listObj.get(listObj.size() - 1)));
    }//GEN-LAST:event_jbtnUltimoActionPerformed

    /**
    * @param args the command line arguments
    */

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jCBSexo;
    private javax.swing.JComboBox jCBUf;
    private javax.swing.JButton jbtnAnterior;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnExcluir;
    private javax.swing.JButton jbtnNovo;
    private javax.swing.JButton jbtnProximo;
    private javax.swing.JButton jbtnSalvar;
    private javax.swing.JButton jbtnUltimo;
    private javax.swing.JLabel jlblBairro;
    private javax.swing.JLabel jlblCep;
    private javax.swing.JLabel jlblCid;
    private javax.swing.JLabel jlblCod;
    private javax.swing.JLabel jlblEnd;
    private javax.swing.JLabel jlblFone;
    private javax.swing.JLabel jlblMail;
    private javax.swing.JLabel jlblNasc;
    private javax.swing.JLabel jlblNome;
    private javax.swing.JLabel jlblSexo;
    private javax.swing.JLabel jlblUf;
    private javax.swing.JButton jtbnPrimeiro;
    private javax.swing.JTextField jtxfBairro;
    private javax.swing.JTextField jtxfCep;
    private javax.swing.JTextField jtxfCid;
    private javax.swing.JTextField jtxfCod;
    private javax.swing.JTextField jtxfEnd;
    private javax.swing.JTextField jtxfFone;
    private javax.swing.JTextField jtxfMail;
    private javax.swing.JTextField jtxfNasc;
    private javax.swing.JTextField jtxfNome;
    // End of variables declaration//GEN-END:variables

}