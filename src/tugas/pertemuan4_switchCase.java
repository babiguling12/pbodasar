package tugas;
import java.util.Scanner;

public class pertemuan4_switchCase {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Menghitung Total Belanja");
        System.out.println("===========================");
        
        System.out.print("Input Total Belanja : ");
        int total = input.nextInt();
        
        System.out.println("");
        System.out.println("1. Reguler\n2. Premium\n3. Sultan");
        System.out.print("Pilih jenis member : ");
        int option = input.nextInt();
        
        double diskon = 0;
        switch(option) {
            case 1 :
                diskon = 0.2;
                break;
            case 2 :
                diskon = 0.3;
                break;
            case 3 :
                diskon = 0.5;
                break;
            default :
                System.out.println("Tidak memiliki member");
        }
        double afterDiskon = total - (total * diskon);
        System.out.println("Diskon = " + (int)(diskon * 100) + "%");
        System.out.println("Total Setelah Diskon : " + afterDiskon);
    }
}
