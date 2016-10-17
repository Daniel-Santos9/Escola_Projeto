package View;

import Model.DAO.ProfessorDAO;
import Model.bean.Professor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FrmProfessor extends javax.swing.JFrame {

    private List<Professor> listProfessor = null;
    private Professor p = null;
    
    public FrmProfessor() {
        initComponents();
        loadProfessoresJTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProfessores = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jNomeLabel = new javax.swing.JLabel();
        jCPFLabel = new javax.swing.JLabel();
        jRGLabel = new javax.swing.JLabel();
        jEmailLabel = new javax.swing.JLabel();
        jGraduaçãoLabel = new javax.swing.JLabel();
        jUsernameLabel = new javax.swing.JLabel();
        jMostrarProfBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("INFORMAÇÕES PROFESSORES");

        jTableProfessores.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableProfessores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Professor", "Nome Professor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProfessores.setRowHeight(20);
        jTableProfessores.setRowMargin(2);
        jTableProfessores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProfessoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProfessores);

        jNomeLabel.setText("NOME:");

        jCPFLabel.setText("CPF:");

        jRGLabel.setText("RG:");

        jEmailLabel.setText("E-MAIL: ");

        jGraduaçãoLabel.setText("GRADUAÇÃO: ");

        jUsernameLabel.setText("USERNAME:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEmailLabel)
                    .addComponent(jGraduaçãoLabel)
                    .addComponent(jNomeLabel)
                    .addComponent(jCPFLabel)
                    .addComponent(jRGLabel)
                    .addComponent(jUsernameLabel))
                .addContainerGap(456, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jNomeLabel)
                .addGap(26, 26, 26)
                .addComponent(jCPFLabel)
                .addGap(26, 26, 26)
                .addComponent(jRGLabel)
                .addGap(26, 26, 26)
                .addComponent(jEmailLabel)
                .addGap(26, 26, 26)
                .addComponent(jGraduaçãoLabel)
                .addGap(26, 26, 26)
                .addComponent(jUsernameLabel)
                .addContainerGap())
        );

        jMostrarProfBtn.setText("Informações");
        jMostrarProfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMostrarProfBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jMostrarProfBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jMostrarProfBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableProfessoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProfessoresMouseClicked

    }//GEN-LAST:event_jTableProfessoresMouseClicked

    private void jMostrarProfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMostrarProfBtnActionPerformed
        int selIndex = jTableProfessores.getSelectedRow();        
        if(selIndex>=0){
            p = listProfessor.get(selIndex);
            jNomeLabel.setText("NOME: " + p.getNome());
            jCPFLabel.setText("CPF: " + p.getCPF());
            jRGLabel.setText("RG: " + p.getRG());
            jEmailLabel.setText("EMAIL: " + p.getEmail());
            jGraduaçãoLabel.setText("GRADUAÇÃO: " +p.getGraduacao());
            jUsernameLabel.setText("USERNAME: " + p.getLogin());
        }
        else{
            JOptionPane.showMessageDialog(null,"Selecione um Professor para Visualizar Informações");
        }
    }//GEN-LAST:event_jMostrarProfBtnActionPerformed

        private void loadProfessoresJTable(){
        DefaultTableModel model = (DefaultTableModel) jTableProfessores.getModel();
        ProfessorDAO profDAO = new ProfessorDAO();                        
        listProfessor = profDAO.ListarProfessores();
        
        for(Professor p: listProfessor){
            model.addRow(new Object[]{
                p.getProf_id(),
                p.getNome()
            });
        }    
    }
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
            java.util.logging.Logger.getLogger(FrmProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCPFLabel;
    private javax.swing.JLabel jEmailLabel;
    private javax.swing.JLabel jGraduaçãoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jMostrarProfBtn;
    private javax.swing.JLabel jNomeLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jRGLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProfessores;
    private javax.swing.JLabel jUsernameLabel;
    // End of variables declaration//GEN-END:variables
}
