/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author emanuelgotesjo
 */

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class Inlog extends javax.swing.JFrame {

    private InfDB idb;
    
    /**
     * Creates new form Inlog
     */
    public Inlog(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Headname = new javax.swing.JLabel();
        TxtbUserName = new javax.swing.JTextField();
        TxtbPassword = new javax.swing.JTextField();
        UserLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Headname.setText("Inloggning");

        TxtbUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtbUserNameActionPerformed(evt);
            }
        });

        TxtbPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtbPasswordActionPerformed(evt);
            }
        });

        UserLabel.setText("Användarnamn:");

        PasswordLabel.setText("Lösenord:");

        jButton1.setText("Logga in");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(Headname))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtbUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserLabel)
                            .addComponent(PasswordLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 164, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(157, 157, 157))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Headname)
                .addGap(37, 37, 37)
                .addComponent(UserLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtbUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordLabel)
                .addGap(2, 2, 2)
                .addComponent(TxtbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtbUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtbUserNameActionPerformed
        // TODO add your handling code here:
        
        try {
        String fråga = "Select namn from agent where agent_ID = 3";
        String svar = idb.fetchSingle(fråga);
        String resultat = svar;
        TxtbUserName.setText(resultat);
        
        }catch (InfException E){
            JOptionPane.showMessageDialog(null, "Fel förfan");
        }
    }//GEN-LAST:event_TxtbUserNameActionPerformed

    private void TxtbPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtbPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtbPasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Headname;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField TxtbPassword;
    private javax.swing.JTextField TxtbUserName;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
