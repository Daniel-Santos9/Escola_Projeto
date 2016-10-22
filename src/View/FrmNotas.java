package View;


import Model.DAO.NotaDAO;
import Model.bean.Aluno;
import Model.bean.Disciplina;
import Model.bean.Nota;
import Model.bean.Turma;
import Model.bean.Usuario;
import Tratamento_Exception.TextFieldValidator;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmNotas extends javax.swing.JFrame {
    
    TextFieldValidator validator = new TextFieldValidator();
    private Usuario u;
    private Turma t ;
    private Aluno a ;
    private Nota n;
    private List<Nota> listNota = null;
    private int muda = 1;
    
    public FrmNotas() {
        initComponents();
      
    }
    
    public FrmNotas(Aluno a, Usuario u, Turma t) {
        initComponents();
        this.a = a;
        this.u = u;
        this.t = t;
        loadNotasJTable();
        jLabelMsg.setVisible(false);
        
        jTFAluno.setEnabled(false);
        jTFProfessor.setEnabled(false);
        jTFTurma.setEnabled(false);
        jTFDisciplina.setEnabled(false);
        jTFTurno.setEnabled(false);
        
        jTFAluno.setText(this.a.getNome());
        jTFProfessor.setText(this.u.getNome());
        jTFTurma.setText(this.t.getSerie());
        jTFDisciplina.setText(this.t.getDisc_nome());
        jTFTurno.setText(this.t.getTurno());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fundo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTipoLabel = new javax.swing.JLabel();
        jCbTipos = new javax.swing.JComboBox<>();
        jBimestrelLabel = new javax.swing.JLabel();
        jCbBimestres = new javax.swing.JComboBox<>();
        jTFNota = new javax.swing.JTextField();
        jNotaLabel = new javax.swing.JLabel();
        jLabelMsg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNotas = new javax.swing.JTable();
        jPanelMenu = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelIconNota = new javax.swing.JLabel();
        jSalvarBtn = new javax.swing.JButton();
        jEditarBtn = new javax.swing.JButton();
        jExcluirBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTurnoLabel = new javax.swing.JLabel();
        jDisciplinaLabel = new javax.swing.JLabel();
        jProfessorLabel = new javax.swing.JLabel();
        jTFProfessor = new javax.swing.JTextField();
        jTFAluno = new javax.swing.JTextField();
        jTFDisciplina = new javax.swing.JTextField();
        jAlunoLabel = new javax.swing.JLabel();
        jTFTurno = new javax.swing.JTextField();
        jTurmaLabel = new javax.swing.JLabel();
        jTFTurma = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Fundo.setBackground(new java.awt.Color(255, 255, 255));
        Fundo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 2, true));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));

        jTipoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTipoLabel.setForeground(new java.awt.Color(56, 160, 224));
        jTipoLabel.setText("TIPO:");

        jCbTipos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCbTipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATIVIDADE", "PROVA", "PROVA FINAL", "TRABALHO" }));
        jCbTipos.setSelectedIndex(-1);
        jCbTipos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jCbTipos.setPreferredSize(new java.awt.Dimension(181, 23));
        jCbTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbTiposActionPerformed(evt);
            }
        });

        jBimestrelLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBimestrelLabel.setForeground(new java.awt.Color(56, 160, 224));
        jBimestrelLabel.setText("BIMESTRE:");

        jCbBimestres.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCbBimestres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jCbBimestres.setSelectedIndex(-1);
        jCbBimestres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jCbBimestres.setPreferredSize(new java.awt.Dimension(181, 23));
        jCbBimestres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbBimestresActionPerformed(evt);
            }
        });

        jTFNota.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTFNota.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFNota.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFNota.setPreferredSize(new java.awt.Dimension(181, 23));
        jTFNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNotaActionPerformed(evt);
            }
        });

        jNotaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jNotaLabel.setForeground(new java.awt.Color(56, 160, 224));
        jNotaLabel.setText("NOTA: ");

        jLabelMsg.setBackground(new java.awt.Color(56, 160, 224));
        jLabelMsg.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabelMsg.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMsg.setText("Por favor preencha todos os campos!");
        jLabelMsg.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jNotaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jTipoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCbTipos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBimestrelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCbBimestres, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(jLabelMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTipoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbTipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBimestrelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbBimestres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNotaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMsg))
                .addGap(21, 21, 21))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));

        jTableNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Bimestre", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableNotas);

        jPanelMenu.setBackground(new java.awt.Color(56, 160, 224));

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("CADASTRO DE NOTAS");
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(248, 40));

        jLabelIconNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/IconNota.png"))); // NOI18N

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabelIconNota)
                .addGap(43, 43, 43))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIconNota)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );

        jSalvarBtn.setBackground(new java.awt.Color(255, 255, 255));
        jSalvarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buttons/SalvarNotaBtn.png"))); // NOI18N
        jSalvarBtn.setBorder(null);
        jSalvarBtn.setBorderPainted(false);
        jSalvarBtn.setFocusPainted(false);
        jSalvarBtn.setPreferredSize(new java.awt.Dimension(107, 30));
        jSalvarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jSalvarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jSalvarBtnMouseExited(evt);
            }
        });
        jSalvarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalvarBtnActionPerformed(evt);
            }
        });

        jEditarBtn.setBackground(new java.awt.Color(255, 255, 255));
        jEditarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buttons/EditarNotaBtn.png"))); // NOI18N
        jEditarBtn.setBorder(null);
        jEditarBtn.setBorderPainted(false);
        jEditarBtn.setFocusPainted(false);
        jEditarBtn.setPreferredSize(new java.awt.Dimension(107, 30));
        jEditarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jEditarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jEditarBtnMouseExited(evt);
            }
        });
        jEditarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditarBtnActionPerformed(evt);
            }
        });

        jExcluirBtn.setBackground(new java.awt.Color(255, 255, 255));
        jExcluirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buttons/ExcluirNotaBtn.png"))); // NOI18N
        jExcluirBtn.setBorder(null);
        jExcluirBtn.setBorderPainted(false);
        jExcluirBtn.setFocusPainted(false);
        jExcluirBtn.setPreferredSize(new java.awt.Dimension(107, 30));
        jExcluirBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jExcluirBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jExcluirBtnMouseExited(evt);
            }
        });
        jExcluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExcluirBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));

        jTurnoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTurnoLabel.setForeground(new java.awt.Color(56, 160, 224));
        jTurnoLabel.setText("TURNO:");

        jDisciplinaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jDisciplinaLabel.setForeground(new java.awt.Color(56, 160, 224));
        jDisciplinaLabel.setText("DISCIPLINA:");

        jProfessorLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jProfessorLabel.setForeground(new java.awt.Color(56, 160, 224));
        jProfessorLabel.setText("PROFESSOR:");

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

        jTFAluno.setBackground(new java.awt.Color(240, 240, 240));
        jTFAluno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTFAluno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFAluno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFAluno.setEnabled(false);
        jTFAluno.setPreferredSize(new java.awt.Dimension(181, 23));
        jTFAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAlunoActionPerformed(evt);
            }
        });

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

        jAlunoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jAlunoLabel.setForeground(new java.awt.Color(56, 160, 224));
        jAlunoLabel.setText("ALUNO:");

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

        jTurmaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTurmaLabel.setForeground(new java.awt.Color(56, 160, 224));
        jTurmaLabel.setText("TURMA:");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTurmaLabel)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jAlunoLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDisciplinaLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTFTurma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFAluno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jProfessorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTurnoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(jTFProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProfessorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(266, 266, 266))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jAlunoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTFTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTurnoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTurmaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDisciplinaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(198, 198, 198))))
        );

        javax.swing.GroupLayout FundoLayout = new javax.swing.GroupLayout(Fundo);
        Fundo.setLayout(FundoLayout);
        FundoLayout.setHorizontalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FundoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FundoLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FundoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FundoLayout.createSequentialGroup()
                        .addComponent(jSalvarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jEditarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jExcluirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );
        FundoLayout.setVerticalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FundoLayout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSalvarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEditarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jExcluirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEditarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditarBtnActionPerformed
        int selIndex = jTableNotas.getSelectedRow();        
        
        if(selIndex>=0){
            muda = 2;
            n = (Nota) listNota.get(selIndex);
            jCbTipos.setSelectedItem(n.getDescricao());
            jTFNota.setText(Float.toString(n.getValor()));
            jCbBimestres.setSelectedItem(n.getBimestre());
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione uma nota na tabela a ser alterada");   
        }
    }//GEN-LAST:event_jEditarBtnActionPerformed

    private void jExcluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExcluirBtnActionPerformed
        int selIndex = jTableNotas.getSelectedRow();        
        
        if(selIndex>=0){
            muda = 3;
            n = (Nota) listNota.get(selIndex);
            NotaDAO ndao = new NotaDAO();
            
            if(ndao.DeleteNotas(n, u.getUser_id())){
                JOptionPane.showMessageDialog(null, "Nota Deletada com Sucesso"); 
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro ao Excluir Nota"); 
            }     
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione uma nota na tabela a ser Excluida");   
        }
    }//GEN-LAST:event_jExcluirBtnActionPerformed

    private void jSalvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalvarBtnActionPerformed
        
        switch (muda) {
            case 1:
                if(jTFNota.getText().equals("") || jCbBimestres.getSelectedIndex() == -1
                        || jCbTipos.getSelectedIndex()==-1){
                    jLabelMsg.setVisible(true);
                }
                else{
                    jLabelMsg.setVisible(false);
                    Nota no = new Nota();
                    NotaDAO ndao = new NotaDAO();
                    
                    no.setBimestre((String) jCbBimestres.getSelectedItem());
                    no.setDescricao((String) jCbTipos.getSelectedItem());
                    no.setValor(Float.parseFloat(jTFNota.getText()));
                    
                    Disciplina d = new Disciplina();
                    d.setDisc_id(t.getId_disc());
                    
                    if(ndao.create(no, a, d, u.getLogin())){
                        JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso");
                        jLLimparBtnMouseClicked(evt);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Cadastro Não Realizado");
                    }
                    
                }   
                break;
            case 2:
                n.setBimestre((String) jCbBimestres.getSelectedItem());
                n.setDescricao((String) jCbTipos.getSelectedItem());
                n.setValor(Float.parseFloat(jTFNota.getText()));
                NotaDAO  ndao = new NotaDAO();
                if(ndao.UpdateNotas(n)){
                    JOptionPane.showMessageDialog(null, "Nota Alterada com Sucesso");
                    jLLimparBtnMouseClicked(evt);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro ao Alterar Nota");
                }   
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nota já foi excluida");
                break;  
        }
    }//GEN-LAST:event_jSalvarBtnActionPerformed

    private void jLLimparBtnMouseClicked(ActionEvent evt) {
        jCbBimestres.setSelectedIndex(-1);
        jTFNota.setText("");
        jCbTipos.setSelectedIndex(-1);
    }
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        loadNotasJTable();
    }//GEN-LAST:event_formWindowActivated

    private void jTFProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFProfessorActionPerformed

    private void jTFAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFAlunoActionPerformed

    private void jTFDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDisciplinaActionPerformed

    private void jTFTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTurnoActionPerformed

    private void jCbTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbTiposActionPerformed

    }//GEN-LAST:event_jCbTiposActionPerformed

    private void jTFTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTurmaActionPerformed

    private void jTFNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNotaActionPerformed

    private void jCbBimestresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbBimestresActionPerformed

    }//GEN-LAST:event_jCbBimestresActionPerformed

    private void jSalvarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalvarBtnMouseEntered
       jSalvarBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/SalvarNota_FocusBtn.png")));
    }//GEN-LAST:event_jSalvarBtnMouseEntered

    private void jSalvarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalvarBtnMouseExited
       jSalvarBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/SalvarNotaBtn.png")));
    }//GEN-LAST:event_jSalvarBtnMouseExited

    private void jEditarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEditarBtnMouseEntered
       jEditarBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/EditarNota_FocusBtn.png")));
    }//GEN-LAST:event_jEditarBtnMouseEntered

    private void jEditarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEditarBtnMouseExited
       jEditarBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/EditarNotaBtn.png")));
    }//GEN-LAST:event_jEditarBtnMouseExited

    private void jExcluirBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExcluirBtnMouseEntered
       jExcluirBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/ExcluirNota_FocusBtn.png")));
    }//GEN-LAST:event_jExcluirBtnMouseEntered

    private void jExcluirBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExcluirBtnMouseExited
       jExcluirBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/ExcluirNotaBtn.png")));
    }//GEN-LAST:event_jExcluirBtnMouseExited
    private void loadNotasJTable(){
        DefaultTableModel model = (DefaultTableModel) jTableNotas.getModel();
        model.setNumRows(0);
        NotaDAO notaDAO = new NotaDAO();                                             
        listNota = notaDAO.ListNotas(a.getMatricula(), t.getId_disc());
    
        listNota.stream().forEach((n) -> {
            model.addRow(new Object[]{
                n.getDescricao(),
                n.getBimestre(),
                n.getValor()
            });
        });   
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fundo;
    private javax.swing.JLabel jAlunoLabel;
    private javax.swing.JLabel jBimestrelLabel;
    private javax.swing.JComboBox<String> jCbBimestres;
    private javax.swing.JComboBox<String> jCbTipos;
    private javax.swing.JLabel jDisciplinaLabel;
    private javax.swing.JButton jEditarBtn;
    private javax.swing.JButton jExcluirBtn;
    private javax.swing.JLabel jLabelIconNota;
    private javax.swing.JLabel jLabelMsg;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jNotaLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JLabel jProfessorLabel;
    private javax.swing.JButton jSalvarBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFAluno;
    private javax.swing.JTextField jTFDisciplina;
    private javax.swing.JTextField jTFNota;
    private javax.swing.JTextField jTFProfessor;
    private javax.swing.JTextField jTFTurma;
    private javax.swing.JTextField jTFTurno;
    private javax.swing.JTable jTableNotas;
    private javax.swing.JLabel jTipoLabel;
    private javax.swing.JLabel jTurmaLabel;
    private javax.swing.JLabel jTurnoLabel;
    // End of variables declaration//GEN-END:variables
}
