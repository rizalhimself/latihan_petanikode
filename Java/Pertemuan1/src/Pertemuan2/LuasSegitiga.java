/*Algoritma
    Deklarasi
        Double luas, int  alas, tinggi
    Membuat scanner baru
    Deskripsi
        Input
        - masukkan input alas dan tinggi
        Proses
        - luas = Alas * Tinggi/2
        Output
        -cetak luas
 */
package Pertemuan2;
import java.util.Scanner;

/**
 *
 * @author rizalhimself
 */
public class LuasSegitiga {
    public static void main(String[] args) {
        //deklarasi
        Double luas;
        int alas, tinggi;
        
        //membuat scanner
        Scanner baca = new Scanner(System.in);
        
        //input
        System.out.println("== Program Hitung Luas Segitiga ==");
        System.out.print("Input alas: ");
        alas = baca.nextInt();
        System.out.print("Input Tinggi: ");
        tinggi = baca.nextInt();
        
        
        //proses
        luas = Double.valueOf((alas * tinggi)/2);
                
        //output
        System.out.println("luas segitiga adalah " +luas+ " cm");
          
    }
    
    
    
}
