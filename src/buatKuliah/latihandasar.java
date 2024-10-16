package buatKuliah;

class Mahasiswa {
    // definisi atribut
    String nama;
    String NIM;
    String nilai;
    
    // definisi method
    void menampilkanIdentitas() {
        System.out.println("nama mahasiswa\t: " + nama);
        System.out.println("NIM\t\t: " + NIM);
        System.out.println("Nilai\t\t: " + nilai);
    }
}
public class latihandasar {

    public static void main(String args[]) {
        // deklarasi objek
        Mahasiswa mahasiswa1 = new Mahasiswa();
        
        mahasiswa1.nama = "Budi ban dalam";
        mahasiswa1.NIM = "3241244";
        mahasiswa1.nilai = "78";
        mahasiswa1.menampilkanIdentitas();
        
        System.out.println("======================================");
        Mahasiswa mahasiswa2 = new Mahasiswa();
        
        mahasiswa2.nama = "Agus karburator";
        mahasiswa2.NIM = "3434141";
        mahasiswa2.nilai = "89";
        mahasiswa2.menampilkanIdentitas();
    }
}
