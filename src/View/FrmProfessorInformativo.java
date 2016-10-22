package View;

import Model.DAO.DisciplinaDAO;
import Model.DAO.ProfessorDAO;
import Model.DAO.TurmaDAO;
import Model.bean.Disciplina;
import Model.bean.Professor;
import Model.bean.Turma;
import Model.bean.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmProfessorInformativo extends javax.swing.JFrame {
    private List<Professor> listProfessor = null;
    private Professor p = null;
    private List<Turma> listTurma = null;
    private TurmaDAO tdao = new TurmaDAO();
    private List<Disciplina> listDisciplina = null;
    private DisciplinaDAO ddao = new DisciplinaDAO();
    private Usuario u;
    
    public FrmProfessorInformativo(Usuario u) {
        initComponents();
        this.u = u;
        loadProfessoresJTable();
    }
    
    public FrmProfessorInformativo() {
        initComponents();
        loadProfessoresJTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fundo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jEmailLabel1 = new javax.swing.JLabel();
        jRGLabel = new javax.swing.JLabel();
        jEmailLabel2 = new javax.swing.JLabel();
        jEmailLabel = new javax.swing.JLabel();
        jCbTurmas = new javax.swing.JComboBox<>();
        jGraduaçãoLabel = new javax.swing.JLabel();
        jUsernameLabel = new javax.swing.JLabel();
        jTFUsername = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jTFGraduacao = new javax.swing.JTextField();
        jTFEmail = new javax.swing.JTextField();
        jNomeLabel = new javax.swing.JLabel();
        jTFRG = new javax.swing.JTextField();
        jCPFLabel = new javax.swing.JLabel();
        jCbDisciplinas = new javax.swing.JComboBox<>();
        jTFCPF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProfessores = new javax.swing.JTable();
        jPanelMenu = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelIconProf = new javax.swing.JLabel();
        jLabelInformativo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informações Professores");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fundo.setBackground(new java.awt.Color(255, 255, 255));
        Fundo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 2, true));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));

        jEmailLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jEmailLabel1.setForeground(new java.awt.Color(56, 160, 224));
        jEmailLabel1.setText("DISCIPLINAS:");

        jRGLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRGLabel.setForeground(new java.awt.Color(56, 160, 224));
        jRGLabel.setText("RG:");

        jEmailLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jEmailLabel2.setForeground(new java.awt.Color(56, 160, 224));
        jEmailLabel2.setText("TURMAS:");

        jEmailLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jEmailLabel.setForeground(new java.awt.Color(56, 160, 224));
        jEmailLabel.setText("E-MAIL: ");

        jCbTurmas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCbTurmas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jCbTurmas.setPreferredSize(new java.awt.Dimension(181, 23));

        jGraduaçãoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jGraduaçãoLabel.setForeground(new java.awt.Color(56, 160, 224));
        jGraduaçãoLabel.setText("GRADUAÇÃO: ");

        jUsernameLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jUsernameLabel.setForeground(new java.awt.Color(56, 160, 224));
        jUsernameLabel.setText("USERNAME:");

        jTFUsername.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTFUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFUsername.setEnabled(false);
        jTFUsername.setPreferredSize(new java.awt.Dimension(181, 23));
        jTFUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUsernameActionPerformed(evt);
            }
        });

        jTFNome.setBackground(new java.awt.Color(240, 240, 240));
        jTFNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTFNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFNome.setEnabled(false);
        jTFNome.setPreferredSize(new java.awt.Dimension(181, 23));
        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        jTFGraduacao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTFGraduacao.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFGraduacao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFGraduacao.setEnabled(false);
        jTFGraduacao.setPreferredSize(new java.awt.Dimension(181, 23));
        jTFGraduacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFGraduacaoActionPerformed(evt);
            }
        });

        jTFEmail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTFEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFEmail.setEnabled(false);
        jTFEmail.setPreferredSize(new java.awt.Dimension(181, 23));
        jTFEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEmailActionPerformed(evt);
            }
        });

        jNomeLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jNomeLabel.setForeground(new java.awt.Color(56, 160, 224));
        jNomeLabel.setText("NOME:");

        jTFRG.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTFRG.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFRG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFRG.setEnabled(false);
        jTFRG.setPreferredSize(new java.awt.Dimension(181, 23));
        jTFRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFRGActionPerformed(evt);
            }
        });

        jCPFLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCPFLabel.setForeground(new java.awt.Color(56, 160, 224));
        jCPFLabel.setText("CPF:");

        jCbDisciplinas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCbDisciplinas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jCbDisciplinas.setPreferredSize(new java.awt.Dimension(181, 23));
        jCbDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbDisciplinasActionPerformed(evt);
            }
        });

        jTFCPF.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTFCPF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFCPF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFCPF.setEnabled(false);
        jTFCPF.setPreferredSize(new java.awt.Dimension(181, 23));
        jTFCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCPFLabel)
                    .addComponent(jEmailLabel)
                    .addComponent(jEmailLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTFCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCbDisciplinas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jGraduaçãoLabel)
                            .addGap(15, 15, 15))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jUsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jEmailLabel2)
                            .addComponent(jRGLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFRG, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jCbTurmas, 0, 1, Short.MAX_VALUE)
                    .addComponent(jTFGraduacao, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(jTFUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jNomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRGLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCPFLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jGraduaçãoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTFEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFGraduacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jEmailLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCbDisciplinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jEmailLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCbTurmas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(164, 164, 164))
        );

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));

        jTableProfessores.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableProfessores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome Professor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProfessores.setGridColor(new java.awt.Color(255, 255, 255));
        jTableProfessores.setRowHeight(20);
        jTableProfessores.setRowMargin(2);
        jTableProfessores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProfessoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProfessores);

        jPanelMenu.setBackground(new java.awt.Color(56, 160, 224));

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("INFORMAÇÕES PROFESSORES");

        jLabelIconProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/IconProfessor.png"))); // NOI18N

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelIconProf)
                .addGap(34, 34, 34))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIconProf)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabelInformativo.setForeground(new java.awt.Color(56, 160, 224));
        jLabelInformativo.setText("dê dois cliques sobre um professor para visualizar sua informação");
        jLabelInformativo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelInformativo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInformativojLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout FundoLayout = new javax.swing.GroupLayout(Fundo);
        Fundo.setLayout(FundoLayout);
        FundoLayout.setHorizontalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelInformativo)
                    .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addComponent(jPanelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FundoLayout.setVerticalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoLayout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelInformativo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void PreencheDisciplina(Professor p){                       
        listDisciplina = ddao.read(p.getId_user());
        jCbDisciplinas.removeAllItems();
        for(Disciplina d: listDisciplina){
            jCbDisciplinas.addItem(d.getNome());
        }
    }
    private void PreencheTurma(Professor p, String d){                       
        listTurma = tdao.read(p.getId_user(), d);
        jCbTurmas.removeAllItems();
        for(Turma t: listTurma){
            jCbTurmas.addItem(t.getSerie());
        }
    }   
    private void jTFUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFUsernameActionPerformed

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jTFGraduacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFGraduacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFGraduacaoActionPerformed

    private void jTFEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEmailActionPerformed

    private void jTFRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFRGActionPerformed

    private void jTFCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCPFActionPerformed

    private void jTableProfessoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProfessoresMouseClicked
        if (evt.getClickCount() > 1) {
            int selIndex = jTableProfessores.getSelectedRow();
            if(selIndex>=0){
                p = listProfessor.get(selIndex);
                jTFNome.setText(p.getNome());
                jTFCPF.setText(p.getCPF());
                jTFRG.setText(p.getRG());
                jTFEmail.setText(p.getEmail());
                jTFGraduacao.setText(p.getGraduacao());
                jTFUsername.setText(p.getLogin());
                PreencheDisciplina(p);
            }
            else{
                JOptionPane.showMessageDialog(null,"Selecione um Professor para Visualizar Informações");
            }
        }
    }//GEN-LAST:event_jTableProfessoresMouseClicked

    private void jLabelInformativojLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInformativojLabel10MouseClicked

    }//GEN-LAST:event_jLabelInformativojLabel10MouseClicked

    private void jCbDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbDisciplinasActionPerformed
            PreencheTurma(p, (String) jCbDisciplinas.getSelectedItem());
    }//GEN-LAST:event_jCbDisciplinasActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        loadProfessoresJTable();
    }//GEN-LAST:event_formWindowActivated
    private void loadProfessoresJTable(){
        DefaultTableModel model = (DefaultTableModel) jTableProfessores.getModel();
        ProfessorDAO profDAO = new ProfessorDAO();
        listProfessor = profDAO.ListarProfessores();
        int cont = 0;
        model.setNumRows(cont);
        for(Professor p: listProfessor){
            ++cont;
            model.addRow(new Object[]{
                cont,
                p.getNome()
            });
        }    
    }
    
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
            java.util.logging.Logger.getLogger(FrmProfessorInformativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProfessorInformativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProfessorInformativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProfessorInformativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProfessorInformativo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fundo;
    private javax.swing.JLabel jCPFLabel;
    private javax.swing.JComboBox<String> jCbDisciplinas;
    private javax.swing.JComboBox<String> jCbTurmas;
    private javax.swing.JLabel jEmailLabel;
    private javax.swing.JLabel jEmailLabel1;
    private javax.swing.JLabel jEmailLabel2;
    private javax.swing.JLabel jGraduaçãoLabel;
    private javax.swing.JLabel jLabelIconProf;
    private javax.swing.JLabel jLabelInformativo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jNomeLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JLabel jRGLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCPF;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFGraduacao;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFRG;
    private javax.swing.JTextField jTFUsername;
    private javax.swing.JTable jTableProfessores;
    private javax.swing.JLabel jUsernameLabel;
    // End of variables declaration//GEN-END:variables
}
