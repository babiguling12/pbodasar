package tugas;

class Karyawan{
    String nama;
    int umur;
    String jabatan;
    int gaji;
    
    
    void showProfile(){
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Umur\t\t: " + umur);
        System.out.println("Jabatan\t\t: " + jabatan);
        System.out.println("Gaji\t\t: " + gaji);
        System.out.println("====================================");
    }
}
    
public class pertemuan1 {

    public static void main(String args[]) {
        System.out.println("========= Daftar Karyawan ==========");
        Karyawan karyawan1 = new Karyawan();
        
        karyawan1.nama = "Budi kopling";
        karyawan1.umur = 23;
        karyawan1.jabatan = "Manager";
        karyawan1.gaji = 200000;
        karyawan1.showProfile();
        
        Karyawan karyawan2 = new Karyawan();
        karyawan2.nama = "Agus karburator";
        karyawan2.umur = 27;
        karyawan2.jabatan = "Staff";
        karyawan2.gaji = 300000;
        karyawan2.showProfile();
        
        Karyawan karyawan3 = new Karyawan();
        karyawan3.nama = "Iqbal oli samping";
        karyawan3.umur = 35;
        karyawan3.jabatan = "Satpam";
        karyawan3.gaji = 150000;
        karyawan3.showProfile();
    }
}
