/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author Décio
 */
public class TelaAnimal extends javax.swing.JFrame {

    /**
     * Creates new form TelaAnimal
     */
    public TelaAnimal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgPetSexo = new javax.swing.ButtonGroup();
        lblTelaPetNomePet = new javax.swing.JPanel();
        lblTelaPetNomeCliente = new javax.swing.JLabel();
        tctPetAnimal = new javax.swing.JTextField();
        lblTelaPetNascimento = new javax.swing.JLabel();
        tctPetNascimento = new javax.swing.JTextField();
        tctPetCor = new javax.swing.JTextField();
        lblTelaPetCor = new javax.swing.JLabel();
        lblTelaPetEspecie = new javax.swing.JLabel();
        tctPetEspecie = new javax.swing.JTextField();
        tctPetRaca = new javax.swing.JTextField();
        lblTelaPetRaca = new javax.swing.JLabel();
        lblTelaPetPeso = new javax.swing.JLabel();
        tctPetPeso = new javax.swing.JTextField();
        lblTelaPetAltura = new javax.swing.JLabel();
        tctPetAltura = new javax.swing.JTextField();
        lblTelaPetSexo = new javax.swing.JLabel();
        lblTelaPetCaracteristica = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaPetCaracteristica = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        tctPetFoto = new javax.swing.JTextField();
        lblTelaPetUrlFoto = new javax.swing.JLabel();
        lblTelaPetPesoUnidade = new javax.swing.JLabel();
        lblTelaPetAlturaUnidade = new javax.swing.JLabel();
        btnSalvarPet = new javax.swing.JButton();
        btnExcluirPet = new javax.swing.JButton();
        btnSairVoltar = new javax.swing.JButton();
        rbMacho = new javax.swing.JRadioButton();
        rbFemea = new javax.swing.JRadioButton();
        jPanelPetAnimalTitulo1 = new javax.swing.JPanel();
        lblTituloPet1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTelaPetNomePet.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblTelaPetNomeCliente.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetNomeCliente.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetNomeCliente.setForeground(new java.awt.Color(102, 102, 102));
        lblTelaPetNomeCliente.setText("Nome Pet:");

        tctPetAnimal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tctPetAnimal.setForeground(new java.awt.Color(51, 51, 51));
        tctPetAnimal.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblTelaPetNascimento.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetNascimento.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetNascimento.setForeground(new java.awt.Color(102, 102, 102));
        lblTelaPetNascimento.setText("Nascimento:");

        tctPetNascimento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tctPetNascimento.setForeground(new java.awt.Color(51, 51, 51));
        tctPetNascimento.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tctPetCor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tctPetCor.setForeground(new java.awt.Color(51, 51, 51));
        tctPetCor.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblTelaPetCor.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetCor.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetCor.setForeground(new java.awt.Color(102, 102, 102));
        lblTelaPetCor.setText("Cor:");

        lblTelaPetEspecie.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetEspecie.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetEspecie.setForeground(new java.awt.Color(102, 102, 102));
        lblTelaPetEspecie.setText("Espécie:");

        tctPetEspecie.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tctPetEspecie.setForeground(new java.awt.Color(51, 51, 51));
        tctPetEspecie.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tctPetRaca.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tctPetRaca.setForeground(new java.awt.Color(51, 51, 51));
        tctPetRaca.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblTelaPetRaca.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetRaca.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetRaca.setForeground(new java.awt.Color(102, 102, 102));
        lblTelaPetRaca.setText("Raça:");

        lblTelaPetPeso.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetPeso.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetPeso.setForeground(new java.awt.Color(102, 102, 102));
        lblTelaPetPeso.setText("Peso:");

        tctPetPeso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tctPetPeso.setForeground(new java.awt.Color(51, 51, 51));
        tctPetPeso.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblTelaPetAltura.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetAltura.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetAltura.setForeground(new java.awt.Color(102, 102, 102));
        lblTelaPetAltura.setText("Altura:");

        tctPetAltura.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tctPetAltura.setForeground(new java.awt.Color(51, 51, 51));
        tctPetAltura.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblTelaPetSexo.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetSexo.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetSexo.setForeground(new java.awt.Color(102, 102, 102));
        lblTelaPetSexo.setText("Sexo:");

        lblTelaPetCaracteristica.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetCaracteristica.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetCaracteristica.setForeground(new java.awt.Color(102, 102, 102));
        lblTelaPetCaracteristica.setText("Características:");

        txaPetCaracteristica.setColumns(20);
        txaPetCaracteristica.setRows(5);
        jScrollPane1.setViewportView(txaPetCaracteristica);

        jLabel1.setText(" ");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tctPetFoto.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        tctPetFoto.setForeground(new java.awt.Color(51, 51, 51));
        tctPetFoto.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblTelaPetUrlFoto.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetUrlFoto.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetUrlFoto.setForeground(new java.awt.Color(102, 102, 102));
        lblTelaPetUrlFoto.setText("Url:");

        lblTelaPetPesoUnidade.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetPesoUnidade.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetPesoUnidade.setForeground(new java.awt.Color(102, 102, 102));
        lblTelaPetPesoUnidade.setText("kg.");

        lblTelaPetAlturaUnidade.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetAlturaUnidade.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetAlturaUnidade.setForeground(new java.awt.Color(102, 102, 102));
        lblTelaPetAlturaUnidade.setText("cm");

        btnSalvarPet.setBackground(new java.awt.Color(204, 204, 204));
        btnSalvarPet.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSalvarPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ticarGreen_1.png"))); // NOI18N
        btnSalvarPet.setText("Salvar");
        btnSalvarPet.setToolTipText("Salvar Alterações");
        btnSalvarPet.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSalvarPet.setIconTextGap(0);
        btnSalvarPet.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSalvarPet.setPreferredSize(new java.awt.Dimension(100, 50));
        btnSalvarPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPetActionPerformed(evt);
            }
        });

        btnExcluirPet.setBackground(new java.awt.Color(204, 204, 204));
        btnExcluirPet.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnExcluirPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/excluir 40x40 vermelho.png"))); // NOI18N
        btnExcluirPet.setText("Excluir");
        btnExcluirPet.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnExcluirPet.setPreferredSize(new java.awt.Dimension(100, 50));
        btnExcluirPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPetActionPerformed(evt);
            }
        });

        btnSairVoltar.setBackground(new java.awt.Color(204, 204, 204));
        btnSairVoltar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSairVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/saidaDireitaRed.png"))); // NOI18N
        btnSairVoltar.setText("Voltar");
        btnSairVoltar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSairVoltar.setPreferredSize(new java.awt.Dimension(100, 50));
        btnSairVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairVoltarActionPerformed(evt);
            }
        });

        btgPetSexo.add(rbMacho);
        rbMacho.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        rbMacho.setForeground(new java.awt.Color(102, 102, 102));
        rbMacho.setText("Macho");

        btgPetSexo.add(rbFemea);
        rbFemea.setForeground(new java.awt.Color(102, 102, 102));
        rbFemea.setText("Fêmea");

        javax.swing.GroupLayout lblTelaPetNomePetLayout = new javax.swing.GroupLayout(lblTelaPetNomePet);
        lblTelaPetNomePet.setLayout(lblTelaPetNomePetLayout);
        lblTelaPetNomePetLayout.setHorizontalGroup(
            lblTelaPetNomePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblTelaPetNomePetLayout.createSequentialGroup()
                .addGroup(lblTelaPetNomePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblTelaPetNomePetLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblTelaPetNomeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tctPetAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lblTelaPetNomePetLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(lblTelaPetNomePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lblTelaPetNomePetLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(lblTelaPetEspecie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tctPetEspecie))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lblTelaPetNomePetLayout.createSequentialGroup()
                                .addGroup(lblTelaPetNomePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTelaPetNascimento)
                                    .addComponent(lblTelaPetRaca)
                                    .addComponent(lblTelaPetCor)
                                    .addComponent(lblTelaPetPeso)
                                    .addComponent(lblTelaPetCaracteristica))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(lblTelaPetNomePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(lblTelaPetNomePetLayout.createSequentialGroup()
                                        .addComponent(tctPetPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblTelaPetPesoUnidade)
                                        .addGap(58, 58, 58)
                                        .addComponent(lblTelaPetAltura)
                                        .addGap(18, 18, 18)
                                        .addComponent(tctPetAltura))
                                    .addComponent(tctPetCor)
                                    .addComponent(tctPetRaca)
                                    .addGroup(lblTelaPetNomePetLayout.createSequentialGroup()
                                        .addComponent(tctPetNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(lblTelaPetSexo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbMacho)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbFemea))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(lblTelaPetNomePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblTelaPetNomePetLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblTelaPetAlturaUnidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lblTelaPetNomePetLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblTelaPetUrlFoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(lblTelaPetNomePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lblTelaPetNomePetLayout.createSequentialGroup()
                                .addComponent(btnSalvarPet, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluirPet, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSairVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tctPetFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))))
                .addContainerGap())
        );
        lblTelaPetNomePetLayout.setVerticalGroup(
            lblTelaPetNomePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblTelaPetNomePetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblTelaPetNomePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lblTelaPetNomePetLayout.createSequentialGroup()
                        .addGroup(lblTelaPetNomePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelaPetNomeCliente)
                            .addComponent(tctPetAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(lblTelaPetNomePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tctPetEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelaPetEspecie))
                        .addGroup(lblTelaPetNomePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lblTelaPetNomePetLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(lblTelaPetNomePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tctPetNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTelaPetNascimento)))
                            .addGroup(lblTelaPetNomePetLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(lblTelaPetNomePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTelaPetSexo)
                                    .addComponent(rbMacho)
                                    .addComponent(rbFemea))))
                        .addGap(16, 16, 16)
                        .addGroup(lblTelaPetNomePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tctPetRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelaPetRaca))
                        .addGap(18, 18, 18)
                        .addGroup(lblTelaPetNomePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tctPetCor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelaPetCor))
                        .addGap(18, 18, 18)
                        .addGroup(lblTelaPetNomePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tctPetPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelaPetPeso)
                            .addComponent(lblTelaPetAltura)
                            .addComponent(tctPetAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelaPetPesoUnidade)
                            .addComponent(lblTelaPetAlturaUnidade))
                        .addGap(66, 66, 66)
                        .addGroup(lblTelaPetNomePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblTelaPetNomePetLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(lblTelaPetNomePetLayout.createSequentialGroup()
                                .addComponent(lblTelaPetCaracteristica)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(45, 45, 45))
                    .addGroup(lblTelaPetNomePetLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(lblTelaPetNomePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelaPetUrlFoto)
                            .addComponent(tctPetFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(lblTelaPetNomePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvarPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluirPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSairVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
        );

        jPanelPetAnimalTitulo1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblTituloPet1.setBackground(new java.awt.Color(102, 102, 102));
        lblTituloPet1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        lblTituloPet1.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloPet1.setText("Pet-Animal");

        javax.swing.GroupLayout jPanelPetAnimalTitulo1Layout = new javax.swing.GroupLayout(jPanelPetAnimalTitulo1);
        jPanelPetAnimalTitulo1.setLayout(jPanelPetAnimalTitulo1Layout);
        jPanelPetAnimalTitulo1Layout.setHorizontalGroup(
            jPanelPetAnimalTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPetAnimalTitulo1Layout.createSequentialGroup()
                .addContainerGap(465, Short.MAX_VALUE)
                .addComponent(lblTituloPet1)
                .addGap(408, 408, 408))
        );
        jPanelPetAnimalTitulo1Layout.setVerticalGroup(
            jPanelPetAnimalTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPetAnimalTitulo1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloPet1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPetAnimalTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTelaPetNomePet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPetAnimalTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTelaPetNomePet, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPetActionPerformed
        ClienteCtrl cCliente = new ClienteCtrl();
        Cliente objCli;
        objCli = new Cliente();

        objCli.setIdCliente("0");
        objCli.setNome(tctNome.getText().trim());
        dataNascimentoCliente = Util.DataFormatadaS(jspNascimento.getValue().toString());
        dataIntNascimentoCliente = Util.DtAmericana(jspNascimento.getValue().toString());
        objCli.setNascimento(dataNascimentoCliente);
        objCli.setEndereco(tctEndereco.getText().trim());
        objCli.setNumero(tctNumeroEndCliente.getText());
        objCli.setBairro(tctBairro.getText().trim());
        objCli.setEmail(tftEmail.getText().trim());
        objCli.setCep(tftCep.getText());
        objCli.setTelefone(tftTelefone.getText());
        objCli.setRg(tftRG.getText());
        objCli.setCpf(tftCPF.getText());
        objCli.setCidade(tctCidade.getText().trim());
        //objCli.setUf(Arrays.toString(cbxUF.getSelectedObjects()));
        objCli.setUf((String) cbxUF.getSelectedItem());
        //objCli.setUf(cbxUF.getSelectedObjects());

        String nome = tctNome.getText().trim();
        //String nasc = tftNascimento.getText();
        String end = tctEndereco.getText().trim();
        String numero = tctNumeroEndCliente.getText();
        String bairro = tctBairro.getText().trim();
        String email = tftEmail.getText().trim();

        String telefone = tftTelefone.getText();
        String rg = tftRG.getText();
        String cpf = tftCPF.getText();
        String cep = tftCep.getText();
        String cidade = tctCidade.getText().trim();
        String uf = Arrays.toString(cbxUF.getSelectedObjects());

        //int i = arrayCli.indexOf(tctNome.getText ());
        String msg;
        msg = "";

        boolean validaNome = ValidaCampos.validaVazio(nome);
        //boolean validaData = ValidaCampos.validaData(nasc);
        boolean validaDatajsp = ValidaCampos.validaDataNascimento(dataIntNascimentoCliente);
        boolean validaEndereco = ValidaCampos.validaVazio(end);
        boolean validaNumeroEnd = ValidaCampos.validaVazio(numero);
        boolean validaBairro = ValidaCampos.validaVazio(bairro);
        boolean validaRG = ValidaCampos.validaRG(rg);
        boolean validaCpfBanco = ClienteCtrl.receberPesquisarClienteCPF(cpf);
        boolean validaCPF = ValidaCampos.validaCPF(cpf);
        boolean validaEmail = ValidaCampos.validaEmail(email);
        boolean validaTelefone = ValidaCampos.validaTelefone(telefone);
        boolean validaCep = ValidaCampos.validaCEP(cep);
        boolean validaCidade = ValidaCampos.validaVazio(cidade);
        boolean validaUF = ValidaCampos.validaVazioComboBox(uf);

        if (btnSalvarCliente.isEnabled()) {
            if (validaCpfBanco) {
            } else {
                msg = msg + "Campo CPF já existe na base de dados Aerofast" + "\n";
                this.tftCPF.setText(null);
            }
        }

        if (validaNome) {
        } else {
            msg = msg + "Campo Nome Vazio" + "\n";
        }

        if (validaDatajsp) {
        } else {
            msg = msg + "Campo Nascimento Inválido" + "\n";
        }

        if (validaEndereco) {
        } else {
            msg = msg + "Campo Endereço Vazio" + "\n";
        }

        if (validaNumeroEnd) {
        } else {
            msg = msg + "Campo Número Endereço Vazio" + "\n";
        }

        if (validaBairro) {
        } else {
            msg = msg + "Campo Bairro Vazio" + "\n";
        }

        if (validaCep) {
        } else {
            msg = msg + "Campo CEP inválido: " + cep + "\n";
            this.tftCep.setText(null);
        }

        if (validaCidade) {
        } else {
            msg = msg + "Campo Cidade Vazio" + "\n";
        }

        if (validaUF) {
        } else {
            msg = msg + "Campo UF Vazio" + "\n";
        }

        if (validaEmail) {
        } else {
            msg = msg + "Campo E-mail inválido: " + email + "\n";
            this.tftEmail.setText(null);
        }

        if (validaTelefone) {
        } else {
            msg = msg + "Campo Telefone inválido: " + telefone + "\n";
            this.tftTelefone.setText(null);
        }

        if (validaRG) {
        } else {
            msg = msg + "Campo RG inválido: " + rg + "\n";
            this.tftRG.setText(null);
        }

        if (validaCPF) {
        } else {
            msg = msg + "Campo CPF inválido: " + cpf + "\n";
            this.tftCPF.setText(null);
        }

        if ("".equals(msg)) {
            // msg = "Dados Enviados ao banco de dados do sistema!";

            if (btnSalvarCliente.isEnabled()) {

                boolean resultadoCliente = arrayCli.add(objCli);
                try {
                    if (resultadoCliente) {
                        cCliente.receberCliente(objCli);
                    }
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
                    msg = msg + ex;
                    JOptionPane.showMessageDialog(null, reduzString(msg));
                }
            } else {//inicio do Alterar Cliente
                boolean flag = false; //verificar esta flag

                try {

                    cCliente.alterarClienteCtrl(objCli, oldCPF);
                    // JOptionPane.showMessageDialog(this, msg, "Dados Alterados", JOptionPane.INFORMATION_MESSAGE);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
                }

                btnLimparCliente.doClick(); //Limpar tela
                flag = true;
            }
            btnLimparCliente.doClick();
            btnSairCliente.doClick();

        } else {
            JOptionPane.showMessageDialog(this, msg, "Campo Inválido ou vazio", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarPetActionPerformed

    private void btnExcluirPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPetActionPerformed
        btnSalvarCliente.setEnabled(false);
        btnAlterarCliente.setEnabled(false);
        btnEditarCliente.setEnabled(false);
        boolean flag = false;

        //inicio
        //ClienteCtrl controller = new ClienteCtrl();
        Cliente cliente;

        try {

            cliente = receberClienteCPF(tftCPF.getText());
            if (cliente != null) {
                oldCPF = tftCPF.getText();
                /**
                * Tratamento do campo tipo jSpinner
                */
                String sdataNascimento = cliente.getNascimento();

                try {
                    calNascimentoCliente = Util.retornaData(sdataNascimento);
                } catch (Exception ex) {
                    Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
                jspNascimento.setValue(calNascimentoCliente);

                tctBairro.setText(cliente.getBairro());

                tftCep.setText(cliente.getCep());
                tctCidade.setText(cliente.getCidade());

                //Como pesquisar comboBox
                cbxUF.setSelectedItem(cliente.getUf());

                tftCPF.setText(cliente.getCpf());
                tftRG.setText(cliente.getRg());
                tftEmail.setText(cliente.getEmail());
                //tftNascimento.setText(arrayCli.get(i).getNascimento());
                tftTelefone.setText(cliente.getTelefone());
                tctNome.setText(cliente.getNome());
                tctEndereco.setText(cliente.getEndereco());
                tctNumeroEndCliente.setText(cliente.getNumero());

                //desabilitar edição
                desabilitarDadosCliente();
                //chamar método em control para deletar o cliente
                ClienteCtrl cCliente = new ClienteCtrl();
                cCliente.deletarClienteCtrl(cliente, oldCPF);
                btnLimparCliente.doClick(); //Limpar tela
                flag = true;

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        //fim método

        //fim método
    }//GEN-LAST:event_btnExcluirPetActionPerformed

    private void btnSairVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(newjPanelPetAnimalTitulole() {
            public void run() {
                new TelaAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgPetSexo;
    private javax.swing.JButton btnExcluirPet;
    private javax.swing.JButton btnSairVoltar;
    private javax.swing.JButton btnSalvarPet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelPetAnimalTitulo1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTelaPetAltura;
    private javax.swing.JLabel lblTelaPetAlturaUnidade;
    private javax.swing.JLabel lblTelaPetCaracteristica;
    private javax.swing.JLabel lblTelaPetCor;
    private javax.swing.JLabel lblTelaPetEspecie;
    private javax.swing.JLabel lblTelaPetNascimento;
    private javax.swing.JLabel lblTelaPetNomeCliente;
    private javax.swing.JPanel lblTelaPetNomePet;
    private javax.swing.JLabel lblTelaPetPeso;
    private javax.swing.JLabel lblTelaPetPesoUnidade;
    private javax.swing.JLabel lblTelaPetRaca;
    private javax.swing.JLabel lblTelaPetSexo;
    private javax.swing.JLabel lblTelaPetUrlFoto;
    private javax.swing.JLabel lblTituloPet1;
    private javax.swing.JRadioButton rbFemea;
    private javax.swing.JRadioButton rbMacho;
    private static javax.swing.JTextField tctPetAltura;
    private static javax.swing.JTextField tctPetAnimal;
    private static javax.swing.JTextField tctPetCor;
    private static javax.swing.JTextField tctPetEspecie;
    private static javax.swing.JTextField tctPetFoto;
    private static javax.swing.JTextField tctPetNascimento;
    private static javax.swing.JTextField tctPetPeso;
    private static javax.swing.JTextField tctPetRaca;
    private javax.swing.JTextArea txaPetCaracteristica;
    // End of variables declaration//GEN-END:variables
}
