/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.AnimalCtrl;
import controle.ClienteCtrl;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;
import modelo.Animal;
import modelo.Cliente;

/**
 * http://rgb.to/hex/8c1aff
 *
 * @author Décio
 */
public class TelaAgendamentoClientePet extends javax.swing.JInternalFrame {

    private DefaultListModel lista = new DefaultListModel();
    private static ArrayList listaNome, listaAnimal, arrayListAnimal;
    private static int pos = 0, tam = 0;
    private String idCliente, idAnimal, nomeCliente;
    private List lAnimal;
    private JList listAnimal;
    private String urlMiniFoto, nomeAnimal;
    private static int openFrameCount = 0; //teste
    private static final int xOffset = 30, yOffset = 30; //teste

    /**
     * Creates new form TelaClientePet
     */
    public TelaAgendamentoClientePet() {
        super("Document #" + (++openFrameCount),
                true, //resizable
                true, //closable
                true, //maximizable
                true);//iconifiable
        initComponents();
        btnAgendar.setVisible(false);
        // Center in the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        //setLocation(new Point((screenSize.width - frameSize.width) / 2,
        //                     (screenSize.height - frameSize.width) / 2));

        //this.setLocation(50, 100); //(ponto inicial apartir lateral,altura)
        setLocation(xOffset * openFrameCount, yOffset * openFrameCount);
        setLocation(new Point((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.width) / 2));
        this.repaint();

        idCliente = "";
        nomeCliente = "";
        tctPetAnimalCpfCliente.setEditable(false);
        tctIdCliente.setEditable(false);
        desabilitarBotoesPet();
        desabilitarBotoesCliente();
        cbxClienteAnimal.removeAllItems();
       // cbxClienteAnimal.removeAll();

        // jScrollPane1.setViewportView(jListPet);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelPet = new javax.swing.JPanel();
        lblTelaPetNomeCliente2 = new javax.swing.JLabel();
        btnConsultarPet = new javax.swing.JButton();
        btnVoltarMenu = new javax.swing.JButton();
        cbxClienteAnimal = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        lblMiniFotoPet = new javax.swing.JLabel();
        lblQuantidadePetCliente = new javax.swing.JLabel();
        jPanelTitulo = new javax.swing.JPanel();
        lblTituloAgendamentoPet = new javax.swing.JLabel();
        jPanelCliente = new javax.swing.JPanel();
        lblTelaPetCodigoCliente = new javax.swing.JLabel();
        tctPetAnimalCpfCliente = new javax.swing.JTextField();
        btnPesquisarCliente = new javax.swing.JButton();
        lblTelaPetNomeCliente = new javax.swing.JLabel();
        tctPetAnimalCliente = new javax.swing.JTextField();
        btnInicioCli = new javax.swing.JButton();
        btnPrevCli = new javax.swing.JButton();
        btnNextCli = new javax.swing.JButton();
        btnLastCli = new javax.swing.JButton();
        tctIdCliente = new javax.swing.JTextField();
        lblTelaPetCodigoCliente1 = new javax.swing.JLabel();
        btnAgendar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 128, 0));
        setClosable(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(208, 201, 82));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanelPet.setBackground(new java.awt.Color(228, 251, 173));
        jPanelPet.setBorder(javax.swing.BorderFactory.createTitledBorder("Pet Animal"));

        lblTelaPetNomeCliente2.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetNomeCliente2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetNomeCliente2.setText("Lista Pet");

        btnConsultarPet.setBackground(new java.awt.Color(165, 216, 160));
        btnConsultarPet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConsultarPet.setForeground(new java.awt.Color(0, 0, 51));
        btnConsultarPet.setText("Consultar");
        btnConsultarPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPetActionPerformed(evt);
            }
        });

        btnVoltarMenu.setBackground(new java.awt.Color(165, 216, 160));
        btnVoltarMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoltarMenu.setForeground(new java.awt.Color(0, 0, 51));
        btnVoltarMenu.setText("Voltar");
        btnVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMenuActionPerformed(evt);
            }
        });

        cbxClienteAnimal.setBackground(new java.awt.Color(255, 239, 191));
        cbxClienteAnimal.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        cbxClienteAnimal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxClienteAnimalItemStateChanged(evt);
            }
        });
        cbxClienteAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxClienteAnimalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        lblMiniFotoPet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblQuantidadePetCliente.setBackground(new java.awt.Color(102, 102, 102));
        lblQuantidadePetCliente.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblQuantidadePetCliente.setText("Este Cliente possui :");
        lblQuantidadePetCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanelPetLayout = new javax.swing.GroupLayout(jPanelPet);
        jPanelPet.setLayout(jPanelPetLayout);
        jPanelPetLayout.setHorizontalGroup(
            jPanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPetLayout.createSequentialGroup()
                .addGroup(jPanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPetLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblQuantidadePetCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPetLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(74, 74, 74))
                    .addGroup(jPanelPetLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTelaPetNomeCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(jPanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPetLayout.createSequentialGroup()
                                .addComponent(btnVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnConsultarPet))
                            .addComponent(cbxClienteAnimal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMiniFotoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        jPanelPetLayout.setVerticalGroup(
            jPanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPetLayout.createSequentialGroup()
                        .addComponent(lblMiniFotoPet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelPetLayout.createSequentialGroup()
                        .addComponent(lblQuantidadePetCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelaPetNomeCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxClienteAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVoltarMenu)
                            .addComponent(btnConsultarPet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21))))
        );

        jPanelTitulo.setBackground(new java.awt.Color(228, 251, 173));
        jPanelTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanelTitulo.setMaximumSize(new java.awt.Dimension(32767, 58));

        lblTituloAgendamentoPet.setBackground(new java.awt.Color(102, 102, 102));
        lblTituloAgendamentoPet.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        lblTituloAgendamentoPet.setText("Agendamento Serviço Pet");

        jPanelCliente.setBackground(new java.awt.Color(228, 251, 173));
        jPanelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        lblTelaPetCodigoCliente.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetCodigoCliente.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetCodigoCliente.setText("Cpf:");

        tctPetAnimalCpfCliente.setBackground(new java.awt.Color(255, 239, 191));
        tctPetAnimalCpfCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tctPetAnimalCpfCliente.setForeground(new java.awt.Color(51, 51, 51));
        tctPetAnimalCpfCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btnPesquisarCliente.setBackground(new java.awt.Color(0, 128, 0));
        btnPesquisarCliente.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnPesquisarCliente.setForeground(new java.awt.Color(0, 0, 51));
        btnPesquisarCliente.setText("Pesquisar");
        btnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarClienteActionPerformed(evt);
            }
        });

        lblTelaPetNomeCliente.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetNomeCliente.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetNomeCliente.setText("Cliente:");

        tctPetAnimalCliente.setBackground(new java.awt.Color(255, 239, 191));
        tctPetAnimalCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tctPetAnimalCliente.setForeground(new java.awt.Color(51, 51, 51));
        tctPetAnimalCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btnInicioCli.setBackground(new java.awt.Color(0, 128, 0));
        btnInicioCli.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInicioCli.setForeground(new java.awt.Color(0, 0, 51));
        btnInicioCli.setText("|<");
        btnInicioCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioCliActionPerformed(evt);
            }
        });

        btnPrevCli.setBackground(new java.awt.Color(0, 128, 0));
        btnPrevCli.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPrevCli.setForeground(new java.awt.Color(0, 0, 51));
        btnPrevCli.setText("<");
        btnPrevCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevCliActionPerformed(evt);
            }
        });

        btnNextCli.setBackground(new java.awt.Color(0, 128, 0));
        btnNextCli.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNextCli.setForeground(new java.awt.Color(0, 0, 51));
        btnNextCli.setText(">");
        btnNextCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextCliActionPerformed(evt);
            }
        });

        btnLastCli.setBackground(new java.awt.Color(0, 128, 0));
        btnLastCli.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLastCli.setForeground(new java.awt.Color(0, 0, 51));
        btnLastCli.setText(">|");
        btnLastCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastCliActionPerformed(evt);
            }
        });

        tctIdCliente.setEditable(false);
        tctIdCliente.setBackground(new java.awt.Color(255, 239, 191));
        tctIdCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        lblTelaPetCodigoCliente1.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetCodigoCliente1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetCodigoCliente1.setText("Id Cliente:");

        btnAgendar.setBackground(new java.awt.Color(0, 128, 0));
        btnAgendar.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnAgendar.setForeground(new java.awt.Color(0, 0, 51));
        btnAgendar.setText("Agendar Horário");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addComponent(lblTelaPetNomeCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelClienteLayout.createSequentialGroup()
                                .addComponent(btnInicioCli, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                .addGap(76, 76, 76)
                                .addComponent(btnPrevCli, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                .addGap(90, 90, 90)
                                .addComponent(btnNextCli, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                .addGap(86, 86, 86)
                                .addComponent(btnLastCli, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                            .addComponent(tctPetAnimalCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(220, 220, 220))
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTelaPetCodigoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tctPetAnimalCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTelaPetCodigoCliente1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisarCliente)
                    .addComponent(tctIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tctPetAnimalCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTelaPetCodigoCliente1)
                        .addComponent(tctIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTelaPetCodigoCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelaPetNomeCliente)
                        .addComponent(tctPetAnimalCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInicioCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrevCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNextCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLastCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelClienteLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tctIdCliente, tctPetAnimalCliente});

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(lblTituloAgendamentoPet)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addComponent(lblTituloAgendamentoPet)
                .addGap(18, 18, 18)
                .addComponent(jPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed
        // Pesquisar Cliente e buscar lista animais por cliente
        int idClienteP;
        DefaultListModel model = new DefaultListModel();

        ClienteCtrl ccliente = new ClienteCtrl();
        listaNome = (ArrayList) ccliente.listaClientesPorNome(tctPetAnimalCliente.getText());

        if (!listaNome.isEmpty()) {
            btnAgendar.setVisible(true);
            pos = 0;

            tam = listaNome.size() - 1;
            Cliente cli = (Cliente) listaNome.get(0);
            tctPetAnimalCpfCliente.setText(cli.getCpf());
            tctPetAnimalCliente.setText(cli.getNome());
            tctIdCliente.setText(cli.getIdCliente());
            idClienteP = Integer.parseInt(cli.getIdCliente());
            habilitarBotoesCliente();

            //buscar listas de animais deste 
            //arrayListAnimal = canimal.receberArrayListAnimaisCliente(idClienteP);
            // jScrollPaneAnimais.add(listAnimal);
            //jListPet.add();
            //lAnimal = canimal.receberListaAnimaisCliente(idClienteP);
            //listAnimal = new JList(model);
            populaJComboBoxAnimalCliente(idClienteP);

           // colocarMiniFotoLabel();
        } else {
            btnAgendar.setVisible(false);
            JOptionPane.showMessageDialog(null, "Cliente não localizado!");
            tctPetAnimalCpfCliente.setText("");
            tctPetAnimalCliente.setText("");
            tctIdCliente.setText("");
            cbxClienteAnimal.setSelectedItem(null);
            cbxClienteAnimal.setSelectedIndex(-1);
            cbxClienteAnimal.removeAllItems();
            cbxClienteAnimal.removeAll();
            desabilitarBotoesCliente();
            desabilitarBotoesPet();

        }

        /*
         */

    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void btnVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVoltarMenuActionPerformed

    private void btnLastCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastCliActionPerformed
        // Botão [>|]
        int idClienteP;
        pos = tam;
        Cliente cli = (Cliente) listaNome.get(tam);
        tctPetAnimalCpfCliente.setText(cli.getCpf());
        tctPetAnimalCliente.setText(cli.getNome());
        tctIdCliente.setText(cli.getIdCliente());
        idClienteP = Integer.parseInt(cli.getIdCliente());
        populaJComboBoxAnimalCliente(idClienteP);
        //colocarMiniFotoLabel();


    }//GEN-LAST:event_btnLastCliActionPerformed

    private void btnInicioCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioCliActionPerformed
        // Botão [|<]
        int idClienteP;
        pos = 0;
        Cliente cli = (Cliente) listaNome.get(pos);
        tctPetAnimalCpfCliente.setText(cli.getCpf());
        tctPetAnimalCliente.setText(cli.getNome());
        tctIdCliente.setText(cli.getIdCliente());
        idClienteP = Integer.parseInt(cli.getIdCliente());
        populaJComboBoxAnimalCliente(idClienteP);
        //colocarMiniFotoLabel();


    }//GEN-LAST:event_btnInicioCliActionPerformed

    private void btnPrevCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevCliActionPerformed
        // Botão [<]

        if (pos > 0) {
            int idClienteP;
            pos--;
            Cliente cli = (Cliente) listaNome.get(pos);
            tctPetAnimalCpfCliente.setText(cli.getCpf());
            tctPetAnimalCliente.setText(cli.getNome());
            tctIdCliente.setText(cli.getIdCliente());
            idClienteP = Integer.parseInt(cli.getIdCliente());
            populaJComboBoxAnimalCliente(idClienteP);
           // colocarMiniFotoLabel();

        }


    }//GEN-LAST:event_btnPrevCliActionPerformed

    private void btnNextCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextCliActionPerformed
        // Botão [>]

        if (pos < tam) {
            int idClienteP;
            pos++;
            Cliente cli = (Cliente) listaNome.get(pos);
            tctPetAnimalCpfCliente.setText(cli.getCpf());
            tctPetAnimalCliente.setText(cli.getNome());
            tctIdCliente.setText(cli.getIdCliente());
            idClienteP = Integer.parseInt(cli.getIdCliente());
            populaJComboBoxAnimalCliente(idClienteP);
            //colocarMiniFotoLabel();

        }


    }//GEN-LAST:event_btnNextCliActionPerformed

    private void cbxClienteAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxClienteAnimalActionPerformed
        if ((cbxClienteAnimal.getSelectedIndex()) != -1) {
            //habilitar os botoes 
            habilitarBotoesPet();
        } else {
            //desabilitar os botoes 
            desabilitarBotoesPet();
        }

    }//GEN-LAST:event_cbxClienteAnimalActionPerformed

    private void btnConsultarPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPetActionPerformed
        //Botão Consultar Animal
        //this.dispose();

        String tituloPet;
        tituloPet = "Gestão Pet- Consultar ";
        String nome = tctPetAnimalCliente.getText();
        String nomeAnimal = cbxClienteAnimal.getSelectedItem() + "";
        int id;
        id = parseInt(tctIdCliente.getText());
        TelaAnimal telaAnimal = new TelaAnimal(nome, id, "c", nomeAnimal);
        telaAnimal.setTitle(tituloPet);
        telaAnimal.setVisible(true);

        //add(telaAnimal, JLayeredPane.DRAG_LAYER);
        telaAnimal.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaAnimal.setLocation(50, 50);


    }//GEN-LAST:event_btnConsultarPetActionPerformed

    private void cbxClienteAnimalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxClienteAnimalItemStateChanged
        // Quando houver alteração no combo box
        lblQuantidadePetCliente.setText("");
        lblMiniFotoPet.setIcon(null);
        int QuantidadePet = 0;
        String nomeCli = "";
        AnimalCtrl canimal = new AnimalCtrl();
        
        if(tctIdCliente.getText()==null){
        
        }else{
           System.out.println(tctIdCliente.getText());
        QuantidadePet = canimal.ReceberContarAnimaisCliente(Integer.parseInt(tctIdCliente.getText()));
        }
        
        nomeCli = tctPetAnimalCliente.getText();
            if (QuantidadePet > 1) {
                lblQuantidadePetCliente.setText(nomeCli + " possui: " + QuantidadePet + " animais Cadastrados");
            }else {
                lblQuantidadePetCliente.setText(nomeCli + " possui: " + QuantidadePet + " animal Cadastrado");
            }
          
        if (cbxClienteAnimal.getSelectedItem() != null) {
            colocarMiniFotoLabel();
        }
    }//GEN-LAST:event_cbxClienteAnimalItemStateChanged

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        moveToFront();
    }//GEN-LAST:event_formMouseClicked

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        // TODO add your handling code here:
        Animal animal = new Animal();
        AnimalCtrl cAnimal = new AnimalCtrl();
        int idCliente = Integer.parseInt(tctIdCliente.getText());
        int idAnimal;

        animal = cAnimal.receberAnimalNomeIdCliente(cbxClienteAnimal.getSelectedItem().toString(), idCliente);

        idAnimal = Integer.parseInt(animal.getIdAnimal());
        //System.out.println(idAnimal +"----"+idCliente);

        montarTelaAgendaServiço(idAnimal, idCliente);
    }//GEN-LAST:event_btnAgendarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnConsultarPet;
    private javax.swing.JButton btnInicioCli;
    private javax.swing.JButton btnLastCli;
    private javax.swing.JButton btnNextCli;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnPrevCli;
    private javax.swing.JButton btnVoltarMenu;
    private javax.swing.JComboBox cbxClienteAnimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JPanel jPanelPet;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JLabel lblMiniFotoPet;
    private javax.swing.JLabel lblQuantidadePetCliente;
    private javax.swing.JLabel lblTelaPetCodigoCliente;
    private javax.swing.JLabel lblTelaPetCodigoCliente1;
    private javax.swing.JLabel lblTelaPetNomeCliente;
    private javax.swing.JLabel lblTelaPetNomeCliente2;
    private javax.swing.JLabel lblTituloAgendamentoPet;
    private javax.swing.JTextField tctIdCliente;
    private static javax.swing.JTextField tctPetAnimalCliente;
    private static javax.swing.JTextField tctPetAnimalCpfCliente;
    // End of variables declaration//GEN-END:variables

    private void desabilitarBotoesPet() {
        //btnIncluirPet.setEnabled(false);
        btnConsultarPet.setEnabled(false);
    }

    private void habilitarBotoesPet() {
        //btnIncluirPet.setEnabled(false);
        btnConsultarPet.setEnabled(true);
    }

    private void desabilitarBotoesCliente() {
        btnInicioCli.setEnabled(false);
        btnPrevCli.setEnabled(false);
        btnNextCli.setEnabled(false);
        btnLastCli.setEnabled(false);
    }

    private void habilitarBotoesCliente() {
        btnInicioCli.setEnabled(true);
        btnPrevCli.setEnabled(true);
        btnNextCli.setEnabled(true);
        btnLastCli.setEnabled(true);
    }

    private void populaJComboBoxAnimalCliente(int id) {

        AnimalCtrl cAnimal = new AnimalCtrl();
        cbxClienteAnimal.removeAllItems(); //remove os itens atuais do comboBox.
        //ArrayList lista = cAeronave.populaComboPrefixoAeronave(); //retorna os prefixos das aeronaves.
        ArrayList lista = cAnimal.populaComboAnimaisCliente(id); //retorna os animais do cliente.
        Iterator i = lista.iterator();
        while (i.hasNext()) {
            cbxClienteAnimal.addItem(String.valueOf(i.next()));

        }

    }

    private void colocarMiniFotoLabel() {
        Animal animal = new Animal();
        AnimalCtrl canimal = new AnimalCtrl();
        nomeAnimal = cbxClienteAnimal.getSelectedItem() + "";
        animal = canimal.receberAnimalNome(nomeAnimal);
        urlMiniFoto = animal.getFoto();
        Dimension d = lblMiniFotoPet.getSize();
        int width = lblMiniFotoPet.getWidth();
        int height = lblMiniFotoPet.getHeight();
        //System.out.println("width: "+d.width + " height: "+d.height);
        String urlFoto = urlMiniFoto; //pegar do combobox
        ImageIcon foto;
        foto = new ImageIcon(urlFoto);

        foto.setImage(foto.getImage().getScaledInstance(d.width, d.height, 100));
        //img.setImage(img.getImage().getScaledInstance(xLargura, yAltura, 100));
        lblMiniFotoPet.setIcon(foto);
        //lblFotoPet.setIcon(new javax.swing.ImageIcon(getClass().getResource(urlFoto)));
    }

    private void colocarMiniFotoLabelVaga() {

        urlMiniFoto = "";
        Dimension d = lblMiniFotoPet.getSize();
        int width = lblMiniFotoPet.getWidth();
        int height = lblMiniFotoPet.getHeight();
        //System.out.println("width: "+d.width + " height: "+d.height);
        String urlFoto = urlMiniFoto; //pegar do combobox
        ImageIcon foto;
        foto = new ImageIcon(urlFoto);

        foto.setImage(foto.getImage().getScaledInstance(d.width, d.height, 100));
        //img.setImage(img.getImage().getScaledInstance(xLargura, yAltura, 100));
        lblMiniFotoPet.setIcon(foto);
        //lblFotoPet.setIcon(new javax.swing.ImageIcon(getClass().getResource(urlFoto)));
    }

    private void montarTelaAgendaServiço(int idAnimal, int idCliente) {
        /*
         String tituloProfissional;
         tituloProfissional = "Gestão Profissional - Consultar ";
         String nome = tctNomeProfissional.getText();
         
         int id;
         id = parseInt(tctIdProfissional.getText());
         TelaCadastroProfissional telaCadProf = new TelaCadastroProfissional(nome, id, "c");
         telaCadProf.setTitle(tituloProfissional);
         telaCadProf.setVisible(true);

         //add(telaAnimal, JLayeredPane.DRAG_LAYER);
         telaCadProf.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
         telaCadProf.setLocation(50, 50);   
        
         this.limparCampos();
         this.desabilitarBotoesProf1();
         */
        String titulo;
        titulo = "Agendamento Serviços Petfast";
       // int idClienteInt;
        // idClienteInt = Integer.parseInt(idCliente);
        // int idAnimalInt;
        //idAnimalInt = Integer.parseInt(idAnimal);

        TelaAgendaServico telaAgenda = new TelaAgendaServico(idAnimal, idCliente);
        telaAgenda.setTitle(titulo);
        telaAgenda.setVisible(true);
        telaAgenda.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaAgenda.setLocation(50, 50);

    }

}
