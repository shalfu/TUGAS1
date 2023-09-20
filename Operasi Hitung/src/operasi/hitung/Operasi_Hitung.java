
package operasi.hitung;
import java.util.Scanner;
 
public class Operasi_Hitung {
 
    public static int Tambah (int a, int b){
 
    return(a + b);
 
}
 
    public static int Kali (int a, int b){
 
    return(a * b);
 
}
 
    public static int Kurang (int a, int b){
 
    return(a - b);
 
}
 
    public static int Bagi (int a, int b){
 
    return(a / b);
 
}
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
 
        System.out.print("Masukan nilai A : ");
 
        int a=input.nextInt();
 
        System.out.print("Masukan nilai B : ");
 
        int b=input.nextInt();
 
        System.out.println("==================");
 
        System.out.println("Hasil Penjumlahan : "+Tambah(a, b));
 
        System.out.println("Hasil Perkalian : "+Kali(a, b));
 
        System.out.println("Hasil Pengurangan : "+Kurang(a, b));
 
        System.out.println("Hasil Pembagian : "+Bagi(a, b));
 
    }
 
}
