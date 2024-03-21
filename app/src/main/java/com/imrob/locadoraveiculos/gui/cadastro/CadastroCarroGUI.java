package com.imrob.locadoraveiculos.gui.cadastro;

import com.imrob.locadoraveiculos.DTO.CarroDTO;
import com.imrob.locadoraveiculos.DTO.FabricanteDTO;
import com.imrob.locadoraveiculos.DTO.ModeloDTO;
import com.imrob.locadoraveiculos.entities.Fabricante;
import com.imrob.locadoraveiculos.services.FabricanteService;
import com.imrob.locadoraveiculos.services.ModeloService;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author imrob
 */
public class CadastroCarroGUI extends javax.swing.JDialog {
    private CarroDTO carro = new CarroDTO();
    private ModeloDTO modelo = new ModeloDTO();
    private Fabricante fabricante = new Fabricante();
    private FabricanteService fabricanteService = new FabricanteService();
    private ModeloService modeloService = new ModeloService();
    /**
     * Creates new form CadastroCarroGUI
     */
    public CadastroCarroGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        carregarComboBoxFabricante();
    }
    
    public void carregarComboBoxFabricante() {
        List<FabricanteDTO> lista = fabricanteService.findAll();
        cboFabricante.removeAllItems();
        
        for (FabricanteDTO f : lista) {
            cboFabricante.addItem(f.getNome());
        }
    }
    
    public void carregarComboBoxModelo(){
        List<ModeloDTO> lista = modeloService.findAll();
        cboModelo.removeAllItems();
        
        for (ModeloDTO f : lista) {
            cboModelo.addItem(f.getNome());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaCadastroCarro = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        lblFabricante = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        lblCor = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        cbDisponivel = new javax.swing.JCheckBox();
        cboFabricante = new javax.swing.JComboBox<>();
        cboModelo = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(255, 139, 15));

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Carro");

        javax.swing.GroupLayout lblTituloLayout = new javax.swing.GroupLayout(lblTitulo);
        lblTitulo.setLayout(lblTituloLayout);
        lblTituloLayout.setHorizontalGroup(
            lblTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblTituloLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lblTituloLayout.setVerticalGroup(
            lblTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(17, 17, 17))
        );

        lblAno.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        lblAno.setText("Ano:");

        lblFabricante.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        lblFabricante.setText("Fabricante");

        txtAno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAnoFocusGained(evt);
            }
        });
        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });

        lblModelo.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        lblModelo.setText("Modelo:");

        lblCor.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        lblCor.setText("Cor:");

        lblPlaca.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        lblPlaca.setText("Placa:");

        lblPreco.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        lblPreco.setText("Preço:");

        cbDisponivel.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        cbDisponivel.setText("Disponivel");

        cboFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFabricanteActionPerformed(evt);
            }
        });

        cboModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboModeloActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaCadastroCarroLayout = new javax.swing.GroupLayout(telaCadastroCarro);
        telaCadastroCarro.setLayout(telaCadastroCarroLayout);
        telaCadastroCarroLayout.setHorizontalGroup(
            telaCadastroCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(telaCadastroCarroLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(telaCadastroCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPreco)
                    .addComponent(lblPlaca)
                    .addComponent(lblCor)
                    .addComponent(lblModelo)
                    .addComponent(lblAno)
                    .addComponent(lblFabricante))
                .addGap(18, 18, 18)
                .addGroup(telaCadastroCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDisponivel)
                    .addComponent(cboFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaCadastroCarroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFechar)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(23, 23, 23))
        );
        telaCadastroCarroLayout.setVerticalGroup(
            telaCadastroCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCadastroCarroLayout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(telaCadastroCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFabricante)
                    .addComponent(cboFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaCadastroCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo)
                    .addComponent(cboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaCadastroCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAno)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaCadastroCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCor)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaCadastroCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaCadastroCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbDisponivel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(telaCadastroCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnFechar))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaCadastroCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaCadastroCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnoFocusGained
        if (txtAno.getText().equals("")){
            txtAno.setText("Insira o ano");
            txtAno.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtAnoFocusGained

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

    private void cboFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFabricanteActionPerformed
        carregarComboBoxModelo();
    }//GEN-LAST:event_cboFabricanteActionPerformed

    private void cboModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboModeloActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroCarroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCarroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCarroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCarroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroCarroGUI dialog = new CadastroCarroGUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox cbDisponivel;
    private javax.swing.JComboBox<String> cboFabricante;
    private javax.swing.JComboBox<String> cboModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JPanel lblTitulo;
    private javax.swing.JPanel telaCadastroCarro;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
