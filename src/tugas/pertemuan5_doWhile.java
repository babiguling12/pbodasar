package tugas;
import java.util.Scanner;

public class pertemuan5_doWhile {

    public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
        
        String option;
        do {
            System.out.println("Menghitung Luas Segitiga\n");
            System.out.print("Input alas : ");
            double alas = input.nextInt();
            System.out.print("Input Tinggi : ");
            double tinggi = input.nextInt();
            
            double luas = 0.5 * alas * tinggi;
            System.out.println("Luas Segitiga : " + luas);
            
            System.out.print("Apakah ingin menghitung lagi? (ya/tidak) : ");
            option = input.next();
        } while (option.equalsIgnoreCase("ya"));
        System.out.println("Program selesai");
    }
}
