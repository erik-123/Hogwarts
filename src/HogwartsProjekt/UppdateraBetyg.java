/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HogwartsProjekt;

import HogwartsProjekt.Validering;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;


/**
 *
 * @author Dator
 */
public class UppdateraBetyg extends javax.swing.JFrame {
    private InfDB idb;

    /**
     * Creates new form UppdateraBetyg2
     */
    public UppdateraBetyg() {
        initComponents();
        try {
            idb = new InfDB("C://db//HOGDB.FDB");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick visst fel");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Search = new javax.swing.JButton();
        Uppdatera = new javax.swing.JButton();
        txtelevid = new javax.swing.JTextField();
        txtnamn = new javax.swing.JTextField();
        txtbetyg = new javax.swing.JTextField();
        lblelevid = new javax.swing.JLabel();
        lblelevnamn = new javax.swing.JLabel();
        lblbetyg = new javax.swing.JLabel();
        Tillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Search.setText("Sök");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Uppdatera.setText("Uppdatera");
        Uppdatera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UppdateraActionPerformed(evt);
            }
        });

        lblelevid.setText("ElevID");

        lblelevnamn.setText("Elevnamn");

        lblbetyg.setText("Betyg");

        Tillbaka.setText("Tillbaka");
        Tillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblbetyg)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblelevid)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtbetyg, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                        .addComponent(txtelevid)
                                        .addComponent(txtnamn))
                                    .addComponent(lblelevnamn))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Search)
                                    .addComponent(Uppdatera))))
                        .addContainerGap(185, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tillbaka)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblelevid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtelevid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search))
                .addGap(18, 18, 18)
                .addComponent(lblelevnamn)
                .addGap(7, 7, 7)
                .addComponent(txtnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(lblbetyg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Uppdatera)
                    .addComponent(txtbetyg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(Tillbaka)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        if (Validering.textNotEmpty(txtelevid)) {
            try {
                String elevID = txtelevid.getText();
                HashMap<String, String> idSearch = idb.fetchRow("select fornamn, efternamn from ELEV where ELEV_ID ='" + elevID + "'");
                String namn = idSearch.get("FORNAMN") + " " + idSearch.get("EFTERNAMN");

                txtnamn.setText(namn);
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, e);
                System.out.println("Internt felmeddelande" + e.getMessage());
            }
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void UppdateraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UppdateraActionPerformed
        if (Validering.textNotEmpty(txtbetyg)) {
            try {

                String idSearch = txtelevid.getText();
                String nyttBetyg = txtbetyg.getText();
                idb.update("UPDATE HAR_BETYG_I SET KURSBETYG = '" + nyttBetyg + "' where ELEV_ID = '" + idSearch + "' ");

                JOptionPane.showMessageDialog(null, "Följande betyg " + nyttBetyg + " lades till för elevID : " + idSearch + " !");
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, e);
                System.out.println("Internt felmeddelande" + e.getMessage());
            }
        }

    }//GEN-LAST:event_UppdateraActionPerformed

    private void TillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TillbakaActionPerformed
        // TODO add your handling code here:
        this.hide();
        LarareMeny frm = new LarareMeny();
        frm.setVisible(true);

    }//GEN-LAST:event_TillbakaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UppdateraBetyg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UppdateraBetyg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UppdateraBetyg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UppdateraBetyg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UppdateraBetyg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Search;
    private javax.swing.JButton Tillbaka;
    private javax.swing.JButton Uppdatera;
    private javax.swing.JLabel lblbetyg;
    private javax.swing.JLabel lblelevid;
    private javax.swing.JLabel lblelevnamn;
    private javax.swing.JTextField txtbetyg;
    private javax.swing.JTextField txtelevid;
    private javax.swing.JTextField txtnamn;
    // End of variables declaration//GEN-END:variables
}
