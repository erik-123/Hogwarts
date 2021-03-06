/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HogwartsProjekt;

import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Jerka
 */
public class registeraNyttKursbetyg extends javax.swing.JFrame {

    private static InfDB idb;

    /**
     * Creates new form registeraNyttKursbetyg
     */
    public registeraNyttKursbetyg() {
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

        PanelRegNyttKursbetyg = new javax.swing.JPanel();
        txtelevID = new javax.swing.JTextField();
        txtelevl = new javax.swing.JTextField();
        txtbetyg = new javax.swing.JTextField();
        txtkursid = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        lbltoptext = new javax.swing.JLabel();
        lblelevid = new javax.swing.JLabel();
        lblelev = new javax.swing.JLabel();
        lblangebetyg = new javax.swing.JLabel();
        lblkursid = new javax.swing.JLabel();
        Tillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Search.setText("SÖK");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Add.setText("Lägg till");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        lbltoptext.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbltoptext.setText("Registrera nytt kursbetyg");

        lblelevid.setText("Ange ELEV ID");

        lblelev.setText("Elev");

        lblangebetyg.setText("Ange Betyg");

        lblkursid.setText("Ange KursID");

        Tillbaka.setText("Tilllbaka");
        Tillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelRegNyttKursbetygLayout = new javax.swing.GroupLayout(PanelRegNyttKursbetyg);
        PanelRegNyttKursbetyg.setLayout(PanelRegNyttKursbetygLayout);
        PanelRegNyttKursbetygLayout.setHorizontalGroup(
            PanelRegNyttKursbetygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegNyttKursbetygLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tillbaka))
            .addGroup(PanelRegNyttKursbetygLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PanelRegNyttKursbetygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Add)
                    .addComponent(lblangebetyg)
                    .addComponent(txtbetyg, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblkursid)
                    .addComponent(txtkursid, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltoptext)
                    .addGroup(PanelRegNyttKursbetygLayout.createSequentialGroup()
                        .addGroup(PanelRegNyttKursbetygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelRegNyttKursbetygLayout.createSequentialGroup()
                                .addComponent(txtelevID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Search))
                            .addComponent(lblelevid))
                        .addGap(18, 18, 18)
                        .addGroup(PanelRegNyttKursbetygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblelev)
                            .addComponent(txtelevl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 82, Short.MAX_VALUE))
        );
        PanelRegNyttKursbetygLayout.setVerticalGroup(
            PanelRegNyttKursbetygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegNyttKursbetygLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lbltoptext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRegNyttKursbetygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblelevid)
                    .addComponent(lblelev))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRegNyttKursbetygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtelevID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search)
                    .addComponent(txtelevl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblangebetyg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbetyg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lblkursid)
                .addGap(18, 18, 18)
                .addComponent(txtkursid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Add)
                .addGap(23, 23, 23)
                .addComponent(Tillbaka)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelRegNyttKursbetyg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegNyttKursbetyg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        if (Validering.textNotEmpty(txtelevID)) {
            try {
                String elevID = txtelevID.getText();
                HashMap<String, String> idSearch = idb.fetchRow("select fornamn, efternamn from ELEV where ELEV_ID ='" + elevID + "'");
                String namn = idSearch.get("FORNAMN") + " " + idSearch.get("EFTERNAMN");

                txtelevl.setText(namn);
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, e);
                System.out.println("Internt felmeddelande" + e.getMessage());
            }
        }

    }//GEN-LAST:event_SearchActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        if (Validering.textNotEmpty(txtbetyg)) {
            if (Validering.textNotEmpty(txtelevID)) {
                if (Validering.textNotEmpty(txtkursid)) {
                    
                   
                    try {

                        String elevID = txtelevID.getText();
                        String betyget = txtbetyg.getText();
                        String kursID = txtkursid.getText();
                        String kurssokning = idb.fetchSingle("select KURS_ID from HAR_BETYG_I where KURS_ID ='"+kursID+"' ");
                                                                   
                                                 
                        
                        if(kurssokning !=(null))
                        {
                        idb.insert("INSERT INTO HAR_BETYG_I(KURS_ID, KURSBETYG, ELEV_ID) VALUES('" + kursID + "','" + betyget + "','" + elevID + "')");    
                        JOptionPane.showMessageDialog(null, "Betyg : " + betyget + " lades till för kursID : " + kursID + " för ElevID : " + elevID + "!");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Ingen kurs med KURS_ID = " + kursID + " finns! \n Vänligen ange ett annat KURS_ID!");
                        }
                    } catch (InfException e) {
                        JOptionPane.showMessageDialog(null, "Denna elev har redan ett betyg registrerat på kursen som du har angett! \n Vänligen ange en annan elev eller ett annat ELEV_ID!");
                        System.out.println("Internt felmeddelande" + e.getMessage());
                    }
                }
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_AddActionPerformed

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
            java.util.logging.Logger.getLogger(registeraNyttKursbetyg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registeraNyttKursbetyg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registeraNyttKursbetyg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registeraNyttKursbetyg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registeraNyttKursbetyg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JPanel PanelRegNyttKursbetyg;
    private javax.swing.JButton Search;
    private javax.swing.JButton Tillbaka;
    private javax.swing.JLabel lblangebetyg;
    private javax.swing.JLabel lblelev;
    private javax.swing.JLabel lblelevid;
    private javax.swing.JLabel lblkursid;
    private javax.swing.JLabel lbltoptext;
    private javax.swing.JTextField txtbetyg;
    private javax.swing.JTextField txtelevID;
    private javax.swing.JTextField txtelevl;
    private javax.swing.JTextField txtkursid;
    // End of variables declaration//GEN-END:variables
}
