//Created by 21343033_Nicholas Ryan Jonathan
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Tugas1bJS6 {
    public static void main(String[] args) {
        String a = "", b = "", c = "";
        float nilai1, nilai2, nilai3, rerata;
        
        a = JOptionPane.showInputDialog("Masukkan nilai 1: ");
        nilai1 = Float.parseFloat(a);
        b = JOptionPane.showInputDialog("Masukkan nilai 2: ");
        nilai2 = Float.parseFloat(b);
        c = JOptionPane.showInputDialog("Masukkan nilai 3: ");
        nilai3 = Float.parseFloat(c);
        
        rerata = (nilai1 + nilai2 + nilai3)/3;
        
        if((rerata >= 60) && (rerata <= 100)){
            String msg = "Rata-rata nilai : "+ rerata +" :-)";
            
            JOptionPane.showMessageDialog(null, msg);
        
            System.out.println("Rata-rata nilai : "+ rerata +" :-)");
        }
        else {
            String msg = "Rata-rata nilai : "+ rerata +" :-(";
            
            JOptionPane.showMessageDialog(null, msg);
        
            System.out.println("Rata-rata nilai : "+ rerata +" :-(");
        }
    }
}