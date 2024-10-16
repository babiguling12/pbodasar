package tugas;
import java.util.Scanner;

public class pertemuan4_if {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Menghitung Operasi Pembagian");
        System.out.println("===============================");
        
        System.out.print("Input bilangan pertama : ");
        double bilPertama = input.nextInt();
        
        System.out.print("Input bilangan kedua : ");
        double bilKedua = input.nextInt();
        
        if(bilKedua == 0) {
            System.out.println("Hasil tak terhingga atau tak terdefinisi");
            return;
        }
        
        double hasil = bilPertama / bilKedua;
        System.out.println("Hasil = " + hasil);
    }
}
