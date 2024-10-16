package tugas;
import java.util.Scanner;

public class pertemuan6_array1dimensi {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int[] hargaBaju = {5000, 10000, 15000, 20000};
        
        int[] jumlahBaju = new int[hargaBaju.length];
        
        for(int i = 0; i < hargaBaju.length; i++) {
            System.out.print("Masukan jumlah baju dengan harga Rp " + hargaBaju[i] + " : ");
            jumlahBaju[i] = input.nextInt();
        }
        
        double totalHarga = 0;
        for(int i = 0; i < hargaBaju.length; i++) {
            totalHarga += jumlahBaju[i] * hargaBaju[i];
        }
        
        System.out.println("Total Harga : Rp " + totalHarga);
    }
}
