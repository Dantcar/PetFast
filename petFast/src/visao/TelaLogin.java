/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programa��o Orientada a Objetos - Avan�ada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */
package visao;


import static controle.UsuarioCtrl.logarUsuario;
import static controle.ValidaCampos.validaLogin;
import static controle.ValidaCampos.validaSenhaForte;
import javax.swing.JOptionPane;

/**
 *
 * @author deciodecarvalho
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaUsuario
     */
    public TelaLogin() {
        
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUsuario = new javax.swing.JPanel();
        btnUsuarioVoltar = new javax.swing.JButton();
        btnNovoUsuarioBd = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        tctLogin = new javax.swing.JTextField();
        lblUsuarioSenha = new javax.swing.JLabel();
        lblLogoPet = new javax.swing.JLabel();
        lblMensagem = new javax.swing.JLabel();
        tctSenha = new javax.swing.JPasswordField();

        btnUsuarioVoltar.setBackground(new java.awt.Color(204, 204, 204));
        btnUsuarioVoltar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnUsuarioVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/saidaDireitaRed.png"))); // NOI18N
        btnUsuarioVoltar.setText("Sair");
        btnUsuarioVoltar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnUsuarioVoltar.setPreferredSize(new java.awt.Dimension(100, 50));
        btnUsuarioVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioVoltarActionPerformed(evt);
            }
        });

        btnNovoUsuarioBd.setBackground(new java.awt.Color(204, 204, 204));
        btnNovoUsuarioBd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNovoUsuarioBd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/bdVerdeAlvo.png"))); // NOI18N
        btnNovoUsuarioBd.setText("Login Usuário");
        btnNovoUsuarioBd.setIconTextGap(2);
        btnNovoUsuarioBd.setInheritsPopupMenu(true);
        btnNovoUsuarioBd.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnNovoUsuarioBd.setPreferredSize(new java.awt.Dimension(100, 50));
        btnNovoUsuarioBd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUsuarioBdActionPerformed(evt);
            }
        });

        lblLogin.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(102, 102, 102));
        lblLogin.setText("Login: ");

        tctLogin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tctLogin.setForeground(new java.awt.Color(51, 51, 51));
        tctLogin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tctLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tctLoginMouseReleased(evt);
            }
        });

        lblUsuarioSenha.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblUsuarioSenha.setForeground(new java.awt.Color(102, 102, 102));
        lblUsuarioSenha.setText("Senha: ");

        lblLogoPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/petCatDog.jpg"))); // NOI18N
        lblLogoPet.setText(" ");

        tctSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelUsuarioLayout = new javax.swing.GroupLayout(panelUsuario);
        panelUsuario.setLayout(panelUsuarioLayout);
        panelUsuarioLayout.setHorizontalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnNovoUsuarioBd, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUsuarioVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelUsuarioLayout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelUsuarioLayout.createSequentialGroup()
                                    .addComponent(lblLogin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tctLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelUsuarioLayout.createSequentialGroup()
                                    .addComponent(lblUsuarioSenha)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tctSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(7, 7, 7)))
                    .addGroup(panelUsuarioLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(lblLogoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelUsuarioLayout.setVerticalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tctLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuarioSenha)
                    .addComponent(tctSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUsuarioVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovoUsuarioBd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnUsuarioVoltarActionPerformed

    private void btnNovoUsuarioBdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioBdActionPerformed
        //meu codigo aqui
        String login;
        String password;
        String msg="";
        login = tctLogin.getText().trim();
        password = tctSenha.getText().trim();
        
        boolean logarUsuarioPet = false;
        
        
        if (validaSenhaForte(password) && validaLogin(login)) {
        
            logarUsuarioPet = logarUsuario(login, password);
                if (logarUsuarioPet){
                    this.dispose();
                    msg ="Usuário: "+login+ " logado com sucesso";
                    String tituloPrincipal;
                    tituloPrincipal = "Gestão Petfast";
        
                    EntradaSistemaPetFast telaPrincipal = new EntradaSistemaPetFast();
                    telaPrincipal.setTitle(tituloPrincipal);
                     telaPrincipal.setVisible(true);
                    // JOptionPane.showMessageDialog(null, msg );
                }
        else{
             msg ="Usuário: "+login+ " falha login";
             JOptionPane.showMessageDialog(null, msg ); 
            }
        
        } else {
            msg = msg + "A Senha não atende o requisito: \n"
                    +"pelo menos uma letra minúscula\n"
                    +"pelo menos uma letra maiúscula\n"
                    +"pelo menos um número\n"
                    +"pelo menos um caractere especial\n"
                    +"minímo de 8 caracteres e máximo de 15\n"
                    +"ou usuário invalido"
                    ;
            JOptionPane.showMessageDialog(null, msg );
        }
        
        
    }//GEN-LAST:event_btnNovoUsuarioBdActionPerformed

    private void tctLoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tctLoginMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tctLoginMouseReleased

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
                java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        //</editor-fold>
            //</editor-fold>
        //</editor-fold>
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new TelaLogin().setVisible(true);
                }
            });
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovoUsuarioBd;
    private javax.swing.JButton btnUsuarioVoltar;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogoPet;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblUsuarioSenha;
    private javax.swing.JPanel panelUsuario;
    private static javax.swing.JTextField tctLogin;
    private javax.swing.JPasswordField tctSenha;
    // End of variables declaration//GEN-END:variables
}