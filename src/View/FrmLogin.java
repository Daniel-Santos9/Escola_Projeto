package View;

import Model.DAO.UsuarioDAO;
import Model.bean.Usuario;
import java.awt.Cursor;
import javax.swing.JOptionPane;

public class FrmLogin extends javax.swing.JFrame {
    
    private int mouseX = 0;
    private int mouseY = 0;

    public FrmLogin() {
        initComponents();
        jLabelMsg.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jCancelarBtn = new javax.swing.JButton();
        jLEntrarBtn = new javax.swing.JButton();
        jLabelMinimize = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jPanelLogin = new javax.swing.JPanel();
        jLabelSenha = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jLabelLogo = new javax.swing.JLabel();
        jLabelMsg = new javax.swing.JLabel();
        jLabelBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login no Sistema");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(515, 360));
        setResizable(false);
        setSize(new java.awt.Dimension(515, 360));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("LOGIN");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 160, 40));

        jCancelarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/CancelarBtn.png"))); // NOI18N
        jCancelarBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 2, true));
        jCancelarBtn.setPreferredSize(new java.awt.Dimension(194, 51));
        jCancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(jCancelarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        jLEntrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        jLEntrarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EntrarBtn.png"))); // NOI18N
        jLEntrarBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 2, true));
        jLEntrarBtn.setPreferredSize(new java.awt.Dimension(194, 51));
        jLEntrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLEntrarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(jLEntrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabelMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Minimize.png"))); // NOI18N
        jLabelMinimize.setToolTipText("Minimizar");
        jLabelMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jLabelClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Fechar.png"))); // NOI18N
        jLabelClose.setToolTipText("Fechar");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jPanelLogin.setBackground(new java.awt.Color(255, 255, 255));

        jLabelSenha.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(56, 164, 220));
        jLabelSenha.setText("SENHA:");
        jLabelSenha.setPreferredSize(new java.awt.Dimension(90, 34));

        jLabelUsuario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(56, 164, 220));
        jLabelUsuario.setText("USUÁRIO:");
        jLabelUsuario.setPreferredSize(new java.awt.Dimension(116, 34));

        jTFUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTFUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFUsuario.setPreferredSize(new java.awt.Dimension(181, 34));
        jTFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUsuarioActionPerformed(evt);
            }
        });

        jPasswordField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPasswordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPasswordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jPasswordField.setPreferredSize(new java.awt.Dimension(181, 34));
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
            .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLoginLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLoginLayout.createSequentialGroup()
                    .addGap(20, 26, Short.MAX_VALUE)
                    .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(16, 16, 16)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 330, 140));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LogoLogin.png"))); // NOI18N
        jLabelLogo.setName(""); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 130, 110));

        jLabelMsg.setBackground(new java.awt.Color(56, 160, 224));
        jLabelMsg.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabelMsg.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMsg.setText("Por favor preencha todos os campos!");
        jLabelMsg.setOpaque(true);
        getContentPane().add(jLabelMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 230, -1));

        jLabelBG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TelaLogin.png"))); // NOI18N
        jLabelBG.setPreferredSize(new java.awt.Dimension(515, 360));
        jLabelBG.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelBGMouseDragged(evt);
            }
        });
        jLabelBG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelBGMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelBGMouseReleased(evt);
            }
        });
        getContentPane().add(jLabelBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelBGMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBGMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
        jLabelBG.setCursor(new Cursor(java.awt.Cursor.MOVE_CURSOR));
    }//GEN-LAST:event_jLabelBGMousePressed

    private void jLabelBGMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBGMouseDragged
        this.setLocation(evt.getXOnScreen() - mouseX, evt.getYOnScreen() - mouseY);
    }//GEN-LAST:event_jLabelBGMouseDragged

    private void jLabelBGMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBGMouseReleased
        jLabelBG.setCursor(new Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabelBGMouseReleased

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        this.setState(FrmLogin.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jLEntrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLEntrarBtnActionPerformed
        String login = jTFUsuario.getText();
        String senha = jPasswordField.getText();
        
        if(!login.equals("") || !senha.equals("")){
            
            jLabelMsg.setVisible(false);
            Usuario usu = new Usuario();
            UsuarioDAO udao = new UsuarioDAO();
            usu.setLogin(login);
            usu.setSenha(senha);

            if(udao.efetuarLogin(usu)){
                switch (usu.getTipo_user()) {
                    case "1": // Tela administrador
                        PrincipalWindow admin = new PrincipalWindow(usu);
                        admin.setVisible(true);
                        admin.setLocationRelativeTo(null);
                        this.dispose();
                        JOptionPane.showMessageDialog(null, "Login feito com Sucesso");
                        break;
                    case "2": // Tela Funcionario
                        PrincipalWindow func = new PrincipalWindow(usu);
                        func.setLocationRelativeTo(null);
                        func.setVisible(true);
                        this.dispose();
                        JOptionPane.showMessageDialog(null, "Login feito com Sucesso");
                        break;
                    case "3": // Tela Professor
                        FrmProfessorPrincipal prof = new FrmProfessorPrincipal(usu);
                        prof.setLocationRelativeTo(null);
                        prof.setVisible(true);
                        this.dispose();
                        JOptionPane.showMessageDialog(null, "Login feito com Sucesso");
                        break;
                    default:
                    break;
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Login e/ou Senha Incorretos");
            }
        }
        else{
            jLabelMsg.setVisible(true);
            JOptionPane.showMessageDialog(null, "Campo(s) de Login e/ou Senha em Branco");
        }
    }//GEN-LAST:event_jLEntrarBtnActionPerformed

    private void jCancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelarBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_jCancelarBtnActionPerformed

    private void jTFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFUsuarioActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        jLEntrarBtnActionPerformed(evt);
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCancelarBtn;
    private javax.swing.JButton jLEntrarBtn;
    private javax.swing.JLabel jLabelBG;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelMsg;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
