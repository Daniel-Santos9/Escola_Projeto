package View;

import Model.DAO.TurmaDAO;
import Model.bean.Turma;
import Model.bean.Usuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FrmProfessorPrincipal extends javax.swing.JFrame {

    private Usuario userLogged;
    private List<Turma> listTurma = null;
    
    public FrmProfessorPrincipal(Usuario u) {
        initComponents();
        userLogged = u;
        jLoginLabel.setText(userLogged.getNome());
        jLabelLogout.setVisible(false);
        loadTurmasTable();
    }

    private FrmProfessorPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelLogoEscola = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLoginLabel = new javax.swing.JLabel();
        jLabelIconUser = new javax.swing.JLabel();
        jLabelLogout = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableTurmas6 = new javax.swing.JTable();
        jLabelTurmas = new javax.swing.JLabel();
        jLabelInformativo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(56, 160, 224));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogoEscola.setFont(new java.awt.Font("Open Sans Semibold", 0, 18)); // NOI18N
        jLabelLogoEscola.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogoEscola.setText("Escola E.E.I.F. Paulo VI");
        jPanel2.add(jLabelLogoEscola, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel3.setBackground(new java.awt.Color(56, 160, 224));
        jPanel3.setForeground(new java.awt.Color(56, 160, 224));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLoginLabel.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLoginLabel.setText("Expedito Alves");
        jPanel3.add(jLoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 130, -1));

        jLabelIconUser.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabelIconUser.setForeground(new java.awt.Color(81, 94, 102));
        jLabelIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/userImg.png"))); // NOI18N
        jLabelIconUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelIconUserMouseClicked(evt);
            }
        });
        jPanel3.add(jLabelIconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 10, -1, -1));

        jLabelLogout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelLogout.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogout.setText("Logout");
        jLabelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogoutMouseClicked(evt);
            }
        });
        jPanel3.add(jLabelLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 42, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 220, 60));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane7.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setBorder(null);

        jTableTurmas6.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jTableTurmas6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disciplina", "Turno", "Série", "Sala", "Ano"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTurmas6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableTurmas6.setGridColor(new java.awt.Color(189, 195, 199));
        jTableTurmas6.setRowHeight(20);
        jTableTurmas6.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTurmas6.getTableHeader().setReorderingAllowed(false);
        jTableTurmas6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTurmas6jTableTurmasMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTableTurmas6);
        jTableTurmas6.getAccessibleContext().setAccessibleDescription("");

        jLabelTurmas.setFont(new java.awt.Font("Open Sans Semibold", 0, 18)); // NOI18N
        jLabelTurmas.setForeground(new java.awt.Color(56, 160, 224));
        jLabelTurmas.setText("TURMAS");
        jLabelTurmas.setMaximumSize(new java.awt.Dimension(65, 26));
        jLabelTurmas.setMinimumSize(new java.awt.Dimension(65, 26));
        jLabelTurmas.setPreferredSize(new java.awt.Dimension(65, 26));

        jLabelInformativo.setForeground(new java.awt.Color(56, 160, 224));
        jLabelInformativo.setText("dê dois cliques sobre uma turma para visualizar os alunos matriculados");
        jLabelInformativo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelInformativo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInformativojLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelInformativo)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInformativo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelIconUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIconUserMouseClicked
        jLabelLogout.setVisible(true);
    }//GEN-LAST:event_jLabelIconUserMouseClicked

    private void jLabelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogoutMouseClicked
        FrmLogin lg = new FrmLogin();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelLogoutMouseClicked

    private void jTableTurmas6jTableTurmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTurmas6jTableTurmasMouseClicked
        if (evt.getClickCount() > 1) {
            int selIndex = jTableTurmas6.getSelectedRow();

            VisualizarTurma vt = new VisualizarTurma(listTurma.get(selIndex), userLogged);
            vt.setVisible(true);
        }
    }//GEN-LAST:event_jTableTurmas6jTableTurmasMouseClicked
    private void loadTurmasTable() {
        DefaultTableModel model = (DefaultTableModel) jTableTurmas6.getModel();
        TurmaDAO turmaDAO = new TurmaDAO();

        listTurma = turmaDAO.read(userLogged.getLogin());

        for (Turma t : listTurma) {
            model.addRow(new Object[]{
                t.getDisc_nome(),
                t.getTurno(),
                t.getSerie(),
                t.getSala(),
                t.getAno()
            });
        }
    }
    
    private void jLabelInformativojLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInformativojLabel10MouseClicked

    }//GEN-LAST:event_jLabelInformativojLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(FrmProfessorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProfessorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProfessorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProfessorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmProfessorPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelIconUser;
    private javax.swing.JLabel jLabelInformativo;
    private javax.swing.JLabel jLabelLogoEscola;
    private javax.swing.JLabel jLabelLogout;
    private javax.swing.JLabel jLabelTurmas;
    private javax.swing.JLabel jLoginLabel;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTableTurmas6;
    // End of variables declaration//GEN-END:variables
}
