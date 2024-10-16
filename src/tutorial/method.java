package tutorial;

class Siswa {
    // data member
    String nama;
    String NIM;
    
    // constructor
    Siswa(String nama, String NIM) {
        this.nama = nama; // this.nama sama artinya dengan mahasiswa1.nama
        this.NIM = NIM;   // this sama artinya dengan class atau object pada mahasiswa1.nama
    }
    
    // method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama\t: " + this.nama);
        System.out.println("NIM\t: " + this.NIM);
    }
    
    // method tanpa return dan dengan parameter    
    void setNama(String nama){
        this.nama = nama;
    }
    
    // method dengan return tapi tanpa parameter
    String getNama(){
        return this.nama;
    }
    
    String getNIM(){
        return this.NIM;
    }
    
    // method dengan return dan parameter
    String greetings(String message){
        return message + " " + this.nama;
    }
}

public class method {

    public static void main(String args[]) {
        Siswa siswa1 = new Siswa("Budi", "124341");
        // method
        siswa1.show();
        
        siswa1.setNama("Agus");
        siswa1.show();
        
        System.out.println(siswa1.getNama());
        System.out.println(siswa1.getNIM());
        
        String data = siswa1.greetings("butuh");
        System.out.println(data);
        
    }
}
