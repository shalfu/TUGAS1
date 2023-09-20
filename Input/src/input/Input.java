
package input;
import java.util.Calendar;
import java.util.Scanner;
   
public class Input {
  public static void main(String args[]){
            
        
    String nama;
        int tahun_lahir;
        int tahun_sekarang;
        int usia;
        double tinggi;
     
        Scanner input = new Scanner(System.in);
 
        Calendar kalender = Calendar.getInstance();
        
        tahun_sekarang = kalender.get(Calendar.YEAR);
 
        
        
        System.out.print("Masukan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukan Tahun Lahir: ");
        tahun_lahir = input.nextInt();
        System.out.print("Masukan Tinggi Badan: ");
        tinggi = input.nextDouble();
        
 
        usia = tahun_sekarang - tahun_lahir;
         
        System.out.println("Nama Kamu: " + nama);
        System.out.println("Usia Kamu adalah " + usia + " Tahun");
        System.out.println("Tinggi Badanmu adalah " + tinggi + " cm");
 
 
    }

}


