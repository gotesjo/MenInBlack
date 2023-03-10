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
public class AdminAndraLosen extends javax.swing.JFrame {

    
    //Klassens fält
    private InfDB idb;
    private User user;
    private String newPass;
    private String kontrollPass;
    String alienNamn;
    
    
    
    /**
     * Creates new form AndraLosen
     */
    public AdminAndraLosen(InfDB idb, User user, String alienNamn) {
        initComponents();
        this.idb = idb;
        this.user = user;
        
        this.alienNamn = alienNamn;
        
        
        
        
        
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
        nyttLosen = new javax.swing.JLabel();
        jPFN = new javax.swing.JPasswordField();
        jButtonOk = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPFK = new javax.swing.JPasswordField();
        jlblB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel1.setText("Ändra lösenord");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 55, -1, -1));

        nyttLosen.setText("Nytt lösenord");
        getContentPane().add(nyttLosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 166, -1, -1));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    //Om det nya lösenordet stämmer med bekräftat lösenord 
    //så kommer det ett meddelande som bekräftar detta och lösenordet ändras.
    //Annars visas ett felmeddelande på skärmen beronde på vad felet är.
    //samt en validering som kollar om lösenordet är godkänt.
    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        
        
        
        try
        {
          
        newPass = jPFN.getText();
        kontrollPass = jPFK.getText();
             
        
            //kolla om nya losnenord stämmer med kontrollera lösenordet samt en lösenords valdering
            //som sedan om detta uppfylls ändrar lösenordet med sql frågan.
            if(newPass.equals(kontrollPass) && Validering.validLosen(newPass))
            {

            idb.update("Update Alien set Losenord = '"+newPass+"' where namn = '"+alienNamn+"'");
            
            JOptionPane.showMessageDialog(null, "Lösenord ändrat");
            
            dispose();
            
            }
            //om nya lösen inte stämmer ändras inte lösenordet och ett felmeddelande poppar up
            else
            {
                jlblB.setText("Bekräfta lösenord matchar ej!");
                jPFK.requestFocus();
            }
                    
        }
        //Om lösenordet inte stämmer.
        catch(InfException e)
        {
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
    private javax.swing.JButton jButtonOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPFK;
    private javax.swing.JPasswordField jPFN;
    private javax.swing.JLabel jlblB;
    private javax.swing.JLabel nyttLosen;
    // End of variables declaration//GEN-END:variables
}
