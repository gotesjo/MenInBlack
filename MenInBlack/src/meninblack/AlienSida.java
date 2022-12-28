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
    private User user;

    /**
     * Creates new form AlienSida
     */
    public AlienSida(InfDB idb, User user) {
        initComponents();
        this.user = user;
        this.idb = idb;
        jLabel2.setText(user.getUsername());
        jLabel1.setText(user.getOmradeschef());

        

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
        jButAndraLosen = new javax.swing.JButton();
        jbutAlienNara = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelHead.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabelHead.setText("AlienSida");

        jButAndraLosen.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jButAndraLosen.setText("Ändra lösen");
        jButAndraLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAndraLosenActionPerformed(evt);
            }
        });

        jbutAlienNara.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jbutAlienNara.setText("Aliens i ditt område");
        jbutAlienNara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutAlienNaraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jLabel1.setText("Din områdeschef");

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbutAlienNara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButAndraLosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabelHead)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButAndraLosen))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelHead)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbutAlienNara)
                            .addComponent(jLabel1))
                        .addGap(72, 72, 72)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Tar dig till AndraLosen fönstret
    private void jButAndraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAndraLosenActionPerformed
       new AndraLosen(idb, user).setVisible(true);
    }//GEN-LAST:event_jButAndraLosenActionPerformed
    //Tar dig till AliensNara fönstret
    private void jbutAlienNaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutAlienNaraActionPerformed
        new AliensNara(idb, user).setVisible(true);
    }//GEN-LAST:event_jbutAlienNaraActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAndraLosen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelHead;
    private javax.swing.JButton jbutAlienNara;
    // End of variables declaration//GEN-END:variables
}
