package View;

import Model.DAO.TurmaDAO;
import Model.bean.Turma;
import Model.bean.Usuario;
import java.util.List;
<<<<<<< HEAD
import javax.swing.ImageIcon;
=======
>>>>>>> origin/master
import javax.swing.table.DefaultTableModel;

public class FrmProfessorPrincipal extends javax.swing.JFrame {

    private Usuario userLogged;
    private List<Turma> listTurma = null;
<<<<<<< HEAD
    private boolean flag = false;
=======
    
>>>>>>> origin/master
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

<<<<<<< HEAD
        Fundo = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        jLabelLogoEscola = new javax.swing.JLabel();
        jLoginLabel = new javax.swing.JLabel();
        jLabelIconUser = new javax.swing.JLabel();
        jLabelLogout = new javax.swing.JLabel();
        jDisciplinaBtn = new javax.swing.JButton();
        jTurmaBtn = new javax.swing.JButton();
        jVisualizarNotasBtn = new javax.swing.JButton();
        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelFuncçõesBásicas = new javax.swing.JPanel();
        jLabeTurmas = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableTurmas6 = new javax.swing.JTable();
        jLabelInformativo = new javax.swing.JLabel();
        jLabelLogoSistema = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Professor Principal");
        setBackground(new java.awt.Color(255, 255, 255));

        Fundo.setBackground(new java.awt.Color(255, 255, 255));
        Fundo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 2, true));

        jPanelMenu.setBackground(new java.awt.Color(56, 160, 224));

        jLabelLogoEscola.setFont(new java.awt.Font("Open Sans Semibold", 1, 26)); // NOI18N
        jLabelLogoEscola.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogoEscola.setText("ESCOLA E.E.I.F. PAULO VI");
=======
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
>>>>>>> origin/master

        jLoginLabel.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLoginLabel.setText("Expedito Alves");
<<<<<<< HEAD

        jLabelIconUser.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabelIconUser.setForeground(new java.awt.Color(81, 94, 102));
        jLabelIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/UserIcon.png"))); // NOI18N
=======
        jPanel3.add(jLoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 130, -1));

        jLabelIconUser.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabelIconUser.setForeground(new java.awt.Color(81, 94, 102));
        jLabelIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/userImg.png"))); // NOI18N
>>>>>>> origin/master
        jLabelIconUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelIconUserMouseClicked(evt);
            }
        });
<<<<<<< HEAD
=======
        jPanel3.add(jLabelIconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 10, -1, -1));
>>>>>>> origin/master

        jLabelLogout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelLogout.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogout.setText("Logout");
        jLabelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogoutMouseClicked(evt);
            }
        });
<<<<<<< HEAD

        jDisciplinaBtn.setBackground(new java.awt.Color(56, 160, 224));
        jDisciplinaBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jDisciplinaBtn.setForeground(new java.awt.Color(56, 160, 224));
        jDisciplinaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buttons/DisciplinaBtn.png"))); // NOI18N
        jDisciplinaBtn.setBorder(null);
        jDisciplinaBtn.setBorderPainted(false);
        jDisciplinaBtn.setPreferredSize(new java.awt.Dimension(150, 55));
        jDisciplinaBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDisciplinaBtnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDisciplinaBtnFocusLost(evt);
            }
        });
        jDisciplinaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jDisciplinaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jDisciplinaBtnMouseExited(evt);
            }
        });
        jDisciplinaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDisciplinaBtnActionPerformed(evt);
            }
        });

        jTurmaBtn.setBackground(new java.awt.Color(56, 160, 224));
        jTurmaBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTurmaBtn.setForeground(new java.awt.Color(56, 160, 224));
        jTurmaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buttons/TurmaBtn.png"))); // NOI18N
        jTurmaBtn.setBorder(null);
        jTurmaBtn.setBorderPainted(false);
        jTurmaBtn.setPreferredSize(new java.awt.Dimension(150, 55));
        jTurmaBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTurmaBtnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTurmaBtnFocusLost(evt);
            }
        });
        jTurmaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTurmaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTurmaBtnMouseExited(evt);
            }
        });
        jTurmaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTurmaBtnActionPerformed(evt);
            }
        });

        jVisualizarNotasBtn.setBackground(new java.awt.Color(56, 160, 224));
        jVisualizarNotasBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jVisualizarNotasBtn.setForeground(new java.awt.Color(56, 160, 224));
        jVisualizarNotasBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buttons/BoletimBtn.png"))); // NOI18N
        jVisualizarNotasBtn.setBorder(null);
        jVisualizarNotasBtn.setBorderPainted(false);
        jVisualizarNotasBtn.setPreferredSize(new java.awt.Dimension(150, 55));
        jVisualizarNotasBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jVisualizarNotasBtnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jVisualizarNotasBtnFocusLost(evt);
            }
        });
        jVisualizarNotasBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jVisualizarNotasBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jVisualizarNotasBtnMouseExited(evt);
            }
        });
        jVisualizarNotasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVisualizarNotasBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelLogoEscola)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLoginLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIconUser)
                    .addComponent(jLabelLogout))
                .addGap(23, 23, 23))
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jDisciplinaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(jTurmaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jVisualizarNotasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIconUser)
                    .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLoginLabel)
                        .addComponent(jLabelLogoEscola)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLogout)
                .addGap(18, 18, 18)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDisciplinaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTurmaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jVisualizarNotasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jInternalFrameBemVindo.setBackground(new java.awt.Color(255, 255, 255));
        jInternalFrameBemVindo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jInternalFrameBemVindo.setTitle("Seja Bem-Vindo");
        jInternalFrameBemVindo.setVisible(true);

        jPanelFuncçõesBásicas.setBackground(new java.awt.Color(255, 255, 255));

        jLabeTurmas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabeTurmas.setForeground(new java.awt.Color(56, 164, 220));
        jLabeTurmas.setText("TURMAS");
        jLabeTurmas.setPreferredSize(new java.awt.Dimension(116, 34));
=======
        jPanel3.add(jLabelLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 42, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 220, 60));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
>>>>>>> origin/master

        jScrollPane7.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setBorder(null);

<<<<<<< HEAD
        jTableTurmas6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
=======
>>>>>>> origin/master
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
<<<<<<< HEAD
=======
        jTableTurmas6.getAccessibleContext().setAccessibleDescription("");

        jLabelTurmas.setFont(new java.awt.Font("Open Sans Semibold", 0, 18)); // NOI18N
        jLabelTurmas.setForeground(new java.awt.Color(56, 160, 224));
        jLabelTurmas.setText("TURMAS");
        jLabelTurmas.setMaximumSize(new java.awt.Dimension(65, 26));
        jLabelTurmas.setMinimumSize(new java.awt.Dimension(65, 26));
        jLabelTurmas.setPreferredSize(new java.awt.Dimension(65, 26));
>>>>>>> origin/master

        jLabelInformativo.setForeground(new java.awt.Color(56, 160, 224));
        jLabelInformativo.setText("dê dois cliques sobre uma turma para visualizar os alunos matriculados");
        jLabelInformativo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelInformativo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInformativojLabel10MouseClicked(evt);
            }
        });

<<<<<<< HEAD
        javax.swing.GroupLayout jPanelFuncçõesBásicasLayout = new javax.swing.GroupLayout(jPanelFuncçõesBásicas);
        jPanelFuncçõesBásicas.setLayout(jPanelFuncçõesBásicasLayout);
        jPanelFuncçõesBásicasLayout.setHorizontalGroup(
            jPanelFuncçõesBásicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFuncçõesBásicasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFuncçõesBásicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabeTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFuncçõesBásicasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelInformativo)
                .addContainerGap())
        );
        jPanelFuncçõesBásicasLayout.setVerticalGroup(
            jPanelFuncçõesBásicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFuncçõesBásicasLayout.createSequentialGroup()
                .addComponent(jLabeTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelInformativo)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jLabelLogoSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/LogoSistemaIcon.png"))); // NOI18N
        jLabelLogoSistema.setMaximumSize(new java.awt.Dimension(250, 250));
        jLabelLogoSistema.setMinimumSize(new java.awt.Dimension(250, 250));
        jLabelLogoSistema.setPreferredSize(new java.awt.Dimension(250, 250));

        javax.swing.GroupLayout jInternalFrameBemVindoLayout = new javax.swing.GroupLayout(jInternalFrameBemVindo.getContentPane());
        jInternalFrameBemVindo.getContentPane().setLayout(jInternalFrameBemVindoLayout);
        jInternalFrameBemVindoLayout.setHorizontalGroup(
            jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameBemVindoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFuncçõesBásicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelLogoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrameBemVindoLayout.setVerticalGroup(
            jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameBemVindoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFuncçõesBásicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jInternalFrameBemVindoLayout.createSequentialGroup()
                .addComponent(jLabelLogoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FundoLayout = new javax.swing.GroupLayout(Fundo);
        Fundo.setLayout(FundoLayout);
        FundoLayout.setHorizontalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrameBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FundoLayout.setVerticalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FundoLayout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(jInternalFrameBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FundoLayout.createSequentialGroup()
                    .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 417, Short.MAX_VALUE)))
=======
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
>>>>>>> origin/master
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addComponent(Fundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
=======
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
>>>>>>> origin/master
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addComponent(Fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
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
    
    private void jLabelIconUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIconUserMouseClicked
        if(flag == false){
            jLabelLogout.setVisible(true);
            flag = true;
        }
        else{
            jLabelLogout.setVisible(false);
            flag = false;
        }
=======
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelIconUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIconUserMouseClicked
        jLabelLogout.setVisible(true);
>>>>>>> origin/master
    }//GEN-LAST:event_jLabelIconUserMouseClicked

    private void jLabelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogoutMouseClicked
        FrmLogin lg = new FrmLogin();
<<<<<<< HEAD
        lg.setLocationRelativeTo(null);
=======
>>>>>>> origin/master
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelLogoutMouseClicked

    private void jTableTurmas6jTableTurmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTurmas6jTableTurmasMouseClicked
        if (evt.getClickCount() > 1) {
            int selIndex = jTableTurmas6.getSelectedRow();

<<<<<<< HEAD
            FrmTurmaInformativo vt = new FrmTurmaInformativo(listTurma.get(selIndex), userLogged);
            vt.setLocationRelativeTo(null);
            vt.setVisible(true);
        }
    }//GEN-LAST:event_jTableTurmas6jTableTurmasMouseClicked

    private void jLabelInformativojLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInformativojLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelInformativojLabel10MouseClicked

    private void jDisciplinaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDisciplinaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDisciplinaBtnActionPerformed

    private void jDisciplinaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDisciplinaBtnMouseExited
        jDisciplinaBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/DisciplinaBtn.png")));
    }//GEN-LAST:event_jDisciplinaBtnMouseExited

    private void jDisciplinaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDisciplinaBtnMouseEntered
        jDisciplinaBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/Disciplina_FocusBtn.png")));
    }//GEN-LAST:event_jDisciplinaBtnMouseEntered

    private void jDisciplinaBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDisciplinaBtnFocusLost

    }//GEN-LAST:event_jDisciplinaBtnFocusLost

    private void jDisciplinaBtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDisciplinaBtnFocusGained

    }//GEN-LAST:event_jDisciplinaBtnFocusGained

    private void jVisualizarNotasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVisualizarNotasBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jVisualizarNotasBtnActionPerformed

    private void jVisualizarNotasBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVisualizarNotasBtnMouseExited
        jVisualizarNotasBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/BoletimBtn.png")));
    }//GEN-LAST:event_jVisualizarNotasBtnMouseExited

    private void jVisualizarNotasBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVisualizarNotasBtnMouseEntered
        jVisualizarNotasBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/Boletim_FocusBtn.png")));
    }//GEN-LAST:event_jVisualizarNotasBtnMouseEntered

    private void jVisualizarNotasBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jVisualizarNotasBtnFocusLost

    }//GEN-LAST:event_jVisualizarNotasBtnFocusLost

    private void jVisualizarNotasBtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jVisualizarNotasBtnFocusGained

    }//GEN-LAST:event_jVisualizarNotasBtnFocusGained

    private void jTurmaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTurmaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTurmaBtnActionPerformed

    private void jTurmaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTurmaBtnMouseExited
        jTurmaBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/TurmaBtn.png")));
    }//GEN-LAST:event_jTurmaBtnMouseExited

    private void jTurmaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTurmaBtnMouseEntered
        jTurmaBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/Turma_FocusBtn.png")));
    }//GEN-LAST:event_jTurmaBtnMouseEntered

    private void jTurmaBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTurmaBtnFocusLost

    }//GEN-LAST:event_jTurmaBtnFocusLost

    private void jTurmaBtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTurmaBtnFocusGained

    }//GEN-LAST:event_jTurmaBtnFocusGained
=======
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
>>>>>>> origin/master

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
<<<<<<< HEAD
    private javax.swing.JPanel Fundo;
    private javax.swing.JButton jDisciplinaBtn;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabeTurmas;
    private javax.swing.JLabel jLabelIconUser;
    private javax.swing.JLabel jLabelInformativo;
    private javax.swing.JLabel jLabelLogoEscola;
    private javax.swing.JLabel jLabelLogoSistema;
    private javax.swing.JLabel jLabelLogout;
    private javax.swing.JLabel jLoginLabel;
    private javax.swing.JPanel jPanelFuncçõesBásicas;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTableTurmas6;
    private javax.swing.JButton jTurmaBtn;
    private javax.swing.JButton jVisualizarNotasBtn;
=======
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
>>>>>>> origin/master
    // End of variables declaration//GEN-END:variables
}
