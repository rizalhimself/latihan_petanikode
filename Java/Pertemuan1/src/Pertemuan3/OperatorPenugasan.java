/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author rizalhimself
 */
public class OperatorPenugasan {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner masuk = new Scanner(System.in);
        System.out.println("==Operator Penugasan==");
        
        //Pengisian nilai
        System.out.print("Masukkan nilai a: ");
        a = masuk.nextInt();
        System.out.println("Masukkan nilai b: ");
        b = masuk.nextInt();
        
        //penambahan
        b += a;
        System.out.println("Penambahan : "+b);
        
        //pengurangan
        b -= a;
        System.out.println("Pengurangan: "+b);
        
        //perkalian
        b *= a;
        System.out.println("Perkalian: "+b);
        
        //pembagian
        b /= a;
        System.out.println("Pembagian: "+b);
        
        //sisa bagi
        b %= a;
        System.out.println("Sisa Bagi: "+b);
        
        
    }
    
}
