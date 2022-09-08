/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.codigo46;

import javax.swing.JOptionPane;

/**
 *
 * @author samyr
 */
public class CODIGO46 {

    public static void main(String[] args) {
        double saldo, nsaldo;
        String s;
        
        s = JOptionPane.showInputDialog("INFORME O SALDO:");
        saldo = Double.parseDouble(s);
        
        nsaldo = saldo * 1.01;
        System.out.println("O novo saldo:.. " +nsaldo);
        
        
    }
}
