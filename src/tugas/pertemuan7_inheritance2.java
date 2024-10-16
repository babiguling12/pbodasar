package tugas;

class Karyawan {
    private String nama;
    protected double gajiPokok;
    
    public Karyawan(String nama){
        this.nama = nama;
    }
     
    public double totalGaji(){
        return this.gajiPokok;
    }
    
    void display(double totalGaji){
        System.out.println("Total gaji " + this.nama + " : Rp " + totalGaji);
    }
}

class KaryawanTetap extends Karyawan {
    private double bonus;
    
    public KaryawanTetap(String nama, double bonus){
        super(nama);
        this.bonus = bonus;
        this.gajiPokok = 3000000;
    }
    
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    
    @Override
    public double totalGaji(){
        return this.gajiPokok + this.bonus;
    }
}

class KaryawanKontrak extends Karyawan{
    private int jamLembur;
    private double tarifLembur;
    
    public KaryawanKontrak(String nama, int jamLembur, double tarifLembur){
        super(nama);
        this.jamLembur = jamLembur;
        this.tarifLembur = tarifLembur;
        this.gajiPokok = 1500000;
    }
    
    public void setJamLembur(int jamLembur){
        this.jamLembur = jamLembur;
    }
    
    public void setTarifLembur(double tarifLembur){
        this.tarifLembur = tarifLembur;
    }
    
    @Override
    public double totalGaji() {
        return this.gajiPokok + (this.jamLembur * this.tarifLembur);
    }
}

public class pertemuan7_inheritance2 {

    public static void main(String args[]) {
        System.out.println("Daftar Gaji Karyawan Tetap");
        KaryawanTetap karyawan1 = new KaryawanTetap("Budi Kopling", 1000000);
        karyawan1.display(karyawan1.totalGaji());
        karyawan1.setBonus(500000);
        karyawan1.display(karyawan1.totalGaji());
        System.out.println("========================================");
        
        System.out.println("Daftar Gaji Karyawan Kontrak");
        KaryawanKontrak karyawan2 = new KaryawanKontrak("Reza Kecap",5,200000);
        karyawan2.display(karyawan2.totalGaji());
        karyawan2.setJamLembur(6);
        karyawan2.setTarifLembur(100000);
        karyawan2.display(karyawan2.totalGaji());
        
    }
}
