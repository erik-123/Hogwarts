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
public class KursBetygSokning extends javax.swing.JFrame {
      private static InfDB idb;

    /**
     * Creates new form KursBetygSokning
     */
    public KursBetygSokning() {
        initComponents();
        
            try{
     idb = new InfDB("C://db//HOGDB.FDB");
        }
        catch(InfException e){
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

        PanelKursBetygSokning = new javax.swing.JPanel();
        lblkursnamn = new javax.swing.JLabel();
        txtkursnamn = new javax.swing.JTextField();
        sok = new javax.swing.JButton();
        lbltoptext = new javax.swing.JLabel();
        txtfornamn = new javax.swing.JTextField();
        lblfornamn = new javax.swing.JLabel();
        Tillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblkursnamn.setText("Skriv in kursens namn");

        sok.setText("Sök");
        sok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sokActionPerformed(evt);
            }
        });

        lbltoptext.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbltoptext.setText("Sökning efter kursbetyg");

        lblfornamn.setText("Ditt förnamn");

        Tillbaka.setText("Tillbaka");
        Tillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelKursBetygSokningLayout = new javax.swing.GroupLayout(PanelKursBetygSokning);
        PanelKursBetygSokning.setLayout(PanelKursBetygSokningLayout);
        PanelKursBetygSokningLayout.setHorizontalGroup(
            PanelKursBetygSokningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKursBetygSokningLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelKursBetygSokningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sok)
                    .addComponent(lbltoptext)
                    .addComponent(txtkursnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfornamn)
                    .addComponent(lblkursnamn)
                    .addComponent(txtfornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelKursBetygSokningLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tillbaka)
                .addContainerGap())
        );
        PanelKursBetygSokningLayout.setVerticalGroup(
            PanelKursBetygSokningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKursBetygSokningLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltoptext)
                .addGap(24, 24, 24)
                .addComponent(lblfornamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblkursnamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtkursnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(Tillbaka)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelKursBetygSokning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelKursBetygSokning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sokActionPerformed
        // TODO add your handling code here:
if(Validering.textNotEmpty(txtkursnamn))         
try{
String kurs = txtkursnamn.getText();
String namn = txtfornamn.getText();


String namnsokning = idb.fetchSingle("SELECT ELEV.FORNAMN FROM HAR_BETYG_I Join ELEV On ELEV.ELEV_ID = HAR_BETYG_I.ELEV_ID Where FORNAMN = '"+namn+"'");

 
String betygssokning = idb.fetchSingle("SELECT HAR_BETYG_I.Kursbetyg, KURS.KURSNAMN FROM HAR_BETYG_I Join KURS On KURS.KURS_ID = HAR_BETYG_I.KURS_ID Where KURSNAMN = '"+kurs+"'");
    
    
  
     JOptionPane.showMessageDialog(null, " "+namnsokning+" har betyget "+betygssokning+" i kursen "+kurs+"");
    
    //JOptionPane.showMessageDialog(null, "Ditt namn eller din kurs kunde inte hittas, vänligen försök igen");  
    
}
catch(InfException e)
{
    JOptionPane.showMessageDialog(null, "Något gick visst fel");   
    System.out.println("Internt felmeddelande" + e.getMessage());
}
         
   
   
        
        
    }//GEN-LAST:event_sokActionPerformed

    private void TillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TillbakaActionPerformed
        // TODO add your handling code here:
this.hide();
ElevHuvudMeny frm = new ElevHuvudMeny();
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
            java.util.logging.Logger.getLogger(KursBetygSokning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KursBetygSokning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KursBetygSokning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KursBetygSokning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KursBetygSokning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelKursBetygSokning;
    private javax.swing.JButton Tillbaka;
    private javax.swing.JLabel lblfornamn;
    private javax.swing.JLabel lblkursnamn;
    private javax.swing.JLabel lbltoptext;
    private javax.swing.JButton sok;
    private javax.swing.JTextField txtfornamn;
    private javax.swing.JTextField txtkursnamn;
    // End of variables declaration//GEN-END:variables
}
