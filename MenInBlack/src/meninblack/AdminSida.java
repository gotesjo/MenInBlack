/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package meninblack;

import java.util.ArrayList;
import oru.inf.InfDB;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author Marti
 */
public class AdminSida extends javax.swing.JFrame {

    private InfDB idb;
    private User user;

    /**
     * Creates new form AdminSida
     */
    public AdminSida(InfDB idb, User user) {
        initComponents();
        this.idb = idb;
        this.user = user;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jBClose = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel1.setText("AdminSida");

        jLabel2.setText("Agentuppgifter");

        jButton1.setText("Sök Agent");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registrering");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hantera Admins");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Neuralisera Agent");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Hantera Områden");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("Alienuppgifter");

        jButton6.setText("Nyregistrering");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Ändra Info");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Eliminera Alien");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Ta bort utr.");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jBClose.setText("Stäng");
        jBClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCloseActionPerformed(evt);
            }
        });

        jButton10.setText("Hantera Kontor");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(97, 97, 97))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(58, 58, 58))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jBClose)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBClose)
                    .addComponent(jButton10))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String agentNamn = JOptionPane.showInputDialog(null, "Ange namn på den Agent du vill ändra", "Ändra en agent", HEIGHT);
        String namn = agentNamn;

        if (Validering.finnsUsernameiDB(agentNamn)) {

            new SokAgent(idb, namn).setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Användaren finns inte i databasen");

    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new RegistreraAgent(idb).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Denna metod ger användaren ett val om den anitingen vill ta bort eller ge adminstatus till en agent. 
        // Beroende på valet användaren gör ger programmet en uppmaning att skriva in en agent som finns med i databasen, 
        // och tar antingen bort eller ger adminstatus, beroende på valet som gjordes tidigare. 
        String[] adminArray = {"Ge status", "Ta bort status"};
        String valdAdmin = (String) JOptionPane.showInputDialog(null, "Välj en önskad agent ifrån listan:", "Välj Agent...",
                JOptionPane.QUESTION_MESSAGE,
                null,
                adminArray,
                adminArray[0]);

        if (valdAdmin != null) {
            if (valdAdmin.equals("Ge status")) {
                String nyAdmin = JOptionPane.showInputDialog("Vilken agent vill du ge adminstatus till?");
                if (Validering.checkAdmin(nyAdmin)) {
                    JOptionPane.showMessageDialog(null, "Denna agent har redan admin-status");
                } else {
                    try {
                        idb.update("UPDATE agent set administrator = 'J' where namn ='" + nyAdmin + "'");
                    } catch (InfException ettE) {
                        JOptionPane.showMessageDialog(null, "Ett fel uppstod när du försökte ge ny status");
                        System.out.println("Internt fel" + ettE);
                    }
                }
            }

            if (valdAdmin.equals("Ta bort status")) {
                String bortAdmin = JOptionPane.showInputDialog("Vilken agent vill du ta bort adminstatus ifrån");
                if (!Validering.checkAdmin(bortAdmin)) {
                    JOptionPane.showMessageDialog(null, "Denna agent har ingen adminstatus");
                } else {
                    try {
                        idb.update("Update agent set administrator = 'N' where namn ='" + bortAdmin + "'");
                    } catch (InfException ettE) {
                        JOptionPane.showMessageDialog(null, "Ett fel uppstod när du försökte ta bort status");
                        System.out.println("Internt fel" + ettE);
                    }
                }

            }
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        taBortAgent();


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Denna kod hanterar områden och dess chefer. Den ger användaren en drop-down meny på de områden som MIB arbetar
        // från. Med valet får man information om vilken agent som nuvarande är områdeschef för respektive område. Man får även ett
        // val om man vill ändra agent, vilket ger en input där användaren kan skriva in en agent som finns med i databasen.
        // Databasen uppdateras med villkoren från vilken agent som var områdeschef innan, och vilken önskad agent som ska bytas. 
        String norrID = "";
        String nyNorrID = "";
        String sveaID = "";
        String nySveaID = "";
        String gotaID = "";
        String nyGotaID = "";

        String[] omradeArray = {"Götaland", "Svealand", "Norrland"};
        String valdAdmin = (String) JOptionPane.showInputDialog(null, "Välj ett önskat område som du vill hantera:", "Välj Agent...",
                JOptionPane.QUESTION_MESSAGE,
                null,
                omradeArray,
                omradeArray[0]);

        if (valdAdmin.equals("Götaland")) {
            String gotaFraga = "Select agent.namn from agent join omradeschef on Agent.Agent_ID = omradeschef.Agent_ID join omrade on omradeschef.omrade = omrade.omrades_ID where benamning = 'Götaland'";
            //gotaID = "select agent.agent_ID from agent where namn ='" +gotaFraga+"'";

            try {
                String chefGota = idb.fetchSingle(gotaFraga);
                gotaID = idb.fetchSingle("select agent.agent_ID from agent where namn ='" + chefGota + "'");
                JOptionPane.showMessageDialog(null, "Chef över detta område är '" + chefGota + "'");

            } catch (InfException ettE) {
                JOptionPane.showMessageDialog(null, "Det finns ingen chef för detta område");
                System.out.println("internt fel" + ettE);
            }

            String[] gotaArray = {"Ja", "Nej"};
            String valtSvar = (String) JOptionPane.showInputDialog(null, "Vill du ändra chef?", "Välj Agent..", JOptionPane.QUESTION_MESSAGE, null, gotaArray, gotaArray[0]);
            if (valtSvar.equals("Ja")) {
                String nyChefGota = JOptionPane.showInputDialog("Vilken agent ska bli ny chef för Götaland");

                nyChefGota = Validering.returGodkäntNamn(nyChefGota);
                String fragaNyGotaID = "SELECT Agent_ID from Agent where namn ='" + nyChefGota + "'";
                if (!Validering.IsUsernameAgent(nyChefGota)) {
                    JOptionPane.showMessageDialog(null, "Denna agent finns inte med i databasen. Vänligen testa en annan agent");
                }
                try {
                    nyGotaID = idb.fetchSingle(fragaNyGotaID);

                } catch (InfException ettE) {
                    JOptionPane.showMessageDialog(null, "fel med hämtning av agent");
                    System.out.println("Internt fel" + ettE);
                }
                String updatefragaGota = "UPDATE Omradeschef set Omradeschef.`Agent_ID` = " + nyGotaID + " WHERE Omradeschef.`Agent_ID` = " + gotaID;
                try {
                    idb.update(updatefragaGota);
                } catch (InfException ettE) {
                    JOptionPane.showMessageDialog(null, "ett fel har uppstått med databasen");
                    System.out.println("Internt fel" + ettE);
                }
            } }
            if (valdAdmin.equals("Svealand")) {
                String sveaFraga = "Select agent.namn from agent join omradeschef on Agent.Agent_ID = omradeschef.Agent_ID join omrade on omradeschef.omrade = omrade.omrades_ID where benamning = 'Svealand'";
                //String sveaID = "select agent.agent_ID from agent where namn ='" +sveaFraga+"'";

                try {
                    String chefSvea = idb.fetchSingle(sveaFraga);
                    sveaID = idb.fetchSingle("select agent.agent_ID from agent where namn ='" + chefSvea + "'");
                    JOptionPane.showMessageDialog(null, "Chef över detta område är '" + chefSvea + "'");
                } catch (InfException ettE) {
                    JOptionPane.showMessageDialog(null, "Det finns ingen chef för detta område");
                    System.out.println("Internt fel" + ettE);
                }
                String[] sveaArray = {"Ja", "Nej"};
                String valtSvarSvea = (String) JOptionPane.showInputDialog(null, "Vill du ändra chef?", "Välj Agent..", JOptionPane.QUESTION_MESSAGE, null, sveaArray, sveaArray[0]);
                if (valtSvarSvea.equals("Ja")) {
                    String nyChefSvea = JOptionPane.showInputDialog("Vilken agent ska bli ny chef för Svealand");

                    nyChefSvea = Validering.returGodkäntNamn(nyChefSvea);

                    String fragaNySveaID = "SELECT Agent_ID from Agent where namn ='" + nyChefSvea + "'";
                    //nySveaID = "select agent.agent_ID from agent where namn ='" +nyChefSvea+"'";

                    if (!Validering.IsUsernameAgent(nyChefSvea)) {
                        JOptionPane.showMessageDialog(null, "Denna agent finns inte med i databasen. Vänligen testa en annan agent");
                    }
                    try {
                        nySveaID = idb.fetchSingle(fragaNySveaID);

                    } catch (InfException ettE) {
                        JOptionPane.showMessageDialog(null, "fel med hämtning av agent");
                        System.out.println("Internt fel" + ettE);
                    }
                    String updatefragaSvea = "UPDATE Omradeschef set Omradeschef.`Agent_ID` = " + nySveaID + " WHERE Omradeschef.`Agent_ID` = " + sveaID;

                    try {
                        idb.update(updatefragaSvea);
                    } catch (InfException ettE) {
                        JOptionPane.showMessageDialog(null, "ett fel har uppstått med databasen");
                        System.out.println("Internt fel" + ettE);
                    }
                } }
                if (valdAdmin.equals("Norrland")) {
                    String norrFraga = "Select agent.namn from agent join omradeschef on Agent.Agent_ID = omradeschef.Agent_ID join omrade on omradeschef.omrade = omrade.omrades_ID where benamning = 'Norrland'";
                    //String norrID = "select agent.agent_ID from agent where namn ='" +chefNorr+ "'";

                    try {
                        String chefNorr = idb.fetchSingle(norrFraga);
                        norrID = idb.fetchSingle("select agent.agent_ID from agent where namn ='" + chefNorr + "'");
                        JOptionPane.showMessageDialog(null, "Chef över detta område är '" + chefNorr + "'");
                    } catch (InfException ettE) {
                        JOptionPane.showMessageDialog(null, "Det finns ingen chef för detta område");
                        System.out.println("Internt fel" + ettE);
                    }
                    String[] norrArray = {"Ja", "Nej"};
                    String valtSvarNorr = (String) JOptionPane.showInputDialog(null, "Vill du ändra chef?", "Välj Agent..", JOptionPane.QUESTION_MESSAGE, null, norrArray, norrArray[0]);
                    if (valtSvarNorr.equals("Ja")) {
                        String nyChefNorr = JOptionPane.showInputDialog("Vilken agent ska bli ny chef för Norrland");

                        nyChefNorr = Validering.returGodkäntNamn(nyChefNorr);

                        String fragaNyNorrID = "SELECT Agent_ID from Agent where namn ='" + nyChefNorr + "'";
                        if (!Validering.IsUsernameAgent(nyChefNorr)) {
                            JOptionPane.showMessageDialog(null, "Denna agent finns inte med i databasen. Vänligen testa en annan agent");
                        }
                        try {
                            nyNorrID = idb.fetchSingle(fragaNyNorrID);

                        } catch (InfException ettE) {
                            JOptionPane.showMessageDialog(null, "fel med hämtning av agent");
                            System.out.println("Internt fel" + ettE);
                        }

                        String updatefraga = "UPDATE Omradeschef set Omradeschef.`Agent_ID` = " + nyNorrID + " WHERE Omradeschef.`Agent_ID` = " + norrID;

                        try {
                            idb.update(updatefraga);
                        } catch (InfException ettE) {
                            JOptionPane.showMessageDialog(null, "ett fel har uppstått med databasen");
                            System.out.println("Internt fel" + ettE);
                        }

                    }

    }//GEN-LAST:event_jButton5ActionPerformed

    }
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String Utfraga = "Select Benamning FROM Utrustning";
        ArrayList<String> UtArrayList = new ArrayList<>();
        int valdUtrustning = 0;

        //Hämtar hem det Utrsutningar som finns i Utrustning i databasen
        try {
            UtArrayList = idb.fetchColumn(Utfraga);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "FEL MED DATABASEN");
            System.out.println("FEL när man skulle hämta hem Utrustningen från databasen " + e);
        }

        Object[] UtArray = UtArrayList.toArray();
        String valdUt = (String) JOptionPane.showInputDialog(null, "Välj en önskad Utrustning att ta bort ifrån listan:", "Välj Utrustning...",
                JOptionPane.QUESTION_MESSAGE,
                null,
                UtArray,
                UtArray[0]);

        String Utnamn = valdUt;

        try {

            String UtIDFraga = "SELECT Utrustnings_ID FROM Utrustning WHERE Benamning = '" + Utnamn + "'";

            String charPlats = idb.fetchSingle(UtIDFraga);

            valdUtrustning = Integer.parseInt(charPlats);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Utrustningen fanns inte i databasen");
            System.out.println("Kunde inte hämta vald Utrustning" + e.getMessage());

        }

        try {
            idb.delete("Delete from Innehar_Utrustning where Utrustnings_ID ='" + valdUtrustning + "'");
            idb.delete("Delete from Vapen where Utrustnings_ID ='" + valdUtrustning + "'");
            idb.delete("Delete from Teknik where Utrustnings_ID ='" + valdUtrustning + "'");
            idb.delete("Delete from Kommunikation where Utrustnings_ID ='" + valdUtrustning + "'");
            idb.delete("Delete from Utrustning where Utrustnings_ID ='" + valdUtrustning + "'");

            JOptionPane.showMessageDialog(null, "Utrustningen har raderas!");

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "kunde inte ta bort vald utrustning");
            System.out.println("Kunde inte uppdatera vald plats" + e.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        // FÖR ATT REGISTRERA EN NY ALIEN I DATABSEN 
        new RegistreraAlien(idb).setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // När man trycker på "ändra Alien"
        String alienNamn;

        //Ber användaren mata in ett namn 
        //Kontrollerar även så det är ett godkänt namn
        alienNamn = JOptionPane.showInputDialog(null, "Ange namn på den Alien du vill veta mer om", "Ändra en alien", HEIGHT);
        alienNamn = Validering.returGodkäntNamn(alienNamn);

        if (Validering.isUsernameAlien(alienNamn) && Validering.isNamnGodkant(alienNamn)) {

            new UppdateraEnAlien(idb, alienNamn, user).setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Alien finns inte i databasen");

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jBCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCloseActionPerformed
        // Stäng ner adminsida
        dispose();
    }//GEN-LAST:event_jBCloseActionPerformed

    //Knapp för att eliminera alien
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        //Hämtar namnet på den alien som ska bort ifrån användaren
        String alienDelete = JOptionPane.showInputDialog(null, "Ange namn på den Alien du vill ta bort", "Ta bort en Alien...", HEIGHT);

        //Kollar ifall valt namn är godkänt
        if (Validering.isUsernameAlien(alienDelete)) {
            //Internt metodanrop som tar bort en alien
            taBortAlien(alienDelete);
        } else {
            JOptionPane.showMessageDialog(null, "Alien finns inte i databasen");
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        new KontorSida(idb).setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * Tar bort en agent ur systemet
     */
    private void taBortAgent() {

        //Ber användaren mata in ett namn 
        String agentDelete;
        agentDelete = JOptionPane.showInputDialog(null, "Ange namn på den Agent du vill ta bort", "Ta bort en agent...", HEIGHT);

        //Kontrollerar även så det är ett godkänt namn
        while (!Validering.isTom(agentDelete) && !Validering.IsUsernameAgent(agentDelete)) {
            agentDelete = JOptionPane.showInputDialog(null, "Ange namn på den Agent du vill ta bort", "Ta bort en agent...", HEIGHT);
        }

        String deleteAID = "";
        String sqlfragaValdAgent = "SELECT Agent_ID FROM Agent where Namn = '" + agentDelete + "'";

        //Hämtar hem Agent_ID för agenten som ska tas bort
        try {
            deleteAID = idb.fetchSingle(sqlfragaValdAgent);

        } catch (InfException e) {
            System.out.println("Fel när man ska hämta AgentID för agenten som ska tas bort" + e);
        }

        String sqlfragaHarAliens = "Select Namn from Alien WHERE Ansvarig_agent = " + deleteAID;
        ArrayList<String> agentensAliens = new ArrayList<>();

        try {

            agentensAliens = idb.fetchColumn(sqlfragaHarAliens);
        } catch (InfException e) {
            System.out.println("Fel när man ska hämta Aliens som agenten ansvarar för" + e);

        }

        //Kod för att Välja en ny Ansvarig Agent. FLytta till metod
        //Checkar ifall agenten har några andra ansvarsområden
        if (!agentensAliens.isEmpty()) {

            String agentfraga = "Select Namn FROM Agent";
            ArrayList<String> agentArrayList = new ArrayList<>();
            int nyAgent = 0;

            //Hämtar hem det agenter som finns som Agent i databasen
            try {
                agentArrayList = idb.fetchColumn(agentfraga);

            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "FEL MED DATABASEN");
                System.out.println("FEL när man skulle hämta hem agenter från databasen " + e);
            }

            Object[] agentArray = agentArrayList.toArray();
            String valdAgent = (String) JOptionPane.showInputDialog(null, "Den agent du vill ta bort ansvarar för Aliens\nVänligen välj en annan agent som ska ta över ansvaret!", "Välj Agent...",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    agentArray,
                    agentArray[0]);

            try {

                String agentnamn = valdAgent;
                String agentIDFraga = "SELECT Agent_ID FROM Agent WHERE Namn like '" + agentnamn + "'";

                String charAgent = idb.fetchSingle(agentIDFraga);

                nyAgent = Integer.parseInt(charAgent);

            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Agenten fanns inte i databasen");
                System.out.println("Kunde inte hämta vald agent" + e.getMessage());

            }

            //Uppdaterar ansvarig agent för det aliens som han hade.
            for (String enAlien : agentensAliens) {
                try {
                    idb.update("Update Alien SET Ansvarig_Agent='" + nyAgent + "' Where Namn='" + enAlien + "'");

                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, "kunde inte uppdatera Ansvarig Agent");
                    System.out.println("Kunde inte uppdatera vald Ansvarig_Agent" + e.getMessage());
                }
            }

        }

        //Hämtar hem de tabeller Agent_ID är forgein Key in
        String sqltabeller = "SELECT TABLE_NAME FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE WHERE REFERENCED_TABLE_NAME = 'Agent' AND REFERENCED_COLUMN_NAME = 'Agent_ID'";
        ArrayList<String> tabeller = new ArrayList<>();
        try {
            tabeller = idb.fetchColumn(sqltabeller);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Problem med att kolla vart Agenten finns på fler platser i databasen");
            System.out.println("Kunde inte hämta tabeller" + e.getMessage());
        }

        //tar bort agenten från alla tabeller där Agent_ID är foreign key
        for (String enTabell : tabeller) {
            try {
                String taBortFranTabell = "DELETE FROM " + enTabell + " WHERE Agent_ID = " + deleteAID;
                idb.delete(taBortFranTabell);

            } catch (InfException e) {
            }
        }

        //Tar bort agenten Användaren valde från början
        try {
            String sqlDelete = "DELETE FROM mibdb.agent WHERE Agent_ID = " + deleteAID;
            idb.delete(sqlDelete);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Kunde inte ta bort Agenten");
            System.out.println("Agenten gick inte att ta bort" + e.getMessage());
        }

        //Kollar ifall agenten har taigits bort eller ej
        if (!Validering.IsUsernameAgent(agentDelete)) {
            JOptionPane.showMessageDialog(null, "Nu har " + agentDelete + " tagits bort ur databasen");
        } else {
            JOptionPane.showMessageDialog(null, "Agenten har inte tagits bort");
        }

    }

    /**
     * Tar bort en alien ifrån systemet
     */
    private void taBortAlien(String alienDelete) {

        String deleteAID = "";
        String sqlfragaValdA = "SELECT Alien_ID FROM Alien where Namn = '" + alienDelete + "'";

        //Hämtar hem Alien_ID för Alien som ska tas bort
        try {
            deleteAID = idb.fetchSingle(sqlfragaValdA);

        } catch (InfException e) {
            System.out.println("Fel när man ska hämta Alien_ID för Alien som ska tas bort" + e);
        }

        //Lägger till det tabeller som Alien_ID ska tas bort ifrån
        ArrayList<String> tabeller = new ArrayList<>();
        tabeller.add("Worm");
        tabeller.add("Boglodite");
        tabeller.add("Squid");

        //tar bort agenten från alla tabeller där Agent_ID är foreign key
        for (String enTabell : tabeller) {
            try {
                String taBortFranTabell = "DELETE FROM " + enTabell + " WHERE Alien_ID = " + deleteAID;
                idb.delete(taBortFranTabell);

            } catch (InfException e) {
            }
        }

        //Tar bort agenten Användaren valde från början
        try {
            String sqlDelete = "DELETE FROM mibdb.alien WHERE Alien_ID = " + deleteAID;
            idb.delete(sqlDelete);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Kunde inte ta bort Alien");
            System.out.println("alien gick inte att ta bort" + e.getMessage());
        }

        //Kollar ifall agenten har taigits bort eller ej
        if (!Validering.isUsernameAlien(alienDelete)) {
            JOptionPane.showMessageDialog(null, "Nu har " + alienDelete + " tagits bort ur databasen");
        } else {
            JOptionPane.showMessageDialog(null, "Alien har inte tagits bort");
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBClose;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
