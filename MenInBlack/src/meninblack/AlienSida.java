/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package meninblack;

import oru.inf.InfDB;





/**
 *
 * @author luddelandstrom
 */
public class AlienSida extends javax.swing.JFrame {

    //Fält för klassen AlienSida.
    private InfDB idb;

    /**
     * Creates new form AlienSida
     */
    public AlienSida(InfDB idb) {
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

        jLabelHead = new javax.swing.JLabel();
        AndraLosen = new javax.swing.JButton();
        AlienNara = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelHead.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabelHead.setText("AlienSida");

        AndraLosen.setText("Ändra lösen");
        AndraLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AndraLosenActionPerformed(evt);
            }
        });

        AlienNara.setText("Aliens i ditt område");
        AlienNara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlienNaraActionPerformed(evt);
            }
        });

        jLabel1.setText("Din områdeschef");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabelHead))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AlienNara)
                            .addComponent(AndraLosen)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelHead)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(AlienNara)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AndraLosen)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Tar dig till AndraLosen fönstret
    private void AndraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AndraLosenActionPerformed
       new AndraLosen(idb).setVisible(true);
    }//GEN-LAST:event_AndraLosenActionPerformed
    //Tar dig till AliensNara fönstret
    private void AlienNaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlienNaraActionPerformed
        new AliensNara(idb).setVisible(true);
    }//GEN-LAST:event_AlienNaraActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlienNara;
    private javax.swing.JButton AndraLosen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelHead;
    // End of variables declaration//GEN-END:variables
}
