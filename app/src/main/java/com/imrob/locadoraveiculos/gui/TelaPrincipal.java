package com.imrob.locadoraveiculos.gui;

import com.imrob.locadoraveiculos.components.CardComponent;
import com.imrob.locadoraveiculos.config.DatabaseConfig;
import com.imrob.locadoraveiculos.entities.Carro;
import com.imrob.locadoraveiculos.entities.Modelo;
import com.imrob.locadoraveiculos.forms.CatalogoVeiculos;
import com.imrob.locadoraveiculos.gui.cadastro.CadastroCarroGUI;
import com.imrob.locadoraveiculos.gui.cadastro.CadastroFabricanteGUI;
import com.imrob.locadoraveiculos.gui.cadastro.CadastroModeloGUI;
import com.imrob.locadoraveiculos.gui.cadastro.FabricanteGUI;
import com.imrob.locadoraveiculos.gui.reserva.NovaReservaGUI;
import com.imrob.locadoraveiculos.repositories.CarroRepository;
import com.imrob.locadoraveiculos.repositories.FabricanteRepository;
import com.imrob.locadoraveiculos.repositories.ModeloRepository;
import com.imrob.locadoraveiculos.services.CarroService;
import com.imrob.locadoraveiculos.services.FabricanteService;
import java.util.List;

public class TelaPrincipal extends javax.swing.JFrame {
    private CatalogoVeiculos catalogo;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        jpConteudo.add(new CatalogoVeiculos());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpConteudo = new javax.swing.JPanel();
        menuBarPrincipal = new javax.swing.JMenuBar();
        menuReservas = new javax.swing.JMenu();
        mnuReservasAdicionar = new javax.swing.JMenuItem();
        mnuReservasVisualizar = new javax.swing.JMenuItem();
        mnuReservasCancelar = new javax.swing.JMenuItem();
        menuVeiculos = new javax.swing.JMenu();
        menuVeiculosCatalogo = new javax.swing.JMenuItem();
        menuVeiculosLocacoes = new javax.swing.JMenuItem();
        menuVeiculosCadastrar = new javax.swing.JMenuItem();
        menuVeiculosRemover = new javax.swing.JMenuItem();
        menuVeiculosAtualizar = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenu();
        menuClientesVisualizar = new javax.swing.JMenuItem();
        menuClientesAdicionar = new javax.swing.JMenuItem();
        menuClientesRemover = new javax.swing.JMenuItem();
        menuClientesAtualizar = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        menuRelatorioReservas = new javax.swing.JMenuItem();
        menuRelatorioFaturamento = new javax.swing.JMenuItem();
        menuConfiguracoes = new javax.swing.JMenu();
        menuConfiguracoesTema = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuAjudaSuporte = new javax.swing.JMenuItem();
        menuAjudaSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 700));
        setPreferredSize(new java.awt.Dimension(900, 599));

        jpConteudo.setPreferredSize(new java.awt.Dimension(600, 600));
        jpConteudo.setLayout(new java.awt.CardLayout());

        menuReservas.setText("Reservas");

        mnuReservasAdicionar.setText("Fazer Nova Reserva");
        mnuReservasAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReservasAdicionarActionPerformed(evt);
            }
        });
        menuReservas.add(mnuReservasAdicionar);

        mnuReservasVisualizar.setText("Visualizar Reservas Atuais");
        menuReservas.add(mnuReservasVisualizar);

        mnuReservasCancelar.setText("Cancelar Reserva");
        menuReservas.add(mnuReservasCancelar);

        menuBarPrincipal.add(menuReservas);

        menuVeiculos.setText("Veículos");

        menuVeiculosCatalogo.setText("Catálogo de Veículos");
        menuVeiculos.add(menuVeiculosCatalogo);

        menuVeiculosLocacoes.setText("Veículos Locados");
        menuVeiculos.add(menuVeiculosLocacoes);

        menuVeiculosCadastrar.setText("Cadastrar Veículo");
        menuVeiculosCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVeiculosCadastrarActionPerformed(evt);
            }
        });
        menuVeiculos.add(menuVeiculosCadastrar);

        menuVeiculosRemover.setText("Remover Veículo");
        menuVeiculos.add(menuVeiculosRemover);

        menuVeiculosAtualizar.setText("Atualizar Veículo");
        menuVeiculos.add(menuVeiculosAtualizar);

        menuBarPrincipal.add(menuVeiculos);

        menuClientes.setText("Clientes");

        menuClientesVisualizar.setText("Visualizar Lista de Clientes");
        menuClientesVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientesVisualizarActionPerformed(evt);
            }
        });
        menuClientes.add(menuClientesVisualizar);

        menuClientesAdicionar.setText("Adicionar Novo Cliente");
        menuClientes.add(menuClientesAdicionar);

        menuClientesRemover.setText("Remover Cliente");
        menuClientes.add(menuClientesRemover);

        menuClientesAtualizar.setText("Atualizar Informações do Cliente");
        menuClientes.add(menuClientesAtualizar);

        menuBarPrincipal.add(menuClientes);

        menuRelatorios.setText("Relatórios");

        menuRelatorioReservas.setText("Reservas");
        menuRelatorios.add(menuRelatorioReservas);

        menuRelatorioFaturamento.setText("Faturamento");
        menuRelatorios.add(menuRelatorioFaturamento);

        menuBarPrincipal.add(menuRelatorios);

        menuConfiguracoes.setText("Configurações");

        menuConfiguracoesTema.setText("Alterar Tema");
        menuConfiguracoes.add(menuConfiguracoesTema);

        menuBarPrincipal.add(menuConfiguracoes);

        menuAjuda.setText("Ajuda");

        menuAjudaSuporte.setText("Suporte");
        menuAjuda.add(menuAjudaSuporte);

        menuAjudaSobre.setText("Sobre");
        menuAjuda.add(menuAjudaSobre);

        menuBarPrincipal.add(menuAjuda);

        setJMenuBar(menuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuClientesVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientesVisualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuClientesVisualizarActionPerformed

    private void menuVeiculosCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVeiculosCadastrarActionPerformed
        new CadastroCarroGUI(this, true).setVisible(true);
    }//GEN-LAST:event_menuVeiculosCadastrarActionPerformed

    private void mnuReservasAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReservasAdicionarActionPerformed
        new NovaReservaGUI(this, true).setVisible(true);
    }//GEN-LAST:event_mnuReservasAdicionarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpConteudo;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuAjudaSobre;
    private javax.swing.JMenuItem menuAjudaSuporte;
    private javax.swing.JMenuBar menuBarPrincipal;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenuItem menuClientesAdicionar;
    private javax.swing.JMenuItem menuClientesAtualizar;
    private javax.swing.JMenuItem menuClientesRemover;
    private javax.swing.JMenuItem menuClientesVisualizar;
    private javax.swing.JMenu menuConfiguracoes;
    private javax.swing.JMenuItem menuConfiguracoesTema;
    private javax.swing.JMenuItem menuRelatorioFaturamento;
    private javax.swing.JMenuItem menuRelatorioReservas;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuReservas;
    private javax.swing.JMenu menuVeiculos;
    private javax.swing.JMenuItem menuVeiculosAtualizar;
    private javax.swing.JMenuItem menuVeiculosCadastrar;
    private javax.swing.JMenuItem menuVeiculosCatalogo;
    private javax.swing.JMenuItem menuVeiculosLocacoes;
    private javax.swing.JMenuItem menuVeiculosRemover;
    private javax.swing.JMenuItem mnuReservasAdicionar;
    private javax.swing.JMenuItem mnuReservasCancelar;
    private javax.swing.JMenuItem mnuReservasVisualizar;
    // End of variables declaration//GEN-END:variables
}
