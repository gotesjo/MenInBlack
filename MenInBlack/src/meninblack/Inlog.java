package meninblack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * @author emanuelgotesjo
 */

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class Inlog extends javax.swing.JFrame {

    private InfDB idb;
    private String svar;
    private String resultat;
    private boolean inloggad = false;
    private String vald; 
    private String alienSvar;
    private String alienResultat;
    
    private User user;
    private Object adminResultat;
    private String adminSvar;
    

    

    
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

        jRadioButton1 = new javax.swing.JRadioButton();
        jLTitel = new javax.swing.JLabel();
        txtbUserName = new javax.swing.JTextField();
        userLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        jBLoggaIN = new javax.swing.JButton();
        jcCombo = new javax.swing.JComboBox<>();
        txtbLosenord = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLTitel.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLTitel.setText("Inloggning");

        txtbUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbUserNameActionPerformed(evt);
            }
        });

        userLabel.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        userLabel.setText("Användarnamn:");

        passwordLabel.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        passwordLabel.setText("Lösenord:");

        jBLoggaIN.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jBLoggaIN.setText("Logga in");
        jBLoggaIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoggaINActionPerformed(evt);
            }
        });

        jcCombo.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jcCombo.setMaximumRowCount(3);
        jcCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agent", "Alien", " " }));
        jcCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcComboActionPerformed(evt);
            }
        });

        txtbLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbLosenordActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jLabel1.setText("Användare:");
        jLabel1.setMaximumSize(new java.awt.Dimension(80, 16));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/meninblack/1283126.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtbUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(passwordLabel)
                            .addComponent(userLabel)
                            .addComponent(txtbLosenord))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(44, 44, 44)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLTitel)
                .addGap(23, 23, 23)
                .addComponent(jBLoggaIN)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLTitel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLoggaIN)
                    .addComponent(txtbLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbUserNameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtbUserNameActionPerformed

    private void jcComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcComboActionPerformed
  
    private void txtbLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbLosenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbLosenordActionPerformed

    
    
    
    /**
 * 

 * Denna metod för knappen 'Logga in' hämtar metoden KollaLosenord() först och checkar även om
 * booleanen 'inloggad' är true. Om true uppnås skapas en ny agentsida, vilket för användaren blir 
 * att om man skriver in rätt lösernord för rätt Agent tar systemet användaren till platsen Agentsida. 
 * Om det är false får användaren även ett meddelande att lösenordet är fel. 
 * @param evt 
 */
    private void jBLoggaINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoggaINActionPerformed
        // TODO add your handling code here:
        checkaComboBox();
        if (vald.equals("Agent") && kollaAgentLosenord()) {
            
            user = new User(idb, txtbUserName.getText());
            
            new Agentsida(idb, user).setVisible(true);
            dispose();
            
            
        } else if (vald.equals("Alien") && kollaAlienLosenord()) {
         
            user = new User(idb, txtbUserName.getText());   
            
            new AlienSida(idb,user).setVisible(true);
            dispose();
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Fel lösenord. Pröva ett annat");
    }//GEN-LAST:event_jBLoggaINActionPerformed
}
    
    
    /**
     * Metoden ställer en SQL fråga till databasen där den tar namn lösenordet från agenten där namnet
     * är lika med användarnamnet som användaren skriver in i textrutan. Med två olika Exceptions
     * fångar vi även upp och skickar ett meddelande om antingen användarnamnet är fel eller lösenordet.
     * Metoden kollar till slut om resultaten från SQL frågan är lika med inputen i lösenords-rutan, 
     * vilket ändrar värdet på booleanen 'inloggad' till true om så är fallet. 
     */ 
    private boolean kollaAgentLosenord() {
        try {
            String användarnamn = txtbUserName.getText();
            String fråga = "Select losenord from agent where namn='" + användarnamn + "'";
            svar = idb.fetchSingle(fråga);
            resultat = svar;
            //TxtbPassword.setText(resultat);

        } catch (InfException E) {
            JOptionPane.showMessageDialog(null, "Fel förfan");
            System.out.println("Internt Felmeddelande" + E.getMessage());
        } catch (Exception Undantag) {
            JOptionPane.showMessageDialog(null, "Något är lurt");
            System.out.println("Internt Felmeddelande" + Undantag.getMessage());

        }
        if (resultat.equals(txtbLosenord.getText())) {
            inloggad = true;
        }
        return inloggad;

    }
    
    
    
    
    private boolean kollaAlienLosenord() {
        try {
            String alienNamn = txtbUserName.getText();
            String alienFråga = "select losenord from alien where namn ='" + alienNamn + "'";
            alienSvar = idb.fetchSingle(alienFråga);
            alienResultat = alienSvar;
        } catch (InfException Ex) {
            JOptionPane.showMessageDialog(null, "Fel");
            System.out.println("Internt Felmeddelande" + Ex.getMessage());
        } catch (Exception EUndantag) {
            JOptionPane.showMessageDialog(null, "Fel, pröva igen");
        }
        if (alienResultat.equals(txtbLosenord.getText())) {
            inloggad = true;
        }
        return inloggad;
    }
    
    private boolean KollaAdminLosenord() {
        try {
            String adminNamn = txtbUserName.getText();
            String adminFråga = "Select losenord from agent where namn ='" + adminNamn + "and administrator ='J'" ;
            adminSvar = idb.fetchSingle(adminFråga);
            adminResultat = adminSvar; 
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Fel lösenord, eller ingen adminstatus");
            System.out.println("Internt meddelande" + ettUndantag.getMessage());
        } catch (Exception ettUndantag) {
                  JOptionPane.showMessageDialog(null, "Fel, pröva igen");           
        }
        if (adminResultat.equals(txtbLosenord.getText())) {
            inloggad = true;
        }
        return inloggad;
    }


    
    private void checkaComboBox() {
        vald = jcCombo.getSelectedItem().toString();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLoggaIN;
    private javax.swing.JLabel jLTitel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JComboBox<String> jcCombo;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField txtbLosenord;
    private javax.swing.JTextField txtbUserName;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
