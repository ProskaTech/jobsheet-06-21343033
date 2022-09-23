//Created by 21343033_Nicholas Ryan Jonathan
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author User
 */
public class Tugas1aJS6 {
    public static void main(String[] args) {
       BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
       
       String a, b, c;
       float nilai1, nilai2, nilai3, rerata;
       
       try {
           System.out.print("Masukkan nilai 1 : ");
           a = dataIn.readLine();
           nilai1 = Float.parseFloat(a);
           System.out.print("Masukkan nilai 2 : ");
           b = dataIn.readLine();
           nilai2 = Float.parseFloat(b);
           System.out.print("Masukkan nilai 3 : ");
           c = dataIn.readLine();
           nilai3 = Float.parseFloat(c);
           
           rerata = (nilai1 + nilai2 + nilai3)/3;
           
           if((rerata >= 60) && (rerata <= 100)){
               System.out.println("Rata-rata nilai : " + rerata + " :-)");
           }
           else {
               System.out.println("Rata-rata nilai : " + rerata + " :-(");
           }
       }
       
       catch (IOException e) {
           System.out.println("gagal membaca keyboard");
       }
    }
}
