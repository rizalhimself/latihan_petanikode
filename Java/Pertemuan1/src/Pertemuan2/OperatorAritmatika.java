/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;
import java.util.Scanner;

/**
 *
 * @author rizalhimself
 */
public class OperatorAritmatika {
    public static void main(String[] args) {
        int angka1;
        int angka2;
        int hasil;
        
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Input angka-1: ");
        angka1 = masukan.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = masukan.nextInt();
        
        // penjumlahan
        hasil = angka1 + angka2;
        System.out.println("Hasil Penjumlahan = "+hasil);
        
        System.out.print("Input angka-1: ");
        angka1 = masukan.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = masukan.nextInt();
        
        // pengurangan
        hasil = angka1 - angka2;
        System.out.println("Hasil Pengurangan = "+hasil);
        
        System.out.print("Input angka-1: ");
        angka1 = masukan.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = masukan.nextInt();
        
        // perkalian
        hasil = angka1 * angka2;
        System.out.println("Hasil Perkalian = "+hasil);
        
        System.out.print("Input angka-1: ");
        angka1 = masukan.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = masukan.nextInt();
        
        // pembagian
        hasil = angka1 / angka2;
        System.out.println("Hasil Pembagian = "+hasil);
        
        System.out.print("Input angka-1: ");
        angka1 = masukan.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = masukan.nextInt();
        
        // sisa bagi
        hasil = angka1 % angka2;
        System.out.println("Hasil Sisa Bagi = "+hasil );
    }
    
    }
    
