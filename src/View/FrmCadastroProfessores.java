package View;

import Model.DAO.ProfessorDAO;
import Model.bean.Professor;
import Model.bean.Usuario;
import Tratamento_Exception.TextFieldValidator;
import javax.swing.JOptionPane;

public class FrmCadastroProfessores extends javax.swing.JFrame {

    private Usuario u = null;
    TextFieldValidator validator = new TextFieldValidator();
    
    public FrmCadastroProfessores() {
        initComponents();
    }
    public FrmCadastroProfessores(Usuario u) {
        initComponents();
        this.u = u;
        space1.setText("");
        space2.setText("");
        space3.setText("");
        jLabelMsg.setText("");
        jLEmailMsg.setText("");
        jLSenhaMsg.setText("");
        jLRGMsg.setVisible(false);
        jLCPFMsg.setVisible(false);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDadosPessoais = new javax.swing.JPanel();
        jRGLabel = new javax.swing.JLabel();
        jEmailLabel = new javax.swing.JLabel();
        jGraduacaoLabel = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jTFEmail = new javax.swing.JTextField();
        jNomeLabel = new javax.swing.JLabel();
        jCPFLabel = new javax.swing.JLabel();
        jCbGraduacao = new javax.swing.JComboBox<>();
        jLCPFMsg = new javax.swing.JLabel();
        space3 = new javax.swing.JLabel();
        jLRGMsg = new javax.swing.JLabel();
        jCPFFormattedTextField = new javax.swing.JFormattedTextField();
        jRGFormattedTextField = new javax.swing.JFormattedTextField();
        jGraduacaoLabel1 = new javax.swing.JLabel();
        jCbArea = new javax.swing.JComboBox<>();
        space1 = new javax.swing.JLabel();
        space2 = new javax.swing.JLabel();
        jLEmailMsg = new javax.swing.JLabel();
        jLabelIconProf = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelDadosLogin = new javax.swing.JPanel();
        jLabelMsg = new javax.swing.JLabel();
        jTFUsername = new javax.swing.JTextField();
        jUsernameLabel = new javax.swing.JLabel();
        jReSenhaLabel = new javax.swing.JLabel();
        jSenhaLabel = new javax.swing.JLabel();
        jLSenhaMsg = new javax.swing.JLabel();
        jTFReSenha = new javax.swing.JPasswordField();
        jTFSenha = new javax.swing.JPasswordField();
        jCadastrarrBtn = new javax.swing.JButton();
        jLimparBtn = new javax.swing.JButton();
        jLabeDadosPessoais = new javax.swing.JLabel();
        jLabeDadosPessoais1 = new javax.swing.JLabel();
        jLabelBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Professor");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelDadosPessoais.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDadosPessoais.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));

        jRGLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRGLabel.setForeground(new java.awt.Color(56, 160, 224));
        jRGLabel.setText("RG:");

        jEmailLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jEmailLabel.setForeground(new java.awt.Color(56, 160, 224));
        jEmailLabel.setText("E-MAIL: ");

        jGraduacaoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jGraduacaoLabel.setForeground(new java.awt.Color(56, 160, 224));
        jGraduacaoLabel.setText("GRADUAÇÃO: ");

        jTFNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTFNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFNome.setPreferredSize(new java.awt.Dimension(216, 23));
        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
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

        jCbGraduacao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jCbGraduacao.setMaximumSize(new java.awt.Dimension(216, 23));
        jCbGraduacao.setMinimumSize(new java.awt.Dimension(216, 23));
        jCbGraduacao.setPreferredSize(new java.awt.Dimension(172, 23));
        jCbGraduacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbGraduacaoActionPerformed(evt);
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

        space3.setBackground(new java.awt.Color(56, 160, 224));
        space3.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        space3.setForeground(new java.awt.Color(255, 255, 255));
        space3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        space3.setText("Insira um email válido!");
        space3.setOpaque(true);

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

        jRGFormattedTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        try {
            jRGFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jRGFormattedTextField.setPreferredSize(new java.awt.Dimension(172, 23));
        jRGFormattedTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jRGFormattedTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jRGFormattedTextFieldFocusLost(evt);
            }
        });

        jGraduacaoLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jGraduacaoLabel1.setForeground(new java.awt.Color(56, 160, 224));
        jGraduacaoLabel1.setText("ÁREA:");

        jCbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CIÊNCIAS DA NATUREZA", "CIÊNCIAS DA SAÚDE", "CIÊNCIAS SOCIAIS", "LINGUAGEM E CÓDIGOS", "MATEMÁTICA E SUAS TECN." }));
        jCbArea.setSelectedIndex(-1);
        jCbArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jCbArea.setPreferredSize(new java.awt.Dimension(172, 23));
        jCbArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCbAreaMouseEntered(evt);
            }
        });
        jCbArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbAreaActionPerformed(evt);
            }
        });

        space1.setBackground(new java.awt.Color(56, 160, 224));
        space1.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        space1.setForeground(new java.awt.Color(255, 255, 255));
        space1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        space1.setText("Formato: 000.000.000-00");
        space1.setMaximumSize(new java.awt.Dimension(160, 16));
        space1.setMinimumSize(new java.awt.Dimension(160, 16));
        space1.setOpaque(true);

        space2.setBackground(new java.awt.Color(56, 160, 224));
        space2.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        space2.setForeground(new java.awt.Color(255, 255, 255));
        space2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        space2.setText("Formato: 00000000-0");
        space2.setOpaque(true);

        jLEmailMsg.setBackground(new java.awt.Color(56, 160, 224));
        jLEmailMsg.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLEmailMsg.setForeground(new java.awt.Color(255, 255, 255));
        jLEmailMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLEmailMsg.setText("Insira um email válido!");
        jLEmailMsg.setOpaque(true);

        javax.swing.GroupLayout jPanelDadosPessoaisLayout = new javax.swing.GroupLayout(jPanelDadosPessoais);
        jPanelDadosPessoais.setLayout(jPanelDadosPessoaisLayout);
        jPanelDadosPessoaisLayout.setHorizontalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(space2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jCPFFormattedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLEmailMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jLRGMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jGraduacaoLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jGraduacaoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRGLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(space3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCbGraduacao, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRGFormattedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(space1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        jPanelDadosPessoaisLayout.setVerticalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRGMsg)
                    .addComponent(space2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRGLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRGFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCPFMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(space1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCPFLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCPFFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCbArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jGraduacaoLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmailMsg)
                    .addComponent(space3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCbGraduacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jGraduacaoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(60, 60, 60))
        );

        getContentPane().add(jPanelDadosPessoais, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 560, 180));

        jLabelIconProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/IconProf.png"))); // NOI18N
        getContentPane().add(jLabelIconProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 60, 50));

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("CADASTRO PROFESSOR");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, 40));

        jPanelDadosLogin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDadosLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jPanelDadosLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMsg.setBackground(new java.awt.Color(56, 160, 224));
        jLabelMsg.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabelMsg.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMsg.setText("Por favor preencha todos os campos!");
        jLabelMsg.setOpaque(true);
        jPanelDadosLogin.add(jLabelMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 82, 230, -1));

        jTFUsername.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTFUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFUsername.setPreferredSize(new java.awt.Dimension(183, 23));
        jTFUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUsernameActionPerformed(evt);
            }
        });
        jTFUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFUsernameKeyTyped(evt);
            }
        });
        jPanelDadosLogin.add(jTFUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 12, -1, -1));

        jUsernameLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jUsernameLabel.setForeground(new java.awt.Color(56, 160, 224));
        jUsernameLabel.setText("USUÁRIO:");
        jUsernameLabel.setMaximumSize(new java.awt.Dimension(55, 23));
        jUsernameLabel.setMinimumSize(new java.awt.Dimension(55, 23));
        jUsernameLabel.setPreferredSize(new java.awt.Dimension(55, 23));
        jPanelDadosLogin.add(jUsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        jReSenhaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jReSenhaLabel.setForeground(new java.awt.Color(56, 160, 224));
        jReSenhaLabel.setText("RE-SENHA:");
        jReSenhaLabel.setMaximumSize(new java.awt.Dimension(61, 23));
        jReSenhaLabel.setMinimumSize(new java.awt.Dimension(61, 23));
        jReSenhaLabel.setPreferredSize(new java.awt.Dimension(61, 23));
        jPanelDadosLogin.add(jReSenhaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 53, -1, -1));

        jSenhaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jSenhaLabel.setForeground(new java.awt.Color(56, 160, 224));
        jSenhaLabel.setText("SENHA:");
        jSenhaLabel.setMaximumSize(new java.awt.Dimension(42, 23));
        jSenhaLabel.setMinimumSize(new java.awt.Dimension(42, 23));
        jSenhaLabel.setPreferredSize(new java.awt.Dimension(42, 23));
        jPanelDadosLogin.add(jSenhaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 12, -1, -1));

        jLSenhaMsg.setBackground(new java.awt.Color(56, 160, 224));
        jLSenhaMsg.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLSenhaMsg.setForeground(new java.awt.Color(255, 255, 255));
        jLSenhaMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSenhaMsg.setText("Senha e Re-Senha diferentes!");
        jLSenhaMsg.setOpaque(true);
        jPanelDadosLogin.add(jLSenhaMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 180, -1));

        jTFReSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFReSenha.setPreferredSize(new java.awt.Dimension(181, 23));
        jPanelDadosLogin.add(jTFReSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        jTFSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTFSenha.setPreferredSize(new java.awt.Dimension(181, 23));
        jPanelDadosLogin.add(jTFSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        getContentPane().add(jPanelDadosLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 560, 110));

        jCadastrarrBtn.setForeground(new java.awt.Color(255, 255, 255));
        jCadastrarrBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/CadastrarBtn.png"))); // NOI18N
        jCadastrarrBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 3, true));
        jCadastrarrBtn.setPreferredSize(new java.awt.Dimension(194, 51));
        jCadastrarrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarrBtnActionPerformed(evt);
            }
        });
        getContentPane().add(jCadastrarrBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        jLimparBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LimparBtn.png"))); // NOI18N
        jLimparBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 3, true));
        jLimparBtn.setPreferredSize(new java.awt.Dimension(194, 51));
        jLimparBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimparBtnActionPerformed(evt);
            }
        });
        getContentPane().add(jLimparBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, -1, -1));

        jLabeDadosPessoais.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabeDadosPessoais.setForeground(new java.awt.Color(56, 164, 220));
        jLabeDadosPessoais.setText("Dados de Login");
        jLabeDadosPessoais.setPreferredSize(new java.awt.Dimension(116, 34));
        getContentPane().add(jLabeDadosPessoais, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 150, -1));

        jLabeDadosPessoais1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabeDadosPessoais1.setForeground(new java.awt.Color(56, 164, 220));
        jLabeDadosPessoais1.setText("Dados Pessoais");
        jLabeDadosPessoais1.setPreferredSize(new java.awt.Dimension(116, 34));
        getContentPane().add(jLabeDadosPessoais1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, -1));

        jLabelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/CadastroProf.png"))); // NOI18N
        getContentPane().add(jLabelBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCadastrarrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarrBtnActionPerformed
        if(jCPFFormattedTextField.getText().equals("") || jTFNome.getText().equals("") || jRGFormattedTextField.getText().equals("")
                || jTFEmail.getText().equals("") || jCbArea.getSelectedIndex() == -1 || jTFUsername.getText().equals("")
                || jTFSenha.getText().equals("") || jCbGraduacao.getSelectedIndex() == -1 || jTFReSenha.getText().equals("")){
            
            jLabelMsg.setText("Por favor preencha todos os campos!");
        }
        else if(!validator.emailValidate(jTFEmail)){            
            jLEmailMsg.setText("Insira um email válido!");      
        }
        else if(!jTFSenha.getText().equals(jTFReSenha.getText())){
            jLSenhaMsg.setText("Senha e Re-Senha diferentes!");
        }
        else{
            jLabelMsg.setText("");
            jLEmailMsg.setText("");
            jLSenhaMsg.setText("");
            
            Professor prof = new Professor();
            ProfessorDAO pdao = new ProfessorDAO();
            
            prof.setNome(jTFNome.getText());
            prof.setLogin(jTFUsername.getText());
            prof.setSenha(jTFSenha.getText());
            prof.setCPF(jCPFFormattedTextField.getText());
            prof.setRG(jRGFormattedTextField.getText());
            prof.setEmail(jTFEmail.getText());
            prof.setGraduacao((String) jCbGraduacao.getSelectedItem());
            prof.setTipo_user("3");
            
            if(pdao.create(prof, u.getUser_id()) ){
                JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso");
                jLimparBtnActionPerformed(evt);
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar");
            }
        }
    }//GEN-LAST:event_jCadastrarrBtnActionPerformed

    private void jLimparBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimparBtnActionPerformed
        jLabelMsg.setText("");
        jLSenhaMsg.setText(""); 
        jLRGMsg.setVisible(false);
        jLCPFMsg.setVisible(false);
        jLEmailMsg.setText("");
        jCPFFormattedTextField.setText("");
        jRGFormattedTextField.setText("");
        jTFNome.setText("");
        jTFEmail.setText("");
        jCbArea.setSelectedIndex(-1);
        jCbGraduacao.removeAllItems();
        jTFSenha.setText("");
        jTFReSenha.setText("");
        jTFUsername.setText("");
    }//GEN-LAST:event_jLimparBtnActionPerformed

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jTFEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEmailActionPerformed

    private void jTFUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFUsernameActionPerformed

    private void jTFUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFUsernameKeyTyped
        validator.maxLengthLimit(jTFUsername, 20);
    }//GEN-LAST:event_jTFUsernameKeyTyped

    private void jTFEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFEmailKeyTyped
        validator.maxLengthLimit(jTFEmail, 50);
    }//GEN-LAST:event_jTFEmailKeyTyped

    private void jCbAreaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCbAreaMouseEntered

    }//GEN-LAST:event_jCbAreaMouseEntered

    private void jCbAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbAreaActionPerformed
        switch (jCbArea.getSelectedIndex()) {
            case 0:
                jCbGraduacao.removeAllItems();
                jCbGraduacao.addItem("BIOLOGIA");
                jCbGraduacao.addItem("CIÊNCIAS");
                jCbGraduacao.addItem("FÍSICA");
                jCbGraduacao.addItem("QUÍMICA");
                break;
            case 1:
                jCbGraduacao.removeAllItems();
                jCbGraduacao.addItem("EDU. FÍSICA");
                break;
            case 2:
                jCbGraduacao.removeAllItems();
                jCbGraduacao.addItem("FILOSOFIA");
                jCbGraduacao.addItem("GEOGRAFIA");
                jCbGraduacao.addItem("HISTÓRIA");
                jCbGraduacao.addItem("RELIGIÃO");
                jCbGraduacao.addItem("SOCIOLOGIA");
                break;
            case 3:
                jCbGraduacao.removeAllItems();
                jCbGraduacao.addItem("ARTE");
                jCbGraduacao.addItem("ESPANHOL");
                jCbGraduacao.addItem("INGLÊS");
                jCbGraduacao.addItem("LIBRA");
                jCbGraduacao.addItem("PORTUGUÊS");
                jCbGraduacao.addItem("REDAÇÃO"); 
                break;
            case 4:
                jCbGraduacao.removeAllItems();
                jCbGraduacao.addItem("MATEMÁTICA"); 
                break;
            default:
            break;
        }
    }//GEN-LAST:event_jCbAreaActionPerformed

    private void jCbGraduacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbGraduacaoActionPerformed

    }//GEN-LAST:event_jCbGraduacaoActionPerformed

    private void jCPFFormattedTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCPFFormattedTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jCPFFormattedTextFieldKeyTyped

    private void jRGFormattedTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRGFormattedTextFieldFocusGained
        jLRGMsg.setVisible(true);
    }//GEN-LAST:event_jRGFormattedTextFieldFocusGained

    private void jCPFFormattedTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCPFFormattedTextFieldFocusGained
        jLCPFMsg.setVisible(true);
    }//GEN-LAST:event_jCPFFormattedTextFieldFocusGained

    private void jRGFormattedTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRGFormattedTextFieldFocusLost
        jLRGMsg.setVisible(false);
    }//GEN-LAST:event_jRGFormattedTextFieldFocusLost

    private void jCPFFormattedTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCPFFormattedTextFieldFocusLost
        jLCPFMsg.setVisible(false);
    }//GEN-LAST:event_jCPFFormattedTextFieldFocusLost

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
            java.util.logging.Logger.getLogger(FrmCadastroProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroProfessores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jCPFFormattedTextField;
    private javax.swing.JLabel jCPFLabel;
    private javax.swing.JButton jCadastrarrBtn;
    private javax.swing.JComboBox<String> jCbArea;
    private javax.swing.JComboBox<String> jCbGraduacao;
    private javax.swing.JLabel jEmailLabel;
    private javax.swing.JLabel jGraduacaoLabel;
    private javax.swing.JLabel jGraduacaoLabel1;
    private javax.swing.JLabel jLCPFMsg;
    private javax.swing.JLabel jLEmailMsg;
    private javax.swing.JLabel jLRGMsg;
    private javax.swing.JLabel jLSenhaMsg;
    private javax.swing.JLabel jLabeDadosPessoais;
    private javax.swing.JLabel jLabeDadosPessoais1;
    private javax.swing.JLabel jLabelBG;
    private javax.swing.JLabel jLabelIconProf;
    private javax.swing.JLabel jLabelMsg;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JButton jLimparBtn;
    private javax.swing.JLabel jNomeLabel;
    private javax.swing.JPanel jPanelDadosLogin;
    private javax.swing.JPanel jPanelDadosPessoais;
    private javax.swing.JFormattedTextField jRGFormattedTextField;
    private javax.swing.JLabel jRGLabel;
    private javax.swing.JLabel jReSenhaLabel;
    private javax.swing.JLabel jSenhaLabel;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JPasswordField jTFReSenha;
    private javax.swing.JPasswordField jTFSenha;
    private javax.swing.JTextField jTFUsername;
    private javax.swing.JLabel jUsernameLabel;
    private javax.swing.JLabel space1;
    private javax.swing.JLabel space2;
    private javax.swing.JLabel space3;
    // End of variables declaration//GEN-END:variables
}
