/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HogwartsProjekt;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author jpn
 */
public class Validering {
    // en statisk metod (en s.k. klassmetod) för att kontrollera textfält
    static public boolean textNotEmpty(JTextField tf) {
        if (tf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Textfältet tomt!");
            tf.requestFocus(); // Sätter fokus vid fel
            return false;
        } else {
            return true;
        }
    }    
}

/**
 *
 * @author Jerka
 */

    

