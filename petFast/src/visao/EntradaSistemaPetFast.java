/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Toolkit;
import javax.swing.JLayeredPane;

/**
 *
 * @author Décio
 */
public class EntradaSistemaPetFast extends javax.swing.JFrame {

    /**
     * Creates new form EntradaSistemaPetFast
     */
    public EntradaSistemaPetFast() {
        initComponents();
        this.pack();
        String pathProjeto = System.getProperty("user.dir")+"//";
        String iconPetfast = pathProjeto + "src//Icones//petfastIcone.png";
        //System.out.println(iconPetfast);
        setIconImage(Toolkit.getDefaultToolkit().getImage( iconPetfast ));
        //setIconImage(new ImageIcon(getClass().getResource(pathProjeto + "src//Icones//petfastIcone.ico")));
        setExtendedState(MAXIMIZED_BOTH); //maximizar a tela principal
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAtendimento = new javax.swing.JMenu();
        menuAdministrarAtendimento = new javax.swing.JMenu();
        subMenuAgendar = new javax.swing.JMenuItem();
        subMenuConsultarAgenda = new javax.swing.JMenuItem();
        menuCadastroCliente_Pet = new javax.swing.JMenu();
        subMenuCliente = new javax.swing.JMenuItem();
        subMenuPet = new javax.swing.JMenuItem();
        menuBox_Especialista = new javax.swing.JMenu();
        subMenuBox = new javax.swing.JMenuItem();
        MenuVooAeronaveCadastrar = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        subMenuRelatorioAtendimento = new javax.swing.JMenuItem();
        subMenuRelatorioCliente = new javax.swing.JMenuItem();
        subMenuRelatorioPet = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        subMenuSobre = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        subMenuSair = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(213, 245, 173));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuBar1.setBackground(new java.awt.Color(245, 245, 245));

        menuAtendimento.setBackground(new java.awt.Color(245, 245, 245));
        menuAtendimento.setText("Atendimento");
        menuAtendimento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        menuAdministrarAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/alterar.png"))); // NOI18N
        menuAdministrarAtendimento.setText("Administrar Atendimento");
        menuAdministrarAtendimento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        subMenuAgendar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        subMenuAgendar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subMenuAgendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconeAtendimento1.png"))); // NOI18N
        subMenuAgendar.setText("Agendar");
        subMenuAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuAgendarActionPerformed(evt);
            }
        });
        menuAdministrarAtendimento.add(subMenuAgendar);

        subMenuConsultarAgenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        subMenuConsultarAgenda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subMenuConsultarAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconeAtendimento.jpg"))); // NOI18N
        subMenuConsultarAgenda.setText("Consultar Agenda");
        subMenuConsultarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuConsultarAgendaActionPerformed(evt);
            }
        });
        menuAdministrarAtendimento.add(subMenuConsultarAgenda);

        menuAtendimento.add(menuAdministrarAtendimento);

        jMenuBar1.add(menuAtendimento);

        menuCadastroCliente_Pet.setBackground(new java.awt.Color(245, 245, 245));
        menuCadastroCliente_Pet.setText(" Cliente/Pet ");
        menuCadastroCliente_Pet.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        menuCadastroCliente_Pet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroCliente_PetActionPerformed(evt);
            }
        });

        subMenuCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        subMenuCliente.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        subMenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconeClientes.png"))); // NOI18N
        subMenuCliente.setText("Cliente ");
        subMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuClienteActionPerformed(evt);
            }
        });
        menuCadastroCliente_Pet.add(subMenuCliente);

        subMenuPet.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        subMenuPet.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        subMenuPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconePetAnimal9.jpg"))); // NOI18N
        subMenuPet.setText("Pet - Animal");
        subMenuPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuPetActionPerformed(evt);
            }
        });
        menuCadastroCliente_Pet.add(subMenuPet);

        jMenuBar1.add(menuCadastroCliente_Pet);

        menuBox_Especialista.setBackground(new java.awt.Color(245, 245, 245));
        menuBox_Especialista.setText("Box / Especialista");
        menuBox_Especialista.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        subMenuBox.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        subMenuBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subMenuBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconeAtendimento1.png"))); // NOI18N
        subMenuBox.setText("Box");
        subMenuBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuBoxActionPerformed(evt);
            }
        });
        menuBox_Especialista.add(subMenuBox);

        MenuVooAeronaveCadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        MenuVooAeronaveCadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuVooAeronaveCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconeAtendente.png"))); // NOI18N
        MenuVooAeronaveCadastrar.setText("Especialista");
        MenuVooAeronaveCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVooAeronaveCadastrarActionPerformed(evt);
            }
        });
        menuBox_Especialista.add(MenuVooAeronaveCadastrar);

        jMenuBar1.add(menuBox_Especialista);

        menuRelatorios.setBackground(new java.awt.Color(245, 245, 245));
        menuRelatorios.setText("Relatórios");
        menuRelatorios.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        subMenuRelatorioAtendimento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        subMenuRelatorioAtendimento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subMenuRelatorioAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconeCaixa.png"))); // NOI18N
        subMenuRelatorioAtendimento.setText("Atendimento");
        subMenuRelatorioAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuRelatorioAtendimentoActionPerformed(evt);
            }
        });
        menuRelatorios.add(subMenuRelatorioAtendimento);

        subMenuRelatorioCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        subMenuRelatorioCliente.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        subMenuRelatorioCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconeClientes1.png"))); // NOI18N
        subMenuRelatorioCliente.setText("Cliente");
        subMenuRelatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuRelatorioClienteActionPerformed(evt);
            }
        });
        menuRelatorios.add(subMenuRelatorioCliente);

        subMenuRelatorioPet.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        subMenuRelatorioPet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subMenuRelatorioPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconePetAnimal2.jpg"))); // NOI18N
        subMenuRelatorioPet.setText("Pet");
        subMenuRelatorioPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuRelatorioPetActionPerformed(evt);
            }
        });
        menuRelatorios.add(subMenuRelatorioPet);

        jMenuBar1.add(menuRelatorios);

        menuSobre.setBackground(new java.awt.Color(245, 245, 245));
        menuSobre.setText("Sobre");
        menuSobre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        subMenuSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        subMenuSobre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subMenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconeAbout.jpg"))); // NOI18N
        subMenuSobre.setText("Sobre");
        subMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuSobreActionPerformed(evt);
            }
        });
        menuSobre.add(subMenuSobre);

        jMenuBar1.add(menuSobre);

        menuSair.setBackground(new java.awt.Color(245, 245, 245));
        menuSair.setText("Sair");
        menuSair.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        subMenuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        subMenuSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/iconeSair.png"))); // NOI18N
        subMenuSair.setText("Sair");
        subMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuSairActionPerformed(evt);
            }
        });
        menuSair.add(subMenuSair);

        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuClienteActionPerformed
        // Cadastro.montaTelaCliente();
        
        String tituloCliente;
        tituloCliente = "Gestão Cliente";

        TelaCliente telaCliente = new TelaCliente();
        telaCliente.setTitle(tituloCliente);
        telaCliente.setVisible(true);
        add(telaCliente, JLayeredPane.DRAG_LAYER);

        telaCliente.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaCliente.setLocation(40, 5); //(ponto inicial apartir lateral,altura)
        telaCliente.pack();
        /*
        TelaCliente telaCliente = new TelaCliente();
        telaCliente.setTitle(Cadastro.tituloCliente);
        telaCliente.setVisible(true);
        telaCliente.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaCliente.setLocation(50, 50);
        */
        
        
    }//GEN-LAST:event_subMenuClienteActionPerformed

    private void subMenuPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuPetActionPerformed
        
        String tituloCliente;
        tituloCliente = "Gestão Pet / Cliente";

        TelaClientePet telaClientePet = new TelaClientePet();
        telaClientePet.setTitle(tituloCliente);
        telaClientePet.pack();
        telaClientePet.setLocation(50, 50); //(ponto inicial apartir lateral,altura)
        telaClientePet.setVisible(true);
        
        add(telaClientePet, JLayeredPane.DRAG_LAYER);

        telaClientePet.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        
        
        //setLocationRelativeTo(null);
        
        
        /*
        String tituloPassageiro ;
        tituloPassageiro = "Gestão Passageiro";

        TelaNovoPassageiro telaPassageiro = new TelaNovoPassageiro();
        telaPassageiro.setTitle(tituloPassageiro);
        telaPassageiro.setVisible(true);
        //add(telaPassageiro, JLayeredPane.DRAG_LAYER);
        add(telaPassageiro, JLayeredPane.DEFAULT_LAYER);
        telaPassageiro.setDefaultCloseOperation(1);
        telaPassageiro.setLocation(40, 5);
        */
    }//GEN-LAST:event_subMenuPetActionPerformed

    private void menuCadastroCliente_PetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroCliente_PetActionPerformed

    }//GEN-LAST:event_menuCadastroCliente_PetActionPerformed

    private void subMenuBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuBoxActionPerformed
        //Cadastro.montaTelaNewVoo();
/*
        String tituloStatus;
        tituloStatus ="Gestão Voo";

        TelaNovoVoo telaVoo = new TelaNovoVoo();
        telaVoo.setTitle(tituloStatus);
        telaVoo.setVisible(true);
        add(telaVoo, JLayeredPane.DEFAULT_LAYER);
        telaVoo.setDefaultCloseOperation(1);
        telaVoo.setLocation(40, 5);
        */
    }//GEN-LAST:event_subMenuBoxActionPerformed

    private void MenuVooAeronaveCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVooAeronaveCadastrarActionPerformed
        //Cadastro.montaTelaAeronave();
        /*
        String tituloAeronave;
        tituloAeronave = "Gestão Aeronave";

        TelaAeronave telaAeronave = new TelaAeronave();
        telaAeronave.setTitle(tituloAeronave);
        telaAeronave.setVisible(true);
        add(telaAeronave, JLayeredPane.DEFAULT_LAYER);
        telaAeronave.setDefaultCloseOperation(1);
        telaAeronave.setLocation(40, 5);
        */
    }//GEN-LAST:event_MenuVooAeronaveCadastrarActionPerformed

    private void subMenuRelatorioAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuRelatorioAtendimentoActionPerformed
      /*
        String tituloStatus;
        tituloStatus = "Relatórios Passagens";

        TelaRelatorioPassagem relPassagem = new TelaRelatorioPassagem();
        relPassagem.setTitle(tituloStatus);
        relPassagem.setVisible(true);
        add(relPassagem, JLayeredPane.DEFAULT_LAYER);
        relPassagem.setDefaultCloseOperation(1);
        relPassagem.setLocation(40, 50);
        */
    }//GEN-LAST:event_subMenuRelatorioAtendimentoActionPerformed

    private void subMenuRelatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuRelatorioClienteActionPerformed
       
        String tituloStatus;
        tituloStatus = "Relatórios Clientes";

        TelaRelatorioCliente relCliente = new TelaRelatorioCliente();
        relCliente.setTitle(tituloStatus);
        relCliente.setVisible(true);
        add(relCliente, JLayeredPane.DEFAULT_LAYER);
        relCliente.setDefaultCloseOperation(1);
        relCliente.setLocation(40, 50);

    }//GEN-LAST:event_subMenuRelatorioClienteActionPerformed

    private void subMenuRelatorioPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuRelatorioPetActionPerformed
        String tituloStatus;
        tituloStatus = "Relatórios Pets";

        TelaRelatorioPet relPet = new TelaRelatorioPet();
        relPet.setTitle(tituloStatus);
        relPet.setVisible(true);
        add(relPet, JLayeredPane.DEFAULT_LAYER);
        relPet.setDefaultCloseOperation(1);
        relPet.setLocation(40, 50);
    }//GEN-LAST:event_subMenuRelatorioPetActionPerformed

    private void subMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuSobreActionPerformed
        // TODO add your handling code here:
      //  Cadastro.montaTelaAbout();
    }//GEN-LAST:event_subMenuSobreActionPerformed

    private void subMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_subMenuSairActionPerformed

    private void subMenuConsultarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuConsultarAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subMenuConsultarAgendaActionPerformed

    private void subMenuAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuAgendarActionPerformed
        // TODO add your handling code here:
        String tituloStatus;
        tituloStatus = "Agendar Serviço Pet";

        TelaMostraAgenda agendaPet = new TelaMostraAgenda(true, 20, 0, 0, 1, 0, 0); // Cria uma nova instancia de TelaMostraAgenda.
        agendaPet.setTitle(tituloStatus);
        agendaPet.setVisible(true);
        
        
        
        
    }//GEN-LAST:event_subMenuAgendarActionPerformed

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
            java.util.logging.Logger.getLogger(EntradaSistemaPetFast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntradaSistemaPetFast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntradaSistemaPetFast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntradaSistemaPetFast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntradaSistemaPetFast().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuVooAeronaveCadastrar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuAdministrarAtendimento;
    private javax.swing.JMenu menuAtendimento;
    private javax.swing.JMenu menuBox_Especialista;
    private javax.swing.JMenu menuCadastroCliente_Pet;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenuItem subMenuAgendar;
    private javax.swing.JMenuItem subMenuBox;
    private javax.swing.JMenuItem subMenuCliente;
    private javax.swing.JMenuItem subMenuConsultarAgenda;
    private javax.swing.JMenuItem subMenuPet;
    private javax.swing.JMenuItem subMenuRelatorioAtendimento;
    private javax.swing.JMenuItem subMenuRelatorioCliente;
    private javax.swing.JMenuItem subMenuRelatorioPet;
    private javax.swing.JMenuItem subMenuSair;
    private javax.swing.JMenuItem subMenuSobre;
    // End of variables declaration//GEN-END:variables

    public void chamarTelaAnimal(){
        
         String tituloPet;
        tituloPet = "Gestão Pet";

        TelaAnimal telaAnimal = new TelaAnimal("Teste",1,"i","");
        telaAnimal.setTitle(tituloPet);
        telaAnimal.setVisible(true);
        add(telaAnimal, JLayeredPane.DRAG_LAYER);

        telaAnimal.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaAnimal.setLocation(40, 5); 
        
    
       /*
               String tituloPet;
        tituloPet = "Gestão Pet";

        TelaAnimal telaAnimal = new TelaAnimal();
        telaAnimal.setTitle(tituloPet);
        

        telaAnimal.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaAnimal.setLocation(40, 5);
        telaAnimal.setVisible(true);
        this.add(telaAnimal, JLayeredPane.DRAG_LAYER) ;
            try {
                telaAnimal.setSelected(true);
                //telaPrincipal.setVisible(true);
                //chamar a tela inclusão pet
                //chamarTelaAnimal(tctPetAnimalCliente.getText(), tctPetAnimalCpfCliente.getText());
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaClientePet.class.getName()).log(Level.SEVERE, null, ex);
            }*/
    }
               

}
