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
 * @author Dator
 */
public class AdminChangeElevhemsPrefekt extends javax.swing.JFrame {
private static InfDB idb;
    /**
     * Creates new form andraElevhemsPrefekt
     */
    public AdminChangeElevhemsPrefekt() {
        initComponents();
        try{
     idb = new InfDB("C://db//HOGDB.FDB"); //hämtar databasen HOGDB.FDB och namnger med ett variabelnamnet InfDB
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick visst fel"); //Felmedellande 
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

        lblTopText = new javax.swing.JLabel();
        txtAngePrefekt = new javax.swing.JTextField();
        lblAndraPerfektID = new javax.swing.JLabel();
        btnAndra = new javax.swing.JButton();
        txtAngeNyPrefekt = new javax.swing.JTextField();
        lblNyttPrefektID = new javax.swing.JLabel();
        Tillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTopText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTopText.setText("Ändra elevhemsprefekt");

        lblAndraPerfektID.setText("Ändringen gäller för prefekt ID:");

        btnAndra.setText("Ändra");
        btnAndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraActionPerformed(evt);
            }
        });

        lblNyttPrefektID.setText("Skriv in ny prefekt ID");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAndraPerfektID)
                                    .addComponent(txtAngePrefekt, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAndra))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAngeNyPrefekt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNyttPrefektID)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTopText)))
                        .addGap(0, 73, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Tillbaka)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTopText)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAndraPerfektID)
                    .addComponent(lblNyttPrefektID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAngePrefekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAngeNyPrefekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAndra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(Tillbaka)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraActionPerformed
        if(Validering.textNotEmpty(txtAngePrefekt)) // Kontrollerar att textfälten är tomma.
        if(Validering.textNotEmpty(txtAngeNyPrefekt))
        try {
        String gammaltID = txtAngePrefekt.getText();
        String nyttID = txtAngeNyPrefekt.getText();
        
        idb.update("UPDATE ELEVHEM SET PREFEKT = '"+nyttID+"' where PREFEKT ='"+gammaltID+"'");  // Uppdaterar prefekt.
     JOptionPane.showMessageDialog(null, "Ny prefekt är prefektID : "+nyttID+" !"); // Informerar om ny prefekt. 
     
     
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick visst fel");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }//GEN-LAST:event_btnAndraActionPerformed

    private void TillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TillbakaActionPerformed
        // TODO add your handling code here:
this.hide();
AdminMeny frm = new AdminMeny();
frm.setVisible(true);          // Gör Adminmeny synlig.
        
        
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
            java.util.logging.Logger.getLogger(AdminChangeElevhemsPrefekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminChangeElevhemsPrefekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminChangeElevhemsPrefekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminChangeElevhemsPrefekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminChangeElevhemsPrefekt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tillbaka;
    private javax.swing.JButton btnAndra;
    private javax.swing.JLabel lblAndraPerfektID;
    private javax.swing.JLabel lblNyttPrefektID;
    private javax.swing.JLabel lblTopText;
    private javax.swing.JTextField txtAngeNyPrefekt;
    private javax.swing.JTextField txtAngePrefekt;
    // End of variables declaration//GEN-END:variables
}
