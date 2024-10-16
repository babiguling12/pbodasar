package tugas;
import java.util.Scanner;

public class pertemuan5_for {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input bilangan : ");
        int bil = input.nextInt();
        
        System.out.print("Input pangkat : ");
        int pangkat = input.nextInt();
        
        int hasil = bil;
        
        if (pangkat == 0) {
            hasil = 1;
        }
        
        for (int i = 1; i < pangkat; i++) {
            hasil *= bil;
        }
        
        System.out.println(bil + "^" + pangkat + " = " + hasil);
                
    }
}
