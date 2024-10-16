package tutorial;

// class dengan constructor
class Pelajar {
    String nama;
    String nim;
    String jurusan;
    
    // constructor dipanggil saat object pertama kali dibuat
//    Pelajar(){
//        System.out.println("Ini adalah constructor");
//    }
    
    // constructor dengan parameter
    Pelajar(String nim) {
        this.nim = nim;
        System.out.println(this.nim);
    }
    
    Pelajar(String inputNama, String NIM, String inputJurusan){
        this.nama = inputNama;
        this.nim = NIM;
        this.jurusan = inputJurusan;
        
        System.out.println(nama);
        System.out.println(nim);
        System.out.println(jurusan);
        System.out.println("===========================");
    }
}

public class constructor {

    public static void main(String args[]) {
        Pelajar mahasiswa1 = new Pelajar("Budi", "2422132", "Teknik Memasak");
        Pelajar mahasiswa2 = new Pelajar("Agus", "43414114", "Teknik Mancing");
        Pelajar mahasiswa3 = new Pelajar("Jordan", "432414412", "Teknik Dugem");
        Pelajar mahasiswaNIM = new Pelajar("321424");
    }
}
