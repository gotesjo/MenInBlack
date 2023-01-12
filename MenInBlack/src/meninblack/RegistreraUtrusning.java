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
public class RegistreraUtrusning extends javax.swing.JFrame {
    
    //Klassens fält
    InfDB idb;
    String utrustningsTyp;
    int uID;

    /**
     * Creates new form RegistreraUtrusning
     */
    public RegistreraUtrusning(InfDB idb) {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTitel = new javax.swing.JLabel();
        jTFNamn = new javax.swing.JTextField();
        jBLaggTill = new javax.swing.JButton();
        jLabNamn = new javax.swing.JLabel();
        jRBKom = new javax.swing.JRadioButton();
        jRBTek = new javax.swing.JRadioButton();
        jRBVap = new javax.swing.JRadioButton();
        jLUtrust = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTitel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jTitel.setText("Registrera Utrustning");

        jBLaggTill.setText("Lägg till");
        jBLaggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLaggTillActionPerformed(evt);
            }
        });

        jLabNamn.setText("Namn på utrustningen ");

        buttonGroup1.add(jRBKom);
        jRBKom.setText("Kommunikation");

        buttonGroup1.add(jRBTek);
        jRBTek.setText("Teknik");

        buttonGroup1.add(jRBVap);
        jRBVap.setText("Vapen");

        jLUtrust.setText("Vad är det för typ av utrustning?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBLaggTill)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBVap)
                            .addComponent(jRBTek)
                            .addComponent(jRBKom)
                            .addComponent(jLabNamn)
                            .addComponent(jTFNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLUtrust)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jTitel)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jTitel)
                .addGap(34, 34, 34)
                .addComponent(jLabNamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLUtrust)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRBKom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRBTek)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRBVap)
                .addGap(18, 18, 18)
                .addComponent(jBLaggTill)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //När man trycker på Lägg till knappen
    private void jBLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLaggTillActionPerformed

        if (jTFNamn.getText() != null && buttonGroup1.isSelected(buttonGroup1.getSelection())) {
            //Kollar vilken radiobutton som är vald
            radioButtonCheck();
            setUID();

            laggTilliUtrustning(jTFNamn.getText());
            laggTillTyp();

            //Stänger ner fönstret när man gjort en registrering
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Fyll i både namn och typ");
        }

    }//GEN-LAST:event_jBLaggTillActionPerformed

    
    // Typ av utrusting Kontroll
    //Gör en kontroll på vilken radiobutton som är vald
    private void radioButtonCheck() {
        if (jRBKom.isSelected()) {
            utrustningsTyp = "Kommunikation";
        } else if (jRBTek.isSelected()) {
            utrustningsTyp = "Teknik";
        } else if (jRBVap.isSelected()) {
            utrustningsTyp = "Vapen";
        }

    }

    //Sätter ett unikt UtrustningsID för utrustningen
    private void setUID(){
        
        //Hämtar Utrustnings_ID
        try {

            uID = Integer.parseInt(idb.getAutoIncrement("Utrustning", "Utrustnings_ID"));

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel");
            System.out.println("Kunde inte hämta Utrustnings_ID" + e.getMessage());
        }
    }
    
    private void laggTilliUtrustning(String enBenamning) {

        //Lägger till utrustningen i databasen
        try{
            if (uID!= 0 && enBenamning != null) {
                String fraga = "INSERT INTO mibdb.utrustning (Utrustnings_ID, Benamning) VALUES (" + uID + ", '" + enBenamning + "')";
                idb.insert(fraga);
            }
        } catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel");
            System.out.println("Kunde inte lägga till en utrustning. Problem med Insert Into..." + e.getMessage());
            
        }
    
}
    //Lägger till utrustnignen i en typ av kategori
    private void laggTillTyp(){
        
        String typFraga = "";
        boolean running = true;
        
        while (running) {
            switch (utrustningsTyp) {
                case "Kommunikation" -> {
                    String valdOTek = getOverforingsTeknik();
                    typFraga = "INSERT INTO mibdb.kommunikation (Utrustnings_ID, Overforingsteknik) VALUES (" + uID + ", '" + valdOTek + "')";
                    running = false;

                }
                case "Teknik" -> {
                    String valdkraftkalla = getKrafkalla();
                    typFraga = "INSERT INTO mibdb.teknik (Utrustnings_ID, Kraftkalla) VALUES (" + uID + ", '" + valdkraftkalla + "')";
                    running = false;

                }
                case "Vapen" -> {
                    int kaliber = getKaliber();
                    typFraga = "INSERT INTO mibdb.vapen (Utrustnings_ID, kaliber) VALUES (" + uID + ", '" + kaliber + "')";
                    running = false;
                }
                default -> {
                    running = true;
                    
                    //man får möjligheten att ändra utrustningstyp om nått blivit fel
                    Object[] typArray = {"Teknik", "Vapen", "Kommunikation"};
                    utrustningsTyp = (String) JOptionPane.showInputDialog(null, "Välj vad du vill registrera:", "Välj...",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            typArray,
                            typArray[0]);
                }
            }
        }
        
        
        try{
            idb.insert(typFraga);
            
        } catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel med utrustningstypen");
            System.out.println("Kunde inte lägga till en typ. Problem med Insert Into..." + e.getMessage());
            
            
        }

    }
    
    
    
    
    
    //Hämtar den kraftkälla användaren matar in
    private String getKrafkalla(){
        String kraftkalla = JOptionPane.showInputDialog("Vad är kraftkällan för denna teknik?");
        
        return kraftkalla;
    }
    
    //Hämtar ifrån användaren den överföringsteknik som utrustningen har
    private String getOverforingsTeknik() {
        String oTek = JOptionPane.showInputDialog("Vad är det för överföringsteknik för detta kommunikationsredskap?");
        
        return oTek;
    }
    
    //Hämtar kaliber på det vapnet användaren lägger till 
    private int getKaliber(){
        String kaliber =JOptionPane.showInputDialog("vad har ditt vapen för kaliber. Mata en heltal");
        
        if(kaliber == null){
            kaliber = "0";
        }
        
        int kaliberInt = Integer.parseInt(kaliber);
        return kaliberInt; 
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBLaggTill;
    private javax.swing.JLabel jLUtrust;
    private javax.swing.JLabel jLabNamn;
    private javax.swing.JRadioButton jRBKom;
    private javax.swing.JRadioButton jRBTek;
    private javax.swing.JRadioButton jRBVap;
    private javax.swing.JTextField jTFNamn;
    private javax.swing.JLabel jTitel;
    // End of variables declaration//GEN-END:variables
}
