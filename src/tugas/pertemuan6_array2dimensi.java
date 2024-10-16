package tugas;
import java.util.Scanner;

public class pertemuan6_array2dimensi {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah toko : ");
        int jumlahToko = input.nextInt();
        System.out.print("Masukkan jumlah barang : ");
        int jumlahBarang = input.nextInt();
        
        String daftarBelanja[][] = new String[jumlahToko][jumlahBarang];
        String[] namaToko = new String[jumlahToko];
        
        for(int i = 0; i < jumlahToko; i++) {
            System.out.print("Masukkan nama toko ke " + (i+1) + " : ");
            input.nextLine();
            namaToko[i] = input.nextLine();
            double totalBiaya = 0;
            for(int j = 0; j < jumlahBarang; j++) {
                System.out.print("Masukkan nama barang ke " + (j+1) + " : ");
                daftarBelanja[i][j] = input.next();
                System.out.print("Masukkan harga barang " + daftarBelanja[i][j] + " : ");
                double hargaBarang = input.nextDouble();
                totalBiaya += hargaBarang;
            }
            System.out.println("");
            daftarBelanja[i][0] = "Total Biaya Belanjaan : " + totalBiaya;
        }
        
        System.out.println("\nData Perbelanjaan:");
        for (int i = 0; i < jumlahToko; i++) {
            System.out.println(namaToko[i] + " : " + daftarBelanja[i][0]);
        }
    }
}
