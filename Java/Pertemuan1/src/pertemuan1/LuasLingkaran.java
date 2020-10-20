//
/*Algoritma!
    Deklarasi
        Double luas(Angka), PI int r
    Deskripsi
        -Input
            PI = 3,14
            r = 18
        -Proses
            luas = PI * r * r
        -Output
            cetak luas
 */
package pertemuan1;

public class LuasLingkaran {
    public static void main(String[] args) {
        //Deklarasi
        Double pi, r, luas;
        
        //Deskripsi
        r = 10.0;
        pi = 3.14;
        
        //Proses
        luas = pi * r * r;
        
        //Output
        System.out.println("Luas Lingkaran");
        System.out.println(luas+ " centimeter");
    }
    
}
