/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_0407;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeverson Nery
 */
public class Java_0407 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null, "Informe um caractere");
        int it = texto.charAt(0);
        int num = ++it;
        
        char ch = (char)num;
        
        JOptionPane.showMessageDialog(null, ch);
    }
    
}
