package tugas;
import java.util.Scanner;

public class pertemuan4_if_elseIf_else {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("MENGHITUNG BERAT BADAN IDEAL");
        System.out.println("=================================");
        System.out.println("1. Laki - laki \n2. Perempuan");
        System.out.print("Pilih Jenis Kelamin : ");
        int option = input.nextInt();
        System.out.print("Masukan tinggi badan : ");
        int tinggi = input.nextInt();
        
        double hasil = 0;
        if(option == 1) {
            hasil = (tinggi - 100) - (0.1 * (tinggi - 100));
        } else if(option == 2) {
            hasil = (tinggi - 100) - (0.15 * (tinggi - 100));
        } else {
            System.out.println("Pilihan Tidak tersedia");
        }
        
        System.out.println("Berat badan ideal anda = " + hasil + " kg");
    }
}
