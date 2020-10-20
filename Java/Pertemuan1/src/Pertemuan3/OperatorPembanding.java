/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;
import java.util.Scanner;

/**
 *
 * @author rizalhimself
 */
public class OperatorPembanding {
    public static void main(String[] args) {
        int nilaiA, nilaiB;
        boolean hasil;
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("==Operator Pembanding==");
        System.out.print("Masukkan nilai A: ");
        nilaiA = masuk.nextInt();
        System.out.print("Masukkan nilai B: ");
        nilaiB = masuk.nextInt();

        hasil = nilaiA > nilaiB;
        System.out.println("Apakah A lebih besar dari B?: "+hasil);
        
        hasil = nilaiA < nilaiB;
        System.out.println("Apakah A lebih kecil dari B?: "+hasil);
        
        hasil = nilaiA == nilaiB;
        System.out.println("Apakah A sama dengan B?: "+hasil);
        
        hasil = nilaiA >= nilaiB;
        System.out.println("Apakah A lebih besar sama dengan B?: "+hasil);
        
        hasil = nilaiA <= nilaiB;
        System.out.println("Apakah A lebih kecil sama dengan B?: "+hasil);
        
        hasil = nilaiA != nilaiB;
        System.out.println("Apakah A tidak sama dengan B?: "+hasil);
        
        
    }
}
