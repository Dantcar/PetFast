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
public class TelaClientePet extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaClientePet
     */
    public TelaClientePet() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblTelaPetCodigoCliente = new javax.swing.JLabel();
        tctPetAnimalCliente1 = new javax.swing.JTextField();
        btnPesquisarCliente = new javax.swing.JButton();
        lblTelaPetNomeCliente = new javax.swing.JLabel();
        tctPetAnimalCliente = new javax.swing.JTextField();
        btnInicioCli = new javax.swing.JButton();
        btnPrevCli = new javax.swing.JButton();
        btnNextCli = new javax.swing.JButton();
        btnLastCli = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblTelaPetNomeCliente2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPet = new javax.swing.JList();
        btnEditarPet = new javax.swing.JButton();
        btnAlterarPet = new javax.swing.JButton();
        btnExcluirPet = new javax.swing.JButton();
        btnConsultarPet = new javax.swing.JButton();
        btnVoltarMenu = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblTituloPet1 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        lblTelaPetCodigoCliente.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetCodigoCliente.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetCodigoCliente.setForeground(new java.awt.Color(102, 102, 102));
        lblTelaPetCodigoCliente.setText("Código:");

        tctPetAnimalCliente1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tctPetAnimalCliente1.setForeground(new java.awt.Color(51, 51, 51));
        tctPetAnimalCliente1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btnPesquisarCliente.setBackground(new java.awt.Color(102, 102, 102));
        btnPesquisarCliente.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnPesquisarCliente.setText("Pesquisar");

        lblTelaPetNomeCliente.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaPetNomeCliente.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaPetNomeCliente.setForeground(new java.awt.Color(102, 102, 102));
        lblTelaPetNomeCliente.setText("Cliente:");

        tctPetAnimalCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tctPetAnimalCliente.setForeground(new java.awt.Color(51, 51, 51));
        tctPetAnimalCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btnInicioCli.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInicioCli.setText("|<");

        btnPrevCli.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPrevCli.setText("<");

        btnNextCli.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNextCli.setText(">");

        btnLastCli.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLastCli.setText(">|");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTelaPetNomeCliente)
                    .addComponent(lblTelaPetCodigoCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnInicioCli)
                                .addGap(92, 92, 92)
                                .addComponent(btnPrevCli)
                                .addGap(109, 109, 109)
                                .addComponent(btnNextCli)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tctPetAnimalCliente1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesquisarCliente)
                            .addComponent(btnLastCli, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(tctPetAnimalCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelaPetCodigoCliente)
                    .addComponent(tctPetAnimalCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarCliente))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelaPetNomeCliente)
                    .addComponent(tctPetAnimalCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicioCli)
                    .addComponent(btnPrevCli)
                    .addComponent(btnNextCli)
                    .addComponent(btnLastCli))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pet Animal"));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(btnEditarPet)
                .addGap(18, 18, 18)
                .addComponent(btnAlterarPet)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirPet)
                .addGap(18, 18, 18)
                .addComponent(btnConsultarPet)
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTelaPetNomeCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterarPet, btnConsultarPet, btnEditarPet, btnExcluirPet});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblTelaPetNomeCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarPet)
                    .addComponent(btnAlterarPet)
                    .addComponent(btnExcluirPet)
                    .addComponent(btnConsultarPet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblTituloPet1.setBackground(new java.awt.Color(102, 102, 102));
        lblTituloPet1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        lblTituloPet1.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloPet1.setText("Pet-Animal");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(288, 288, 288)
                    .addComponent(lblTituloPet1)
                    .addContainerGap(289, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
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
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarPet;
    private javax.swing.JButton btnConsultarPet;
    private javax.swing.JButton btnEditarPet;
    private javax.swing.JButton btnExcluirPet;
    private javax.swing.JButton btnInicioCli;
    private javax.swing.JButton btnLastCli;
    private javax.swing.JButton btnNextCli;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnPrevCli;
    private javax.swing.JButton btnVoltarMenu;
    private javax.swing.JList jListPet;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTelaPetCodigoCliente;
    private javax.swing.JLabel lblTelaPetNomeCliente;
    private javax.swing.JLabel lblTelaPetNomeCliente2;
    private javax.swing.JLabel lblTituloPet1;
    private static javax.swing.JTextField tctPetAnimalCliente;
    private static javax.swing.JTextField tctPetAnimalCliente1;
    // End of variables declaration//GEN-END:variables
}
