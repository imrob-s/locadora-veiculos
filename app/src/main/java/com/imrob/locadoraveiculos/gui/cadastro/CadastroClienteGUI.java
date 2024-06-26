
package com.imrob.locadoraveiculos.gui.cadastro;

import com.fasterxml.jackson.databind.JsonNode;
import com.imrob.locadoraveiculos.DTO.ClienteDTO;
import com.imrob.locadoraveiculos.DTO.EnderecoDTO;
import com.imrob.locadoraveiculos.Utils.Utils;
import com.imrob.locadoraveiculos.Utils.Validators;
import com.imrob.locadoraveiculos.services.ClienteService;
import com.imrob.locadoraveiculos.services.ViaCEP;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class CadastroClienteGUI extends javax.swing.JPanel {
    private final ViaCEP viacep;
    public CadastroClienteGUI() {
        initComponents();
        viacep = Feign.builder()
                .decoder(new JacksonDecoder())
                .target(ViaCEP.class, "https://viacep.com.br");
    }

    void consultarCep(String cep) {
        SwingWorker<JsonNode, Void> worker = new SwingWorker<>() {
            @Override
            protected JsonNode doInBackground() throws Exception {
                return viacep.consultarCEP(cep);
            }

            @Override
            protected void done() {
                try {
                    JsonNode endereco = get();
                    txtRua.setText(endereco.get("logradouro").asText());
                    txtBairro.setText(endereco.get("bairro").asText());
                    txtCidade.setText(endereco.get("localidade").asText());
                    txtEstado.setText(endereco.get("uf").asText());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao obter as informações do Cep: " + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        };

        worker.execute();
    }

    public List<String> validarCampos() {
        List<String> erros = new ArrayList<>();

        if (!Validators.isCharacters(txtBairro.getText())) {
            erros.add("O campo Bairro é inválido.");
        }
        if (!Validators.isCharacters(txtCidade.getText())) {
            erros.add("O campo Cidade é inválido.");
        }
        if (!Validators.isCharacters(txtNome.getText())) {
            erros.add("O campo Nome é inválido.");
        }
        if (!Validators.isNumber(txtCnh.getText())) {
            erros.add("O campo CNH é inválido.");
        }
        if (!Validators.isValidEmail(txtEmail.getText())) {
            erros.add("O campo Email é inválido.");
        }
        if (!Validators.isCharacters(txtEstado.getText())) {
            erros.add("O campo Estado é inválido.");
        }
        if (!Validators.isNumber(txtNumero.getText())) {
            erros.add("O campo Número é inválido.");
        }
        if (!Validators.isNumber(txtRg.getText())) {
            erros.add("O campo RG é inválido.");
        }
        if (!Validators.isCharacters(txtRua.getText())) {
            erros.add("O campo Rua é inválido.");
        }
        if (!Validators.hasNumberQuantity(txtCpf.getText(), 11)) {
            erros.add("O campo CPF é inválido.");
        }
        if (!Validators.hasNumberQuantity(txtfCep.getText().replaceAll("[^0-9]", ""), 8)) {
            erros.add("O campo CEP é inválido.");
        }
        if (!Validators.hasNumberQuantity(txtfTelefone.getText().replaceAll("[^0-9]", ""), 11)) {
            erros.add("O campo Telefone é inválido.");
        }

        return erros;
    }

    public void exibirErros(List<String> erros) {
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Por favor, corrija os seguintes erros:\n");
        for (String erro : erros) {
            mensagem.append("- ").append(erro).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString(), "Erro de validação", JOptionPane.ERROR_MESSAGE);
    }

    private void limparCampos() {
        txtNome.setText("");
        txtCpf.setText("");
        txtRg.setText("");
        txtCnh.setText("");
        txtVencimentoCnh.setText("");
        txtEmail.setText("");
        txtRua.setText("");
        txtfTelefone.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtEstado.setText("");
        txtfCep.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crazyPanel = new raven.crazypanel.CrazyPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCnh = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtVencimentoCnh = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtfTelefone = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtfCep = new javax.swing.JFormattedTextField();
        btnConsultarCep = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();

        crazyPanel.setFlatLafStyleComponent(new raven.crazypanel.FlatLafStyleComponent(
            "",
            new String[]{
                "font:bold +10",
                "font:bold +1",
                "",
                "",
                "showClearButton:true;JTextField.placeholderText=Nome",
                "showClearButton:true;JTextField.placeholderText=Sobrenome",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "showClearButton:true;JTextField.placeholderText=ex. 22/05/2030",
                "",
                "",
                "",
                "showClearButton:true;JTextField.placeholderText=exemplo@gmail.com",
                "",
                "font:bold +1"
            }
        ));
        crazyPanel.setMigLayoutConstraints(new raven.crazypanel.MigLayoutConstraints(
            "wrap 2,fillx,insets 25",
            "[grow 0,trail]15[fill]",
            "",
            new String[]{
                "wrap,al lead",
                "wrap,al lead",
                "wrap,al lead",
                "",
                "split 2",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "span 2,grow 1",
                "wrap,al lead",
                "wrap,al lead",
                "",
                "split 2",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "span 2,al trail"
            }
        ));

        jLabel1.setText("Cadastro de Cliente");
        crazyPanel.add(jLabel1);

        jLabel2.setText("Contato");
        crazyPanel.add(jLabel2);

        jLabel3.setText("Informações pessoais");
        crazyPanel.add(jLabel3);

        jLabel4.setText("Nome Completo");
        crazyPanel.add(jLabel4);
        crazyPanel.add(txtNome);
        crazyPanel.add(txtSobrenome);

        jLabel5.setText("CPF");
        crazyPanel.add(jLabel5);

        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCpfKeyTyped(evt);
            }
        });
        crazyPanel.add(txtCpf);

        jLabel6.setText("RG");
        crazyPanel.add(jLabel6);

        txtRg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRgKeyTyped(evt);
            }
        });
        crazyPanel.add(txtRg);

        jLabel7.setText("CNH");
        crazyPanel.add(jLabel7);
        crazyPanel.add(txtCnh);

        jLabel8.setText("Vencimento CNH");
        crazyPanel.add(jLabel8);
        crazyPanel.add(txtVencimentoCnh);

        jLabel11.setText("Telefone");
        crazyPanel.add(jLabel11);

        try {
            txtfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        crazyPanel.add(txtfTelefone);

        jLabel12.setText("Email");
        crazyPanel.add(jLabel12);

        txtEmail.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        crazyPanel.add(txtEmail);
        crazyPanel.add(jSeparator1);

        jLabel9.setText("Endereço");
        crazyPanel.add(jLabel9);

        jLabel13.setText("Informações de onde o cliente mora");
        crazyPanel.add(jLabel13);

        jLabel10.setText("CEP");
        crazyPanel.add(jLabel10);

        try {
            txtfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        crazyPanel.add(txtfCep);

        btnConsultarCep.setText("Consultar");
        btnConsultarCep.addActionListener(this::btnConsultarCepActionPerformed);
        crazyPanel.add(btnConsultarCep);

        jLabel14.setText("Rua");
        crazyPanel.add(jLabel14);

        txtRua.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        crazyPanel.add(txtRua);

        jLabel15.setText("Numero");
        crazyPanel.add(jLabel15);

        txtNumero.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        crazyPanel.add(txtNumero);

        jLabel16.setText("Bairro");
        crazyPanel.add(jLabel16);

        txtBairro.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        crazyPanel.add(txtBairro);

        jLabel17.setText("Cidade");
        crazyPanel.add(jLabel17);

        txtCidade.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        crazyPanel.add(txtCidade);

        jLabel18.setText("Estado");
        crazyPanel.add(jLabel18);

        txtEstado.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        crazyPanel.add(txtEstado);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(this::btnSalvarActionPerformed);
        crazyPanel.add(btnSalvar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 612, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(crazyPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 600, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 666, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(crazyPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 654, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyTyped
        String numCpf = txtCpf.getText();

        if (numCpf.length() >= 11) {
            numCpf = numCpf.substring(0, numCpf.length() - 1).trim();
            txtCpf.setText(numCpf);
        }
    }//GEN-LAST:event_txtCpfKeyTyped

    private void txtRgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRgKeyTyped
        String numRG = txtRg.getText();

        if (numRG.length() >= 9) {
            numRG = numRG.substring(0, numRG.length() - 1).trim();
            txtRg.setText(numRG);
        }
    }//GEN-LAST:event_txtRgKeyTyped

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        List<String> erros = validarCampos();

        if (erros.isEmpty()) {
            EnderecoDTO endereco = new EnderecoDTO(
                    txtRua.getText(),
                    txtNumero.getText(),
                    txtBairro.getText(),
                    txtCidade.getText(),
                    txtEstado.getText(),
                    txtfCep.getText()
            );

            ClienteDTO cliente = new ClienteDTO(
                    txtNome.getText() + " " + txtSobrenome.getText(),
                    txtRg.getText(),
                    txtCpf.getText(),
                    txtCnh.getText(),
                    LocalDate.parse(txtVencimentoCnh.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                    txtEmail.getText(),
                    txtfTelefone.getText()
            );
            try {
            new ClienteService().save(cliente, endereco);
            JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                int resposta = JOptionPane.showConfirmDialog(this, "Deseja cadastrar um novo cliente?", "Cadastrar Novo", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    limparCampos();
                } else {
                    Utils.sair(this);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar o cliente no sistema: " + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            exibirErros(erros);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnConsultarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCepActionPerformed
        consultarCep(txtfCep.getText());
    }//GEN-LAST:event_btnConsultarCepActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarCep;
    private javax.swing.JButton btnSalvar;
    private raven.crazypanel.CrazyPanel crazyPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCnh;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtSobrenome;
    private javax.swing.JTextField txtVencimentoCnh;
    private javax.swing.JFormattedTextField txtfCep;
    private javax.swing.JFormattedTextField txtfTelefone;
    // End of variables declaration//GEN-END:variables
}
