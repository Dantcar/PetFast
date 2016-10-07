/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.AnimalCtrl;
import controle.ClienteCtrl;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import modelo.Cliente;

/**
 *
 * @author Décio
 */
public class TelaClientePet extends javax.swing.JInternalFrame {

    private DefaultListModel lista = new DefaultListModel();
    private static ArrayList listaNome, listaAnimal, arrayListAnimal;
    private static int pos = 0, tam = 0;
    private String idCliente, nomeCliente;
    private List lAnimal ;
    private JList listAnimal ;
    /**
     * Creates new form TelaClientePet
     */
    public TelaClientePet() {
        
        initComponents();
        this.setLocation(50, 100); //(ponto inicial apartir lateral,altura)
        idCliente = "";
        nomeCliente = "";
        tctPetAnimalCpfCliente.setEditable(false);
        tctIdCliente.setEditable(false);
        desabilitarBotoesPet();
        desabilitarBotoesCliente();
        cbxClienteAnimal.removeAllItems (); 
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
        jPanelPet = new javax.swing.JPanel();
        lblTelaPetNomeCliente2 = new javax.swing.JLabel();
        btnAlterarPet = new javax.swing.JButton();
        btnExcluirPet = new javax.swing.JButton();
        btnConsultarPet = new javax.swing.JButton();
        btnVoltarMenu = new javax.swing.JButton();
        btnIncluirPet = new javax.swing.JButton();
        cbxClienteAnimal = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jPanelTitulo = new javax.swing.JPanel();
        lblTituloPet1 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jPanelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        lblTelaPetCodigoCliente.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetCodigoCliente.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetCodigoCliente.setForeground(new java.awt.Color(102, 102, 102));
        lblTelaPetCodigoCliente.setText("Cpf:");

        tctPetAnimalCpfCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tctPetAnimalCpfCliente.setForeground(new java.awt.Color(51, 51, 51));
        tctPetAnimalCpfCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btnPesquisarCliente.setBackground(new java.awt.Color(102, 102, 102));
        btnPesquisarCliente.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnPesquisarCliente.setText("Pesquisar");
        btnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarClienteActionPerformed(evt);
            }
        });

        lblTelaPetNomeCliente.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetNomeCliente.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetNomeCliente.setForeground(new java.awt.Color(102, 102, 102));
        lblTelaPetNomeCliente.setText("Cliente:");

        tctPetAnimalCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tctPetAnimalCliente.setForeground(new java.awt.Color(51, 51, 51));
        tctPetAnimalCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btnInicioCli.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInicioCli.setText("|<");
        btnInicioCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioCliActionPerformed(evt);
            }
        });

        btnPrevCli.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPrevCli.setText("<");
        btnPrevCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevCliActionPerformed(evt);
            }
        });

        btnNextCli.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNextCli.setText(">");
        btnNextCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextCliActionPerformed(evt);
            }
        });

        btnLastCli.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLastCli.setText(">|");
        btnLastCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastCliActionPerformed(evt);
            }
        });

        tctIdCliente.setEditable(false);
        tctIdCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        lblTelaPetCodigoCliente1.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetCodigoCliente1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetCodigoCliente1.setForeground(new java.awt.Color(102, 102, 102));
        lblTelaPetCodigoCliente1.setText("Id Cliente:");

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTelaPetNomeCliente))
                    .addComponent(lblTelaPetCodigoCliente))
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnInicioCli)
                        .addGap(92, 92, 92)
                        .addComponent(btnPrevCli)
                        .addGap(109, 109, 109)
                        .addComponent(btnNextCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLastCli)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tctPetAnimalCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelClienteLayout.createSequentialGroup()
                                .addComponent(tctPetAnimalCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(lblTelaPetCodigoCliente1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tctIdCliente))
                        .addGap(19, 19, 19))))
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tctPetAnimalCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTelaPetCodigoCliente1)
                        .addComponent(tctIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTelaPetCodigoCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelaPetNomeCliente)
                        .addComponent(tctPetAnimalCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicioCli)
                    .addComponent(btnPrevCli)
                    .addComponent(btnNextCli)
                    .addComponent(btnLastCli))
                .addContainerGap())
        );

        jPanelClienteLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tctIdCliente, tctPetAnimalCliente});

        jPanelPet.setBorder(javax.swing.BorderFactory.createTitledBorder("Pet Animal"));

        lblTelaPetNomeCliente2.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetNomeCliente2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetNomeCliente2.setForeground(new java.awt.Color(102, 102, 102));
        lblTelaPetNomeCliente2.setText("Lista Pet");

        btnAlterarPet.setText("Alterar");
        btnAlterarPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarPetActionPerformed(evt);
            }
        });

        btnExcluirPet.setText("Excluir");
        btnExcluirPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPetActionPerformed(evt);
            }
        });

        btnConsultarPet.setText("Consultar");
        btnConsultarPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPetActionPerformed(evt);
            }
        });

        btnVoltarMenu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVoltarMenu.setText("Voltar");
        btnVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMenuActionPerformed(evt);
            }
        });

        btnIncluirPet.setText("Incluir");
        btnIncluirPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirPetActionPerformed(evt);
            }
        });

        cbxClienteAnimal.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        cbxClienteAnimal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxClienteAnimal.setSelectedIndex(-1);
        cbxClienteAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxClienteAnimalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanelPetLayout = new javax.swing.GroupLayout(jPanelPet);
        jPanelPet.setLayout(jPanelPetLayout);
        jPanelPetLayout.setHorizontalGroup(
            jPanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPetLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnIncluirPet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btnAlterarPet)
                .addGroup(jPanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPetLayout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(jLabel1))
                    .addGroup(jPanelPetLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnExcluirPet)
                        .addGap(59, 59, 59)
                        .addComponent(btnConsultarPet)))
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTelaPetNomeCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxClienteAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );

        jPanelPetLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterarPet, btnConsultarPet, btnExcluirPet, btnIncluirPet});

        jPanelPetLayout.setVerticalGroup(
            jPanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPetLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelaPetNomeCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxClienteAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(jPanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluirPet)
                    .addComponent(btnAlterarPet)
                    .addComponent(btnExcluirPet)
                    .addComponent(btnConsultarPet))
                .addGap(37, 37, 37)
                .addComponent(btnVoltarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblTituloPet1.setBackground(new java.awt.Color(102, 102, 102));
        lblTituloPet1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        lblTituloPet1.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloPet1.setText("Pet-Animal");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelTituloLayout.createSequentialGroup()
                    .addGap(288, 288, 288)
                    .addComponent(lblTituloPet1)
                    .addContainerGap(289, Short.MAX_VALUE)))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelTituloLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(lblTituloPet1)
                    .addContainerGap(23, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanelPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed
        // Pesquisar Cliente e buscar lista animais por cliente
        int idClienteP;
        DefaultListModel model = new DefaultListModel();
       
        ClienteCtrl ccliente = new ClienteCtrl();
        AnimalCtrl canimal = new AnimalCtrl();
        listaNome = (ArrayList) ccliente.listaClientesPorNome(tctPetAnimalCliente.getText());
        //Jlist listaAnimais = canimal.receberListaAnimaisCliente(WIDTH);
        if (!listaNome.isEmpty()) {
            btnIncluirPet.setEnabled(true);
            pos = 0;
            btnIncluirPet.setEnabled(true);
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
            
            
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não localizado!");
            tctPetAnimalCpfCliente.setText("");
            tctPetAnimalCliente.setText("");
            tctIdCliente.setText("");
            cbxClienteAnimal.setSelectedItem(null);
            cbxClienteAnimal.setSelectedIndex(-1);
            cbxClienteAnimal.removeAllItems (); 
            cbxClienteAnimal.removeAll();
            desabilitarBotoesCliente();
            desabilitarBotoesPet();
            btnIncluirPet.setEnabled(false);
        }

        /*
         */

    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void btnVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVoltarMenuActionPerformed

    private void btnLastCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastCliActionPerformed
        // TODO add your handling code here:
        int idClienteP;
        pos = tam;
        Cliente cli = (Cliente) listaNome.get(tam);
        tctPetAnimalCpfCliente.setText(cli.getCpf());
        tctPetAnimalCliente.setText(cli.getNome());
        tctIdCliente.setText(cli.getIdCliente());
        idClienteP = Integer.parseInt(cli.getIdCliente());
        populaJComboBoxAnimalCliente(idClienteP);
        btnIncluirPet.setEnabled(true);
        
    }//GEN-LAST:event_btnLastCliActionPerformed

    private void btnInicioCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioCliActionPerformed
        // TODO add your handling code here:
        int idClienteP;
        pos = 0;
        Cliente cli = (Cliente) listaNome.get(pos);
        tctPetAnimalCpfCliente.setText(cli.getCpf());
        tctPetAnimalCliente.setText(cli.getNome());
        tctIdCliente.setText(cli.getIdCliente());
        idClienteP = Integer.parseInt(cli.getIdCliente());
        populaJComboBoxAnimalCliente(idClienteP);
        btnIncluirPet.setEnabled(true);
                
    }//GEN-LAST:event_btnInicioCliActionPerformed

    private void btnPrevCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevCliActionPerformed
        // TODO add your handling code here:
         
        if (pos > 0) {
            int idClienteP;
            pos--;
            Cliente cli = (Cliente) listaNome.get(pos);
            tctPetAnimalCpfCliente.setText(cli.getCpf());
            tctPetAnimalCliente.setText(cli.getNome());
            tctIdCliente.setText(cli.getIdCliente());
            idClienteP = Integer.parseInt(cli.getIdCliente());
            populaJComboBoxAnimalCliente(idClienteP);
            btnIncluirPet.setEnabled(true);
           
        }
        
 
    }//GEN-LAST:event_btnPrevCliActionPerformed

    private void btnNextCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextCliActionPerformed
        // TODO add your handling code here:
        
        if (pos < tam) {
            int idClienteP;
            pos++;
            Cliente cli = (Cliente) listaNome.get(pos);
            tctPetAnimalCpfCliente.setText(cli.getCpf());
            tctPetAnimalCliente.setText(cli.getNome());
            tctIdCliente.setText(cli.getIdCliente());
            idClienteP = Integer.parseInt(cli.getIdCliente());
            populaJComboBoxAnimalCliente(idClienteP);
            btnIncluirPet.setEnabled(true);
            
        }
        
        
    }//GEN-LAST:event_btnNextCliActionPerformed

    private void btnIncluirPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirPetActionPerformed
        // TODO add your handling code here:

        this.dispose();

        String tituloPet;
        tituloPet = "Gestão Pet Inclusão de Novo Animal Pet";
        String nome = tctPetAnimalCliente.getText();
        String nomeAnimal = cbxClienteAnimal.getSelectedItem()+"";
        int id;
        id = parseInt(tctIdCliente.getText());
        TelaAnimal telaAnimal = new TelaAnimal(nome, id, "i",nomeAnimal);
        telaAnimal.setTitle(tituloPet);
        telaAnimal.setVisible(true);

        //add(telaAnimal, JLayeredPane.DRAG_LAYER);
        telaAnimal.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaAnimal.setLocation(50, 50);

        
    }//GEN-LAST:event_btnIncluirPetActionPerformed

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
        this.dispose();

        String tituloPet;
        tituloPet = "Gestão Pet- Consultar ";
        String nome = tctPetAnimalCliente.getText();
        String nomeAnimal = cbxClienteAnimal.getSelectedItem()+"";
        int id;
        id = parseInt(tctIdCliente.getText());
        TelaAnimal telaAnimal = new TelaAnimal(nome, id, "c",nomeAnimal);
        telaAnimal.setTitle(tituloPet);
        telaAnimal.setVisible(true);

        //add(telaAnimal, JLayeredPane.DRAG_LAYER);
        telaAnimal.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaAnimal.setLocation(50, 50);
        
        
    }//GEN-LAST:event_btnConsultarPetActionPerformed

    private void btnAlterarPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarPetActionPerformed
        // Botão alterar
        this.dispose();

        String tituloPet;
        tituloPet = "Gestão Pet - Alteração";
        String nome = tctPetAnimalCliente.getText();
        String nomeAnimal = cbxClienteAnimal.getSelectedItem()+"";
        int id;
        id = parseInt(tctIdCliente.getText());
        TelaAnimal telaAnimal = new TelaAnimal(nome, id, "a",nomeAnimal);
        telaAnimal.setTitle(tituloPet);
        telaAnimal.setVisible(true);

        //add(telaAnimal, JLayeredPane.DRAG_LAYER);
        telaAnimal.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaAnimal.setLocation(50, 50);
        
    }//GEN-LAST:event_btnAlterarPetActionPerformed

    private void btnExcluirPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPetActionPerformed
        // TBotão Excluir Animal
         this.dispose();

        String tituloPet;
        tituloPet = "Gestão Pet - Exclusão";
        String nome = tctPetAnimalCliente.getText();
        String nomeAnimal = cbxClienteAnimal.getSelectedItem()+"";
        int id;
        id = parseInt(tctIdCliente.getText());
        TelaAnimal telaAnimal = new TelaAnimal(nome, id, "e",nomeAnimal);
        telaAnimal.setTitle(tituloPet);
        telaAnimal.setVisible(true);

        //add(telaAnimal, JLayeredPane.DRAG_LAYER);
        telaAnimal.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaAnimal.setLocation(50, 50);
        
        
    }//GEN-LAST:event_btnExcluirPetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarPet;
    private javax.swing.JButton btnConsultarPet;
    private javax.swing.JButton btnExcluirPet;
    private javax.swing.JButton btnIncluirPet;
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
    private javax.swing.JLabel lblTelaPetCodigoCliente;
    private javax.swing.JLabel lblTelaPetCodigoCliente1;
    private javax.swing.JLabel lblTelaPetNomeCliente;
    private javax.swing.JLabel lblTelaPetNomeCliente2;
    private javax.swing.JLabel lblTituloPet1;
    private javax.swing.JTextField tctIdCliente;
    private static javax.swing.JTextField tctPetAnimalCliente;
    private static javax.swing.JTextField tctPetAnimalCpfCliente;
    // End of variables declaration//GEN-END:variables

    private void desabilitarBotoesPet() {
        //btnIncluirPet.setEnabled(false);
        btnIncluirPet.setEnabled(false);
        btnAlterarPet.setEnabled(false);
        btnExcluirPet.setEnabled(false);
        btnConsultarPet.setEnabled(false);
    }
    
     private void habilitarBotoesPet() {
        //btnIncluirPet.setEnabled(false);
        btnIncluirPet.setEnabled(true);
        btnAlterarPet.setEnabled(true);
        btnExcluirPet.setEnabled(true);
        btnConsultarPet.setEnabled(true);
    }

    private void desabilitarBotoesCliente() {
        //btnInicioCli.setEnabled(false);
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

    private void chamarTelaAnimal(String nome, String cpf) {

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

}
