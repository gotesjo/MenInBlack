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

        jButton7.setText("Ändra Info");

        jButton8.setText("Eliminera Alien");

        jButton9.setText("Ta bort utr.");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
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
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58))))
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
                .addComponent(jButton10)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       String agentNamn = JOptionPane.showInputDialog(null, "Ange namn på den Agent du vill ändra", "Ändra en agent", HEIGHT);
       String namn = agentNamn;
       
       if(Validering.finnsUsernameiDB(agentNamn)){ 
           
            new SokAgent(idb,namn).setVisible(true);
            
       }else {
           JOptionPane.showMessageDialog(null, "Användaren finns inte i databasen");
        
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new RegistreraAgent(idb).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String[] adminArray = { "Ge status", "Ta bort status" };
        String valdAdmin = (String)JOptionPane.showInputDialog( null, "Välj en önskad agent ifrån listan:", "Välj Agent...",
                                        JOptionPane.QUESTION_MESSAGE, 
                                        null, 
                                        adminArray,
                                        adminArray[ 0 ] );
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
                } } }
            
                if (valdAdmin.equals("Ta bort status")) {
                    String bortAdmin = JOptionPane.showInputDialog( "Vilken agent vill du ta bort adminstatus ifrån");
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

        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String agenten = JOptionPane.showInputDialog( "Namnet på agent?");
        String idFraga = "Select Agent_ID from agent where namn ='" +agenten+ "'";
        String exFraga = "Select Alien_ID from alien where Ansvarig_Agent ='" +idFraga+ "'";
        ArrayList<String> exAgentArrayList = new ArrayList<>();
        int nyAnsvarig = 0;
        
        try {
            exAgentArrayList = idb.fetchColumn(exFraga);
        } catch (InfException ettE) {
            JOptionPane.showMessageDialog(null, "Det blev ett fel med databasen");
            System.out.println("Internt fel" + ettE);
        }
        Object [] exAgentArray = exAgentArrayList.toArray();
        
        
      
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String[] omradeArray = {"Götaland", "Svealand", "Norrland"};
        String valdAdmin = (String) JOptionPane.showInputDialog(null, "Välj ett önskat område som du vill hantera:", "Välj Agent...",
                JOptionPane.QUESTION_MESSAGE,
                null,
                omradeArray,
                omradeArray[0]);

        if (valdAdmin.equals("Götaland")) {
            String gotaFraga = "Select agent.namn from agent join omradeschef on Agent.Agent_ID = omradeschef.Agent_ID join omrade on omradeschef.omrade = omrade.omrades_ID where benamning = 'Götaland'";

            try {
                String chefGota = idb.fetchSingle(gotaFraga);
                JOptionPane.showMessageDialog(null, "Chef över detta område är '" + chefGota + "'");

            } catch (InfException ettE) {
                JOptionPane.showMessageDialog(null, "Det finns ingen chef för detta område");
            }

            String[] gotaArray = {"Ja", "Nej"};
            String valtSvar = (String) JOptionPane.showInputDialog(null, "Vill du ändra chef?", "Välj Agent..", JOptionPane.QUESTION_MESSAGE, null, gotaArray, gotaArray[0]);
            if (valtSvar.equals("Ja")) {
                String nyChefGota = JOptionPane.showInputDialog("Vilken agent ska bli ny chef för Götaland");
                if (!Validering.IsUsernameAgent(nyChefGota)) {
                    JOptionPane.showMessageDialog(null, "Denna agent finns inte med i databasen. Vänligen testa en annan agent");
                }
                try {
                    idb.update("update omradeschef set omradeschef.Agent_ID = (select agent.agent_ID from agent where agent.namn ='" +gotaFraga+ "')where omradeschef.Agent_ID =(select agent.agent_ID from agent where namn ='"+gotaFraga+"'");
                } catch (InfException ettE) {
                    JOptionPane.showMessageDialog(null, "Ett fel har uppstått med databasen");
                }
            }
        }
        if (valdAdmin.equals("Svealand")) {
            String sveaFraga = "Select agent.namn from agent join omradeschef on Agent.Agent_ID = omradeschef.Agent_ID join omrade on omradeschef.omrade = omrade.omrades_ID where benamning = 'Svealand'";

            try {
                String chefSvea = idb.fetchSingle(sveaFraga);
                JOptionPane.showMessageDialog(null, "Chef över detta område är '" + chefSvea + "'");
            } catch (InfException ettE) {
                JOptionPane.showMessageDialog(null, "Det finns ingen chef för detta område");
                System.out.println("Internt fel" + ettE);
            }
            String[] sveaArray = {"Ja", "Nej"};
            String valtSvarSvea = (String) JOptionPane.showInputDialog(null, "Vill du ändra chef?", "Välj Agent..", JOptionPane.QUESTION_MESSAGE, null, sveaArray, sveaArray[0]);
            if (valtSvarSvea.equals("Ja")) {
                String nyChefSvea = JOptionPane.showInputDialog("Vilken agent ska bli ny chef för Svealand");
                if (!Validering.IsUsernameAgent(nyChefSvea)) {
                    JOptionPane.showMessageDialog(null, "Denna agent finns inte med i databasen. Vänligen testa en annan agent");
                }
                try {
                    idb.update("update omradeschef set omradeschef.Agent_ID = (select agent.agent_ID from agent where agent.namn ='" +nyChefSvea+ "')where omradeschef.Agent_ID =(select agent.agent_ID from agent where namn = '"+sveaFraga+"'");
                } catch (InfException ettE) {
                    JOptionPane.showMessageDialog(null, "Ett fel har uppstått med databasen");
                }
            }
        }
        if (valdAdmin.equals("Norrland")) {
            String norrFraga = "Select agent.namn from agent join omradeschef on Agent.Agent_ID = omradeschef.Agent_ID join omrade on omradeschef.omrade = omrade.omrades_ID where benamning = 'Norrland'";

            try {
                String chefNorr = idb.fetchSingle(norrFraga);
                JOptionPane.showMessageDialog(null, "Chef över detta område är '" + chefNorr + "'");
            } catch (InfException ettE) {
                JOptionPane.showMessageDialog(null, "Det finns ingen chef för detta område");
                System.out.println("Internt fel" + ettE);
            }
            String[] norrArray = {"Ja", "Nej"};
            String valtSvarNorr = (String) JOptionPane.showInputDialog(null, "Vill du ändra chef?", "Välj Agent..", JOptionPane.QUESTION_MESSAGE, null, norrArray, norrArray[0]);
            if (valtSvarNorr.equals("Ja")) {
                String nyChefNorr = JOptionPane.showInputDialog("Vilken agent ska bli ny chef för Norrland");
                if (!Validering.IsUsernameAgent(nyChefNorr)) {
                    JOptionPane.showMessageDialog(null, "Denna agent finns inte med i databasen. Vänligen testa en annan agent");
                }
                try {
                    idb.update("UPDATE Omradeschef set Omradeschef.`Agent_ID` = (select agent.agent_ID from agent where namn ='"+chefNy+"') WHERE Omradeschef.`Agent_ID` = (select agent.agent_ID from agent where namn ='"+chefNorr+"')");
                } catch (InfException ettE) {
                    JOptionPane.showMessageDialog(null, "ett fel har uppstått med databasen");
                    System.out.println("Internt fel" + ettE);
                }

            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        //String kontorNamn = JOptionPane.showInputDialog("Vilket kontor vill du hantera?");
        //String kontor = kontorNamn;
        
       // if(Validering.finnsKontor(kontorNamn));
        
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    String Utfraga = "Select Benamning FROM Utrustning";
          ArrayList<String> UtArrayList = new ArrayList<>();
          int valdUtrustning = 0;

          
          //Hämtar hem det Utrsutningar som finns i Utrustning i databasen
          try{
              UtArrayList = idb.fetchColumn(Utfraga);
              
          } catch(InfException e) {
            JOptionPane.showMessageDialog(null, "FEL MED DATABASEN");
            System.out.println("FEL när man skulle hämta hem Utrustningen från databasen " + e);
          }
        
        Object[] UtArray = UtArrayList.toArray();
        String valdUt = (String)JOptionPane.showInputDialog( null, "Välj en önskad Utrustning att ta bort ifrån listan:", "Välj Utrustning...",
                                        JOptionPane.QUESTION_MESSAGE, 
                                        null, 
                                       UtArray,
                                        UtArray[ 0 ] );
        
            String Utnamn = valdUt;
            
        try{
            
            String UtIDFraga = "SELECT Utrustnings_ID FROM Utrustning WHERE Benamning = '"+Utnamn+"'";
            
            String charPlats = idb.fetchSingle(UtIDFraga);
            
            valdUtrustning = Integer.parseInt(charPlats);
            
        } catch(InfException e){
            JOptionPane.showMessageDialog(null, "Utrustningen fanns inte i databasen");
            System.out.println("Kunde inte hämta vald Utrustning" + e.getMessage());
            
        }
        
        
        
        try{
            idb.delete("Delete from Innehar_Utrustning where Utrustnings_ID ='"+valdUtrustning+"'");
            idb.delete("Delete from Vapen where Utrustnings_ID ='"+valdUtrustning+"'");
            idb.delete("Delete from Teknik where Utrustnings_ID ='"+valdUtrustning+"'");
            idb.delete("Delete from Kommunikation where Utrustnings_ID ='"+valdUtrustning+"'");
            idb.delete("Delete from Utrustning where Utrustnings_ID ='"+valdUtrustning+"'");
            
            JOptionPane.showMessageDialog(null, "Utrustningen har raderas!");
            
            
        } catch(InfException e){
            JOptionPane.showMessageDialog(null, "kunde inte ta bort vald utrustning");
            System.out.println("Kunde inte uppdatera vald plats" + e.getMessage());
        }
        
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(AdminSida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSida(idb, user).setVisible(true);
            }
        });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
