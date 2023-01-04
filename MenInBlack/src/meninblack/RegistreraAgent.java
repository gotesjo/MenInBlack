/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package meninblack;

import java.util.ArrayList;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author emanuelgotesjo
 */
public class RegistreraAgent extends javax.swing.JFrame {

    //Klassens fält
    private InfDB idb;
    private int aid;
    private String namn;
    private String losenord;
    private String telefon;
    private String regDatum;
    private int omrade;
    private String admin;
    private boolean possibleReg;
    
    /**
     * Creates new form RegistreraAgent
     */
    public RegistreraAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
        
        namn = "";
        losenord = "";
        telefon = "";
        regDatum = "";
        admin = "";
        possibleReg = true;
        
        jLVarning.setVisible(false);
        
        fyllOmradeCB();
        
        
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
        dateChooser1 = new com.raven.datechooser.DateChooser();
        jLtitel = new javax.swing.JLabel();
        jTNamn = new javax.swing.JTextField();
        jTLosen = new javax.swing.JTextField();
        jTTelefon = new javax.swing.JTextField();
        jCOmrade = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jRBJa = new javax.swing.JRadioButton();
        jRBNej = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jTDate = new javax.swing.JTextField();
        jBIdag = new javax.swing.JButton();
        jBReg = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLVarning = new javax.swing.JLabel();

        dateChooser1.setDateFormat("yyyy-MM-dd");
        dateChooser1.setTextRefernce(jTDate);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLtitel.setText("Registrera ny Agent");

        jTNamn.setText("Agentnamn");
        jTNamn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTNamnMousePressed(evt);
            }
        });

        jTLosen.setText("Lösenord");
        jTLosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTLosenMousePressed(evt);
            }
        });

        jTTelefon.setText("Telefonnummer");
        jTTelefon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTTelefonMousePressed(evt);
            }
        });

        jLabel1.setText("Jobbar inom område:");

        buttonGroup1.add(jRBJa);
        jRBJa.setText("Ja");

        buttonGroup1.add(jRBNej);
        jRBNej.setText("Nej");

        jLabel2.setText("Administratörstatus");

        jBIdag.setText("Idag");
        jBIdag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIdagActionPerformed(evt);
            }
        });

        jBReg.setText("Registrera");
        jBReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegActionPerformed(evt);
            }
        });

        jLabel3.setText("Anställningsdatum");

        jLVarning.setForeground(new java.awt.Color(255, 51, 51));
        jLVarning.setText("Kan inte registrera! Fyll i allt för att registrera");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jCOmrade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBJa)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTDate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBIdag))
                    .addComponent(jRBNej))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLtitel)
                        .addGap(205, 205, 205))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBReg)
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLVarning)
                        .addGap(126, 126, 126))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLtitel)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jRBJa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRBNej)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBIdag))))
                .addGap(18, 18, 18)
                .addComponent(jLVarning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBReg)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Registerar alien när man trycker på registrera knappen
    private void jBRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegActionPerformed
        // TODO add your handling code here:
        setAgentInfo();
        
        
        //Kontrollerar så all nödvändig information är inskrivet och korrekt.
        if (possibleReg) {
            //När agentinfon är satt så formuleras en string för databasen      
            String fraga2 = "INSERT INTO mibdb.agent (Agent_ID, Namn, Telefon, Anstallningsdatum, Administrator, Losenord, Omrade) VALUES (" + aid + ", '" + namn + "', '" + telefon + "', '" + regDatum + "', '" + admin + "', '" + losenord + "', " + omrade + ")";

            //Gör registreringen via en sql fråga
            try {
                idb.insert(fraga2);

            } catch (InfException e) {
                javax.swing.JOptionPane.showMessageDialog(null, "Fel i Databasfråga");
                System.out.println("Kunde inte lägga till Agenten till databasen" + e.getMessage());

            }
         //Stänger ner rutan om man fyllt i korrekt
         dispose();
        }
        else{
            //Visar felmeddelande text
            jLVarning.setVisible(true);
        }

    }//GEN-LAST:event_jBRegActionPerformed

    private void jTNamnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTNamnMousePressed
// Tömmer namnrutan första gången man ska börja skriva

        if (jTNamn.getText().equals("Agentnamn")) {
            jTNamn.setText("");
        }
    }//GEN-LAST:event_jTNamnMousePressed

    private void jTLosenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTLosenMousePressed
        // Tömmer lösenordsrutan första gången man ska börja skriva

        if (jTLosen.getText().equals("Lösenord")) {
            jTLosen.setText("");
        }
    }//GEN-LAST:event_jTLosenMousePressed

    private void jTTelefonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTTelefonMousePressed
     // Tömmer Telefonrutan första gången man ska börja skriva
        
        if(jTTelefon.getText().equals("Telefonnummer"))
            {
                jTTelefon.setText("");
            } 
    }//GEN-LAST:event_jTTelefonMousePressed

    private void jBIdagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIdagActionPerformed
       
        //Sätter datumet till dagens datum
        dateChooser1.toDay();

    }//GEN-LAST:event_jBIdagActionPerformed

    
    private void fyllOmradeCB() {
        String platsFråga = "SELECT Benamning FROM Omrade ORDER By Benamning";
        
        ArrayList<String> allaOmradeNamn;
        
        try{
            allaOmradeNamn = idb.fetchColumn(platsFråga);
            
            for(String omradet : allaOmradeNamn)
            {
                jCOmrade.addItem(omradet);
            }
                    
        } catch(InfException ettUndantag){
            javax.swing.JOptionPane.showMessageDialog(null, "Inläsningsfel ifrån Databasen");
        }    
    }
    
    //Fyller klassens fält med information ifrån användarens inmatning
    private void setAgentInfo(){
        
        //Nollar så att varje gång man trycker på knappen testar den om det blir några fel
        possibleReg = true;
        
        //Gör om namnet så det är korrekt för databasen
        if (Validering.isNamnGodkant(jTNamn.getText()) && !Validering.finnsUsernameiDB(jTNamn.getText())) {
            namn = Validering.returGodkäntNamn(jTNamn.getText());
        }
        else{
            possibleReg = false;
        }
        
        //Kollar så att lösenordet är godkänt och rutan inte är tom
        if (Validering.validLosen(jTLosen.getText()) && Validering.isTom(jTLosen.getText()) ) {
            losenord = jTLosen.getText();
        } else {
            possibleReg = false;
        }

        //Kollar telefonnummer är korrekt
        if (Validering.isTelefonnummer(jTTelefon.getText())) {
            telefon = jTTelefon.getText();
        } else {
            possibleReg = false;
        }

        //Kollar så datum är ifyllt
        if (Validering.isTom(jTDate.getText())) {
            regDatum = jTDate.getText();
        }
       
        radioButtonCheck();
        setAid();
        setOmrade();
        
        
    }
    
    //Checka vilken radiobutton som är checkad för att kolla om Agenten ska ha adminstatus
    //Ger fältet admin ett värde J eller N
    private void radioButtonCheck(){
        if(jRBJa.isSelected()){
           admin = "J"; 
           
        }
        else if(jRBNej.isSelected()){
             admin = "N";
        }
        else{
            possibleReg = false;
        }
            
    }
    
    // Genererar ett Agent_ID som är unikt 
    private void setAid(){
        
        // Hämtar ett unikt ID för registreringen av en ny Agent
        try{
            
            
            String charAid = idb.getAutoIncrement("Agent", "Agent_ID");
            
            aid = Integer.parseInt(charAid);
        } 
        catch(InfException e){
            javax.swing.JOptionPane.showMessageDialog(null, "Databasfel");
            System.out.println("Kunde inte hämta Agent_ID" + e.getMessage());
        }
    }
    
    //hämtar Områdets ID för det Område man valt i comboboxen
    private void setOmrade(){
        try{
            
            String omradesNamn = jCOmrade.getSelectedItem().toString();
            String omradeFraga = "SELECT Omrades_ID FROM Omrade WHERE Benamning like '"+omradesNamn+"'";
            
            String charPlats = idb.fetchSingle(omradeFraga);
            
            omrade = Integer.parseInt(charPlats);
            
        } catch(InfException e){
            javax.swing.JOptionPane.showMessageDialog(null, "Området fanns inte i databasen");
            System.out.println("Kunde inte hämta vald plats" + e.getMessage());
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JButton jBIdag;
    private javax.swing.JButton jBReg;
    private javax.swing.JComboBox<String> jCOmrade;
    private javax.swing.JLabel jLVarning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLtitel;
    private javax.swing.JRadioButton jRBJa;
    private javax.swing.JRadioButton jRBNej;
    private javax.swing.JTextField jTDate;
    private javax.swing.JTextField jTLosen;
    private javax.swing.JTextField jTNamn;
    private javax.swing.JTextField jTTelefon;
    // End of variables declaration//GEN-END:variables
}
