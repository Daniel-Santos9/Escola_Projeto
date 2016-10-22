package View;

import Model.DAO.AlunoDAO;
import Model.bean.Aluno;
import Model.bean.Turma;
import Model.bean.Usuario;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class FrmTurmaInformativo extends javax.swing.JFrame {
    
    public Turma t ;
    public Usuario u ;
    private boolean flag = false;
    private List<Aluno> listAluno = null;

    public FrmTurmaInformativo(Turma t, Usuario u) {   
        initComponents();
        this.t = t;
        this.u = u;
        loadAlunosJTable();
        jTFTurma.setEnabled(false);
        jTFSala.setEnabled(false);
        jTFAno.setEnabled(false);
        jTFTurno.setEnabled(false);
        jTFDisciplina.setEnabled(false);
        jTFProfessor.setEnabled(false);
        
        jTFTurma.setText(this.t.getSerie());
        jTFSala.setText(this.t.getSala());
        jTFAno.setText(this.t.getAno());
        jTFTurno.setText(this.t.getTurno());
        jTFDisciplina.setText(this.t.getDisc_nome());
        jTFProfessor.setText(this.u.getNome());
    }
    
    public FrmTurmaInformativo() {        
        initComponents();                       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlunos = new javax.swing.JTable();
        jCadastrarNotaBtn = new javax.swing.JButton();
        jPanelMenu = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelInformativo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jDisciplinaLabel = new javax.swing.JLabel();
        jAnoLabel = new javax.swing.JLabel();
        jProfessorLabel = new javax.swing.JLabel();
        jSalaLabel = new javax.swing.JLabel();
        jTFSala = new javax.swing.JTextField();
        jTFTurma = new javax.swing.JTextField();
        jTFProfessor = new javax.swing.JTextField();
        jTFAno = new javax.swing.JTextField();
        jTurmaLabel = new javax.swing.JLabel();
        jTFDisciplina = new javax.swing.JTextField();
        jTurnoLabel = new javax.swing.JLabel();
        jTFTurno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 2, true));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));

        jTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Chamada", "Nome Completo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAlunos.setColumnSelectionAllowed(true);
        jTableAlunos.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jTableAlunos.setRowHeight(20);
        jTableAlunos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTableAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlunos);
        jTableAlunos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTableAlunos.getColumnModel().getColumnCount() > 0) {
            jTableAlunos.getColumnModel().getColumn(0).setMinWidth(100);
            jTableAlunos.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTableAlunos.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jCadastrarNotaBtn.setBackground(new java.awt.Color(255, 255, 255));
        jCadastrarNotaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buttons/CadNotaBtn.png"))); // NOI18N
        jCadastrarNotaBtn.setBorder(null);
        jCadastrarNotaBtn.setBorderPainted(false);
        jCadastrarNotaBtn.setFocusPainted(false);
        jCadastrarNotaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCadastrarNotaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCadastrarNotaBtnMouseExited(evt);
            }
        });
        jCadastrarNotaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarNotaBtnActionPerformed(evt);
            }
        });

        jPanelMenu.setBackground(new java.awt.Color(56, 160, 224));

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("INFORMAÇÕES TURMA");
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(248, 40));

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        jLabelInformativo.setForeground(new java.awt.Color(56, 160, 224));
        jLabelInformativo.setText("Clique duas vezes sobre um aluno para visualizar as informações referentes ao mesmo");
        jLabelInformativo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelInformativo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInformativojLabel10MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));

        jDisciplinaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jDisciplinaLabel.setForeground(new java.awt.Color(56, 160, 224));
        jDisciplinaLabel.setText("DISCIPLINA:");

        jAnoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jAnoLabel.setForeground(new java.awt.Color(56, 160, 224));
        jAnoLabel.setText("ANO:");

        jProfessorLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jProfessorLabel.setForeground(new java.awt.Color(56, 160, 224));
        jProfessorLabel.setText("PROFESSOR:");

        jSalaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jSalaLabel.setForeground(new java.awt.Color(56, 160, 224));
        jSalaLabel.setText("SALA:");

        jTFSala.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTFSala.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFSala.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFSala.setEnabled(false);
        jTFSala.setPreferredSize(new java.awt.Dimension(181, 23));
        jTFSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFSalaActionPerformed(evt);
            }
        });

        jTFTurma.setBackground(new java.awt.Color(240, 240, 240));
        jTFTurma.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTFTurma.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFTurma.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFTurma.setEnabled(false);
        jTFTurma.setPreferredSize(new java.awt.Dimension(181, 23));
        jTFTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTurmaActionPerformed(evt);
            }
        });

        jTFProfessor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTFProfessor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFProfessor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFProfessor.setEnabled(false);
        jTFProfessor.setPreferredSize(new java.awt.Dimension(181, 23));
        jTFProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFProfessorActionPerformed(evt);
            }
        });

        jTFAno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTFAno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFAno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFAno.setEnabled(false);
        jTFAno.setPreferredSize(new java.awt.Dimension(181, 23));
        jTFAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAnoActionPerformed(evt);
            }
        });

        jTurmaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTurmaLabel.setForeground(new java.awt.Color(56, 160, 224));
        jTurmaLabel.setText("TURMA:");

        jTFDisciplina.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTFDisciplina.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFDisciplina.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFDisciplina.setEnabled(false);
        jTFDisciplina.setPreferredSize(new java.awt.Dimension(181, 23));
        jTFDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDisciplinaActionPerformed(evt);
            }
        });

        jTurnoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTurnoLabel.setForeground(new java.awt.Color(56, 160, 224));
        jTurnoLabel.setText("TURNO:");

        jTFTurno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTFTurno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFTurno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFTurno.setEnabled(false);
        jTFTurno.setPreferredSize(new java.awt.Dimension(181, 23));
        jTFTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTurnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDisciplinaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jAnoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTurmaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(jTFAno, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(jTFTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jSalaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTurnoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jTFSala, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jProfessorLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jTFProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSalaLabel))
                        .addComponent(jTFTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTurmaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTurnoLabel)
                    .addComponent(jAnoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jTFDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProfessorLabel)
                    .addComponent(jTFProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDisciplinaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInformativo)
                    .addComponent(jCadastrarNotaBtn))
                .addGap(0, 87, Short.MAX_VALUE))
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCadastrarNotaBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInformativo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCadastrarNotaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarNotaBtnActionPerformed
        int selIndex = jTableAlunos.getSelectedRow();        
        if(selIndex>=0){
            FrmNotas nt = new FrmNotas(listAluno.get(selIndex),u,t);
            nt.setLocationRelativeTo(null);
            nt.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Selecione um aluno para cadastra uma nota");
        }
    }//GEN-LAST:event_jCadastrarNotaBtnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void jTableAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunosMouseClicked
        if (evt.getClickCount() > 1) {
            int selIndex = jTableAlunos.getSelectedRow();
            if(selIndex>=0){
                FrmCadastroAlunos ca = new FrmCadastroAlunos(u,listAluno.get(selIndex));
                ca.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"Selecione um aluno para Ver informações");
            }
        }
    }//GEN-LAST:event_jTableAlunosMouseClicked

    private void jLabelInformativojLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInformativojLabel10MouseClicked

    }//GEN-LAST:event_jLabelInformativojLabel10MouseClicked

    private void jTFSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFSalaActionPerformed

    private void jTFTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTurmaActionPerformed

    private void jTFProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFProfessorActionPerformed

    private void jTFAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFAnoActionPerformed

    private void jTFDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDisciplinaActionPerformed

    private void jTFTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTurnoActionPerformed

    private void jCadastrarNotaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCadastrarNotaBtnMouseEntered
        jCadastrarNotaBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/CadNota_FocusBtn.png")));
    }//GEN-LAST:event_jCadastrarNotaBtnMouseEntered

    private void jCadastrarNotaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCadastrarNotaBtnMouseExited
        jCadastrarNotaBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/CadNotaBtn.png")));
    }//GEN-LAST:event_jCadastrarNotaBtnMouseExited

    
    private void loadAlunosJTable(){
        DefaultTableModel model = (DefaultTableModel) jTableAlunos.getModel();
        AlunoDAO alunoDAO = new AlunoDAO();
        int cont = 0;
        listAluno = alunoDAO.listAlunos(t);
        
        for(Aluno a: listAluno){
            ++cont;
            model.addRow(new Object[]{
                cont,
                a.getNome()
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmTurmaInformativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTurmaInformativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTurmaInformativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTurmaInformativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTurmaInformativo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAnoLabel;
    private javax.swing.JButton jCadastrarNotaBtn;
    private javax.swing.JLabel jDisciplinaLabel;
    private javax.swing.JLabel jLabelInformativo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JLabel jProfessorLabel;
    private javax.swing.JLabel jSalaLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFAno;
    private javax.swing.JTextField jTFDisciplina;
    private javax.swing.JTextField jTFProfessor;
    private javax.swing.JTextField jTFSala;
    private javax.swing.JTextField jTFTurma;
    private javax.swing.JTextField jTFTurno;
    private javax.swing.JTable jTableAlunos;
    private javax.swing.JLabel jTurmaLabel;
    private javax.swing.JLabel jTurnoLabel;
    // End of variables declaration//GEN-END:variables
}
