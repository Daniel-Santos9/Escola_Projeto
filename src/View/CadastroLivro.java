package View;

import Model.DAO.DisciplinaDAO;
import Model.DAO.ExemplarDAO;
import Model.DAO.LivroDAO;
import Model.bean.Disciplina;
import Model.bean.Exemplar;
import Model.bean.Livro;
import Model.bean.Usuario;
import java.util.List;
import javax.swing.JOptionPane;

public class CadastroLivro extends javax.swing.JFrame {
    private List<Disciplina> listDisciplina = null;
    private Usuario u;
    private DisciplinaDAO ddao = new DisciplinaDAO();
    private Exemplar exe;
    private ExemplarDAO edao = new ExemplarDAO();
    private Livro l = new Livro();
    private LivroDAO ldao = new LivroDAO();
    
    public CadastroLivro() {
        initComponents();
        jLabelMsg.setVisible(false);
        PreencheDisciplina();
    }
    
    public CadastroLivro(Usuario u) {
        initComponents();
        this.u = u;
        jLabelMsg.setVisible(false);
        PreencheDisciplina();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDisciplinaCb = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jNomeTextField = new javax.swing.JTextField();
        jQtdTextField = new javax.swing.JTextField();
        jDescricaoTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProfessores = new javax.swing.JTable();
        jSalvarBtn = new javax.swing.JButton();
        jLabelMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("CADASTRO DE LIVROS");

        jLabel2.setText("NOME:");

        jLabel3.setText("DESCRIÇÃO: ");

        jDisciplinaCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DISCIPLINA" }));

        jLabel4.setText("QUANTIDADE:");

        jTableProfessores.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableProfessores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Livro", "Nome", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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

        jSalvarBtn.setText("SALVAR");
        jSalvarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalvarBtnActionPerformed(evt);
            }
        });

        jLabelMsg.setBackground(new java.awt.Color(231, 76, 60));
        jLabelMsg.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabelMsg.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMsg.setText("Por favor preencha todos os campos!");
        jLabelMsg.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jNomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jDescricaoTextField)))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jQtdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jDisciplinaCb, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSalvarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabelMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQtdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jDescricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDisciplinaCb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jSalvarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableProfessoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProfessoresMouseClicked

    }//GEN-LAST:event_jTableProfessoresMouseClicked

    private void jSalvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalvarBtnActionPerformed
        
        if(!jDescricaoTextField.getText().equals("") || !jNomeTextField.getText().equals("") || !jQtdTextField.getText().equals("") || jDisciplinaCb.getSelectedItem()== null){   
            jLabelMsg.setVisible(false);
            exe.setDescricao(jDescricaoTextField.getText());
            exe.setNome(jNomeTextField.getText());
            int qtd = Integer.parseInt(jQtdTextField.getText());
            
            if(ldao.create(l,(Disciplina) jDisciplinaCb.getSelectedItem(), u.getUser_id())){
                for(int i = 1; i <= qtd; i++){
                    exe.setTombamento(Integer.toString(i));
                    
                    if(!edao.create(exe, l, u.getUser_id())){
                        JOptionPane.showMessageDialog(null, "Erro ao Cadastrar");  
                    }
                }
 
                JOptionPane.showMessageDialog(null, "Livros Cadastrados com sucesso");  
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar");  
            }
        }
        else{
            jLabelMsg.setVisible(true);
        }
        
    }//GEN-LAST:event_jSalvarBtnActionPerformed

    private void PreencheDisciplina(){                       
        listDisciplina = ddao.ListDisciplina();
        jDisciplinaCb.removeAllItems();
        for(Disciplina d: listDisciplina){
            jDisciplinaCb.addItem(d);
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
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jDescricaoTextField;
    private javax.swing.JComboBox<Object> jDisciplinaCb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelMsg;
    private javax.swing.JTextField jNomeTextField;
    private javax.swing.JTextField jQtdTextField;
    private javax.swing.JButton jSalvarBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProfessores;
    // End of variables declaration//GEN-END:variables
}
