package View;

import Model.DAO.AlunoDAO;
import Model.DAO.PaisDAO;
import Model.DAO.TurmaDAO;
import Model.bean.Aluno;
import Model.bean.Pais;
import Model.bean.Turma;
import Model.bean.Usuario;
import Tratamento_Exception.PaisInvalidoException;
import Tratamento_Exception.TextFieldValidator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FrmCadastroAlunos extends javax.swing.JFrame {
    
    TextFieldValidator validator = new TextFieldValidator();
    private Usuario u;
    private Pais p;
    private Aluno a;
    private List<Turma> listTurma = null;
    private List<Turma> listTurno = null;
    private Turma t;
    PaisDAO pdao = new PaisDAO();
    TurmaDAO tdao = new TurmaDAO();
    
    
    public FrmCadastroAlunos() {
        initComponents();
    }
    
   public FrmCadastroAlunos(Usuario u) {
        initComponents();
        PreencheTurma();
        this.u = u;       
        jLabelMsg.setVisible(false);
        jLRGMsg.setVisible(false);
        jLCPFMsg.setVisible(false);
        jLEmailMsg.setVisible(false);
    }
   
   public FrmCadastroAlunos(Usuario u, Aluno a) {
        initComponents();
        this.u = u;
        this.a = a;
        this.p = pdao.InformationTurma(a.getId_pais());
        this.t = tdao.InformationTurma(a.getId_turma());
        jLabelTitulo.setText("INFORMAÇÃO ALUNO");
        informacao_aluno();
        jLabelMsg.setVisible(false);
        jLRGMsg.setVisible(false);
        jLCPFMsg.setVisible(false);
        jLEmailMsg.setVisible(false);
        jCPFFormattedTextField.setEnabled(false);
        jTFNome.setEnabled(false);
        jRGFormattedTextField.setEnabled(false);
        jTFEmail.setEnabled(false);
        jTFNum.setEnabled(false);
        jTFRua.setEnabled(false);
        jTFPai.setEnabled(false);
        jTFMae.setEnabled(false);
        jLimparBtn.setVisible(false);
        jCadastrarBtn.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fundo = new javax.swing.JPanel();
        jPanelDadosPessoais = new javax.swing.JPanel();
        jRGLabel = new javax.swing.JLabel();
        jEmailLabel = new javax.swing.JLabel();
        jTurnoLabel = new javax.swing.JLabel();
        jRGFormattedTextField = new javax.swing.JTextField();
        jTFEmail = new javax.swing.JTextField();
        jNomeLabel = new javax.swing.JLabel();
        jCPFLabel = new javax.swing.JLabel();
        jCbTurno = new javax.swing.JComboBox<>();
        jLCPFMsg = new javax.swing.JLabel();
        jLRGMsg = new javax.swing.JLabel();
        jCPFFormattedTextField = new javax.swing.JFormattedTextField();
        jTurmaLabel = new javax.swing.JLabel();
        jCbTurma = new javax.swing.JComboBox<>();
        jLEmailMsg = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jPanelDadosLogin = new javax.swing.JPanel();
        jPaiLabel = new javax.swing.JLabel();
        jMaeLabel = new javax.swing.JLabel();
        jTFMae = new javax.swing.JTextField();
        jTFPai = new javax.swing.JTextField();
        jCadastrarBtn = new javax.swing.JButton();
        jLimparBtn = new javax.swing.JButton();
        jLabeDadosParentesco = new javax.swing.JLabel();
        jLabeDadosPessoais = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelIconAlu = new javax.swing.JLabel();
        jLabeDadosEndereco = new javax.swing.JLabel();
        jPanelDadosLogin1 = new javax.swing.JPanel();
        jRuaLabel = new javax.swing.JLabel();
        jSenhaLabel1 = new javax.swing.JLabel();
        jTFNum = new javax.swing.JTextField();
        jTFRua = new javax.swing.JTextField();
        jLabelMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Fundo.setBackground(new java.awt.Color(255, 255, 255));
        Fundo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 2, true));

        jPanelDadosPessoais.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDadosPessoais.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));

        jRGLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRGLabel.setForeground(new java.awt.Color(56, 160, 224));
        jRGLabel.setText("RG:");

        jEmailLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jEmailLabel.setForeground(new java.awt.Color(56, 160, 224));
        jEmailLabel.setText("E-MAIL: ");

        jTurnoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTurnoLabel.setForeground(new java.awt.Color(56, 160, 224));
        jTurnoLabel.setText("TURNO: ");

        jRGFormattedTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jRGFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jRGFormattedTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jRGFormattedTextField.setPreferredSize(new java.awt.Dimension(216, 23));
        jRGFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRGFormattedTextFieldActionPerformed(evt);
            }
        });
        jRGFormattedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jRGFormattedTextFieldKeyTyped(evt);
            }
        });

        jTFEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTFEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFEmail.setPreferredSize(new java.awt.Dimension(216, 23));
        jTFEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEmailActionPerformed(evt);
            }
        });
        jTFEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFEmailKeyTyped(evt);
            }
        });

        jNomeLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jNomeLabel.setForeground(new java.awt.Color(56, 160, 224));
        jNomeLabel.setText("NOME:");

        jCPFLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCPFLabel.setForeground(new java.awt.Color(56, 160, 224));
        jCPFLabel.setText("CPF:");
        jCPFLabel.setPreferredSize(new java.awt.Dimension(23, 23));

        jCbTurno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jCbTurno.setMaximumSize(new java.awt.Dimension(216, 23));
        jCbTurno.setMinimumSize(new java.awt.Dimension(216, 23));
        jCbTurno.setPreferredSize(new java.awt.Dimension(172, 23));
        jCbTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbTurnoActionPerformed(evt);
            }
        });

        jLCPFMsg.setBackground(new java.awt.Color(56, 160, 224));
        jLCPFMsg.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLCPFMsg.setForeground(new java.awt.Color(255, 255, 255));
        jLCPFMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCPFMsg.setText("Formato: 000.000.000-00");
        jLCPFMsg.setMaximumSize(new java.awt.Dimension(160, 16));
        jLCPFMsg.setMinimumSize(new java.awt.Dimension(160, 16));
        jLCPFMsg.setOpaque(true);

        jLRGMsg.setBackground(new java.awt.Color(56, 160, 224));
        jLRGMsg.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLRGMsg.setForeground(new java.awt.Color(255, 255, 255));
        jLRGMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRGMsg.setText("Formato: 00000000-0");
        jLRGMsg.setOpaque(true);

        jCPFFormattedTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        try {
            jCPFFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jCPFFormattedTextField.setPreferredSize(new java.awt.Dimension(216, 23));
        jCPFFormattedTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCPFFormattedTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCPFFormattedTextFieldFocusLost(evt);
            }
        });
        jCPFFormattedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCPFFormattedTextFieldKeyTyped(evt);
            }
        });

        jTurmaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTurmaLabel.setForeground(new java.awt.Color(56, 160, 224));
        jTurmaLabel.setText("TURMA:");

        jCbTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CIÊNCIAS DA NATUREZA", "CIÊNCIAS DA SAÚDE", "CIÊNCIAS SOCIAIS", "LINGUAGEM E CÓDIGOS", "MATEMÁTICA E SUAS TECN." }));
        jCbTurma.setSelectedIndex(-1);
        jCbTurma.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jCbTurma.setPreferredSize(new java.awt.Dimension(172, 23));
        jCbTurma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCbTurmaMouseEntered(evt);
            }
        });
        jCbTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbTurmaActionPerformed(evt);
            }
        });

        jLEmailMsg.setBackground(new java.awt.Color(56, 160, 224));
        jLEmailMsg.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLEmailMsg.setForeground(new java.awt.Color(255, 255, 255));
        jLEmailMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLEmailMsg.setText("Insira um email válido!");
        jLEmailMsg.setOpaque(true);

        jTFNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTFNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFNome.setPreferredSize(new java.awt.Dimension(216, 23));
        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });
        jTFNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNomeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosPessoaisLayout = new javax.swing.GroupLayout(jPanelDadosPessoais);
        jPanelDadosPessoais.setLayout(jPanelDadosPessoaisLayout);
        jPanelDadosPessoaisLayout.setHorizontalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLCPFMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jNomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jEmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCPFLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFNome, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(jCPFFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLEmailMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jLRGMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTurmaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTurnoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRGLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCbTurma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRGFormattedTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(32, 32, 32))))
        );
        jPanelDadosPessoaisLayout.setVerticalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLRGMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRGFormattedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRGLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLCPFMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCPFLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCPFFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCbTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTurmaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLEmailMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCbTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTurnoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(60, 60, 60))
        );

        jPanelDadosLogin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDadosLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jPanelDadosLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPaiLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPaiLabel.setForeground(new java.awt.Color(56, 160, 224));
        jPaiLabel.setText("PAI:");
        jPaiLabel.setMaximumSize(new java.awt.Dimension(55, 23));
        jPaiLabel.setMinimumSize(new java.awt.Dimension(55, 23));
        jPaiLabel.setPreferredSize(new java.awt.Dimension(55, 23));
        jPanelDadosLogin.add(jPaiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 20));

        jMaeLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMaeLabel.setForeground(new java.awt.Color(56, 160, 224));
        jMaeLabel.setText("MÃE:");
        jMaeLabel.setMaximumSize(new java.awt.Dimension(42, 23));
        jMaeLabel.setMinimumSize(new java.awt.Dimension(42, 23));
        jMaeLabel.setPreferredSize(new java.awt.Dimension(42, 23));
        jPanelDadosLogin.add(jMaeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jTFMae.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTFMae.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFMae.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFMae.setPreferredSize(new java.awt.Dimension(216, 23));
        jTFMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMaeActionPerformed(evt);
            }
        });
        jTFMae.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFMaeKeyTyped(evt);
            }
        });
        jPanelDadosLogin.add(jTFMae, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 200, -1));

        jTFPai.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTFPai.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFPai.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFPai.setPreferredSize(new java.awt.Dimension(216, 23));
        jTFPai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPaiActionPerformed(evt);
            }
        });
        jTFPai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFPaiKeyTyped(evt);
            }
        });
        jPanelDadosLogin.add(jTFPai, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 200, -1));

        jCadastrarBtn.setBackground(new java.awt.Color(255, 255, 255));
        jCadastrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        jCadastrarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buttons/CadastrarBtn.png"))); // NOI18N
        jCadastrarBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jCadastrarBtn.setPreferredSize(new java.awt.Dimension(194, 51));
        jCadastrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCadastrarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCadastrarBtnMouseExited(evt);
            }
        });
        jCadastrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarBtnActionPerformed(evt);
            }
        });

        jLimparBtn.setBackground(new java.awt.Color(255, 255, 255));
        jLimparBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buttons/LimparBtn.png"))); // NOI18N
        jLimparBtn.setBorder(null);
        jLimparBtn.setBorderPainted(false);
        jLimparBtn.setPreferredSize(new java.awt.Dimension(194, 51));
        jLimparBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLimparBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLimparBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLimparBtnMouseExited(evt);
            }
        });
        jLimparBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimparBtnActionPerformed(evt);
            }
        });

        jLabeDadosParentesco.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabeDadosParentesco.setForeground(new java.awt.Color(56, 164, 220));
        jLabeDadosParentesco.setText("Dados de Parentesco");
        jLabeDadosParentesco.setPreferredSize(new java.awt.Dimension(116, 34));

        jLabeDadosPessoais.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabeDadosPessoais.setForeground(new java.awt.Color(56, 164, 220));
        jLabeDadosPessoais.setText("Dados Pessoais");
        jLabeDadosPessoais.setPreferredSize(new java.awt.Dimension(116, 34));

        jPanelMenu.setBackground(new java.awt.Color(56, 160, 224));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(606, 100));

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("CADASTRO ALUNO");
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(248, 40));

        jLabelIconAlu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/IconAluno.png"))); // NOI18N

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(95, 95, 95)
                .addComponent(jLabelIconAlu)
                .addGap(32, 32, 32))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIconAlu)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabeDadosEndereco.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabeDadosEndereco.setForeground(new java.awt.Color(56, 164, 220));
        jLabeDadosEndereco.setText("Dados de Endereço");
        jLabeDadosEndereco.setPreferredSize(new java.awt.Dimension(116, 34));

        jPanelDadosLogin1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDadosLogin1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jPanelDadosLogin1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRuaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRuaLabel.setForeground(new java.awt.Color(56, 160, 224));
        jRuaLabel.setText("RUA:");
        jRuaLabel.setMaximumSize(new java.awt.Dimension(55, 23));
        jRuaLabel.setMinimumSize(new java.awt.Dimension(55, 23));
        jRuaLabel.setPreferredSize(new java.awt.Dimension(55, 23));
        jPanelDadosLogin1.add(jRuaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 20));

        jSenhaLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jSenhaLabel1.setForeground(new java.awt.Color(56, 160, 224));
        jSenhaLabel1.setText("N°:");
        jSenhaLabel1.setMaximumSize(new java.awt.Dimension(42, 23));
        jSenhaLabel1.setMinimumSize(new java.awt.Dimension(42, 23));
        jSenhaLabel1.setPreferredSize(new java.awt.Dimension(42, 23));
        jPanelDadosLogin1.add(jSenhaLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jTFNum.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTFNum.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFNum.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFNum.setPreferredSize(new java.awt.Dimension(216, 23));
        jTFNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNumActionPerformed(evt);
            }
        });
        jTFNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNumKeyTyped(evt);
            }
        });
        jPanelDadosLogin1.add(jTFNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 50, -1));

        jTFRua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTFRua.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFRua.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFRua.setPreferredSize(new java.awt.Dimension(216, 23));
        jTFRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFRuaActionPerformed(evt);
            }
        });
        jTFRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFRuaKeyTyped(evt);
            }
        });
        jPanelDadosLogin1.add(jTFRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 200, -1));

        jLabelMsg.setBackground(new java.awt.Color(56, 160, 224));
        jLabelMsg.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabelMsg.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMsg.setText("Por favor preencha todos os campos!");
        jLabelMsg.setOpaque(true);

        javax.swing.GroupLayout FundoLayout = new javax.swing.GroupLayout(Fundo);
        Fundo.setLayout(FundoLayout);
        FundoLayout.setHorizontalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FundoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(FundoLayout.createSequentialGroup()
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelDadosLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabeDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabeDadosParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelDadosLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabeDadosEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jCadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLimparBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabelMsg)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FundoLayout.setVerticalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoLayout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanelDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabeDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabeDadosParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDadosLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabeDadosEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDadosLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelMsg)
                .addGap(18, 18, 18)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLimparBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fundo, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 private void informacao_aluno(){
        
        //Dados Pessoais
        jCPFFormattedTextField.setText(a.getCPF());
        jTFNome.setText(a.getNome());
        jRGFormattedTextField.setText(a.getRG());
        jTFEmail.setText(a.getEmail());
        
        //Parentescos
        jTFMae.setText(p.getNome_mae());
        jTFPai.setText(p.getNome_pai());
        
        // Endereço
        jTFNum.setText(p.getNum());
        jTFRua.setText(p.getLogradouro());
        
        //Dados Turma
        jCbTurma.setEnabled(false);
        jCbTurma.removeAllItems();
        jCbTurma.addItem(t.getSerie());
        
        jCbTurno.setEnabled(false);
        jCbTurno.removeAllItems();
        jCbTurno.addItem(t.getTurno());
    }
 
    private void PreencheTurma(){                       
        listTurma = tdao.read();
        jCbTurma.removeAllItems();
        for(Turma t: listTurma){
            jCbTurma.addItem(t.getSerie());
        }
    }
    
    private void PreencheTurno(String turma){                       
        listTurno = tdao.read_turno(turma);
        jCbTurno.removeAllItems();
        for(Turma t: listTurno){
            jCbTurno.addItem(t.getTurno());
        }
    }
    private void jRGFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRGFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRGFormattedTextFieldActionPerformed

    private void jTFEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEmailActionPerformed

    private void jTFEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFEmailKeyTyped
        validator.maxLengthLimit(jTFEmail, 50);
    }//GEN-LAST:event_jTFEmailKeyTyped

    private void jCbTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbTurnoActionPerformed

    }//GEN-LAST:event_jCbTurnoActionPerformed

    private void jCPFFormattedTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCPFFormattedTextFieldFocusGained
        jLCPFMsg.setVisible(true);
    }//GEN-LAST:event_jCPFFormattedTextFieldFocusGained

    private void jCPFFormattedTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCPFFormattedTextFieldFocusLost
        jLCPFMsg.setVisible(false);
    }//GEN-LAST:event_jCPFFormattedTextFieldFocusLost

    private void jCPFFormattedTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCPFFormattedTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jCPFFormattedTextFieldKeyTyped

    private void jCbTurmaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCbTurmaMouseEntered

    }//GEN-LAST:event_jCbTurmaMouseEntered

    private void jCbTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbTurmaActionPerformed
        if(jCbTurma.getSelectedIndex()!=-1){
            PreencheTurno((String) jCbTurma.getSelectedItem());
        }     
    }//GEN-LAST:event_jCbTurmaActionPerformed

    private void jCadastrarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCadastrarBtnMouseEntered
        jCadastrarBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/Cadastrar_FocusBtn.png")));
    }//GEN-LAST:event_jCadastrarBtnMouseEntered

    private void jCadastrarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCadastrarBtnMouseExited
        jCadastrarBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/CadastrarBtn.png")));
    }//GEN-LAST:event_jCadastrarBtnMouseExited

    private void jCadastrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarBtnActionPerformed
        if(jCPFFormattedTextField.getText().equals("") || jRGFormattedTextField.getText().equals("") || jRGFormattedTextField.getText().equals("")
        || jTFEmail.getText().equals("") || jCbTurma.getSelectedIndex() == -1 || jCbTurno.getSelectedIndex() == -1 
        || jTFPai.getText().equals("") || jTFMae.getText().equals("") || jTFRua.getText().equals("") || jTFNum.getText().equals("")){

            jLabelMsg.setVisible(true);
        }
        else if(!validator.emailValidate(jTFEmail)){
            jLEmailMsg.setVisible(true);
        }
        else{
            jLabelMsg.setVisible(false);
            jLEmailMsg.setVisible(false);

            AlunoDAO adao = new AlunoDAO();
            
            Aluno al = new Aluno();
            al.setCPF(jCPFFormattedTextField.getText());
            al.setRG(jRGFormattedTextField.getText());
            al.setEmail(jTFEmail.getText());
            al.setNome(jRGFormattedTextField.getText());
            
            Turma tu = new Turma();
            tu.setSerie((String) jCbTurma.getSelectedItem());
            tu.setTurno((String) jCbTurno.getSelectedItem());  
            
            Pais pa = new Pais();
            pa.setLogradouro(jTFRua.getText());
            pa.setNome_mae(jTFMae.getText());
            pa.setNome_pai(jTFPai.getText());
            pa.setNum(jTFNum.getText());

            try {
                if(pdao.procura_pais(pa)==-1){
                    pdao.create(pa, u.getLogin());
                }
            } catch (PaisInvalidoException ex) {
                Logger.getLogger(FrmCadastroAlunos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(adao.create(al, tu, pa, u.getLogin())){
                JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso");
                jLimparBtnActionPerformed(evt);
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar");
            }
        }
    }//GEN-LAST:event_jCadastrarBtnActionPerformed

    private void jLimparBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimparBtnMouseEntered
        jLimparBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/Limpar_FocusBtn.png")));
    }//GEN-LAST:event_jLimparBtnMouseEntered

    private void jLimparBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimparBtnMouseExited
        jLimparBtn.setIcon(new ImageIcon(getClass().getResource("/Imagens/Buttons/LimparBtn.png")));
    }//GEN-LAST:event_jLimparBtnMouseExited

    private void jLimparBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimparBtnActionPerformed
        jLabelMsg.setText("");
        jLRGMsg.setVisible(false);
        jLCPFMsg.setVisible(false);
        jLEmailMsg.setText("");
        jCPFFormattedTextField.setText("");
        jRGFormattedTextField.setText("");
        jRGFormattedTextField.setText("");
        jTFEmail.setText("");
        jTFNum.setText("");
        jTFRua.setText("");
        jTFPai.setText("");
        jTFMae.setText("");
        jCbTurma.setSelectedIndex(-1);
        jCbTurno.removeAllItems();

    }//GEN-LAST:event_jLimparBtnActionPerformed

    private void jTFMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMaeActionPerformed

    private void jTFMaeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFMaeKeyTyped
        validator.maxLengthLimit(jTFMae, 50);
    }//GEN-LAST:event_jTFMaeKeyTyped

    private void jTFPaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPaiActionPerformed

    private void jTFPaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPaiKeyTyped
        validator.maxLengthLimit(jTFPai, 50);
    }//GEN-LAST:event_jTFPaiKeyTyped

    private void jTFNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNumActionPerformed

    private void jTFNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNumKeyTyped
        validator.maxLengthLimit(jTFNum, 4);
    }//GEN-LAST:event_jTFNumKeyTyped

    private void jTFRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFRuaActionPerformed
        validator.maxLengthLimit(jTFRua, 50);
    }//GEN-LAST:event_jTFRuaActionPerformed

    private void jTFRuaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFRuaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFRuaKeyTyped

    private void jLimparBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimparBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLimparBtnMouseClicked

    private void jRGFormattedTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRGFormattedTextFieldKeyTyped
        validator.maxLengthLimit(jRGFormattedTextField, 50);
    }//GEN-LAST:event_jRGFormattedTextFieldKeyTyped

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jTFNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNomeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeKeyTyped

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
            java.util.logging.Logger.getLogger(FrmCadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroAlunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fundo;
    private javax.swing.JFormattedTextField jCPFFormattedTextField;
    private javax.swing.JLabel jCPFLabel;
    private javax.swing.JButton jCadastrarBtn;
    private javax.swing.JComboBox<String> jCbTurma;
    private javax.swing.JComboBox<String> jCbTurno;
    private javax.swing.JLabel jEmailLabel;
    private javax.swing.JLabel jLCPFMsg;
    private javax.swing.JLabel jLEmailMsg;
    private javax.swing.JLabel jLRGMsg;
    private javax.swing.JLabel jLabeDadosEndereco;
    private javax.swing.JLabel jLabeDadosParentesco;
    private javax.swing.JLabel jLabeDadosPessoais;
    private javax.swing.JLabel jLabelIconAlu;
    private javax.swing.JLabel jLabelMsg;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JButton jLimparBtn;
    private javax.swing.JLabel jMaeLabel;
    private javax.swing.JLabel jNomeLabel;
    private javax.swing.JLabel jPaiLabel;
    private javax.swing.JPanel jPanelDadosLogin;
    private javax.swing.JPanel jPanelDadosLogin1;
    private javax.swing.JPanel jPanelDadosPessoais;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JTextField jRGFormattedTextField;
    private javax.swing.JLabel jRGLabel;
    private javax.swing.JLabel jRuaLabel;
    private javax.swing.JLabel jSenhaLabel1;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFMae;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFNum;
    private javax.swing.JTextField jTFPai;
    private javax.swing.JTextField jTFRua;
    private javax.swing.JLabel jTurmaLabel;
    private javax.swing.JLabel jTurnoLabel;
    // End of variables declaration//GEN-END:variables
}
