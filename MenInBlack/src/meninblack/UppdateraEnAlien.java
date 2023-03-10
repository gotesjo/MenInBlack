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
public class UppdateraEnAlien extends javax.swing.JFrame {
    
    private InfDB idb; 
    private String alienNamn;
    private int aid;
    private String ras;
    User user;
    
    

    /**
     * Creates new form RegistreraAlien
     */
    public UppdateraEnAlien(InfDB idb, String alienNamn, User user) {
        initComponents();
        
        this.idb = idb;
        this.alienNamn =  Validering.returGodkäntNamn(alienNamn);
        this.user = user;
        
        jlblLosenord.setVisible(false);
        if(Validering.checkAdmin(user.getUsername())) {
            jlblLosenord.setVisible(true);
        }
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

        jPasswordField1 = new javax.swing.JPasswordField();
        jLTitel = new javax.swing.JLabel();
        jLNamn = new javax.swing.JLabel();
        jBClose = new javax.swing.JButton();
        jBnamn = new javax.swing.JButton();
        jLAlienNamn = new javax.swing.JLabel();
        jLPlats = new javax.swing.JLabel();
        jLAlienPlats = new javax.swing.JLabel();
        jBplats = new javax.swing.JButton();
        jBAAgent = new javax.swing.JButton();
        jLAnsvarigAgent = new javax.swing.JLabel();
        jLAlienAgent = new javax.swing.JLabel();
        jLTelefonnummer = new javax.swing.JLabel();
        jLnummer = new javax.swing.JLabel();
        jBnummer = new javax.swing.JButton();
        jLAlienRas = new javax.swing.JLabel();
        jLRas = new javax.swing.JLabel();
        jBras = new javax.swing.JButton();
        jlblLosenord = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MIB Skandinavien");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLTitel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLTitel.setText("Ändra info om Alien");

        jLNamn.setText("Namn");

        jBClose.setText("Klar");
        jBClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCloseActionPerformed(evt);
            }
        });

        jBnamn.setText("Ändra Namn");
        jBnamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnamnActionPerformed(evt);
            }
        });

        jLAlienNamn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLAlienNamn.setText("jLnamn");

        jLPlats.setText("Plats");

        jLAlienPlats.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLAlienPlats.setText("EnPlats");

        jBplats.setText("Ändra Plats");
        jBplats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBplatsActionPerformed(evt);
            }
        });

        jBAAgent.setText("Ändra Agent");
        jBAAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAAgentActionPerformed(evt);
            }
        });

        jLAnsvarigAgent.setText("Ansvarig Agent");

        jLAlienAgent.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLAlienAgent.setText("Agent");

        jLTelefonnummer.setText("Telefon");

        jLnummer.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLnummer.setText("Nummer");

        jBnummer.setText("Ändra Nummer");
        jBnummer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnummerActionPerformed(evt);
            }
        });

        jLAlienRas.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLAlienRas.setText("enRas");

        jLRas.setText("Ras");

        jBras.setText("Ändra Ras");
        jBras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrasActionPerformed(evt);
            }
        });

        jlblLosenord.setText("Ändra Lösen");
        jlblLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlblLosenordActionPerformed(evt);
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
                        .addComponent(jLTitel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlblLosenord)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBClose)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLAlienAgent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBAAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLNamn)
                                    .addComponent(jLAlienNamn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLPlats)
                                    .addComponent(jLAlienPlats)
                                    .addComponent(jLAlienRas)
                                    .addComponent(jLRas))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBplats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLTelefonnummer)
                                    .addComponent(jLnummer))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                                .addComponent(jBnummer, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLAnsvarigAgent))))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLTitel)
                .addGap(18, 18, 18)
                .addComponent(jLNamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLAlienNamn)
                    .addComponent(jBnamn))
                .addGap(18, 18, 18)
                .addComponent(jLTelefonnummer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLnummer)
                    .addComponent(jBnummer))
                .addGap(18, 18, 18)
                .addComponent(jLPlats)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLAlienPlats)
                    .addComponent(jBplats))
                .addGap(18, 18, 18)
                .addComponent(jLRas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLAlienRas)
                    .addComponent(jBras))
                .addGap(18, 18, 18)
                .addComponent(jLAnsvarigAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAAgent)
                    .addComponent(jLAlienAgent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBClose)
                    .addComponent(jlblLosenord))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCloseActionPerformed
            
        
        //Stänger ner programmet när man tryckt close    
        dispose();

        
    }//GEN-LAST:event_jBCloseActionPerformed

    
    //Kod för att ändra AlienNamn
    private void jBnamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnamnActionPerformed
        // Ändrar namnet emot ett nytt valt unikt namn
        String prevNamn = alienNamn;
        String newNamn = JOptionPane.showInputDialog("Vad vill du ange som namn istället?\nMåste vara unikt" );
        
        if (newNamn != null) {
            // Gör om namnet till ett namn som är godkänt för databasen
            newNamn = Validering.returGodkäntNamn(newNamn);

            if (!Validering.finnsUsernameiDB(newNamn)) {
                try {
                    //Uppdaterar namnet för vald alien
                    idb.update("UPDATE Alien SET Namn='" + newNamn + "' where Namn like '" + prevNamn + "'");

                    if (Validering.finnsUsernameiDB(newNamn)) {
                        alienNamn = newNamn;
                    }

                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, "FEL MED DATABASEN");
                    System.out.println("Fel när namn skulle uppdateras i databasen" + e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Namnet finns redan\nVänligen välj ett annat");
            }

            //Uppdaterar sidan med ny info om Alien
            fyllInfoOmAlien();
        }
        
    }//GEN-LAST:event_jBnamnActionPerformed

    //Kod för att ändra nummer
    private void jBnummerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnummerActionPerformed
        // Ändrar Telefonnumer för en alien
        String newNumber = JOptionPane.showInputDialog("Vad vill du byta telefonnummret till istället?");
        
        if (newNumber != null) {
            try {
                //Uppdaterar nummret för vald alien
                idb.update("UPDATE Alien SET Telefon='" + newNumber + "' where Namn like '" + alienNamn + "'");

            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Numret kunde inte uppdateras\nNågot blev fel");
                System.out.println("Fel när Telefon skulle uppdateras i databasen" + e);

            }

            //Uppdaterar sidan med ny info om Alien
            fyllInfoOmAlien();
        }
    }//GEN-LAST:event_jBnummerActionPerformed

    
    //Kod för att ändra plats
    private void jBplatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBplatsActionPerformed
          //Kod för att ändra Plats

        String platsfraga = "Select Benamning FROM Plats";
        ArrayList<String> platsArrayList = new ArrayList<>();
        int nyPlats = 0;

        //Hämtar hem det platser som finns i platstabellen i databasen
        try {
            platsArrayList = idb.fetchColumn(platsfraga);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "FEL MED DATABASEN");
            System.out.println("FEL när man skulle hämta hem platser från databasen " + e);
        }

        Object[] platsArray = platsArrayList.toArray();
        String valdPlats = (String) JOptionPane.showInputDialog(null, "Välj en önskad plats ifrån listan:", "Välj Plats...",
                JOptionPane.QUESTION_MESSAGE,
                null,
                platsArray,
                platsArray[0]);

        if (valdPlats != null) {
            try {

                String platsnamn = valdPlats;
                String platsIDFraga = "SELECT Plats_ID FROM Plats WHERE Benamning like '" + platsnamn + "'";

                String charPlats = idb.fetchSingle(platsIDFraga);

                nyPlats = Integer.parseInt(charPlats);

            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Platsen fanns inte i databasen");
                System.out.println("Kunde inte hämta vald plats" + e.getMessage());

            }

            try {
                idb.update("Update Alien SET Plats='" + nyPlats + "' Where Namn='" + alienNamn + "'");

            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "kunde inte uppdatera platsen");
                System.out.println("Kunde inte uppdatera vald plats" + e.getMessage());
            }

            //Uppdaterar sidan med ny info om Alien
            fyllInfoOmAlien();
        }

    }//GEN-LAST:event_jBplatsActionPerformed

    
    //Kod för att ändra ras
    private void jBrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrasActionPerformed
        ////Kod för att ändra Rasen för en alien
        
        String[] rasArray = { "Squid", "Boglodite", "Worm" };
        String valdRas = (String)JOptionPane.showInputDialog( null, "Välj en önskad ras ifrån listan:", "Välj Ras...",
                                        JOptionPane.QUESTION_MESSAGE, 
                                        null, 
                                        rasArray,
                                        rasArray[ 0 ] );
        
        if (valdRas != null) {
            taBortRas();

            ras = valdRas;
            sattRas();

            //Uppdaterar sidan med ny info om Alien
            fyllInfoOmAlien();
        }
    }//GEN-LAST:event_jBrasActionPerformed

    //Kod för att ändra Ansvarig Agent
    private void jBAAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAAgentActionPerformed

        String agentfraga = "Select Namn FROM Agent";
          ArrayList<String> agentArrayList = new ArrayList<>();
          int nyAgent = 0;

          
          //Hämtar hem det agenter som finns som Agent i databasen
          try{
              agentArrayList = idb.fetchColumn(agentfraga);
              
          } catch(InfException e) {
            JOptionPane.showMessageDialog(null, "FEL MED DATABASEN");
            System.out.println("FEL när man skulle hämta hem agenter från databasen " + e);
          }
        
        Object[] agentArray = agentArrayList.toArray();
        String valdAgent = (String)JOptionPane.showInputDialog( null, "Välj en önskad agent ifrån listan:", "Välj Agent...",
                                        JOptionPane.QUESTION_MESSAGE, 
                                        null, 
                                        agentArray,
                                        agentArray[ 0 ] );
        
        if (valdAgent != null) {

            try {

                String agentnamn = valdAgent;
                String agentIDFraga = "SELECT Agent_ID FROM Agent WHERE Namn like '" + agentnamn + "'";

                String charAgent = idb.fetchSingle(agentIDFraga);

                nyAgent = Integer.parseInt(charAgent);

            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Agenten fanns inte i databasen");
                System.out.println("Kunde inte hämta vald agent" + e.getMessage());

            }

            try {
                idb.update("Update Alien SET Ansvarig_Agent='" + nyAgent + "' Where Namn='" + alienNamn + "'");

            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "kunde inte uppdatera Ansvarig Agent");
                System.out.println("Kunde inte uppdatera vald Ansvarig_Agent" + e.getMessage());
            }

            //Uppdaterar sidan med ny info om Alien
            fyllInfoOmAlien();
        }
        
    }//GEN-LAST:event_jBAAgentActionPerformed

    private void jlblLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlblLosenordActionPerformed
        // Tar dig till adminAndraLosen om du har adminstatus
        new AdminAndraLosen(idb, user, alienNamn).setVisible(true);
        
         
    }//GEN-LAST:event_jlblLosenordActionPerformed
    
    //Fyller på med information om vald Alien
    private void fyllInfoOmAlien(){
        
        ras = getRas();
       
        jLAlienNamn.setText(alienNamn);
        jLAlienRas.setText(ras);
        
        try{
        jLnummer.setText(idb.fetchSingle("SELECT Telefon from Alien Where namn like '"+alienNamn+"'"));
        jLAlienPlats.setText(idb.fetchSingle("SELECT Benamning from Plats JOIN Alien on Plats_ID = Alien.Plats Where namn like '"+alienNamn+"'"));
        jLAlienAgent.setText(idb.fetchSingle("SELECT Agent.Namn FROM Agent JOIN Alien on AGENT_ID=Ansvarig_Agent WHERE Alien.namn like '"+alienNamn+"'"));
        
        //hämtar hem Alien_ID ifrån databasen
        String charAid = idb.fetchSingle("SELECT Alien_ID from Alien Where namn like '"+alienNamn+"'");
        aid = Integer.parseInt(charAid);
        
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
        
        ras = getRas();
        
    }
    
    private void taBortRas(){
        String fraga = "";
       
        switch (ras) {
            case "Worm":
                
                fraga = "DELETE FROM mibdb.worm WHERE Alien_ID = " + aid;
                break;
                
            case "Boglodite":
                
                fraga = "DELETE FROM mibdb.boglodite WHERE Alien_ID = " + aid;
                
                break;
                
            case "Squid":
                
                fraga = "DELETE FROM mibdb.squid WHERE Alien_ID = " + aid;
                
                break;
                
            default:
            
        }
        
        if (ras == null) {
            //tar bort Alien_ID från rasen i databasen
            try {
                idb.delete(fraga);
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Fel i databasen när ras skulle ändras");
                System.out.println("Kunde inte ta bort rasen vid ändring" + e.getMessage());
            }

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
    private javax.swing.JButton jBAAgent;
    private javax.swing.JButton jBClose;
    private javax.swing.JButton jBnamn;
    private javax.swing.JButton jBnummer;
    private javax.swing.JButton jBplats;
    private javax.swing.JButton jBras;
    private javax.swing.JLabel jLAlienAgent;
    private javax.swing.JLabel jLAlienNamn;
    private javax.swing.JLabel jLAlienPlats;
    private javax.swing.JLabel jLAlienRas;
    private javax.swing.JLabel jLAnsvarigAgent;
    private javax.swing.JLabel jLNamn;
    private javax.swing.JLabel jLPlats;
    private javax.swing.JLabel jLRas;
    private javax.swing.JLabel jLTelefonnummer;
    private javax.swing.JLabel jLTitel;
    private javax.swing.JLabel jLnummer;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton jlblLosenord;
    // End of variables declaration//GEN-END:variables
}
