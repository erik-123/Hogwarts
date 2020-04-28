package HogwartsProjekt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.util.Arrays;
import oru.inf.InfDB;
import oru.inf.InfException;
 
/**
 *
 * @author Erik
 */
public class InloggningLarare extends javax.swing.JFrame {
       private static InfDB idb;
// create new object
JPasswordField passwordField = new JPasswordField(20);
  
// get the password
char[] password = passwordField.getPassword();


    /**
     * Creates new form InloggningLarare
     */
    public InloggningLarare() {
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

        PanelInloggningLarare = new javax.swing.JPanel();
        Toptext = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        lblAnvandare = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        OK = new javax.swing.JButton();
        Changepassword = new javax.swing.JButton();
        AdminLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Toptext.setText("Logga in här för att kunna fortsätta");

        lblAnvandare.setText("Användarenamn/Förnamn");

        lblLosenord.setText("Lösenord");

        OK.setText("Ok");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        Changepassword.setText("Ändra mitt lösenord");
        Changepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangepasswordActionPerformed(evt);
            }
        });

        AdminLogin.setText("Administratörsinloggning");
        AdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelInloggningLarareLayout = new javax.swing.GroupLayout(PanelInloggningLarare);
        PanelInloggningLarare.setLayout(PanelInloggningLarareLayout);
        PanelInloggningLarareLayout.setHorizontalGroup(
            PanelInloggningLarareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInloggningLarareLayout.createSequentialGroup()
                .addGroup(PanelInloggningLarareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInloggningLarareLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(Toptext, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelInloggningLarareLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(PanelInloggningLarareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelInloggningLarareLayout.createSequentialGroup()
                                .addComponent(Changepassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                                .addComponent(OK))
                            .addGroup(PanelInloggningLarareLayout.createSequentialGroup()
                                .addGroup(PanelInloggningLarareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAnvandare)
                                    .addComponent(lblLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelInloggningLarareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(username))))))
                .addGap(109, 109, 109))
            .addGroup(PanelInloggningLarareLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(AdminLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelInloggningLarareLayout.setVerticalGroup(
            PanelInloggningLarareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInloggningLarareLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Toptext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelInloggningLarareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnvandare))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelInloggningLarareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLosenord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInloggningLarareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OK)
                    .addComponent(Changepassword))
                .addGap(51, 51, 51)
                .addComponent(AdminLogin)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelInloggningLarare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelInloggningLarare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
   if(Validering.textNotEmpty(PasswordField)) 
        try{
       //förnamn används som användarenamn
      String passwordinput = String.valueOf(PasswordField.getPassword());
      String fornamn = idb.fetchSingle("select FORNAMN from LARARE where FORNAMN = '"+username.getText()+"'");
      String passwordfetch = idb.fetchSingle("Select LOSENORD from LARARE where LOSENORD ='"+passwordinput+"'"); 
      
       JOptionPane.showMessageDialog(null,"Användaren : "+fornamn+" hittades");
        
                     
            
          if(fornamn.equals(username.getText())&&passwordfetch.equals(passwordinput))
           
            {
                
                JOptionPane.showMessageDialog(null,"Du har loggats in!");
                new LarareMeny().setVisible(true);
                this.setVisible(false);  
            }
            else
                JOptionPane.showMessageDialog(null,"Felaktigt Lösenord, lösenordet kunde inte hittas "+passwordfetch+" ");
            
        }
        catch(InfException e){
            System.out.println(e.getMessage());
        }    	

    }//GEN-LAST:event_OKActionPerformed

    private void ChangepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangepasswordActionPerformed
        new ChangePassword().setVisible(true);
        this.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_ChangepasswordActionPerformed

    private void AdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginActionPerformed
        // TODO add your handling code here:
        new AdminLogin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AdminLoginActionPerformed
	

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
            java.util.logging.Logger.getLogger(InloggningLarare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InloggningLarare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InloggningLarare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InloggningLarare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InloggningLarare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminLogin;
    private javax.swing.JButton Changepassword;
    private javax.swing.JButton OK;
    private javax.swing.JPanel PanelInloggningLarare;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel Toptext;
    private javax.swing.JLabel lblAnvandare;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}