/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ClienteCtrl;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Cliente;
        

/**
 *
 * @author Décio
 */
public class TelaClientePet extends javax.swing.JInternalFrame {
        
        private static ArrayList listaNome;
        private static int pos=0,tam=0;
        private String idCliente,nomeCliente;
        private List animal = null;
    /**
     * Creates new form TelaClientePet
     */
    public TelaClientePet() {
        initComponents();
        idCliente = "";
        nomeCliente = "";
        tctPetAnimalCpfCliente.setEditable(false);
        desabilitarBotoesPet();
        desabilitarBotoesCliente();
         
        
        
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
        jPanelPet = new javax.swing.JPanel();
        lblTelaPetNomeCliente2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPet = new javax.swing.JList();
        btnEditarPet = new javax.swing.JButton();
        btnAlterarPet = new javax.swing.JButton();
        btnExcluirPet = new javax.swing.JButton();
        btnConsultarPet = new javax.swing.JButton();
        btnVoltarMenu = new javax.swing.JButton();
        btnIncluirPet = new javax.swing.JButton();
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

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTelaPetNomeCliente)
                    .addComponent(lblTelaPetCodigoCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelClienteLayout.createSequentialGroup()
                                .addComponent(btnInicioCli)
                                .addGap(92, 92, 92)
                                .addComponent(btnPrevCli)
                                .addGap(109, 109, 109)
                                .addComponent(btnNextCli)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tctPetAnimalCpfCliente))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesquisarCliente)
                            .addComponent(btnLastCli, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(tctPetAnimalCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tctIdCliente)
                .addContainerGap())
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelaPetCodigoCliente)
                    .addComponent(tctPetAnimalCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarCliente))
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelaPetNomeCliente)
                            .addComponent(tctPetAnimalCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(tctIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        jListPet.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jListPet.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListPet);

        btnEditarPet.setText("Editar");

        btnAlterarPet.setText("Alterar");

        btnExcluirPet.setText("Excluir");

        btnConsultarPet.setText("Consultar");

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

        javax.swing.GroupLayout jPanelPetLayout = new javax.swing.GroupLayout(jPanelPet);
        jPanelPet.setLayout(jPanelPetLayout);
        jPanelPetLayout.setHorizontalGroup(
            jPanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPetLayout.createSequentialGroup()
                .addGroup(jPanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPetLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTelaPetNomeCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanelPetLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnIncluirPet)
                        .addGap(56, 56, 56)
                        .addComponent(btnEditarPet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(btnAlterarPet)
                        .addGap(50, 50, 50)
                        .addComponent(btnExcluirPet)
                        .addGap(52, 52, 52)
                        .addComponent(btnConsultarPet)))
                .addContainerGap())
            .addGroup(jPanelPetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPetLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterarPet, btnConsultarPet, btnEditarPet, btnExcluirPet, btnIncluirPet});

        jPanelPetLayout.setVerticalGroup(
            jPanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPetLayout.createSequentialGroup()
                .addGroup(jPanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPetLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPetLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblTelaPetNomeCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditarPet)
                    .addComponent(btnAlterarPet)
                    .addComponent(btnExcluirPet)
                    .addComponent(btnIncluirPet)
                    .addComponent(btnConsultarPet))
                .addGap(37, 37, 37)
                .addComponent(btnVoltarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(21, 21, 21))
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
        
        ClienteCtrl ccliente = new ClienteCtrl();
         
        listaNome = (ArrayList) ccliente.listaClientesPorNome(tctPetAnimalCliente.getText());
        
        if (!listaNome.isEmpty()){
          pos = 0;
          tam = listaNome.size()-1;
          Cliente cli =  (Cliente) listaNome.get(0);
        tctPetAnimalCpfCliente.setText(cli.getCpf());
        tctPetAnimalCliente.setText(cli.getNome());
        tctIdCliente.setText(cli.getIdCliente());
        abilitarBotoesCliente();
        btnIncluirPet.setEnabled(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Cliente não localizado!");
            tctPetAnimalCpfCliente.setText("");
            tctPetAnimalCliente.setText("");
            desabilitarBotoesCliente();
            desabilitarBotoesPet();
        }
        
        
    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void btnVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVoltarMenuActionPerformed

    private void btnLastCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastCliActionPerformed
        // TODO add your handling code here:
        pos=tam;
       Cliente cli =  (Cliente) listaNome.get(tam);
        tctPetAnimalCpfCliente.setText(cli.getCpf());
        tctPetAnimalCliente.setText(cli.getNome());
        tctIdCliente.setText(cli.getIdCliente());
        
    }//GEN-LAST:event_btnLastCliActionPerformed

    private void btnInicioCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioCliActionPerformed
        // TODO add your handling code here:
        pos=0;
         Cliente cli =  (Cliente) listaNome.get(pos);
        tctPetAnimalCpfCliente.setText(cli.getCpf());
        tctPetAnimalCliente.setText(cli.getNome());
        tctIdCliente.setText(cli.getIdCliente());
    }//GEN-LAST:event_btnInicioCliActionPerformed

    private void btnPrevCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevCliActionPerformed
        // TODO add your handling code here:
        if (pos>0){
        pos--;    
        Cliente cli =  (Cliente) listaNome.get(pos);
        tctPetAnimalCpfCliente.setText(cli.getCpf());
        tctPetAnimalCliente.setText(cli.getNome());
        tctIdCliente.setText(cli.getIdCliente());
           
        }
        
    }//GEN-LAST:event_btnPrevCliActionPerformed

    private void btnNextCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextCliActionPerformed
        // TODO add your handling code here:
         if (pos<tam){
        pos++;     
        Cliente cli =  (Cliente) listaNome.get(pos);
        tctPetAnimalCpfCliente.setText(cli.getCpf());
        tctPetAnimalCliente.setText(cli.getNome());
        tctIdCliente.setText(cli.getIdCliente());
          
        }
    }//GEN-LAST:event_btnNextCliActionPerformed

    private void btnIncluirPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirPetActionPerformed
        // TODO add your handling code here:
       
        
        this.dispose();
                    
        String tituloPet;
        tituloPet = "Gestão Pet";
        String nome = tctPetAnimalCliente.getText();
        int id;
        id = parseInt(tctIdCliente.getText());
        TelaAnimal telaAnimal = new TelaAnimal(nome,id);
        telaAnimal.setTitle(tituloPet);
        telaAnimal.setVisible(true);
        
        //add(telaAnimal, JLayeredPane.DRAG_LAYER);

        telaAnimal.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaAnimal.setLocation(40, 5); 
       
        /*
        //modelo:  
        
        this.dispose();
        AnimalCtrl animal = new AnimalCtrl(); 
        animal.chamarTelaAnimal();
        */ 
        
    }//GEN-LAST:event_btnIncluirPetActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarPet;
    private javax.swing.JButton btnConsultarPet;
    private javax.swing.JButton btnEditarPet;
    private javax.swing.JButton btnExcluirPet;
    private javax.swing.JButton btnIncluirPet;
    private javax.swing.JButton btnInicioCli;
    private javax.swing.JButton btnLastCli;
    private javax.swing.JButton btnNextCli;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnPrevCli;
    private javax.swing.JButton btnVoltarMenu;
    private javax.swing.JList jListPet;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JPanel jPanelPet;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTelaPetCodigoCliente;
    private javax.swing.JLabel lblTelaPetNomeCliente;
    private javax.swing.JLabel lblTelaPetNomeCliente2;
    private javax.swing.JLabel lblTituloPet1;
    private javax.swing.JTextField tctIdCliente;
    private static javax.swing.JTextField tctPetAnimalCliente;
    private static javax.swing.JTextField tctPetAnimalCpfCliente;
    // End of variables declaration//GEN-END:variables

    private void desabilitarBotoesPet() {
        btnIncluirPet.setEnabled(false);
        btnEditarPet.setEnabled(false);
        btnAlterarPet.setEnabled(false);
        btnExcluirPet.setEnabled(false);
        btnConsultarPet.setEnabled(false);
    }
    
    private void desabilitarBotoesCliente(){
        btnInicioCli.setEnabled(false);
        btnPrevCli.setEnabled(false);
        btnNextCli.setEnabled(false);
        btnLastCli.setEnabled(false);
    }
    
     private void abilitarBotoesCliente(){
        btnInicioCli.setEnabled(true);
        btnPrevCli.setEnabled(true);
        btnNextCli.setEnabled(true);
        btnLastCli.setEnabled(true);
    }
     
    private void chamarTelaAnimal(String nome, String cpf){
        
    }
    
}