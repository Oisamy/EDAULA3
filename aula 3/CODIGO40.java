/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.codigo40;

import javax.swing.JOptionPane;

/**
 *
 * @author samyr
 */
public class CODIGO40 {

    public static void main(String[] args) {
        float quoc, rest, val1, val2;
        String s;
        
        s = JOptionPane.showInputDialog ("entre com o dividendo: ");
        val1 = Float.parseFloat(s);
        
        s = JOptionPane.showInputDialog ("entre com o valor do divisor: ");
        val2 = Float.parseFloat (s);
        
        quoc = val1 / val2;
        rest = val1 % 2;
        
        System.out.println("DIVIDENDO:.." +val1);
        System.out.println("DIVISOR:.." +val2);
        System.out.println("QUOCIENTE:.." +quoc);
        System.out.println("RESTO:.." +rest);
        
    }
}
