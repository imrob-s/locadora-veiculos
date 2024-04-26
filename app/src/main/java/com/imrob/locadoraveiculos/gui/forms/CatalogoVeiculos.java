
package com.imrob.locadoraveiculos.gui.forms;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.imrob.locadoraveiculos.DTO.CarroDTO;
import com.imrob.locadoraveiculos.gui.cadastro.CadastroCarroGUI;
import com.imrob.locadoraveiculos.gui.components.CardCarro;
import com.imrob.locadoraveiculos.gui.components.FormManager;
import com.imrob.locadoraveiculos.services.CarroService;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class CatalogoVeiculos extends javax.swing.JPanel {
    private CardCarro card;
    private JPanel jpConteudo;
    private JScrollPane scroll;
    
    public CatalogoVeiculos() {
        initComponents();
        carregarTela();
        carregarCatalogoCarros();
        txtProcurar.putClientProperty(FlatClientProperties.TEXT_FIELD_TRAILING_ICON, new FlatSVGIcon(getClass().getResource("/imgs/icons/procurar.svg")));
        btnNovo.setIcon(new FlatSVGIcon(getClass().getResource("/imgs/icons/add.svg")));
    }
    
//    public void carregarCatalogoCarros() {
//        List<CarroDTO> lista = Application.listaCarro;
//        
//        for (CarroDTO c : lista) {
//            jpConteudo.add(new CardCarro(c));
//        }
//    }
    
    public void carregarCatalogoCarros() {
    String filtro = txtProcurar.getText();
    jpConteudo.removeAll();

    List<CarroDTO> carrosFiltrados = new CarroService().findAll().stream()
            .filter(carro ->
                    carro.getModelo().toLowerCase().contains(filtro.toLowerCase()) ||
                    carro.getFabricante().toLowerCase().contains(filtro.toLowerCase()) ||
                    carro.getCor().toLowerCase().contains(filtro.toLowerCase()) ||
                    carro.getPlaca().toLowerCase().contains(filtro.toLowerCase()) ||
                    String.valueOf(carro.getValorLocacao()).toLowerCase().contains(filtro.toLowerCase()) ||
                    String.valueOf(carro.getDisponivel()).toLowerCase().contains(filtro.toLowerCase()))
            .collect(Collectors.toList());

    for (CarroDTO c : carrosFiltrados) {
        jpConteudo.add(new CardCarro(c)); 
    }

    jpConteudo.revalidate();
    jpConteudo.repaint();
}

    
    public void carregarTela() {
        jpConteudo = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        scroll.setViewportView(jpConteudo);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.getVerticalScrollBar().setUnitIncrement(10);
        add(scroll, java.awt.BorderLayout.CENTER); 
        
        setPreferredSize(new Dimension(980, 685));
        GridLayout gridLayout = new GridLayout(0, 5, 5, 5); // 3 colunas, 10 pixels de espaçamento horizontal e vertical
        jpConteudo.setLayout(gridLayout);
        jpConteudo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 30));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pHeader = new javax.swing.JPanel();
        txtProcurar = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();

        setBackground(new java.awt.Color(15, 15, 15));
        setLayout(new java.awt.BorderLayout());

        txtProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProcurarActionPerformed(evt);
            }
        });
        txtProcurar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProcurarKeyTyped(evt);
            }
        });

        btnNovo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pHeaderLayout = new javax.swing.GroupLayout(pHeader);
        pHeader.setLayout(pHeaderLayout);
        pHeaderLayout.setHorizontalGroup(
            pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHeaderLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(txtProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                .addComponent(btnNovo)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        pHeaderLayout.setVerticalGroup(
            pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHeaderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo))
                .addGap(20, 20, 20))
        );

        add(pHeader, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        FormManager.getInstance().showForm("Cadastro de Veículo", new CadastroCarroGUI());
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txtProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProcurarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProcurarActionPerformed

    private void txtProcurarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProcurarKeyTyped
        carregarCatalogoCarros();
    }//GEN-LAST:event_txtProcurarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovo;
    private javax.swing.JPanel pHeader;
    private javax.swing.JTextField txtProcurar;
    // End of variables declaration//GEN-END:variables
}
