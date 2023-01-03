package meninblack;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author emanuelgotesjo
 */
public class Agentsida extends javax.swing.JFrame {
    
    InfDB idb;
    User user;

    /**
     * Creates new form Agentsida
     */
    public Agentsida(InfDB idb, User user) {
        initComponents();
        
        this.idb = idb;
        this.user = user;
        
        
        //Kontrollerar ifall agenten som loggat in även är berättigad till Administratörssidan
        //Anväder valideringsklassen för att göra kontrollen
        jMenub.setVisible(false);
        if(Validering.checkAdmin(user.getUsername())) {
            jMenub.setVisible(true);
        }
        
      
        fyllSida();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jBListaAliens = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabelValkommen = new javax.swing.JLabel();
        jLAgent = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jBChef = new javax.swing.JButton();
        jMenub = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MIB Skandinavien");

        labelTitel.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        labelTitel.setText("Agentsida");

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jLabel1.setText("Personligt");

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jLabel2.setText("Aliens");

        jButton1.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jButton1.setText("Registrera Ny Alien");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBListaAliens.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jBListaAliens.setText("Lista alla Aliens");
        jBListaAliens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListaAliensActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jButton3.setText("Hantera Aliens");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jButton5.setText("Ändra Lösenord");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jButton6.setText("Registrera Utrustning");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jButton7.setText("Logga ut");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabelValkommen.setFont(new java.awt.Font("Agency FB", 3, 18)); // NOI18N
        jLabelValkommen.setText("Välkommen");

        jLAgent.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jLAgent.setText("Agent");

        jButton8.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jButton8.setText("Min Utrustning");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jBChef.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jBChef.setText("Se områdeschef");
        jBChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBChefActionPerformed(evt);
            }
        });

        jMenu1.setText("Gå till administratörssidan");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu1MousePressed(evt);
            }
        });
        jMenub.add(jMenu1);
        jMenu1.getAccessibleContext().setAccessibleDescription("");

        setJMenuBar(jMenub);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLAgent)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValkommen)
                    .addComponent(jBChef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jBListaAliens, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(labelTitel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jButton7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(labelTitel)
                .addGap(31, 31, 31)
                .addComponent(jLabelValkommen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLAgent)
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBChef)
                    .addComponent(jBListaAliens, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // FÖR ATT REGISTRERA EN NY ALIEN I DATABSEN 
         new RegistreraAlien(idb).setVisible(true); 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBListaAliensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListaAliensActionPerformed
        // Öppnar upp ett fönster för att lista alla aliens
        new ListaAllaAliens(idb).setVisible(true); 
    }//GEN-LAST:event_jBListaAliensActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new AndraLosen(idb, user).setVisible(true);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Stänger ner programmet när man loggar ut
        
        dispose();
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // När man trycker på "ändra Alien"
        
       String alienNamn = JOptionPane.showInputDialog(null, "Ange namn på den Alien du vill veta mer om", "Ändra en alien", HEIGHT);
       
       if(Validering.isUsernameAlien(alienNamn)){ 
           
            new UppdateraEnAlien(idb,alienNamn).setVisible(true);
            
       }else {
           JOptionPane.showMessageDialog(null, "Användaren finns inte i databasen");
       
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MousePressed
        // TODO add your handling code here:
                new AdminSida(idb, user).setVisible(true);
    }//GEN-LAST:event_jMenu1MousePressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        Object[] typArray = { "Fordon", "Utrustning"};
        String valdTyp = (String)JOptionPane.showInputDialog( null, "Välj vad du vill registrera:", "Välj...",
                                        JOptionPane.QUESTION_MESSAGE, 
                                        null, 
                                        typArray,
                                        typArray[ 0 ] );
        
        if(valdTyp.equals("Fordon")){
            
            new RegistreraFordon(idb).setVisible(true);             
        }
        else if(valdTyp.equals("Utrustning")){
            new RegistreraUtrusning(idb).setVisible(true);
            
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    // För att se den utrustning och fordon inloggad agent har eller vill lägga till
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

    }//GEN-LAST:event_jButton8ActionPerformed

    //Knapp för att se områdeschef för valt område
    private void jBChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBChefActionPerformed
        
        String sqlOmradeFraga = "SELECT Benamning From Omrade";
        String valdOmrade = "";
        
        try{
            Object[] omradeArray = idb.fetchColumn(sqlOmradeFraga).toArray();
            
            valdOmrade = (String)JOptionPane.showInputDialog( null, "För vilket område vill du se områdeschefen?", "Välj...",
                                        JOptionPane.QUESTION_MESSAGE, 
                                        null, 
                                        omradeArray,
                                        omradeArray[ 0 ] );
       
        } catch(InfException e) {
            JOptionPane.showMessageDialog(null, "FEL MED DATABASEN");
            System.out.println("FEL när man skulle hämta hem Områden från databasen " + e);
        }
        
        hittaOmradesChef(valdOmrade);
        
        
    }//GEN-LAST:event_jBChefActionPerformed

    
    // Fyller agentsidan med text som ska anpassas efter användaren
    private void fyllSida(){
        jLAgent.setText(user.getUsername());   
        
    }
    
    //Hittar områdeschefen för ett valt område.
    //Tar en String som parameter
    private void hittaOmradesChef(String omrade) {
        
        String sqlChefFraga = "SELECT Namn From Agent JOIN Omradeschef ON Omradeschef.Agent_ID=Agent.Agent_ID JOIN Omrade ON Omrade.Omrades_ID=Omradeschef.Omrade Where Benamning like '"+omrade+"'";
        String chefNamn = "";
       
        //Hämtar en Områdeschef från databasen för det område som skickades med som parameter
        try {
            chefNamn = idb.fetchSingle(sqlChefFraga);
        } catch(InfException e) {
            
            System.out.println("FEL när man skulle hämta Områdeschef från databasen " + e);
        }
        
        
        //Kontrollerar ifall namnet på chefen är null. I sådana fall skriver den ut en annan text
        if (chefNamn.equals("null")) {
            JOptionPane.showMessageDialog(null, "Finns ingen områdeschef för området.\nKontakta Administratör för att rätta till felet");

        } else {
            JOptionPane.showMessageDialog(null, "Områdeschefen är: " + chefNamn);
        }
        
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBChef;
    private javax.swing.JButton jBListaAliens;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLAgent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelValkommen;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenub;
    private javax.swing.JLabel labelTitel;
    // End of variables declaration//GEN-END:variables
}
