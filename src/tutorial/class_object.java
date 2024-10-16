package tutorial;

// membuat class sebagai template
class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    double ipk;
}

public class class_object {

    public static void main(String args[]) {
        
       // instalasi / membuat object 
       Mahasiswa mahasiswa1 = new Mahasiswa();
       mahasiswa1.nama = "Budi";
       mahasiswa1.nim = "3242551";
       mahasiswa1.jurusan = "Teknik Memasak";
       mahasiswa1.ipk = 3.6;
       
       System.out.println(mahasiswa1.nama);
       System.out.println(mahasiswa1.nim);
       System.out.println(mahasiswa1.jurusan);
       System.out.println(mahasiswa1.ipk);
       
       System.out.println("================================");
       
       Mahasiswa mahasiswa2 = new Mahasiswa();
       mahasiswa2.nama = "Agus";
       mahasiswa2.nim = "3242551";
       mahasiswa2.jurusan = "Teknik Mandi";
       mahasiswa2.ipk = 3.6;

       System.out.println(mahasiswa2.nama);
       System.out.println(mahasiswa2.nim);
       System.out.println(mahasiswa2.jurusan);
       System.out.println(mahasiswa2.ipk);
       
    }
}
