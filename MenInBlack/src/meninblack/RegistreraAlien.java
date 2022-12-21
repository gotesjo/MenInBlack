/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package meninblack;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author emanuelgotesjo
 */
public class RegistreraAlien extends javax.swing.JFrame {
    
    private static InfDB idb; 
<<<<<<< Updated upstream
=======
    private int aid;
    private String namn;
    private String losenord;
    private String telefon;
    //private String ras;
    private int plats;
    private int ansvarigAgent;
    
>>>>>>> Stashed changes

    /**
     * Creates new form RegistreraAlien
     */
    public RegistreraAlien(InfDB idb) {
        initComponents();
        
        this.idb = idb;
        
<<<<<<< Updated upstream
=======
        namn = "";
        losenord = "";
        telefon = "";
       // ras = "";
        
        //Fyller det comboboxar som används i formuläret
>>>>>>> Stashed changes
        fyllaPlatsCB();
        fyllaAgentCB();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTFNamn = new javax.swing.JTextField();
        jTFLosenord = new javax.swing.JTextField();
        jTFTelefon = new javax.swing.JTextField();
        jCBPlats = new javax.swing.JComboBox<>();
        jCBAgent = new javax.swing.JComboBox<>();
        jRbWorm = new javax.swing.JRadioButton();
        jRBBoglodite = new javax.swing.JRadioButton();
        jRBSquid = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBRegistrera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registrera ny Alien");

        jTFNamn.setText("Namn");
        jTFNamn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTFNamnMousePressed(evt);
            }
        });

        jTFLosenord.setText("Lösenord");
        jTFLosenord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTFLosenordMousePressed(evt);
            }
        });

        jTFTelefon.setText("Telefon");
        jTFTelefon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTFTelefonMousePressed(evt);
            }
        });

        buttonGroup1.add(jRbWorm);
        jRbWorm.setText("Worm");

        buttonGroup1.add(jRBBoglodite);
        jRBBoglodite.setText("Boglodite");

        buttonGroup1.add(jRBSquid);
        jRBSquid.setText("Squid");

        jLabel2.setText("Plats");

        jLabel3.setText("Ansvarig agent");

        jLabel4.setText("Uppgifter");

        jBRegistrera.setText("Registrera");
        jBRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRbWorm)
                            .addComponent(jRBBoglodite))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRBSquid)
                            .addComponent(jLabel4)
                            .addComponent(jTFNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(49, 49, 49))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBRegistrera)
                    .addComponent(jLabel1))
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFLosenord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jRBSquid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRBBoglodite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRbWorm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBRegistrera)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistreraActionPerformed
<<<<<<< Updated upstream
        // TODO add your handling code here:
=======
        // Registrerar en alien till Databasen 
        
        /**
         * Insert Into Alien (Alien_ID, Registreringsdatum, losenord,Namn, Telefon, plats, Ansvarig_Agent)
         * VALUES (ID, DATE, 'LOSENORD', 'NAMN', 'TelefonNummer', PLATS ID,  AGENT ID);
         */
        
        setAlienInfo();
        
        // SQL Fråga formulering
        // (Alien_ID, Registreringsdatum, losenord,Namn, Telefon, plats, Ansvarig_Agent)
       // String fraga = "INSERT INTO Alien VALUES ("+aid+" , NULL, '"+losenord+"', '"+namn+"', '"+telefon+"', "+plats+","+ansvarigAgent+")";
        String fraga2 = "INSERT INTO Alien (Alien_ID, Losenord, Namn, Telefon, Ansvarig_Agent, Plats) VALUES ("+aid+", '"+losenord+"', '"+namn+"', '"+telefon+"', "+ansvarigAgent+"," +plats+")";
                
        //Gör registreringen via en sql fråga
        try{
            idb.insert(fraga2);
            
        } catch(InfException e){
            JOptionPane.showMessageDialog(null, "Fel i Databasfråga");
            System.out.println("Kunde inte lägga till Alien till databasen" + e.getMessage());
            
        }
>>>>>>> Stashed changes
        
        
    }//GEN-LAST:event_jBRegistreraActionPerformed

    private void jTFNamnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFNamnMousePressed
        // Tömmer namnrutan första gången man ska börja skriva
        
        if(jTFNamn.getText().equals("Namn"))
            {
                jTFNamn.setText("");
            }  
    }//GEN-LAST:event_jTFNamnMousePressed

    private void jTFLosenordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFLosenordMousePressed
        // // Tömmer Lösenordsrutan första gången man ska börja skriva
        
        if(jTFLosenord.getText().equals("Lösenord"))
            {
                jTFLosenord.setText("");
            }
    }//GEN-LAST:event_jTFLosenordMousePressed

    private void jTFTelefonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFTelefonMousePressed
        // // Tömmer Telefonrutan första gången man ska börja skriva
        
        if(jTFTelefon.getText().equals("Telefon"))
            {
                jTFTelefon.setText("");
            }
    }//GEN-LAST:event_jTFTelefonMousePressed

    
    //Metod för att fylla COMBOBOX innehållande platser i databasen 
    private void fyllaPlatsCB(){
        String platsFråga = "SELECT Benamning FROM Plats ORDER By Benamning";
        
        ArrayList<String> allaPlatsNamn;
        
        try{
            allaPlatsNamn = idb.fetchColumn(platsFråga);
            
            for(String plats : allaPlatsNamn)
            {
                jCBPlats.addItem(plats);
            }
                    
        } catch(InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "Inläsningsfel ifrån Databasen");
        }
        
    }
    
    //Metod fö att fylla COMBOX för ansvarande agent
    private void fyllaAgentCB() {
        String agentFråga = "SELECT Namn FROM Agent ORDER BY Namn";

        ArrayList<String> allaAgenter;

        try {
            allaAgenter = idb.fetchColumn(agentFråga);

            for (String agent : allaAgenter) {
                jCBAgent.addItem(agent);
            }

        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Inläsningsfel ifrån Databasen");
        }

    }
<<<<<<< Updated upstream
=======
    
    private void setAlienInfo(){
        
        namn = jTFNamn.getText();
        losenord = jTFLosenord.getText();
        telefon = jTFTelefon.getText();
       
        //radioButtonCheck();
        setAid();
        setPlats();
        setAnsvarigAgent();
        
        
    }
    
//    private void radioButtonCheck(){
//        if(jRBBoglodite.isSelected()){
//           ras = "Boglodite"; 
//        }
//        else if(jRBSquid.isSelected()){
//             ras = "Squid";
//        }
//        
//        else if(jRBWorm.isSelected()){
//             ras = "Worm";
//        }
//            
//    }
    
    private void setAid(){
        
        // Hämtar ett unikt ID för registreringen av en ny Alien
        try{
            
            String charAid = idb.getAutoIncrement("Alien", "Alien_id");
            
            aid = Integer.parseInt(charAid);
        } 
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Databasfel");
            System.out.println("Kunde inte hämta Alien_ID" + e.getMessage());
        }
        
    }
    
    //hämtar platsens ID för den platsen man valt i comboboxen
    private void setPlats(){
        try{
            
            String platsnamn = jCBPlats.getSelectedItem().toString();
            String platsfraga = "SELECT Plats_ID FROM Plats WHERE Benamning like '"+platsnamn+"'";
            
            String charPlats = idb.fetchSingle(platsfraga);
            
            plats = Integer.parseInt(charPlats);
            
        } catch(InfException e){
            JOptionPane.showMessageDialog(null, "Platsen fanns inte i databasen");
            System.out.println("Kunde inte hämta vald plats" + e.getMessage());
            
        }
        
    }
    
    //hämtar agentens ID för den ansvariga agent man valt i comboboxen
    private void setAnsvarigAgent(){
        try{
            
            String agentnamn = jCBAgent.getSelectedItem().toString();
            String agentfraga = "SELECT Agent_ID FROM Agent WHERE Namn like '"+agentnamn+"'";
            
            String charAgent =  idb.fetchSingle(agentfraga);
            
            ansvarigAgent = Integer.parseInt(charAgent);
            
        } catch(InfException e){
            JOptionPane.showMessageDialog(null, "Agenten fanns inte i databasen");
            System.out.println("Kunde inte hämta vald agent" + e.getMessage());
            
        }
        
    }
>>>>>>> Stashed changes


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBRegistrera;
    private javax.swing.JComboBox<String> jCBAgent;
    private javax.swing.JComboBox<String> jCBPlats;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRBBoglodite;
    private javax.swing.JRadioButton jRBSquid;
    private javax.swing.JRadioButton jRbWorm;
    private javax.swing.JTextField jTFLosenord;
    private javax.swing.JTextField jTFNamn;
    private javax.swing.JTextField jTFTelefon;
    // End of variables declaration//GEN-END:variables
}
