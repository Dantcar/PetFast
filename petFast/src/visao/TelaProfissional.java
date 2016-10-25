/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ProfissionalCtrl;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.Profissional;

/**
 *
 * @author Décio
 */
public class TelaProfissional extends javax.swing.JInternalFrame {

    private DefaultListModel lista = new DefaultListModel();
    private static ArrayList listaNome;
    private static int pos = 0, tam = 0;
    private String idProfissional, nomeProfissional;
    
    private static int openFrameCount = 0; //teste
    private static final int xOffset = 30, yOffset = 30; //teste
    
    /**
     * Creates new form TelaProfissional
     */
    public TelaProfissional() {
        
         super("Document #" + (++openFrameCount),
          true, //resizable
          true, //closable
          true, //maximizable
          true);//iconifiable
        
        initComponents();
        
         // Center in the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        //setLocation(new Point((screenSize.width - frameSize.width) / 2,
        //                     (screenSize.height - frameSize.width) / 2));
        
        //this.setLocation(50, 100); //(ponto inicial apartir lateral,altura)
        setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
        setLocation(new Point((screenSize.width - frameSize.width) / 2,
                              (screenSize.height - frameSize.width) / 2));
        this.repaint();
        idProfissional = "";
        nomeProfissional = "";
        tctProfissionalCpf.setEditable(false);
        tctIdProfissional.setEditable(false);
        //desabilitarBotoesProf();
        //desabilitarBotoesProf2();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipalProf = new javax.swing.JPanel();
        PainelProfTitulo = new javax.swing.JPanel();
        lblTituloProfissional = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTelaProfCpf = new javax.swing.JLabel();
        tctProfissionalCpf = new javax.swing.JTextField();
        tctIdProfissional = new javax.swing.JTextField();
        btnPesquisarProfissional = new javax.swing.JButton();
        tctNomeProfissional = new javax.swing.JTextField();
        lblTelaProfNome = new javax.swing.JLabel();
        btnInicioProf = new javax.swing.JButton();
        btnPrevProf = new javax.swing.JButton();
        btnNextProf = new javax.swing.JButton();
        btnLastProf = new javax.swing.JButton();
        PainelProfLista = new javax.swing.JPanel();
        btnIncluirProf = new javax.swing.JButton();
        btnAlterarProf = new javax.swing.JButton();
        btnExcluirProf = new javax.swing.JButton();
        btnConsultarProf = new javax.swing.JButton();
        btnVoltarMenu = new javax.swing.JButton();

        PainelPrincipalProf.setBackground(new java.awt.Color(156, 116, 64));
        PainelPrincipalProf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PainelPrincipalProf.setForeground(new java.awt.Color(124, 124, 124));
        PainelPrincipalProf.setEnabled(false);

        PainelProfTitulo.setBackground(new java.awt.Color(228, 196, 154));
        PainelProfTitulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true));

        lblTituloProfissional.setBackground(new java.awt.Color(102, 102, 102));
        lblTituloProfissional.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        lblTituloProfissional.setText("Profissional");

        javax.swing.GroupLayout PainelProfTituloLayout = new javax.swing.GroupLayout(PainelProfTitulo);
        PainelProfTitulo.setLayout(PainelProfTituloLayout);
        PainelProfTituloLayout.setHorizontalGroup(
            PainelProfTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProfTituloLayout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(lblTituloProfissional)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelProfTituloLayout.setVerticalGroup(
            PainelProfTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelProfTituloLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(lblTituloProfissional)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 234, 207));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true), "Profissional", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(100, 100, 100))); // NOI18N

        lblTelaProfCpf.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaProfCpf.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaProfCpf.setText("Cpf:");

        tctProfissionalCpf.setBackground(new java.awt.Color(255, 239, 191));
        tctProfissionalCpf.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tctProfissionalCpf.setForeground(new java.awt.Color(51, 51, 51));
        tctProfissionalCpf.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tctIdProfissional.setEditable(false);
        tctIdProfissional.setBackground(new java.awt.Color(255, 239, 191));
        tctIdProfissional.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        btnPesquisarProfissional.setBackground(new java.awt.Color(0, 128, 0));
        btnPesquisarProfissional.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnPesquisarProfissional.setForeground(new java.awt.Color(0, 0, 51));
        btnPesquisarProfissional.setText("Pesquisar");
        btnPesquisarProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarProfissionalActionPerformed(evt);
            }
        });

        tctNomeProfissional.setBackground(new java.awt.Color(255, 239, 191));
        tctNomeProfissional.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tctNomeProfissional.setForeground(new java.awt.Color(51, 51, 51));
        tctNomeProfissional.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblTelaProfNome.setBackground(new java.awt.Color(102, 102, 102));
        lblTelaProfNome.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTelaProfNome.setText("Nome:");

        btnInicioProf.setBackground(new java.awt.Color(0, 128, 0));
        btnInicioProf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInicioProf.setForeground(new java.awt.Color(0, 0, 51));
        btnInicioProf.setText("|<");
        btnInicioProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioProfActionPerformed(evt);
            }
        });

        btnPrevProf.setBackground(new java.awt.Color(0, 128, 0));
        btnPrevProf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPrevProf.setForeground(new java.awt.Color(0, 0, 51));
        btnPrevProf.setText("<");
        btnPrevProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevProfActionPerformed(evt);
            }
        });

        btnNextProf.setBackground(new java.awt.Color(0, 128, 0));
        btnNextProf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNextProf.setForeground(new java.awt.Color(0, 0, 51));
        btnNextProf.setText(">");
        btnNextProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextProfActionPerformed(evt);
            }
        });

        btnLastProf.setBackground(new java.awt.Color(0, 128, 0));
        btnLastProf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLastProf.setForeground(new java.awt.Color(0, 0, 51));
        btnLastProf.setText(">|");
        btnLastProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastProfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTelaProfNome)
                        .addComponent(lblTelaProfCpf))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnInicioProf)
                            .addGap(92, 92, 92)
                            .addComponent(btnPrevProf)
                            .addGap(109, 109, 109)
                            .addComponent(btnNextProf)
                            .addGap(94, 94, 94)
                            .addComponent(btnLastProf))
                        .addComponent(tctNomeProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tctProfissionalCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(98, 98, 98)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnPesquisarProfissional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tctIdProfissional))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tctProfissionalCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tctIdProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblTelaProfCpf, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnPesquisarProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelaProfNome)
                            .addComponent(tctNomeProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInicioProf)
                        .addComponent(btnPrevProf)
                        .addComponent(btnNextProf)
                        .addComponent(btnLastProf))
                    .addGap(19, 19, 19)))
        );

        PainelProfLista.setBackground(new java.awt.Color(228, 196, 154));
        PainelProfLista.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true), "Botões", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(100, 100, 100))); // NOI18N

        btnIncluirProf.setBackground(new java.awt.Color(0, 128, 0));
        btnIncluirProf.setForeground(new java.awt.Color(0, 0, 51));
        btnIncluirProf.setText("Incluir");
        btnIncluirProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirProfActionPerformed(evt);
            }
        });

        btnAlterarProf.setBackground(new java.awt.Color(0, 128, 0));
        btnAlterarProf.setForeground(new java.awt.Color(0, 0, 51));
        btnAlterarProf.setText("Alterar");
        btnAlterarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProfActionPerformed(evt);
            }
        });

        btnExcluirProf.setBackground(new java.awt.Color(0, 128, 0));
        btnExcluirProf.setForeground(new java.awt.Color(0, 0, 51));
        btnExcluirProf.setText("Excluir");
        btnExcluirProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProfActionPerformed(evt);
            }
        });

        btnConsultarProf.setBackground(new java.awt.Color(0, 128, 0));
        btnConsultarProf.setForeground(new java.awt.Color(0, 0, 51));
        btnConsultarProf.setText("Consultar");
        btnConsultarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProfActionPerformed(evt);
            }
        });

        btnVoltarMenu.setBackground(new java.awt.Color(0, 128, 0));
        btnVoltarMenu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVoltarMenu.setForeground(new java.awt.Color(0, 0, 51));
        btnVoltarMenu.setText("Voltar");
        btnVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelProfListaLayout = new javax.swing.GroupLayout(PainelProfLista);
        PainelProfLista.setLayout(PainelProfListaLayout);
        PainelProfListaLayout.setHorizontalGroup(
            PainelProfListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProfListaLayout.createSequentialGroup()
                .addGroup(PainelProfListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelProfListaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelProfListaLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btnIncluirProf)
                        .addGap(60, 60, 60)
                        .addComponent(btnAlterarProf)
                        .addGap(51, 51, 51)
                        .addComponent(btnExcluirProf)
                        .addGap(44, 44, 44)
                        .addComponent(btnConsultarProf)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        PainelProfListaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterarProf, btnConsultarProf, btnExcluirProf, btnIncluirProf});

        PainelProfListaLayout.setVerticalGroup(
            PainelProfListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProfListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelProfListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnIncluirProf)
                    .addComponent(btnAlterarProf)
                    .addComponent(btnExcluirProf)
                    .addComponent(btnConsultarProf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PainelPrincipalProfLayout = new javax.swing.GroupLayout(PainelPrincipalProf);
        PainelPrincipalProf.setLayout(PainelPrincipalProfLayout);
        PainelPrincipalProfLayout.setHorizontalGroup(
            PainelPrincipalProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPrincipalProfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelPrincipalProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelProfTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelProfLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PainelPrincipalProfLayout.setVerticalGroup(
            PainelPrincipalProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalProfLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(PainelProfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PainelProfLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelPrincipalProf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelPrincipalProf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarProfissionalActionPerformed
        // Pesquisar Cliente e buscar lista animais por cliente
        int idProfissionalP;
        DefaultListModel model = new DefaultListModel();

        ProfissionalCtrl cProfissional = new ProfissionalCtrl();
        listaNome = (ArrayList) cProfissional.listaProfissionaisNome(tctNomeProfissional.getText());

        if (!listaNome.isEmpty()) {
            btnIncluirProf.setEnabled(true);
            pos = 0;
            btnIncluirProf.setEnabled(true);
            tam = listaNome.size() - 1;
            Profissional prof = (Profissional) listaNome.get(0);
            tctProfissionalCpf.setText(prof.getCpf());
            tctNomeProfissional.setText(prof.getNome());
            tctIdProfissional.setText(prof.getIdProfissional());
            idProfissionalP = Integer.parseInt(prof.getIdProfissional());
            habilitarBotoesProf();

            //buscar listas de animais deste
            //arrayListAnimal = canimal.receberArrayListAnimaisCliente(idClienteP);
            // jScrollPaneAnimais.add(listAnimal);
            //jListPet.add();
            //lAnimal = canimal.receberListaAnimaisCliente(idClienteP);
            //listAnimal = new JList(model);
            

            // colocarMiniFotoLabel();

        } else {
            JOptionPane.showMessageDialog(null, "Profissional não localizado!");
            tctProfissionalCpf.setText("");
            tctNomeProfissional.setText("");
            tctIdProfissional.setText("");
           
            desabilitarBotoesProf();
            desabilitarBotoesProf2();
            btnIncluirProf.setEnabled(false);
        }

        /*
        */
    }//GEN-LAST:event_btnPesquisarProfissionalActionPerformed

    private void btnInicioProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioProfActionPerformed
        // Botão [|<]
        int idProfissionalP;
        pos = 0;
        Profissional prof = (Profissional) listaNome.get(pos);
        tctProfissionalCpf.setText(prof.getCpf());
        tctNomeProfissional.setText(prof.getNome());
        tctIdProfissional.setText(prof.getIdProfissional());
        idProfissionalP = Integer.parseInt(prof.getIdProfissional());
        //colocarMiniFotoLabel();
        btnIncluirProf.setEnabled(true);
    }//GEN-LAST:event_btnInicioProfActionPerformed

    private void btnPrevProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevProfActionPerformed
        // Botão [<]

        if (pos > 0) {
            int idProfissionalP;
            pos--;
            Profissional prof = (Profissional) listaNome.get(pos);
            tctProfissionalCpf.setText(prof.getCpf());
            tctNomeProfissional.setText(prof.getNome());
            tctIdProfissional.setText(prof.getIdProfissional());
            idProfissionalP = Integer.parseInt(prof.getIdProfissional());
            
            // colocarMiniFotoLabel();
            btnIncluirProf.setEnabled(true);

        }

    }//GEN-LAST:event_btnPrevProfActionPerformed

    private void btnNextProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextProfActionPerformed
        // Botão [>]

        if (pos < tam) {
            int idProfissionalP;
            pos++;
            Profissional prof = (Profissional) listaNome.get(pos);
            tctProfissionalCpf.setText(prof.getCpf());
            tctNomeProfissional.setText(prof.getNome());
            tctIdProfissional.setText(prof.getIdProfissional());
            idProfissionalP = Integer.parseInt(prof.getIdProfissional());
           
            //colocarMiniFotoLabel();
            btnIncluirProf.setEnabled(true);

        }

    }//GEN-LAST:event_btnNextProfActionPerformed

    private void btnLastProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastProfActionPerformed
        // Botão [>|]
         int idProfissionalP;
        pos = tam;
        Profissional prof = (Profissional) listaNome.get(tam);
        tctProfissionalCpf.setText(prof.getCpf());
        tctNomeProfissional.setText(prof.getNome());
        tctIdProfissional.setText(prof.getIdProfissional());
        idProfissionalP = Integer.parseInt(prof.getIdProfissional());
        
        //colocarMiniFotoLabel();
        btnIncluirProf.setEnabled(true);
    }//GEN-LAST:event_btnLastProfActionPerformed

    private void btnIncluirProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirProfActionPerformed
        // TODO add your handling code here:

        //this.dispose();
        String tituloProfissional;
        tituloProfissional = "Gestão Pet Inclusão de Novo Profissional";
        String nome = tctNomeProfissional.getText();
        //String nomeAnimal = cbxClienteAnimal.getSelectedItem() + "";
        int id;
        id = parseInt(tctIdProfissional.getText());
        //TelaCadastroProfissional telaCadProf = new TelaCadastroProfissional(nome, id, "i", nomeProfissional);
        TelaCadastroProfissional telaCadProf = new TelaCadastroProfissional("",0,"");
        telaCadProf.setTitle(tituloProfissional);
        telaCadProf.setVisible(true);

        //add(telaAnimal, JLayeredPane.DRAG_LAYER);
        telaCadProf.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaCadProf.setLocation(50, 50);

    }//GEN-LAST:event_btnIncluirProfActionPerformed

    private void btnAlterarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProfActionPerformed
        // Botão alterar
        //this.dispose();
/*
        String tituloPet;
        tituloPet = "Gestão Pet - Alteração";
        String nome = tctPetAnimalCliente.getText();
        String nomeAnimal = cbxClienteAnimal.getSelectedItem() + "";
        int id;
        id = parseInt(tctIdCliente.getText());
        TelaAnimal telaAnimal = new TelaAnimal(nome, id, "a", nomeAnimal);
        telaAnimal.setTitle(tituloPet);
        telaAnimal.setVisible(true);

        //add(telaAnimal, JLayeredPane.DRAG_LAYER);
        telaAnimal.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaAnimal.setLocation(50, 50);
        
 */
    }//GEN-LAST:event_btnAlterarProfActionPerformed

    private void btnExcluirProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProfActionPerformed
        // TBotão Excluir Animal
        //this.dispose();

/*
         String tituloPet;
        tituloPet = "Gestão Pet - Exclusão";
        String nome = tctPetAnimalCliente.getText();
        String nomeAnimal = cbxClienteAnimal.getSelectedItem() + "";
        int id;
        id = parseInt(tctIdCliente.getText());
        TelaAnimal telaAnimal = new TelaAnimal(nome, id, "e", nomeAnimal);
        telaAnimal.setTitle(tituloPet);
        telaAnimal.setVisible(true);

        //add(telaAnimal, JLayeredPane.DRAG_LAYER);
        telaAnimal.setDefaultCloseOperation(1);//DISPOSE_ON_CLOSE
        telaAnimal.setLocation(50, 50);       
*/


    }//GEN-LAST:event_btnExcluirProfActionPerformed

    private void btnConsultarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProfActionPerformed
        //Botão Consultar Animal
        //this.dispose();

        
        /*
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
        */
       

    }//GEN-LAST:event_btnConsultarProfActionPerformed

    private void btnVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVoltarMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPrincipalProf;
    private javax.swing.JPanel PainelProfLista;
    private javax.swing.JPanel PainelProfTitulo;
    private javax.swing.JButton btnAlterarProf;
    private javax.swing.JButton btnConsultarProf;
    private javax.swing.JButton btnExcluirProf;
    private javax.swing.JButton btnIncluirProf;
    private javax.swing.JButton btnInicioProf;
    private javax.swing.JButton btnLastProf;
    private javax.swing.JButton btnNextProf;
    private javax.swing.JButton btnPesquisarProfissional;
    private javax.swing.JButton btnPrevProf;
    private javax.swing.JButton btnVoltarMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTelaProfCpf;
    private javax.swing.JLabel lblTelaProfNome;
    private javax.swing.JLabel lblTituloProfissional;
    private javax.swing.JTextField tctIdProfissional;
    private static javax.swing.JTextField tctNomeProfissional;
    private static javax.swing.JTextField tctProfissionalCpf;
    // End of variables declaration//GEN-END:variables

    private void desabilitarBotoesProf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void desabilitarBotoesProf2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void habilitarBotoesProf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
