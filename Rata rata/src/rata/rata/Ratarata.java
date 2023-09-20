
package rata.rata;
import java.util.Scanner;
public class Ratarata {
    public static void main(String args[])
    {
        int number, banyaknya, hasil;
        float jml_nilai, while_num, hsl_rata;
       
        System.out.println ("\t === Program Menghitung Nilai Rata-Rata === \n");
       
        Scanner nilai = new Scanner(System.in);
        System.out.print ("\t Banyaknya Nilai: ");
        banyaknya = nilai.nextInt();
       
        System.out.println ("\t ------------------------------------");
        number=1;
        jml_nilai=0;
       
        while (number<=banyaknya){
                System.out.print ("\n\t Nilai ke - "+number+" : ");
                while_num = nilai.nextFloat ();
                jml_nilai += while_num;
                number++;
        }
       
        hsl_rata = jml_nilai / banyaknya;
       
        
        System.out.println ("\n\t Jumlah Nilai : "+jml_nilai);
        System.out.printf ("\t Nilai Rata-Ratanya adalah : %.2f",hsl_rata);
        
    }
}

 
