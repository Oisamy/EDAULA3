/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.codigo41;

import javax.swing.JOptionPane;

/**
 *
 * @author samyr
 */
public class CODIGO41 {

    public static void main(String[] args) {
        int a, b, c, d, mp;
        String s;
        
        s = JOptionPane.showInputDialog ("ENTRE COM 1 NUMERO: ");
        a = (int) Float.parseFloat(s);
        
        s = JOptionPane.showInputDialog("ENTRE COM 2 NUMERO: ");
        b = (int) Float.parseFloat(s);
        
        s = JOptionPane.showInputDialog("ENTRE COM 3 NUMERO: ");
        c = (int) Float.parseFloat(s);
        
        s = JOptionPane.showInputDialog("ENTRE COM 4 NUMERO: ");
        d = (int) Float.parseFloat(s);
        
        mp = (a*1 + b*2 + c*3 + d*4)/10;
        System.out.println("MEDIA EMPONDERADA: " +mp);
    }
}
