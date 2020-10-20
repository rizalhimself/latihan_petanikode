/*Program Penghitung Keliling Persegi Panjang
 *Algoritma
    1. Import Fungsi Scanner
    2. Deklarasi variabel kll, p, l
    3. Deklarasi fungsi scanner
    4. Deskripsi
        //Input
            masukan input p dan l
        //Proses
            kll = 2*p + 2*l
        //Output
            menampilkan kll
 */
package Pertemuan3;
import java.util.Scanner;

/**
 *
 * @author rizalhimself
 */
public class KelilingPersegiPanjang {
    public static void main(String[] args) {
        Double kll, p, l;
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("==Program Penghitung Keliling Persegi Panjang==");
        System.out.println("\n");
        System.out.print("Masukkan Input Panjang : ");
        p = masukan.nextDouble();
        System.out.print("Masukkan Input Lebar : ");
        l = masukan.nextDouble();
        
        kll = (2*p) + (2*l);
        
        System.out.println("Keliling Persegi Panjang Tersebut adalah : " +kll);
        
       
    }
    
}
