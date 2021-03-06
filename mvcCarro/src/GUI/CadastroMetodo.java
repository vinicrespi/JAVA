/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadastroMetodo.java
 *
 * Created on 18/05/2012, 16:06:59
 */

package GUI;

import BO.MarcaBO;
import BO.ModelosBO;
import DTO.MarcaDTO;
import DTO.ModelosDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 110000636
 */
public class CadastroMetodo extends javax.swing.JFrame {
    List<ModelosDTO> listObj = new ArrayList<ModelosDTO>();
    ModelosBO modelosBO;
    /** Creates new form CadastroMetodo */
    public CadastroMetodo() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelosBO = new ModelosBO();
        listObj = modelosBO.PesquisarTodos();
        if(listObj.size() > 0)
            carregarTela(listObj.get(0));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCod = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        jtxbCod = new javax.swing.JTextField();
        jtxbDesc = new javax.swing.JTextField();
        jbtnNovo = new javax.swing.JButton();
        jbtnSalvar = new javax.swing.JButton();
        jbtnExcluir = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jbtnPrimeiro = new javax.swing.JButton();
        jbtnAnterior = new javax.swing.JButton();
        jbtnProximo = new javax.swing.JButton();
        jbtnUltimo = new javax.swing.JButton();
        jCBMarca = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCod.setText("Código:");

        lblDesc.setText("Descrição:");

        lblMarca.setText("Marca:");

        jtxbCod.setEditable(false);
        jtxbCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxbCodActionPerformed(evt);
            }
        });

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

        jbtnPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/primeiro.png"))); // NOI18N
        jbtnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrimeiroActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxbCod, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDesc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxbDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnUltimo, 0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jbtnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
                        .addComponent(jtxbCod)
                        .addComponent(jbtnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
                        .addComponent(jbtnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
                        .addComponent(lblCod)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesc)
                    .addComponent(jtxbDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(jCBMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void carregarTela(ModelosDTO modelosDTO)
    {
    jtxbCod.setText(String.valueOf(modelosDTO.getMod_cod()));
    jtxbDesc.setText(modelosDTO.getMod_desc());

    MarcaBO marcaBO = new MarcaBO();
    List<MarcaDTO> listMarca = marcaBO.pesquisar();

    jCBMarca.removeAllItems();
    for(int x = 0; x < listMarca.size(); x++)
    {
        jCBMarca.addItem(listMarca.get(x).getMarca_desc());
    }
    jCBMarca.setSelectedItem(modelosDTO.getMarca().getMarca_desc());
    }

    public ModelosDTO carregarDTO(){
        ModelosDTO modelosDTO = new ModelosDTO();
        if("".equals(jtxbCod.getText()))
            modelosDTO.setMod_cod(0);
        else
            modelosDTO.setMod_cod(Integer.parseInt(jtxbCod.getText()));
        modelosDTO.setMod_desc(jtxbDesc.getText());
        MarcaBO marcaBO = new MarcaBO();
        MarcaDTO marcaDTO = new MarcaDTO();
        marcaDTO.setMarca_desc(jCBMarca.getSelectedItem().toString());
        marcaDTO = marcaBO.procurarPorDescricao(marcaDTO);
        modelosDTO.setMarca(marcaDTO);
        return modelosDTO;
    }

    private void jtxbCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxbCodActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jtxbCodActionPerformed

    private void jbtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalvarActionPerformed
    if(!"".equals(jtxbCod.getText()))
    {
        modelosBO = new ModelosBO();
        modelosBO.alterar(carregarDTO());
    }
    else
    {
        modelosBO = new ModelosBO();
        modelosBO.inserir(carregarDTO());
        modelosBO = new ModelosBO();
        listObj = modelosBO.PesquisarTodos();
        carregarTela(listObj.get(listObj.size() - 1));
    }
    modelosBO = new ModelosBO();
    listObj = modelosBO.PesquisarTodos();


    }//GEN-LAST:event_jbtnSalvarActionPerformed

    private void jbtnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrimeiroActionPerformed
        if(listObj.size() > 0)
        carregarTela(listObj.get(0));
    }//GEN-LAST:event_jbtnPrimeiroActionPerformed

    private void jbtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNovoActionPerformed
        jtxbCod.setText("");
        jtxbDesc.setText("");
    }//GEN-LAST:event_jbtnNovoActionPerformed

    private void jbtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExcluirActionPerformed
       Object[] options = {"Sim", "Não"};
       int i = JOptionPane.showOptionDialog(null, "Confirmar exclusão do resgistro?", "Aviso de exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    if(i == JOptionPane.YES_OPTION)
    {
        if(!"".equals(jtxbCod.getText()))
       {
           modelosBO = new ModelosBO();
           modelosBO.excluir(carregarDTO());
       }
       listObj = modelosBO.PesquisarTodos();
       if(listObj.size() == 0)
       {
           JOptionPane.showMessageDialog(null, "Não existem dados cadastrados", "Aviso", JOptionPane.PLAIN_MESSAGE);
       }
       else{
           carregarTela(listObj.get(0));
       }
    }
    else
    {
           JOptionPane.showConfirmDialog(null, "Registro não será excluido", "Aviso", JOptionPane.PLAIN_MESSAGE);
    }
    }//GEN-LAST:event_jbtnExcluirActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
    if(listObj.size() > 0)
        carregarTela(listObj.get(0));
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAnteriorActionPerformed
       if(!"".equals(jtxbCod.getText()))
       {
           int codigo = Integer.parseInt(jtxbCod.getText());
           for(int x = 0; x < listObj.size(); x++){
               if(listObj.get(x).getMod_cod() == codigo){
               if(x - 1 >= 0)
               {
                   carregarTela(listObj.get(x - 1));
               }
           }
           }
       }
    }//GEN-LAST:event_jbtnAnteriorActionPerformed

    private void jbtnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProximoActionPerformed
            if(!"".equals(jtxbCod.getText()))
       {
           int codigo = Integer.parseInt(jtxbCod.getText());
           for(int x = 0; x < listObj.size(); x++){
               if(listObj.get(x).getMod_cod() == codigo){
               if(x + 1 >= 0)
               {
                   carregarTela(listObj.get(x + 1));
               }
           }
           }
       }
    }//GEN-LAST:event_jbtnProximoActionPerformed

    private void jbtnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUltimoActionPerformed
       if(listObj.size() > 0)
           carregarTela(listObj.get(listObj.size() - 1));
    }//GEN-LAST:event_jbtnUltimoActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroMetodo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jCBMarca;
    private javax.swing.JButton jbtnAnterior;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnExcluir;
    private javax.swing.JButton jbtnNovo;
    private javax.swing.JButton jbtnPrimeiro;
    private javax.swing.JButton jbtnProximo;
    private javax.swing.JButton jbtnSalvar;
    private javax.swing.JButton jbtnUltimo;
    private javax.swing.JTextField jtxbCod;
    private javax.swing.JTextField jtxbDesc;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblMarca;
    // End of variables declaration//GEN-END:variables

}
