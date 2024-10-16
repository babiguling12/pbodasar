package tugas;
import java.util.Scanner;

public class pertemuan5_while {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int jumlahData, total = 0, max = -1000, index = -1000, data, i = 1;
        
        System.out.print("Masukan Jumlah Data : ");
        jumlahData = input.nextInt();
        while(i <= jumlahData)  {
            System.out.print("Masukan data ke - " + i + " : ");
            data = input.nextInt();
            total += data;
            i++;

            if (data > max){
                max = data;
                index = i;
            }
        } 
        System.out.println("\nJumlah data \t: " + total);
        System.out.println("Nilai Terbesar \t: " + max);
        System.out.println("Index data \t: " + index);

    }
}
