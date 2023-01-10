/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package meninblack;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author emanuelgotesjo
 */
public class RegistreraAlien extends javax.swing.JFrame {
    
    private static InfDB idb; 

    private int aid;
    private String namn;
    private String losenord;
    private String telefon;
    private String ras;
    private int plats;
    private int ansvarigAgent;
    private String regDatum;   
    private boolean possibleReg;

    /**
     * Creates new form RegistreraAlien
     */
    public RegistreraAlien(InfDB idb) {
        initComponents();
        
        this.idb = idb;

        namn = "";
        losenord = "";
        telefon = "";
        ras = "";
        possibleReg = false;
        
        //Fyller det comboboxar som används i formuläret
        fyllaPlatsCB();
        fyllaAgentCB();
        
        //Visar inte varningsrutan från start
        jLVarning.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rasGruppButt = new javax.swing.ButtonGroup();
        dateChooserRegDate = new com.raven.datechooser.DateChooser();
        jLabel1 = new javax.swing.JLabel();
        jTFNamn = new javax.swing.JTextField();
        jTFLosenord = new javax.swing.JTextField();
        jTFTelefon = new javax.swing.JTextField();
        jCBPlats = new javax.swing.JComboBox<>();
        jCBAgent = new javax.swing.JComboBox<>();
        jRBWorm = new javax.swing.JRadioButton();
        jRBBoglodite = new javax.swing.JRadioButton();
        jRBSquid = new javax.swing.JRadioButton();
        jLPlats = new javax.swing.JLabel();
        jLAnsvarigAgent = new javax.swing.JLabel();
        jLUppgifter = new javax.swing.JLabel();
        jBRegistrera = new javax.swing.JButton();
        jTextDate = new javax.swing.JTextField();
        jLabeldate = new javax.swing.JLabel();
        jBToDay = new javax.swing.JButton();
        jLVarning = new javax.swing.JLabel();

        dateChooserRegDate.setDateFormat("yyyy-MM-dd");
        dateChooserRegDate.setTextRefernce(jTextDate);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        rasGruppButt.add(jRBWorm);
        jRBWorm.setText("Worm");

        rasGruppButt.add(jRBBoglodite);
        jRBBoglodite.setText("Boglodite");

        rasGruppButt.add(jRBSquid);
        jRBSquid.setText("Squid");

        jLPlats.setText("Plats");

        jLAnsvarigAgent.setText("Ansvarig agent");

        jLUppgifter.setText("Uppgifter");

        jBRegistrera.setText("Registrera");
        jBRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistreraActionPerformed(evt);
            }
        });

        jLabeldate.setText("Registreringsdatum");

        jBToDay.setText("idag...");
        jBToDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBToDayActionPerformed(evt);
            }
        });

        jLVarning.setForeground(new java.awt.Color(255, 0, 0));
        jLVarning.setText("Fel! Fyll i all information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jRBSquid)
                                        .addComponent(jLUppgifter)
                                        .addComponent(jRBBoglodite)
                                        .addComponent(jTFNamn)
                                        .addComponent(jTFLosenord)
                                        .addComponent(jTFTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLPlats)
                                        .addComponent(jLAnsvarigAgent)
                                        .addComponent(jLabeldate, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextDate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jBToDay))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jCBPlats, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jCBAgent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel1)
                                    .addGap(162, 162, 162)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBRegistrera)
                                .addGap(18, 18, 18)
                                .addComponent(jLVarning)
                                .addGap(7, 7, 7)))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRBWorm)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUppgifter)
                    .addComponent(jLPlats))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFLosenord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLAnsvarigAgent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRBSquid)
                    .addComponent(jLabeldate))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jRBBoglodite))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBToDay))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRBWorm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRegistrera)
                    .addComponent(jLVarning))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistreraActionPerformed

        // Registrerar en alien till Databasen 
        setAlienInfo();
        
        //kollar så alla textfields är korrekta
       if(possibleReg){
       String fraga2 = "INSERT INTO Alien (Alien_ID, Registreringsdatum, Losenord, Namn, Telefon, Ansvarig_Agent, Plats) VALUES ("+aid+", '"+regDatum+"', '"+losenord+"', '"+namn+"', '"+telefon+"', "+ansvarigAgent+"," +plats+")";
                
        //Gör registreringen via en sql fråga
        try{
            idb.insert(fraga2);
            
        } catch(InfException e){
            JOptionPane.showMessageDialog(null, "Fel i Databasfråga");
            System.out.println("Kunde inte lägga till Alien till databasen" + e.getMessage());
            
        }
         sattRas();
         
         //Stänger ner rutan
         dispose();
       }
       else {
            jLVarning.setVisible(true);
       }
         

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

    private void jBToDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBToDayActionPerformed
        dateChooserRegDate.toDay();
    }//GEN-LAST:event_jBToDayActionPerformed

    
    //Metod för att fylla COMBOBOX innehållande platser i databasen 
    private void fyllaPlatsCB(){
        String platsFråga = "SELECT Benamning FROM Plats ORDER By Benamning";
        
        ArrayList<String> allaPlatsNamn;
        
        try{
            allaPlatsNamn = idb.fetchColumn(platsFråga);
            
            for(String platsen : allaPlatsNamn)
            {
                jCBPlats.addItem(platsen);
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

            for (String enAgent : allaAgenter) {
                jCBAgent.addItem(enAgent);
            }

        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Inläsningsfel ifrån Databasen");
        }

    }
    
    //Fyller klassens fält med information ifrån användarens inmatning
    private void setAlienInfo(){
        
        possibleReg = true;
        
        //Sätter ett namn godkänt för Databasen
        if(Validering.isNamnGodkant(jTFNamn.getText()) && !Validering.finnsUsernameiDB(jTFNamn.getText())){
        namn = Validering.returGodkäntNamn(jTFNamn.getText());
        } else {
            possibleReg = false;
        }
       
        //Kollar lösenord är godkänt
        if (Validering.validLosen(jTFLosenord.getText())) {
            losenord = jTFLosenord.getText();
        } else{
            possibleReg = false;
        }
        
        //kollar telefonnummer så det är korrekt
        if (Validering.isTelefonnummer(jTFTelefon.getText())) {
            telefon = jTFTelefon.getText();
        } else {
            possibleReg = false;
        }
        
        //Kollar ifall den är ifylld
        if(Validering.isTom(jTextDate.getText())){
            regDatum = jTextDate.getText();
        } else {
            possibleReg = false;
        }
        
       
        radioButtonCheck();
        setAid();
        setPlats();
        setAnsvarigAgent();
        
        
        
    }
    
    // RAS Kontroll
    //Gör en kontroll på vilken radiobutton som är vald
    private void radioButtonCheck(){
        if(jRBBoglodite.isSelected()){
           ras = "Boglodite"; 
        }
        else if(jRBSquid.isSelected()){
             ras = "Squid";
        }
        
        else if(jRBWorm.isSelected()){
             ras = "Worm";
        }
        else{
            //ifall ingen checkbox är checkad
            possibleReg = false;
            
        }
            
    }
    
    // Genererar ett Alien_ID som är unikt 
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
            
            //kollar så nått värde är inmatat
            if(charPlats == null || !Validering.isTom(charPlats)){
                possibleReg = false;
            }
            
        } catch(InfException e){
            JOptionPane.showMessageDialog(null, "Platsen fanns inte i databasen");
            System.out.println("Kunde inte hämta vald plats" + e.getMessage());
            
        }
        
        
    }
    
    //hämtar agentens ID för den ansvariga agent man valt i comboboxen
    private void setAnsvarigAgent() {
        String agentnamn = null;

        try {

            agentnamn = jCBAgent.getSelectedItem().toString();
            String agentfraga = "SELECT Agent_ID FROM Agent WHERE Namn like '" + agentnamn + "'";

            String charAgent = idb.fetchSingle(agentfraga);

            ansvarigAgent = Integer.parseInt(charAgent);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Agenten fanns inte i databasen");
            System.out.println("Kunde inte hämta vald agent" + e.getMessage());
        }

        //kollar så nått värde är inmatat
        if (agentnamn == null || !Validering.isTom(agentnamn)) {
            possibleReg = false;
        }

    }
    
    // Sätter rasen för den Alien som registreras
    //Skickar upp rasen till Databasen
    private void sattRas(){
        String fraga = "";
       
        switch (ras) {
            case "Worm":
                
                fraga = "INSERT INTO "+ras+" VALUES("+aid+")";
                break;
                
            case "Boglodite":
                
                int antalBogloditeBoogies= getAntalBoogies();
                fraga = "INSERT INTO "+ras+" VALUES("+aid+", " +antalBogloditeBoogies+")";
                
                break;
                
            case "Squid":
                
                int squidArmar = getArmarSquid();
                fraga = "INSERT INTO "+ras+" VALUES("+aid+", " +squidArmar+")";
                
                break;
                
            default:
            // code block
        }
        
        //Lägger till rasen i databasen
        try{
            idb.insert(fraga);
        } catch(InfException e){
            JOptionPane.showMessageDialog(null, "Fel i databasen");
            System.out.println("Kunde inte lägga till ras" + e.getMessage());
            
        }
        
    }
    
    //lägger till antal armar till ras
    //Skickar en uppmaning till användaren att mata in antal armar
    private int getArmarSquid(){
        String armar = JOptionPane.showInputDialog("Hur många armar har din Alien? Räkna dom tack!");
        int antalArmar = Integer.parseInt(armar);
        
        return antalArmar;
    }
    
     //lägger till antal Boogies till ras
    //Skickar en uppmaning till användaren att mata in antal Boogies
    private int getAntalBoogies(){
        String boogies = JOptionPane.showInputDialog("Hur många boogies har din Alien? Räkna dom tack!");
        int antalBoogies = Integer.parseInt(boogies);
        return antalBoogies;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.datechooser.DateChooser dateChooserRegDate;
    private javax.swing.JButton jBRegistrera;
    private javax.swing.JButton jBToDay;
    private javax.swing.JComboBox<String> jCBAgent;
    private javax.swing.JComboBox<String> jCBPlats;
    private javax.swing.JLabel jLAnsvarigAgent;
    private javax.swing.JLabel jLPlats;
    private javax.swing.JLabel jLUppgifter;
    private javax.swing.JLabel jLVarning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabeldate;
    private javax.swing.JRadioButton jRBBoglodite;
    private javax.swing.JRadioButton jRBSquid;
    private javax.swing.JRadioButton jRBWorm;
    private javax.swing.JTextField jTFLosenord;
    private javax.swing.JTextField jTFNamn;
    private javax.swing.JTextField jTFTelefon;
    private javax.swing.JTextField jTextDate;
    private javax.swing.ButtonGroup rasGruppButt;
    // End of variables declaration//GEN-END:variables
}
