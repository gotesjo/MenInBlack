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
 * @author emanuelgotesjo
 */
public class UppdateraEnAlien extends javax.swing.JFrame {
    
    private InfDB idb; 
    private String alienNamn;
    private String ras;
    
    
    

    /**
     * Creates new form RegistreraAlien
     */
    public UppdateraEnAlien(InfDB idb, String alienNamn) {
        initComponents();
        
        this.idb = idb;
        this.alienNamn = alienNamn;
        
        
        fyllInfoOmAlien();
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
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBstang = new javax.swing.JButton();
        jBnamn = new javax.swing.JButton();
        jLnamn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLPlats = new javax.swing.JLabel();
        jBplats = new javax.swing.JButton();
        jBAAgent = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLAgent = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLnummer = new javax.swing.JLabel();
        jBnummer = new javax.swing.JButton();
        jLras = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jBras = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MIB Skandinavien");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Ändra info om Alien");

        jLabel2.setText("Namn");

        jBstang.setText("Klar");
        jBstang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBstangActionPerformed(evt);
            }
        });

        jBnamn.setText("Ändra Namn");
        jBnamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnamnActionPerformed(evt);
            }
        });

        jLnamn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLnamn.setText("jLnamn");

        jLabel7.setText("Plats");

        jLPlats.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLPlats.setText("EnPlats");

        jBplats.setText("Ändra Plats");
        jBplats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBplatsActionPerformed(evt);
            }
        });

        jBAAgent.setText("Ändra Agent");

        jLabel9.setText("Ansvarig Agent");

        jLAgent.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLAgent.setText("Agent");

        jLabel3.setText("Telefon");

        jLnummer.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLnummer.setText("Nummer");

        jBnummer.setText("Ändra Nummer");
        jBnummer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnummerActionPerformed(evt);
            }
        });

        jLras.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLras.setText("enRas");

        jLabel8.setText("Ras");

        jBras.setText("Ändra Ras");
        jBras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLAgent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBAAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLnamn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLPlats)
                                    .addComponent(jLras)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBplats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLnummer))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                                .addComponent(jBnummer, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(0, 33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBstang)
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLnamn)
                    .addComponent(jBnamn))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLnummer)
                    .addComponent(jBnummer))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLPlats)
                    .addComponent(jBplats))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLras)
                    .addComponent(jBras))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAAgent)
                    .addComponent(jLAgent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jBstang)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBstangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBstangActionPerformed
            
        
        //Stänger ner programmet när man tryckt close    
        dispose();

        
    }//GEN-LAST:event_jBstangActionPerformed

    private void jBnamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnamnActionPerformed
        // Ändrar namnet emot ett nytt valt unikt namn
        String prevNamn = alienNamn;
        String newNamn = JOptionPane.showInputDialog("Vad vill du ange som namn istället?\nMåste vara unikt" );
        
        if(!Validering.finnsUsernameiDB(newNamn)){
            try{
                //Uppdaterar namnet för vald alien
                idb.update("UPDATE Alien SET Namn='"+newNamn+"' where Namn like '"+prevNamn+"'");
                
                if(Validering.finnsUsernameiDB(newNamn)){
                    alienNamn = newNamn;
                }
           
            } catch(InfException e){
                JOptionPane.showMessageDialog(null, "FEL MED DATABASEN");
                System.out.println("Fel när namn skulle uppdateras i databasen" + e);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Namnet finns redan\nVänligen välj ett annat");
        }
        
        //Uppdaterar sidan med ny info om Alien
        fyllInfoOmAlien();
        
    }//GEN-LAST:event_jBnamnActionPerformed

    
    private void jBnummerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnummerActionPerformed
        // Ändrar Telefonnumer för en alien
        String newNumber = JOptionPane.showInputDialog("Vad vill du byta telefonnummret till istället?");
        
            try{
                //Uppdaterar nummret för vald alien
                idb.update("UPDATE Alien SET Telefon='"+newNumber+"' where Namn like '"+alienNamn+"'");
           
            } catch(InfException e){
                JOptionPane.showMessageDialog(null, "Numret kunde inte uppdateras\nNågot blev fel");
                System.out.println("Fel när Telefon skulle uppdateras i databasen" + e);
                
            }
        
        //Uppdaterar sidan med ny info om Alien
        fyllInfoOmAlien();
    }//GEN-LAST:event_jBnummerActionPerformed

    private void jBplatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBplatsActionPerformed
          //Kod för att ändra Plats
    }//GEN-LAST:event_jBplatsActionPerformed

    private void jBrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrasActionPerformed
        ////Kod för att ändra Rasen för en alien
        
        String[] rasArray = { "Squid", "Boglodite", "Worm" };
        String valdRas = (String)JOptionPane.showInputDialog( null, "Välj en önskad ras ifrån listan:", "Välj Ras...",
                                        JOptionPane.QUESTION_MESSAGE, 
                                        null, 
                                        rasArray,
                                        rasArray[ 0 ] );
        
        
        
        ras = valdRas;                              
        sattRas();
        
        //Uppdaterar sidan med ny info om Alien
        fyllInfoOmAlien();
    }//GEN-LAST:event_jBrasActionPerformed

    //Fyller på med information om vald Alien
    private void fyllInfoOmAlien(){
       
        jLnamn.setText(alienNamn);
        jLras.setText(getRas());
        
        try{
        jLnummer.setText(idb.fetchSingle("SELECT Telefon from Alien Where namn like '"+alienNamn+"'"));
        jLPlats.setText(idb.fetchSingle("SELECT Benamning from Plats JOIN Alien on Plats_ID = Alien.Plats Where namn like '"+alienNamn+"'"));
        jLAgent.setText(idb.fetchSingle("SELECT Agent.Namn FROM Agent JOIN Alien on AGENT_ID=Ansvarig_Agent WHERE Alien.namn like '"+alienNamn+"'"));
        
        } catch(InfException e){
            JOptionPane.showMessageDialog(null, "FEL MED DATABASEN");
            System.out.println("FEL när man skulle hämta hem data ifrån databasen " + e);
        }
    }
    
    //Hämtar ut Aliens ras beroende på vart Aliens ID finns med i vilken rastabell
    private String getRas(){
        String enRas = "";
        String fragaBoglodite = "SELECT Namn FROM Alien JOIN Boglodite ON Boglodite.Alien_ID=Alien.Alien_ID WHERE namn LIKE '"+alienNamn+"'";
        String fragaSquid = "SELECT Namn FROM Alien JOIN Squid ON Squid.Alien_ID=Alien.Alien_ID WHERE namn LIKE '"+alienNamn+"'";
        String fragaWorm = "SELECT Namn FROM Alien JOIN Worm ON Worm.Alien_ID=Alien.Alien_ID WHERE namn LIKE '"+alienNamn+"'";
        
        //Gör en kontroll i vardera rastabell
        try{
            if(alienNamn.equals(idb.fetchSingle(fragaBoglodite))){
                enRas="Boglodite";
            }
            else if(alienNamn.equals(idb.fetchSingle(fragaSquid))){
                enRas="Squid";
            }
            else if(alienNamn.equals(idb.fetchSingle(fragaWorm))){
                enRas="Worm";
            }
            else{
                enRas="Har ingen ras";
            }
            
        } catch(InfException e){
            JOptionPane.showMessageDialog(null, "Din varelse har ingen ras");
            System.out.println("FEL när man skulle hämta hem ras ifrån databasen " + e);
        }
       
        //Retunerar rasen i form av en String
        return enRas;
    }

    

    
//    //hämtar agentens ID för den ansvariga agent man valt i comboboxen
//    private void setAnsvarigAgent(){
//        try{
//            
//            String agentnamn = jCBAgent.getSelectedItem().toString();
//            String agentfraga = "SELECT Agent_ID FROM Agent WHERE Namn like '"+agentnamn+"'";
//            
//            String charAgent =  idb.fetchSingle(agentfraga);
//            
//            ansvarigAgent = Integer.parseInt(charAgent);
//            
//        } catch(InfException e){
//            JOptionPane.showMessageDialog(null, "Agenten fanns inte i databasen");
//            System.out.println("Kunde inte hämta vald agent" + e.getMessage());
//            
//        }
//        
//    }
    
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBAAgent;
    private javax.swing.JButton jBnamn;
    private javax.swing.JButton jBnummer;
    private javax.swing.JButton jBplats;
    private javax.swing.JButton jBras;
    private javax.swing.JButton jBstang;
    private javax.swing.JLabel jLAgent;
    private javax.swing.JLabel jLPlats;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLnamn;
    private javax.swing.JLabel jLnummer;
    private javax.swing.JLabel jLras;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}