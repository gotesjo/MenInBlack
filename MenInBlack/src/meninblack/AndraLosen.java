/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package meninblack;


import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author luddelandstrom
 */
public class AndraLosen extends javax.swing.JFrame {

    
    //Klassens fält
    private InfDB idb;
    private User user;
    private InfException e;
    private String oldPass;
    private String newPass;
    private String kontrollPass;
    
    /**
     * Creates new form AndraLosen
     */
    public AndraLosen(InfDB idb, User user) {
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
        gamLosen = new javax.swing.JLabel();
        nyttLosen = new javax.swing.JLabel();
        jPFG = new javax.swing.JPasswordField();
        jPFN = new javax.swing.JPasswordField();
        jButtonOk = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPFK = new javax.swing.JPasswordField();
        jlblB = new javax.swing.JLabel();
        jlblG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel1.setText("Ändra lösenord");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 55, -1, -1));

        gamLosen.setText("Gammalt lösenor");
        getContentPane().add(gamLosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 109, -1, -1));

        nyttLosen.setText("Nytt lösenord");
        getContentPane().add(nyttLosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 166, -1, -1));

        jPFG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPFGActionPerformed(evt);
            }
        });
        getContentPane().add(jPFG, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 106, 210, -1));

        jPFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPFNActionPerformed(evt);
            }
        });
        getContentPane().add(jPFN, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 163, 210, -1));

        jButtonOk.setText("OK");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 272, -1, -1));

        jLabel2.setText("Bekräfta Lösenord");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 208, -1, -1));

        jPFK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPFKActionPerformed(evt);
            }
        });
        getContentPane().add(jPFK, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 205, 210, -1));

        jlblB.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jlblB, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 240, 220, 20));

        jlblG.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jlblG, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 135, 220, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jPFGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPFGActionPerformed
        
    }//GEN-LAST:event_jPFGActionPerformed
    
    //Gemensamt ändra losenord för alien/agent
    //Kollar om det gammla lösenordet stämmer och om det nya lösenordet stämmer med bekräfta 
    //lösenord, om detta stämmer kommer det ett meddelande som bekräftar detta och lösenordet ändras.
    //Annars visas ett felmeddelande på skärmen beronde på vad felet är. 
    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed

        //Hämtar sql fråga samt hämtar det som matas in i fälten.
        try {

            String sqlFraga1 = "select losenord from agent where agent.namn = '" + user.getUsername() + "'" + "union select losenord from alien where alien.namn = '" + user.getUsername() + "'";
            String alienSvar = idb.fetchSingle(sqlFraga1);
            String alienResultat = alienSvar;

            oldPass = jPFG.getText();
            newPass = jPFN.getText();
            kontrollPass = jPFK.getText();

            //Om det gammla lösenordet stämmer överens med lösenordet som finns i databasen för den inloggade så går den vidare.
            if (oldPass.equals(alienResultat)) {

                //om nytt losenord stämmer med kontroll lösenordet och lösenordet är valid.
                if (newPass.equals(kontrollPass) && Validering.validLosen(newPass)) {

                    String anv;
                    //kollar vem det är som loggat in alien/agent genom att hämta användarnamnet och en valid metod som kollar om den är alien annars agent.
                    //uppdaterar då lösenordet
                    if (Validering.isUsernameAlien(user.getUsername())) {
                        anv = "Alien";
                    } else {
                        anv = "Agent";
                    }

                    idb.update("Update " + anv + " set Losenord = '" + newPass + "' where namn = '" + user.getUsername() + "'");

                    JOptionPane.showMessageDialog(null, "Lösenord ändrat");

                    dispose();

                } //om nyttPass och kontrollPass inte matchar
                else {
                    jlblB.setText("Bekräfta lösenord matchar ej!");
                    jPFK.requestFocus();
                }

            } //Om gammla lösenordet och databasens lösen inte matchar.
            else {
                jlblG.setText("Gammalt lösenord matchar ej!");
                jPFG.requestFocus();
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Fel lösenord!" + e);

        }
    }//GEN-LAST:event_jButtonOkActionPerformed

    
    private void jPFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPFNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPFNActionPerformed

    private void jPFKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPFKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPFKActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gamLosen;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPFG;
    private javax.swing.JPasswordField jPFK;
    private javax.swing.JPasswordField jPFN;
    private javax.swing.JLabel jlblB;
    private javax.swing.JLabel jlblG;
    private javax.swing.JLabel nyttLosen;
    // End of variables declaration//GEN-END:variables
}
