/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package meninblack;

import static java.awt.image.ImageObserver.HEIGHT;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author emanuelgotesjo
 */
public class RegistreraFordon extends javax.swing.JFrame {
    
    //Klassens fält
    InfDB idb;

    /**
     * Creates new form RegistreraFordon
     */
    public RegistreraFordon(InfDB idb) {  
             
        initComponents();
        
       this.idb = idb;
       fyllComboBoxen();
                
                
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        jLTitel = new javax.swing.JLabel();
        jTFordonID = new javax.swing.JTextField();
        jTBeskrivning = new javax.swing.JTextField();
        jComBYear = new javax.swing.JComboBox<>();
        jLarsModell = new javax.swing.JLabel();
        jBLaggTill = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTFDate = new javax.swing.JTextField();
        jBDate = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        dateChooser1.setDateFormat("yyyy-MM-dd");
        dateChooser1.setTextRefernce(jTFDate);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLTitel.setText("Registrera Fordon");

        jTFordonID.setText("Fordons ID");
        jTFordonID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTFordonIDMousePressed(evt);
            }
        });

        jTBeskrivning.setText("Fordonsbeskrivning");
        jTBeskrivning.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTBeskrivningMousePressed(evt);
            }
        });
        jTBeskrivning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBeskrivningActionPerformed(evt);
            }
        });

        jComBYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComBYearActionPerformed(evt);
            }
        });

        jLarsModell.setText("Årsmodell");

        jBLaggTill.setText("Lägg till");
        jBLaggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLaggTillActionPerformed(evt);
            }
        });

        jLabel1.setText("Registreringsdatum");

        jBDate.setText("Idag...");
        jBDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComBYear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTBeskrivning)
                    .addComponent(jTFordonID)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLTitel)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLarsModell)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTFDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBDate))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jBLaggTill)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLTitel)
                .addGap(18, 18, 18)
                .addComponent(jTFordonID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTBeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLarsModell)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComBYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDate)
                    .addComponent(jTFDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jBLaggTill)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComBYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComBYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComBYearActionPerformed

    // Tömmer FordonsID första gången man ska börja skriva
    private void jTFordonIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFordonIDMousePressed

        if (jTFordonID.getText().equals("Fordons ID")) {
            jTFordonID.setText("");
        }
    }//GEN-LAST:event_jTFordonIDMousePressed

    // Tömmer Beskrivningsrutan första gången man ska börja skriva
    private void jTBeskrivningMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBeskrivningMousePressed

        if (jTBeskrivning.getText().equals("Fordonsbeskrivning")) {
            jTBeskrivning.setText("");
        }
    }//GEN-LAST:event_jTBeskrivningMousePressed

    private void jTBeskrivningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBeskrivningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBeskrivningActionPerformed

    //Lägger till ett fordon i registret
    private void jBLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLaggTillActionPerformed
     
     String fID = jTFordonID.getText();
     String fbenmn = jTBeskrivning.getText();
     int arsmodell = Integer.parseInt(jComBYear.getSelectedItem().toString());
     String regDate = jTFDate.getText();
     boolean running = true;
     
     
        // Checka så att ID är ifyllt och korrekt
        while (running) {
            if (fID == null || fID.length() > 6) {
                fID = JOptionPane.showInputDialog(null, "Du behöver ange ett fordons ID\nFår max vara 6 tecken och måste vara  unik!", "Välj ett godkänt ID", HEIGHT);
                
            } else{
                running = false;
            }
        }
     
     
     
     //Formulerar SQL fråga
     String sqlFraga = "INSERT INTO mibdb.fordon (Fordons_ID, Fordonsbeskrivning, Registreringsdatum, Arsmodell) VALUES ('"+fID+"', '"+fbenmn+"', '"+regDate+"', "+arsmodell+")";
        
     //Försöker lägga till fordonet i databasen innehållande de lokala variabler som hämtat data ifrån användarfönstret.
     try{
        idb.insert(sqlFraga);
                
     } catch(InfException e) {
        javax.swing.JOptionPane.showMessageDialog(null, "Problem med databasen. Kunde inte lägga till fordon");
        System.out.println("Kunde inte lägga till fordon" + e.getMessage());
     }
     
     //Stänger ner fönstret när ett fordon har lagts till
        dispose();
    }//GEN-LAST:event_jBLaggTillActionPerformed

    
    //Knappen för att sätta datumet till dagens datum
    private void jBDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDateActionPerformed

        dateChooser1.toDay();
        
    }//GEN-LAST:event_jBDateActionPerformed

    //Fyller komboboxen med årtal från 1950 fram till idag
    private void  fyllComboBoxen(){
        
        //Skapar en arrayList innehållande alla årtal
        ArrayList<String> years_tmp = new ArrayList<>();
        for(int years = 1950; years<=Calendar.getInstance().get(Calendar.YEAR); years++) {
        years_tmp.add(years+""); 
        }
        
        //Lägger till åren i comboboxen
        for(String aYear : years_tmp) {
            jComBYear.addItem(aYear);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JButton jBDate;
    private javax.swing.JButton jBLaggTill;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComBYear;
    private javax.swing.JLabel jLTitel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLarsModell;
    private javax.swing.JTextField jTBeskrivning;
    private javax.swing.JTextField jTFDate;
    private javax.swing.JTextField jTFordonID;
    // End of variables declaration//GEN-END:variables
}
