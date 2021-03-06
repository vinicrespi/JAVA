/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BO.AutomoveisBO;
import BO.ModelosBO;
import DTO.AutomoveisDTO;
import DTO.ModelosDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius
 */
public class CadastroAutomoveis extends javax.swing.JFrame {

    List<AutomoveisDTO> listObj = new ArrayList<AutomoveisDTO>();
    AutomoveisBO automoveisBO;
    
    /**
     * Creates new form CadastroAutomoveis
     */
    public CadastroAutomoveis() {
        initComponents();
        this.setLocationRelativeTo(null);
        automoveisBO = new AutomoveisBO();
        listObj = automoveisBO.PesquisarTodos();
        if(listObj.size() > 0)
            carregarTela(listObj.get(0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public AutomoveisDTO carregarDTO(){
        AutomoveisDTO automoveisDTO = new AutomoveisDTO();
        automoveisDTO.setAut_placa(jTFCodigo.getText().toUpperCase());
        ModelosBO modelosBO = new ModelosBO();
        ModelosDTO modelosDTO = new ModelosDTO();
        modelosDTO.setMod_desc(JCBMolelo.getSelectedItem().toString());
        modelosDTO = modelosBO.procurarPorDescricao(modelosDTO);
        automoveisDTO.setModelo(modelosDTO);
        automoveisDTO.setAut_ano(Integer.parseInt(JTFAno.getText()));
        automoveisDTO.setAut_preco(Double.parseDouble(JTFPreco.getText()));
        automoveisDTO.setAut_combustivel(jTFCombustivel.getText());
        automoveisDTO.setAut_km(Double.parseDouble(jTFKm.getText()));
        automoveisDTO.setAut_cor(jTFCor.getText());
        
        if(jCBArCondicionado.isSelected() == true)
            automoveisDTO.setAut_arcondicionado(1);
        else
            automoveisDTO.setAut_arcondicionado(0);
        
        if(jCBVidroEletrico.isSelected() == true)
            automoveisDTO.setAut_vidroeletrico(1);
        else
            automoveisDTO.setAut_vidroeletrico(0);
        
                if(jCBAirBag.isSelected() == true)
                    automoveisDTO.setAut_airbag(1);
                else
                    automoveisDTO.setAut_airbag(0);
                
                if(jCBTravaEletrica.isSelected()== true)
                    automoveisDTO.setAut_travaeletrica(1);
                else
                    automoveisDTO.setAut_travaeletrica(0);
                
                if(jCBAlarme.isSelected() == true)
                    automoveisDTO.setAut_alarme(1);
                else
                    automoveisDTO.setAut_alarme(0);
                
                if(jCBDesembacador.isSelected() == true)
                    automoveisDTO.setAut_desembacador(1);
                else
                    automoveisDTO.setAut_desembacador(0);
                
                if(jCBRodaDeLiga.isSelected() == true)
                    automoveisDTO.setAut_rodaliga(1);
                else
                    automoveisDTO.setAut_rodaliga(0);
                
                if(jCBVolanteHidraulico.isSelected() == true)
                    automoveisDTO.setAut_volantehidraulico(1);
                else
                    automoveisDTO.setAut_volantehidraulico(0);
                
                if(jCBArQuente.isSelected() == true)
                    automoveisDTO.setAut_arquente(1);
                else
                    automoveisDTO.setAut_arquente(0);
                
                if(JCBAbs.isSelected() == true)
                    automoveisDTO.setAut_abs(1);
                else
                    automoveisDTO.setAut_abs(0);
                
                if(jCBCambioAutomatico.isSelected() == true)
                    automoveisDTO.setAut_cambioaut(1);
                else
                    automoveisDTO.setAut_cambioaut(0);
                
                if(jCBCdPlayer.isSelected() == true)
                    automoveisDTO.setAut_cdplayer(1);
                else
                    automoveisDTO.setAut_cdplayer(0);
                
                if(jCBIsufilm.isSelected() == true)
                    automoveisDTO.setAut_isufilm(1);
                else
                    automoveisDTO.setAut_isufilm(0);
                
                if(jCBLimpadorTraseiro.isSelected() == true)
                    automoveisDTO.setAut_limpadortraseiro(1);
                else
                    automoveisDTO.setAut_limpadortraseiro(0);
                
              if(jCBVendido.isSelected() == true)
                    automoveisDTO.setAut_vendido(1);
              else
                    automoveisDTO.setAut_vendido(0);
              
              automoveisDTO.setAut_outros(jTAOutros.getText());
        
        
        return automoveisDTO;
    }
    
    public void carregarTela(AutomoveisDTO automoveisDTO){
        jTFCodigo.setText(automoveisDTO.getAut_placa());
        
        ModelosBO modelosBO = new ModelosBO();
        List<ModelosDTO> listModelos = modelosBO.PesquisarTodos();
        JCBMolelo.removeAllItems();
        for(int x = 0; x < listModelos.size(); x++){
            JCBMolelo.addItem(listModelos.get(x).getMod_desc());
        }
        JCBMolelo.setSelectedItem(automoveisDTO.getModelo().getMod_desc());
        
        JTFAno.setText(String.valueOf(automoveisDTO.getAut_ano()));
        JTFPreco.setText(String.valueOf(automoveisDTO.getAut_preco()));
        jTFCor.setText(String.valueOf(automoveisDTO.getAut_cor()));
        jTFCombustivel.setText(String.valueOf(automoveisDTO.getAut_combustivel()));
        jTFKm.setText(String.valueOf(automoveisDTO.getAut_km()));

        if(automoveisDTO.getAut_arcondicionado() == 1)
            jCBArCondicionado.setSelected(true);
        else
            jCBArCondicionado.setSelected(false);

        if(automoveisDTO.getAut_vidroeletrico() == 1)
            jCBVidroEletrico.setSelected(true);
        else
            jCBVidroEletrico.setSelected(false);

            if(automoveisDTO.getAut_travaeletrica() == 1)
                jCBTravaEletrica.setSelected(true);
            else
                jCBTravaEletrica.setSelected(false);

            if(automoveisDTO.getAut_alarme() == 1)
                jCBAlarme.setSelected(true);
            else
                jCBAlarme.setSelected(false);

            if(automoveisDTO.getAut_desembacador() == 1)
                jCBDesembacador.setSelected(true);
            else
                jCBDesembacador.setSelected(false);

            if(automoveisDTO.getAut_rodaliga() == 1)
                jCBRodaDeLiga.setSelected(true);
            else
                jCBRodaDeLiga.setSelected(false);

            if(automoveisDTO.getAut_volantehidraulico() == 1)
                jCBVolanteHidraulico.setSelected(true);
            else
                jCBVolanteHidraulico.setSelected(false);

            if(automoveisDTO.getAut_arquente() == 1)
                jCBArQuente.setSelected(true);
            else
                jCBArQuente.setSelected(false);

            if(automoveisDTO.getAut_cambioaut() == 1)
                jCBCambioAutomatico.setSelected(true);
            else
                jCBCambioAutomatico.setSelected(false);

            if(automoveisDTO.getAut_cdplayer() == 1)
                jCBCdPlayer.setSelected(true);
            else
                jCBCdPlayer.setSelected(false);

            if(automoveisDTO.getAut_isufilm() == 1)
                jCBIsufilm.setSelected(true);
            else
                jCBIsufilm.setSelected(false);

            if(automoveisDTO.getAut_limpadortraseiro() == 1)
                jCBLimpadorTraseiro.setSelected(true);
            else
                jCBLimpadorTraseiro.setSelected(false);

            if(automoveisDTO.getAut_vendido() == 1)
                jCBVendido.setSelected(true);
            else
                jCBVendido.setSelected(false);

            jTAOutros.setText(automoveisDTO.getAut_outros());

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        JCBMolelo = new javax.swing.JComboBox();
        JTFAno = new javax.swing.JTextField();
        JTFPreco = new javax.swing.JTextField();
        jTFCor = new javax.swing.JTextField();
        jCBArCondicionado = new javax.swing.JCheckBox();
        jCBVidroEletrico = new javax.swing.JCheckBox();
        jCBAirBag = new javax.swing.JCheckBox();
        jCBTravaEletrica = new javax.swing.JCheckBox();
        jCBAlarme = new javax.swing.JCheckBox();
        jCBDesembacador = new javax.swing.JCheckBox();
        jCBRodaDeLiga = new javax.swing.JCheckBox();
        jCBVolanteHidraulico = new javax.swing.JCheckBox();
        jCBArQuente = new javax.swing.JCheckBox();
        JCBAbs = new javax.swing.JCheckBox();
        jCBCambioAutomatico = new javax.swing.JCheckBox();
        jCBCdPlayer = new javax.swing.JCheckBox();
        jCBIsufilm = new javax.swing.JCheckBox();
        jCBLimpadorTraseiro = new javax.swing.JCheckBox();
        jCBVendido = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFCombustivel = new javax.swing.JTextField();
        jTFKm = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAOutros = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Placa");

        jLabel2.setText("Modelo");

        jLabel3.setText("Ano");

        jLabel4.setText("Preço");

        jLabel5.setText("Cor");

        jCBArCondicionado.setText("Ar Condicionado");

        jCBVidroEletrico.setText("Vidro Elétrico");

        jCBAirBag.setText("Air Bag");

        jCBTravaEletrica.setText("Trava Elétrica");

        jCBAlarme.setText("Alarme");

        jCBDesembacador.setText("Desembaçador");

        jCBRodaDeLiga.setText("Rodas de Liga");

        jCBVolanteHidraulico.setText("Volante Hidráulico");

        jCBArQuente.setText("Ar quente");

        JCBAbs.setText("ABS");

        jCBCambioAutomatico.setText("Câmbio Automático");

        jCBCdPlayer.setText("CD Player");

        jCBIsufilm.setText("Isufilm");

        jCBLimpadorTraseiro.setText("Limpador Traseiro");

        jCBVendido.setText("Vendido");
        jCBVendido.setEnabled(false);

        jLabel6.setText("Combustível");

        jLabel7.setText("KM");

        jTAOutros.setColumns(20);
        jTAOutros.setRows(5);
        jScrollPane1.setViewportView(jTAOutros);

        jLabel8.setText("Outros");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/primeiro.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ultimo.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anterior.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/proximo.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jButton8.setText("Cancelar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exlcuir.jpg"))); // NOI18N
        jButton7.setText("Excluir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        jButton6.setText("Salvar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo.png"))); // NOI18N
        jButton5.setText("Novo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCBMolelo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFAno, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBVolanteHidraulico)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCBRodaDeLiga)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBDesembacador)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCBAlarme)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCBTravaEletrica)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jCBAirBag)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jCBVidroEletrico)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jCBArCondicionado)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jTFCor)
                                                            .addComponent(JTFPreco)))))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCBAbs)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jCBArQuente)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFCombustivel)
                                    .addComponent(jTFKm, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
                            .addComponent(jCBCambioAutomatico)
                            .addComponent(jCBCdPlayer)
                            .addComponent(jCBIsufilm)
                            .addComponent(jCBLimpadorTraseiro)
                            .addComponent(jCBVendido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1, 0, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, 0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JCBMolelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTFAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTFCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTFKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTFCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBArCondicionado)
                            .addComponent(jCBArQuente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBVidroEletrico)
                            .addComponent(JCBAbs))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBAirBag)
                            .addComponent(jCBCambioAutomatico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBTravaEletrica)
                            .addComponent(jCBCdPlayer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBAlarme)
                            .addComponent(jCBIsufilm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBDesembacador)
                            .addComponent(jCBLimpadorTraseiro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCBVendido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBRodaDeLiga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBVolanteHidraulico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTFCodigo.setText("");
        JTFAno.setText("");
        JTFPreco.setText("");
        jTFCor.setText("");
        jTFCombustivel.setText("");
        jTFKm.setText("");
        jCBArCondicionado.setSelected(false);
        jCBVidroEletrico.setSelected(false);
        jCBAirBag.setSelected(false);
        jCBTravaEletrica.setSelected(false);
        jCBAlarme.setSelected(false);
        jCBDesembacador.setSelected(false);
        jCBRodaDeLiga.setSelected(false);
        jCBVolanteHidraulico.setSelected(false);
        jCBArQuente.setSelected(false);
        JCBAbs.setSelected(false);
        jCBCambioAutomatico.setSelected(false);
        jCBCdPlayer.setSelected(false);
        jCBIsufilm.setSelected(false);
        jCBLimpadorTraseiro.setSelected(false);
        jCBVendido.setSelected(false);
        jTAOutros.setText("");

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        automoveisBO = new AutomoveisBO();
        AutomoveisDTO automoveisDTO = new AutomoveisDTO();
        automoveisDTO.setAut_placa(jTFCodigo.getText());
        automoveisDTO = automoveisBO.procurarPorPlaca(automoveisDTO);
        if(automoveisDTO != null){
            automoveisBO.alterar(carregarDTO());
        }else{
            automoveisBO.inserir(carregarDTO());
            listObj = automoveisBO.PesquisarTodos();
            carregarTela(listObj.get(listObj.size() - 1));
        }
        listObj = automoveisBO.PesquisarTodos();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Object[] options = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null, "Confirmar exclusão do registro?", "Aviso de exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if(i == JOptionPane.YES_OPTION){
            if(!"".equals(jTFCodigo.getText())){
                automoveisBO.excluir(carregarDTO());
            }
            listObj = automoveisBO.PesquisarTodos();
            if(listObj.size() == 0){
                JOptionPane.showMessageDialog(null, "Não existem dados cadastrados", "Aviso", JOptionPane.PLAIN_MESSAGE);
            }else{
                carregarTela(listObj.get(0));
            }
        }else{
            JOptionPane.showMessageDialog(null, "Registro não será excluido", "Aviso", JOptionPane.PLAIN_MESSAGE);
        
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       if(listObj.size() > 0)
           carregarTela(listObj.get(0));
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if(listObj.size() > 0)
           carregarTela(listObj.get(0));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!"".equals(jTFCodigo.getText())){
            String placa = jTFCodigo.getText();
            for(int x = 0; x < listObj.size(); x++){
                if(placa.equals(listObj.get(x).getAut_placa())){
                    if(x - 1 >= 0){
                        carregarTela(listObj.get(x - 1));
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            if(!"".equals(jTFCodigo.getText())){
            String placa = jTFCodigo.getText();
            for(int x = 0; x < listObj.size(); x++){
                if(placa.equals(listObj.get(x).getAut_placa())){
                    if(x + 1 < listObj.size()){
                        carregarTela(listObj.get(x + 1));
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(listObj.size() > 0)
           carregarTela(listObj.get(listObj.size() - 1));
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroAutomoveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAutomoveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAutomoveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAutomoveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CadastroAutomoveis().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox JCBAbs;
    private javax.swing.JComboBox JCBMolelo;
    private javax.swing.JTextField JTFAno;
    private javax.swing.JTextField JTFPreco;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCBAirBag;
    private javax.swing.JCheckBox jCBAlarme;
    private javax.swing.JCheckBox jCBArCondicionado;
    private javax.swing.JCheckBox jCBArQuente;
    private javax.swing.JCheckBox jCBCambioAutomatico;
    private javax.swing.JCheckBox jCBCdPlayer;
    private javax.swing.JCheckBox jCBDesembacador;
    private javax.swing.JCheckBox jCBIsufilm;
    private javax.swing.JCheckBox jCBLimpadorTraseiro;
    private javax.swing.JCheckBox jCBRodaDeLiga;
    private javax.swing.JCheckBox jCBTravaEletrica;
    private javax.swing.JCheckBox jCBVendido;
    private javax.swing.JCheckBox jCBVidroEletrico;
    private javax.swing.JCheckBox jCBVolanteHidraulico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAOutros;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFCombustivel;
    private javax.swing.JTextField jTFCor;
    private javax.swing.JTextField jTFKm;
    // End of variables declaration//GEN-END:variables
}
