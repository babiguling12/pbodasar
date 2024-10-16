package tugas;
import java.util.Scanner;

public class pertemuan4_if_else {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Cek Bilangan Ganji atau Genap");
        System.out.println("=================================");
        
        System.out.print("Masukan bilangan : ");
        int bil = input.nextInt();
        
        if(bil % 2 == 0) {
            System.out.println(bil + " adalah bilangan genap");
        } else {
            System.out.println(bil + " adalah bilangan ganjil");
        }
    }
}
