package HogwartsProjekt;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.HashMap; 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erik
 */
public class ChangeElevInfo extends javax.swing.JFrame {
    private static InfDB idb;

    /**
     * Creates new form ChangeElevInfo
     */
    public ChangeElevInfo() {
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

        PanelChangeElevInfo = new javax.swing.JPanel();
        lbltoptext = new javax.swing.JLabel();
        lblelevid = new javax.swing.JLabel();
        lblandrainfo = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        txtelevid = new javax.swing.JTextField();
        txtnyttelevid = new javax.swing.JTextField();
        txtfornamn = new javax.swing.JTextField();
        txtefternamn = new javax.swing.JTextField();
        txtsovsal = new javax.swing.JTextField();
        lblnyttelevid = new javax.swing.JLabel();
        lblfornamn = new javax.swing.JLabel();
        lblefternamn = new javax.swing.JLabel();
        lblsovsal = new javax.swing.JLabel();
        andra = new javax.swing.JButton();
        tillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltoptext.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbltoptext.setText("Ändra information för en elev");

        lblelevid.setText(" Skriv in elev ID");

        lblandrainfo.setText("Ändra information");

        Search.setText("SÖK");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        lblnyttelevid.setText("Elev ID");

        lblfornamn.setText("Förnamn");

        lblefternamn.setText("Efternamn");

        lblsovsal.setText("Sovsal");

        andra.setText("Ändra");
        andra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraActionPerformed(evt);
            }
        });

        tillbaka.setText("Tillbaka");
        tillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelChangeElevInfoLayout = new javax.swing.GroupLayout(PanelChangeElevInfo);
        PanelChangeElevInfo.setLayout(PanelChangeElevInfoLayout);
        PanelChangeElevInfoLayout.setHorizontalGroup(
            PanelChangeElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChangeElevInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelChangeElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblandrainfo)
                    .addComponent(Search)
                    .addComponent(lblelevid)
                    .addComponent(txtelevid, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelChangeElevInfoLayout.createSequentialGroup()
                        .addGroup(PanelChangeElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbltoptext, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelChangeElevInfoLayout.createSequentialGroup()
                                .addGroup(PanelChangeElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnyttelevid)
                                    .addComponent(lblfornamn)
                                    .addComponent(lblefternamn)
                                    .addComponent(lblsovsal))
                                .addGap(21, 21, 21)
                                .addGroup(PanelChangeElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtfornamn, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(txtnyttelevid, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsovsal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtefternamn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(andra)))
                        .addGap(18, 18, 18)
                        .addComponent(tillbaka)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        PanelChangeElevInfoLayout.setVerticalGroup(
            PanelChangeElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChangeElevInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltoptext)
                .addGap(37, 37, 37)
                .addComponent(lblelevid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtelevid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Search)
                .addGap(21, 21, 21)
                .addComponent(lblandrainfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelChangeElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnyttelevid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnyttelevid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelChangeElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfornamn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelChangeElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtefternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblefternamn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelChangeElevInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsovsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsovsal)
                    .addComponent(andra)
                    .addComponent(tillbaka))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelChangeElevInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelChangeElevInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        if (Validering.textNotEmpty(txtelevid)) {
            try {
                String id = txtelevid.getText();
                String idSearch = idb.fetchSingle("select fornamn from ELEV where ELEV_ID ='" + id + "'");

                JOptionPane.showMessageDialog(null, "Följande elev hittades: " + idSearch + " !");

                txtfornamn.setText(idSearch);
                String Efternamn = idb.fetchSingle("select efternamn from ELEV where ELEV_ID ='" + id + "'");
                txtefternamn.setText(Efternamn);
                String ElevID = idb.fetchSingle("select ELEV_ID from ELEV where ELEV_ID ='" + id + "'");
                txtnyttelevid.setText(ElevID);
                String Sovsal = idb.fetchSingle("select Sovsal from ELEV where ELEV_ID ='" + id + "'");
                txtsovsal.setText(Sovsal);

            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, e);
                System.out.println("Internt felmeddelande" + e.getMessage());
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void andraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraActionPerformed

        if (Validering.textNotEmpty(txtelevid)) {
            try {
                String id = txtelevid.getText();

                String NyttFornamn = txtfornamn.getText();
                idb.update("UPDATE ELEV SET ELEV_ID = '" + NyttFornamn + "' where ELEV_ID ='" + id + "'");

                JOptionPane.showMessageDialog(null, "Eleven " + id + " har ändras till: " + NyttFornamn + " !");

            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, e);
                System.out.println("Internt felmeddelande" + e.getMessage());

            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_andraActionPerformed

    private void tillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tillbakaActionPerformed
        this.hide();
        LarareMeny frm = new LarareMeny();
        frm.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_tillbakaActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeElevInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeElevInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeElevInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeElevInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeElevInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelChangeElevInfo;
    private javax.swing.JButton Search;
    private javax.swing.JButton andra;
    private javax.swing.JLabel lblandrainfo;
    private javax.swing.JLabel lblefternamn;
    private javax.swing.JLabel lblelevid;
    private javax.swing.JLabel lblfornamn;
    private javax.swing.JLabel lblnyttelevid;
    private javax.swing.JLabel lblsovsal;
    private javax.swing.JLabel lbltoptext;
    private javax.swing.JButton tillbaka;
    private javax.swing.JTextField txtefternamn;
    private javax.swing.JTextField txtelevid;
    private javax.swing.JTextField txtfornamn;
    private javax.swing.JTextField txtnyttelevid;
    private javax.swing.JTextField txtsovsal;
    // End of variables declaration//GEN-END:variables
}