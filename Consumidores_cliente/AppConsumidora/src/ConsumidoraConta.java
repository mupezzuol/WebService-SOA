import java.util.List;
import javax.swing.JOptionPane;
public class ConsumidoraConta extends javax.swing.JFrame {
    public ConsumidoraConta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdConta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelSaldo = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnSacar = new javax.swing.JButton();
        btnDepositar = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        lblTextoOp = new javax.swing.JLabel();
        lblCriarConta = new javax.swing.JLabel();
        txtSenhaAbertura = new javax.swing.JTextField();
        txtNomeAbertura = new javax.swing.JTextField();
        lblNomeAbertura = new javax.swing.JLabel();
        lblSenhaAbertura = new javax.swing.JLabel();
        btnCriarConta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Conta");

        txtIdConta.setName("txtidConta"); // NOI18N

        jLabel2.setText("Nome:");

        labelNome.setText("Digite o número da conta");
        labelNome.setName("labelNome"); // NOI18N

        jLabel4.setText("Saldo:");

        labelSaldo.setText("Digite o número da conta");
        labelSaldo.setName("labelSaldo"); // NOI18N

        btnConsultar.setText("Consultar");
        btnConsultar.setName("btnConsultar"); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnSacar.setText("Sacar");
        btnSacar.setName("botaoConsultar"); // NOI18N
        btnSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarActionPerformed(evt);
            }
        });

        btnDepositar.setText("Depositar");
        btnDepositar.setToolTipText("");
        btnDepositar.setActionCommand("");
        btnDepositar.setName("botaoConsultar"); // NOI18N
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        txtValor.setToolTipText("");
        txtValor.setName("txtidConta"); // NOI18N

        lblValor.setText("Valor:");

        txtSenha.setToolTipText("");
        txtSenha.setName("txtidConta"); // NOI18N

        lblSenha.setText("Senha:");

        lblTextoOp.setText("DEPOIS DE CONSULTAR: SAQUE OU DEPOSITE NA SUA CONTA");
        lblTextoOp.setName("labelSaldo"); // NOI18N

        lblCriarConta.setText("CRIE JÁ SUA CONTA, É FÁCIL E RÁPIDO!");
        lblCriarConta.setName("labelSaldo"); // NOI18N

        txtSenhaAbertura.setToolTipText("");
        txtSenhaAbertura.setName("txtidConta"); // NOI18N

        txtNomeAbertura.setToolTipText("");
        txtNomeAbertura.setName("txtidConta"); // NOI18N

        lblNomeAbertura.setText("Nome:");

        lblSenhaAbertura.setText("Senha:");

        btnCriarConta.setText("CRIAR CONTA");
        btnCriarConta.setName("btnConsultar"); // NOI18N
        btnCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarContaActionPerformed(evt);
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
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelSaldo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelNome)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNomeAbertura)
                                        .addComponent(lblSenhaAbertura))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNomeAbertura)
                                        .addComponent(txtSenhaAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(lblCriarConta, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCriarConta)
                                .addGap(44, 44, 44)))
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdConta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblValor)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtValor))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblSenha)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSenha))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnSacar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnDepositar))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(lblTextoOp)
                    .addContainerGap(213, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(labelNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(labelSaldo)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCriarConta)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSenhaAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSenhaAbertura)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblNomeAbertura)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCriarConta)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSacar)
                    .addComponent(btnDepositar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(lblTextoOp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(101, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
                                    
        try {
            // Chamo meu webService e estancio ele
            ws.ServicoContaService servico = new ws.ServicoContaService();
            ws.ServicoConta webservice = servico.getServicoConta();
            
            //crio uma LIST e coloco o que vira do webservice
            List<String> resultado = (List<String>) webservice.consultarDadosConta(Integer.parseInt(txtIdConta.getText()));

            //Se resultado não retornou vazio
            if (!resultado.get(0).equals("")) {
                //Exibe resultado da busca
                labelNome.setText(resultado.get(0));
                labelSaldo.setText(resultado.get(1));

                lblTextoOp.setVisible(true);
                lblValor.setVisible(true);
                lblSenha.setVisible(true);
                txtValor.setVisible(true);
                txtSenha.setVisible(true);
                btnSacar.setVisible(true);
                btnDepositar.setVisible(true);
            }  
            else {
                //Alerta se resultado não encontrado
                JOptionPane.showMessageDialog(null, "Conta não encontrada!");
            }
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarActionPerformed
        try {
            // Chamo meu webService e estancio ele
            ws.ServicoContaService servico = new ws.ServicoContaService();
            ws.ServicoConta webservice = servico.getServicoConta();
            
            //Converso o que vem dos TXT da tela do usuario
            double vr = Double.parseDouble(txtValor.getText());  
            int  id = Integer.parseInt(txtIdConta.getText()); 
            
            //Chamo o 'sacar' do webservice
            webservice.sacar(id, vr , txtSenha.getText());
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
            txtValor.setText("");
            txtSenha.setText("");
            lblTextoOp.setVisible(false);
            lblValor.setVisible(false);
            lblSenha.setVisible(false);
            txtValor.setVisible(false);
            txtSenha.setVisible(false);
            btnSacar.setVisible(false);
            btnDepositar.setVisible(false);
            
            //crio uma LIST e coloco o que vira do webservice
            List<String> resultado = (List<String>) webservice.consultarDadosConta(Integer.parseInt(txtIdConta.getText()));

            //Se resultado não retornou vazio
            if (!resultado.get(0).equals("")) {
                //Exibe resultado da busca
                labelNome.setText(resultado.get(0));
                labelSaldo.setText(resultado.get(1));
            }
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnSacarActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        try {
            // Chamo meu webService e estancio ele
            ws.ServicoContaService servico = new ws.ServicoContaService();
            ws.ServicoConta webservice = servico.getServicoConta();
            
            //Converso o que vem dos TXT da tela do usuario
            double vr = Double.parseDouble(txtValor.getText());  
            int  id = Integer.parseInt(txtIdConta.getText()); 
            
            //Chamo o 'sacar' do webservice
            webservice.depositar(id, vr, txtSenha.getText());
            
            JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso!");
            txtValor.setText("");
            txtSenha.setText("");
            lblTextoOp.setVisible(false);
            lblValor.setVisible(false);
            lblSenha.setVisible(false);
            txtValor.setVisible(false);
            txtSenha.setVisible(false);
            btnSacar.setVisible(false);
            btnDepositar.setVisible(false);
            
            //crio uma LIST e coloco o que vira do webservice
            List<String> resultado = (List<String>) webservice.consultarDadosConta(Integer.parseInt(txtIdConta.getText()));

            //Se resultado não retornou vazio
            if (!resultado.get(0).equals("")) {
                //Exibe resultado da busca
                labelNome.setText(resultado.get(0));
                labelSaldo.setText(resultado.get(1));
            }
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        lblTextoOp.setVisible(false);
        lblValor.setVisible(false);
        lblSenha.setVisible(false);
        txtValor.setVisible(false);
        txtSenha.setVisible(false);
        btnSacar.setVisible(false);
        btnDepositar.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void btnCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarContaActionPerformed
        try {
            // Chamo meu webService e estancio ele
            ws.ServicoContaService servico = new ws.ServicoContaService();
            ws.ServicoConta webservice = servico.getServicoConta();
            
            //Chamo o 'sacar' do webservice
            webservice.aberturaDeConta(txtNomeAbertura.getText(), txtSenhaAbertura.getText());
            
            JOptionPane.showMessageDialog(null, "SUA CONTA FOI ABERTA COM SUCESSO! REALIZE SAQUES E DEPÓSITOS");
            txtNomeAbertura.setText("");
            txtSenhaAbertura.setText("");
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnCriarContaActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsumidoraConta().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnCriarConta;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnSacar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSaldo;
    private javax.swing.JLabel lblCriarConta;
    private javax.swing.JLabel lblNomeAbertura;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSenhaAbertura;
    private javax.swing.JLabel lblTextoOp;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtIdConta;
    private javax.swing.JTextField txtNomeAbertura;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtSenhaAbertura;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
