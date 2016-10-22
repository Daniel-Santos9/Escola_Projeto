package View;

import Model.bean.Usuario;
import javax.swing.ImageIcon;

public class FrmPrincipalFuncionario extends javax.swing.JFrame {

    private Usuario userLogged;
    private boolean flag = false;
    
    public FrmPrincipalFuncionario(Usuario u) {
        initComponents();
        userLogged = u;
        jLoginLabel.setText(userLogged.getNome());
        jLabelLogout.setVisible(false);
    }
    public FrmPrincipalFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPaneTela = new javax.swing.JPanel();
        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelFuncçõesBásicas = new javax.swing.JPanel();
        jLabeDadosLogin = new javax.swing.JLabel();
        jCad_AlunoBtn = new javax.swing.JButton();
        jCad_ProfessorBtn = new javax.swing.JButton();
        jCad_FuncionarioBtn = new javax.swing.JButton();
        jCad_LivroBtn = new javax.swing.JButton();
        jLabeDadosLogin1 = new javax.swing.JLabel();
        jInf_ProfessorBtn = new javax.swing.JButton();
        jInf_AlunoBtn = new javax.swing.JButton();
        jInf_FuncionarioBtn = new javax.swing.JButton();
        jInf_LivroBtn = new javax.swing.JButton();
        jLabelLogoSistema = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        jALunosBtn = new javax.swing.JButton();
        jLabelLogoEscola = new javax.swing.JLabel();
        jLoginLabel = new javax.swing.JLabel();
        jLabelIconUser = new javax.swing.JLabel();
        jLabelLogout = new javax.swing.JLabel();
        jProfessorBtn = new javax.swing.JButton();
        jFuncionarioBtn = new javax.swing.JButton();
        jDisciplinaBtn = new javax.swing.JButton();
        jTurmaBtn = new javax.swing.JButton();
        jVisualizarNotasBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal Funcionário");
        setBackground(new java.awt.Color(0, 102, 255));
        setMinimumSize(new java.awt.Dimension(656, 512));
        setResizable(false);

        jPaneTela.setBackground(new java.awt.Color(255, 255, 255));
        jPaneTela.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 4, true));

        jInternalFrameBemVindo.setBackground(new java.awt.Color(255, 255, 255));
        jInternalFrameBemVindo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jInternalFrameBemVindo.setTitle("Seja Bem-Vindo");
        jInternalFrameBemVindo.setVisible(true);

        jPanelFuncçõesBásicas.setBackground(new java.awt.Color(255, 255, 255));

        jLabeDadosLogin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabeDadosLogin.setForeground(new java.awt.Color(56, 164, 220));
        jLabeDadosLogin.setText("CADASTROS:");
        jLabeDadosLogin.setPreferredSize(new java.awt.Dimension(116, 34));

        jCad_AlunoBtn.setBackground(new java.awt.Color(255, 255, 255));
        jCad_AlunoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buttons/CadAluBtn.png"))); // NOI18N
        jCad_AlunoBtn.setToolTipText("Cadastro Aluno");
        jCad_AlunoBtn.setBorder(null);
        jCad_AlunoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCad_AlunoBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCad_AlunoBtnMouseExited(evt);
            }
        });
        jCad_AlunoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCad_AlunoBtnActionPerformed(evt);
            }
        });

        jCad_ProfessorBtn.setBackground(new java.awt.Color(255, 255, 255));
        jCad_ProfessorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buttons/CadProfBtn.png"))); // NOI18N
        jCad_ProfessorBtn.setToolTipText("Cadastro Professor");
        jCad_ProfessorBtn.setBorder(null);
        jCad_ProfessorBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCad_ProfessorBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCad_ProfessorBtnMouseExited(evt);
            }
        });
        jCad_ProfessorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCad_ProfessorBtnActionPerformed(evt);
            }
        });

        jCad_FuncionarioBtn.setBackground(new java.awt.Color(255, 255, 255));
        jCad_FuncionarioBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buttons/CadFuncBtn.png"))); // NOI18N
        jCad_FuncionarioBtn.setToolTipText("Cadastro Funcionário");
        jCad_FuncionarioBtn.setBorder(null);
        jCad_FuncionarioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCad_FuncionarioBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCad_FuncionarioBtnMouseExited(evt);
            }
        });

        jCad_LivroBtn.setBackground(new java.awt.Color(255, 255, 255));
        jCad_LivroBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buttons/CadLivroBtn.png"))); // NOI18N
        jCad_LivroBtn.setToolTipText("Cadastro Livro");
        jCad_LivroBtn.setBorder(null);
        jCad_LivroBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCad_LivroBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCad_LivroBtnMouseExited(evt);
            }
        });

        jLabeDadosLogin1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabeDadosLogin1.setForeground(new java.awt.Color(56, 164, 220));
        jLabeDadosLogin1.setText("INFORMAÇÕES:");
        jLabeDadosLogin1.setPreferredSize(new java.awt.Dimension(116, 34));

        jInf_ProfessorBtn.setBackground(new java.awt.Color(255, 255, 255));
        jInf_ProfessorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buttons/InfProfBtn.png"))); // NOI18N
        jInf_ProfessorBtn.setToolTipText("Informação Professor");
        jInf_ProfessorBtn.setBorder(null);
        jInf_ProfessorBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jInf_ProfessorBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jInf_ProfessorBtnMouseExited(evt);
            }
        });
        jInf_ProfessorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInf_ProfessorBtnActionPerformed(evt);
            }
        });

        jInf_AlunoBtn.setBackground(new java.awt.Color(255, 255, 255));
        jInf_AlunoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buttons/InfAluBtn.png"))); // NOI18N
        jInf_AlunoBtn.setToolTipText("Informação Aluno");
        jInf_AlunoBtn.setBorder(null);
        jInf_AlunoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jInf_AlunoBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jInf_AlunoBtnMouseExited(evt);
            }
        });

        jInf_FuncionarioBtn.setBackground(new java.awt.Color(255, 255, 255));
        jInf_FuncionarioBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buttons/InfFuncBtn.png"))); // NOI18N
        jInf_FuncionarioBtn.setToolTipText("Informação Funcionário");
        jInf_FuncionarioBtn.setBorder(null);
        jInf_FuncionarioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jInf_FuncionarioBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jInf_FuncionarioBtnMouseExited(evt);
            }
        });

        jInf_LivroBtn.setBackground(new java.awt.Color(255, 255, 255));
        jInf_LivroBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buttons/InfLivroBtn.png"))); // NOI18N
        jInf_LivroBtn.setToolTipText("Informação Livro");
        jInf_LivroBtn.setBorder(null);
        jInf_LivroBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jInf_LivroBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jInf_LivroBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelFuncçõesBásicasLayout = new javax.swing.GroupLayout(jPanelFuncçõesBásicas);
        jPanelFuncçõesBásicas.setLayout(jPanelFuncçõesBásicasLayout);
        jPanelFuncçõesBásicasLayout.setHorizontalGroup(
            jPanelFuncçõesBásicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFuncçõesBásicasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFuncçõesBásicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabeDadosLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFuncçõesBásicasLayout.createSequentialGroup()
                        .addComponent(jCad_ProfessorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCad_AlunoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCad_FuncionarioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCad_LivroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabeDadosLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFuncçõesBásicasLayout.createSequentialGroup()
                        .addComponent(jInf_ProfessorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jInf_AlunoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jInf_FuncionarioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jInf_LivroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanelFuncçõesBásicasLayout.setVerticalGroup(
            jPanelFuncçõesBásicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFuncçõesBásicasLayout.createSequentialGroup()
                .addComponent(jLabeDadosLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelFuncçõesBásicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCad_AlunoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCad_FuncionarioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCad_LivroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCad_ProfessorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabeDadosLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelFuncçõesBásicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInf_AlunoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInf_FuncionarioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInf_LivroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInf_ProfessorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 34, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabelLogoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jInternalFrameBemVindoLayout.setVerticalGroup(
            jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameBemVindoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFuncçõesBásicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jInternalFrameBemVindoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabelLogoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelMenu.setBackground(new java.awt.Color(56, 160, 224));

        jALunosBtn.setBackground(new java.awt.Color(56, 160, 224));
        jALunosBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jALunosBtn.setForeground(new java.awt.Color(56, 160, 224));
        jALunosBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buttons/AlunoBtn.png"))); // NOI18N
        jALunosBtn.setBorder(null);
        jALunosBtn.setBorderPainted(false);
        jALunosBtn.setPreferredSize(new java.awt.Dimension(150, 55));
        jALunosBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jALunosBtnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jALunosBtnFocusLost(evt);
            }
        });
        jALunosBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jALunosBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jALunosBtnMouseExited(evt);
            }
        });
        jALunosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jALunosBtnActionPerformed(evt);
            }
        });

        jLabelLogoEscola.setFont(new java.awt.Font("Open Sans Semibold", 1, 26)); // NOI18N
        jLabelLogoEscola.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogoEscola.setText("ESCOLA E.E.I.F. PAULO VI");

        jLoginLabel.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLoginLabel.setText("Expedito Alves");

        jLabelIconUser.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabelIconUser.setForeground(new java.awt.Color(81, 94, 102));
        jLabelIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/UserIcon.png"))); // NOI18N
        jLabelIconUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelIconUserMouseClicked(evt);
            }
        });

        jLabelLogout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelLogout.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogout.setText("Logout");
        jLabelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogoutMouseClicked(evt);
            }
        });

        jProfessorBtn.setBackground(new java.awt.Color(56, 160, 224));
        jProfessorBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jProfessorBtn.setForeground(new java.awt.Color(56, 160, 224));
        jProfessorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buttons/ProfessorBtn.png"))); // NOI18N
        jProfessorBtn.setBorder(null);
        jProfessorBtn.setBorderPainted(false);
        jProfessorBtn.setPreferredSize(new java.awt.Dimension(150, 55));
        jProfessorBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jProfessorBtnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jProfessorBtnFocusLost(evt);
            }
        });
        jProfessorBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jProfessorBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jProfessorBtnMouseExited(evt);
            }
        });
        jProfessorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProfessorBtnActionPerformed(evt);
            }
        });

        jFuncionarioBtn.setBackground(new java.awt.Color(56, 160, 224));
        jFuncionarioBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jFuncionarioBtn.setForeground(new java.awt.Color(56, 160, 224));
        jFuncionarioBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buttons/FuncionarioBtn.png"))); // NOI18N
        jFuncionarioBtn.setBorder(null);
        jFuncionarioBtn.setBorderPainted(false);
        jFuncionarioBtn.setPreferredSize(new java.awt.Dimension(150, 55));
        jFuncionarioBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFuncionarioBtnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFuncionarioBtnFocusLost(evt);
            }
        });
        jFuncionarioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jFuncionarioBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jFuncionarioBtnMouseExited(evt);
            }
        });
        jFuncionarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFuncionarioBtnActionPerformed(evt);
            }
        });

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
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabelLogoEscola)
                .addGap(466, 466, 466)
                .addComponent(jLoginLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIconUser)
                    .addComponent(jLabelLogout))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jALunosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProfessorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFuncionarioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDisciplinaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTurmaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jVisualizarNotasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelIconUser)
                            .addComponent(jLoginLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelLogout))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelLogoEscola)))
                .addGap(18, 18, 18)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jALunosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProfessorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFuncionarioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDisciplinaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTurmaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jVisualizarNotasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPaneTelaLayout = new javax.swing.GroupLayout(jPaneTela);
        jPaneTela.setLayout(jPaneTelaLayout);
        jPaneTelaLayout.setHorizontalGroup(
            jPaneTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneTelaLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(jInternalFrameBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPaneTelaLayout.setVerticalGroup(
            jPaneTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneTelaLayout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jInternalFrameBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPaneTela, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jALunosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jALunosBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jALunosBtnActionPerformed

    private void jProfessorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProfessorBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jProfessorBtnActionPerformed

    private void jFuncionarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFuncionarioBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFuncionarioBtnActionPerformed

    private void jDisciplinaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDisciplinaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDisciplinaBtnActionPerformed

    private void jTurmaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTurmaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTurmaBtnActionPerformed

    private void jVisualizarNotasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVisualizarNotasBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jVisualizarNotasBtnActionPerformed

    private void jLabelIconUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIconUserMouseClicked
        if(flag == false){
            jLabelLogout.setVisible(true);
            flag = true;
        }
        else{
            jLabelLogout.setVisible(false);
            flag = false;
        }
    }//GEN-LAST:event_jLabelIconUserMouseClicked

    private void jALunosBtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jALunosBtnFocusGained

    }//GEN-LAST:event_jALunosBtnFocusGained

    private void jALunosBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jALunosBtnFocusLost

    }//GEN-LAST:event_jALunosBtnFocusLost

    private void jProfessorBtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jProfessorBtnFocusGained

    }//GEN-LAST:event_jProfessorBtnFocusGained

    private void jProfessorBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jProfessorBtnFocusLost

    }//GEN-LAST:event_jProfessorBtnFocusLost

    private void jVisualizarNotasBtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jVisualizarNotasBtnFocusGained

    }//GEN-LAST:event_jVisualizarNotasBtnFocusGained

    private void jVisualizarNotasBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jVisualizarNotasBtnFocusLost

    }//GEN-LAST:event_jVisualizarNotasBtnFocusLost

    private void jTurmaBtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTurmaBtnFocusGained

    }//GEN-LAST:event_jTurmaBtnFocusGained

    private void jTurmaBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTurmaBtnFocusLost

    }//GEN-LAST:event_jTurmaBtnFocusLost

    private void jFuncionarioBtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFuncionarioBtnFocusGained

    }//GEN-LAST:event_jFuncionarioBtnFocusGained

    private void jFuncionarioBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFuncionarioBtnFocusLost

    }//GEN-LAST:event_jFuncionarioBtnFocusLost

    private void jDisciplinaBtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDisciplinaBtnFocusGained

    }//GEN-LAST:event_jDisciplinaBtnFocusGained

    private void jDisciplinaBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDisciplinaBtnFocusLost

    }//GEN-LAST:event_jDisciplinaBtnFocusLost

    private void jCad_ProfessorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCad_ProfessorBtnActionPerformed
        FrmCadastroProfessores prof = new FrmCadastroProfessores(userLogged);
        prof.setLocationRelativeTo(null);
        prof.setVisible(true);
    }//GEN-LAST:event_jCad_ProfessorBtnActionPerformed

    private void jLabelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogoutMouseClicked
        FrmLogin lg = new FrmLogin();
        lg.setLocationRelativeTo(null);
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelLogoutMouseClicked

    private void jALunosBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jALunosBtnMouseEntered
        jALunosBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/Aluno_FocusBtn.png")));
    }//GEN-LAST:event_jALunosBtnMouseEntered

    private void jALunosBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jALunosBtnMouseExited
        jALunosBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/AlunoBtn.png")));
    }//GEN-LAST:event_jALunosBtnMouseExited

    private void jProfessorBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProfessorBtnMouseEntered
        jProfessorBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/Professor_FocusBtn.png")));
    }//GEN-LAST:event_jProfessorBtnMouseEntered

    private void jProfessorBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProfessorBtnMouseExited
        jProfessorBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/ProfessorBtn.png")));
    }//GEN-LAST:event_jProfessorBtnMouseExited

    private void jFuncionarioBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFuncionarioBtnMouseEntered
        jFuncionarioBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/Funcionario_FocusBtn.png")));
    }//GEN-LAST:event_jFuncionarioBtnMouseEntered

    private void jFuncionarioBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFuncionarioBtnMouseExited
        jFuncionarioBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/FuncionarioBtn.png")));
    }//GEN-LAST:event_jFuncionarioBtnMouseExited

    private void jDisciplinaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDisciplinaBtnMouseEntered
        jDisciplinaBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/Disciplina_FocusBtn.png")));
    }//GEN-LAST:event_jDisciplinaBtnMouseEntered

    private void jDisciplinaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDisciplinaBtnMouseExited
        jDisciplinaBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/DisciplinaBtn.png")));
    }//GEN-LAST:event_jDisciplinaBtnMouseExited

    private void jTurmaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTurmaBtnMouseEntered
        jTurmaBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/Turma_FocusBtn.png")));
    }//GEN-LAST:event_jTurmaBtnMouseEntered

    private void jTurmaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTurmaBtnMouseExited
        jTurmaBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/TurmaBtn.png")));
    }//GEN-LAST:event_jTurmaBtnMouseExited

    private void jVisualizarNotasBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVisualizarNotasBtnMouseEntered
        jVisualizarNotasBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/Boletim_FocusBtn.png")));
    }//GEN-LAST:event_jVisualizarNotasBtnMouseEntered

    private void jVisualizarNotasBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVisualizarNotasBtnMouseExited
        jVisualizarNotasBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/BoletimBtn.png")));
    }//GEN-LAST:event_jVisualizarNotasBtnMouseExited

    private void jCad_ProfessorBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCad_ProfessorBtnMouseEntered
        jCad_ProfessorBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/CadProf_FocusBtn.png")));
    }//GEN-LAST:event_jCad_ProfessorBtnMouseEntered

    private void jCad_ProfessorBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCad_ProfessorBtnMouseExited
        jCad_ProfessorBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/CadProfBtn.png")));
    }//GEN-LAST:event_jCad_ProfessorBtnMouseExited

    private void jInf_ProfessorBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInf_ProfessorBtnMouseExited
        jInf_ProfessorBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/InfProfBtn.png")));
    }//GEN-LAST:event_jInf_ProfessorBtnMouseExited

    private void jInf_ProfessorBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInf_ProfessorBtnMouseEntered
        jInf_ProfessorBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/InfProf_FocusBtn.png")));
    }//GEN-LAST:event_jInf_ProfessorBtnMouseEntered

    private void jCad_LivroBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCad_LivroBtnMouseEntered
        jCad_LivroBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/CadLivro_FocusBtn.png")));
    }//GEN-LAST:event_jCad_LivroBtnMouseEntered

    private void jCad_LivroBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCad_LivroBtnMouseExited
        jCad_LivroBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/CadLivroBtn.png")));
    }//GEN-LAST:event_jCad_LivroBtnMouseExited

    private void jInf_LivroBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInf_LivroBtnMouseEntered
        jInf_LivroBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/InfLivro_FocusBtn.png")));
    }//GEN-LAST:event_jInf_LivroBtnMouseEntered

    private void jInf_LivroBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInf_LivroBtnMouseExited
        jInf_LivroBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/InfLivroBtn.png")));
    }//GEN-LAST:event_jInf_LivroBtnMouseExited

    private void jCad_FuncionarioBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCad_FuncionarioBtnMouseEntered
        jCad_FuncionarioBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/CadFunc_FocusBtn.png")));
    }//GEN-LAST:event_jCad_FuncionarioBtnMouseEntered

    private void jCad_FuncionarioBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCad_FuncionarioBtnMouseExited
        jCad_FuncionarioBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/CadFuncBtn.png")));
    }//GEN-LAST:event_jCad_FuncionarioBtnMouseExited

    private void jInf_FuncionarioBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInf_FuncionarioBtnMouseEntered
        jInf_FuncionarioBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/InfFunc_FocusBtn.png")));
    }//GEN-LAST:event_jInf_FuncionarioBtnMouseEntered

    private void jInf_FuncionarioBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInf_FuncionarioBtnMouseExited
        jInf_FuncionarioBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/InfFuncBtn.png")));
    }//GEN-LAST:event_jInf_FuncionarioBtnMouseExited

    private void jCad_AlunoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCad_AlunoBtnMouseEntered
        jCad_AlunoBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/CadAlu_FocusBtn.png")));
    }//GEN-LAST:event_jCad_AlunoBtnMouseEntered

    private void jCad_AlunoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCad_AlunoBtnMouseExited
        jCad_AlunoBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/CadAluBtn.png")));
    }//GEN-LAST:event_jCad_AlunoBtnMouseExited

    private void jInf_AlunoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInf_AlunoBtnMouseEntered
        jInf_AlunoBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/InfAlu_FocusBtn.png")));
    }//GEN-LAST:event_jInf_AlunoBtnMouseEntered

    private void jInf_AlunoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInf_AlunoBtnMouseExited
        jInf_AlunoBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/InfAluBtn.png")));
    }//GEN-LAST:event_jInf_AlunoBtnMouseExited

    private void jInf_ProfessorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInf_ProfessorBtnActionPerformed
        FrmProfessorInformativo Prof_Inf = new FrmProfessorInformativo(userLogged);
        Prof_Inf.setLocationRelativeTo(null);
        Prof_Inf.setVisible(true);
    }//GEN-LAST:event_jInf_ProfessorBtnActionPerformed

    private void jCad_AlunoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCad_AlunoBtnActionPerformed
        FrmCadastroAlunos Alu_Cad = new FrmCadastroAlunos(userLogged);
        Alu_Cad.setLocationRelativeTo(null);
        Alu_Cad.setVisible(true);
    }//GEN-LAST:event_jCad_AlunoBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmPrincipalFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jALunosBtn;
    private javax.swing.JButton jCad_AlunoBtn;
    private javax.swing.JButton jCad_FuncionarioBtn;
    private javax.swing.JButton jCad_LivroBtn;
    private javax.swing.JButton jCad_ProfessorBtn;
    private javax.swing.JButton jDisciplinaBtn;
    private javax.swing.JButton jFuncionarioBtn;
    private javax.swing.JButton jInf_AlunoBtn;
    private javax.swing.JButton jInf_FuncionarioBtn;
    private javax.swing.JButton jInf_LivroBtn;
    private javax.swing.JButton jInf_ProfessorBtn;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabeDadosLogin;
    private javax.swing.JLabel jLabeDadosLogin1;
    private javax.swing.JLabel jLabelIconUser;
    private javax.swing.JLabel jLabelLogoEscola;
    private javax.swing.JLabel jLabelLogoSistema;
    private javax.swing.JLabel jLabelLogout;
    private javax.swing.JLabel jLoginLabel;
    private javax.swing.JPanel jPaneTela;
    private javax.swing.JPanel jPanelFuncçõesBásicas;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JButton jProfessorBtn;
    private javax.swing.JButton jTurmaBtn;
    private javax.swing.JButton jVisualizarNotasBtn;
    // End of variables declaration//GEN-END:variables
}
