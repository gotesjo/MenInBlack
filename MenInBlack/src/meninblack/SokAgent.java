/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package meninblack;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Marti
 */
public class SokAgent extends javax.swing.JFrame {
    private static InfDB idb;
    private String agentNamn;
    private int pid;
    

    /**
     * Creates new form SokAgent
     */
    public SokAgent(InfDB idb, String agentNamn) {
        initComponents();
        this.idb = idb;
        this.agentNamn = agentNamn;
        fyllInformation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLNamnAgent = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLNummerAgent = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLDatumAgent = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLAnsvarigAgent = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLStatusAgent = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel1.setText("Info om agenten");

        jLabel2.setText("Namn");

        jLNamnAgent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLNamnAgent.setText("jLnamn");

        jLabel4.setText("Telefon");

        jLNummerAgent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLNummerAgent.setText("Nummer");

        jLabel6.setText("Anställningsdatum");

        jLDatumAgent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLDatumAgent.setText("Datum");

        jLabel8.setText("Område");

        jLAnsvarigAgent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLAnsvarigAgent.setText("Ansvarig i");

        jLabel10.setText("AdminStatus");

        jLStatusAgent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLStatusAgent.setText("Status :");

        jButton1.setText("Ändra Namn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Ändra Område");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Ändra Status");

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNamnAgent)
                            .addComponent(jLNummerAgent)
                            .addComponent(jLabel6)
                            .addComponent(jLDatumAgent)
                            .addComponent(jLabel8)
                            .addComponent(jLAnsvarigAgent)
                            .addComponent(jLStatusAgent)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNamnAgent)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNummerAgent)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDatumAgent)
                    .addComponent(jButton3))
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAnsvarigAgent)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLStatusAgent)
                    .addComponent(jButton6))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nuvarandeNamn = agentNamn;
        String nyttNamn = JOptionPane.showInputDialog("Vad ska agenten få för nytt namn?\nNamnet måste vara unikt");

        if (!Validering.finnsUsernameiDB(nyttNamn));
        {
            try {
                idb.update("UPDATE agent SET namn= '" + nyttNamn + "' where namn like '" + nuvarandeNamn + "'");

                if (Validering.finnsUsernameiDB(nyttNamn)) {
                    agentNamn = nyttNamn;
                }
            } catch (InfException ettUndantag) {
                JOptionPane.showMessageDialog(null, "DATABASFEL");
                System.out.println("Internt meddelande" + ettUndantag);
            }
            // Uppdaterar sidan med den infon du valt. 
            fyllInformation();
    }//GEN-LAST:event_jButton1ActionPerformed
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String nyttNummer = JOptionPane.showInputDialog("Vad ska det nya numret vara?");
       
        try {
            idb.update("UPDATE agent SET Telefon='" + nyttNummer + "' where namn like '" + agentNamn + "'");
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Detta nummer kunde inte uppdateras");
            System.out.println("Fel när numret skulle uppdateras");
        }
        // Uppdaterar sidan med det nya numret.
        fyllInformation();

    }//GEN-LAST:event_jButton2ActionPerformed




    /**
     * @param args the command line arguments
     */
    private void fyllInformation() {
      
       
        jLNamnAgent.setText(agentNamn);
        
        try {
            jLNummerAgent.setText(idb.fetchSingle("Select telefon from agent where namn ='" + agentNamn + "'"));
            jLDatumAgent.setText(idb.fetchSingle("Select anstallningsdatum from agent where namn ='" + agentNamn + "'"));
            jLAnsvarigAgent.setText(idb.fetchSingle("select plats.`Benamning` from plats join omrade on omrade.`Omrades_ID` = Finns_I join agent on omrade = omrade.`Omrades_ID` where namn ='" + agentNamn + "'"));
            jLStatusAgent.setText(idb.fetchSingle("Select administrator from agent where namn ='" + agentNamn + "'"));
            
            //hämtar Alien_ID från databasen
            String CharID = idb.fetchSingle("select Agent_ID from agent where namn ='" + agentNamn + "'");
            pid = Integer.parseInt(CharID);
        } catch(InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel med databasen");
            System.out.println("internt meddelande" + ettUndantag);
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(SokAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SokAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SokAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SokAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SokAgent(idb, agentNamn).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLAnsvarigAgent;
    private javax.swing.JLabel jLDatumAgent;
    private javax.swing.JLabel jLNamnAgent;
    private javax.swing.JLabel jLNummerAgent;
    private javax.swing.JLabel jLStatusAgent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}