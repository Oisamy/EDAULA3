/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.codigo43;

import javax.swing.JOptionPane;

/**
 *
 * @author samyr
 */
public class CODIGO43 {

    public static void main(String[] args) {
        float num, logaritmo;
        String s;
        
        s = JOptionPane.showInputDialog("ENTRE COM O LOGARITMO: ");
        num = Float.parseFloat (s);
        
        logaritmo = (float) (Math.log(num)/ Math.log(10));
        System.out.println("LOGARITMO: " +logaritmo);
        
    }
}
