/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HogwartsProjekt;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Erik
 */
public class AdminTabortKurs extends javax.swing.JFrame {
 private static InfDB idb;
    
    /**
     * Creates new form AdminTabortLarare
     */
    public AdminTabortKurs() {
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

        PanelAdminTabortKurs = new javax.swing.JPanel();
        search = new javax.swing.JButton();
        txtkursnamn = new javax.swing.JTextField();
        lblkursnamn = new javax.swing.JLabel();
        lbltoptext = new javax.swing.JLabel();
        Tillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        search.setText("Sök");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        lblkursnamn.setText("Skriv in kursens namn");

        lbltoptext.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbltoptext.setText("Ta bort en kurs");

        javax.swing.GroupLayout PanelAdminTabortKursLayout = new javax.swing.GroupLayout(PanelAdminTabortKurs);
        PanelAdminTabortKurs.setLayout(PanelAdminTabortKursLayout);
        PanelAdminTabortKursLayout.setHorizontalGroup(
            PanelAdminTabortKursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAdminTabortKursLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAdminTabortKursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblkursnamn)
                    .addComponent(txtkursnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltoptext)
                    .addComponent(search))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        PanelAdminTabortKursLayout.setVerticalGroup(
            PanelAdminTabortKursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAdminTabortKursLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lbltoptext)
                .addGap(18, 18, 18)
                .addComponent(lblkursnamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtkursnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search)
                .addContainerGap(170, Short.MAX_VALUE))
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelAdminTabortKurs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tillbaka)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Tillbaka))
                    .addComponent(PanelAdminTabortKurs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        if (Validering.textNotEmpty(txtkursnamn)) {
            try {

                String kurs = txtkursnamn.getText();
                String kurssokning = idb.fetchSingle("select KURSNAMN from KURS where KURSNAMN ='" + kurs + "'");

                int YesOrNo = JOptionPane.showConfirmDialog(null, "Vill du ta bort " + kurssokning + "?");
                switch (YesOrNo) {
                    case 0:

                        idb.delete("DELETE FROM KURS where KURSNAMN= '" + kurs + "'");
                        JOptionPane.showMessageDialog(null, "Kursen har tagits bort!");

                        break;
                    case 1:
                        this.hide();
                        AdminMeny frm = new AdminMeny();
                        frm.setVisible(true);
                        break;
                    default:
                        System.exit(0);
                }
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, e);
                System.out.println("Internt felmeddelande" + e.getMessage());

            }
        }


    }//GEN-LAST:event_searchActionPerformed

    private void TillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TillbakaActionPerformed
        // TODO add your handling code here:
        this.hide();
        AdminMeny frm = new AdminMeny();
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
            java.util.logging.Logger.getLogger(AdminTabortKurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminTabortKurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminTabortKurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminTabortKurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminTabortKurs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAdminTabortKurs;
    private javax.swing.JButton Tillbaka;
    private javax.swing.JLabel lblkursnamn;
    private javax.swing.JLabel lbltoptext;
    private javax.swing.JButton search;
    private javax.swing.JTextField txtkursnamn;
    // End of variables declaration//GEN-END:variables
}
