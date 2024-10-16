package tugas;

class BangunRuang {
    private String name;
    
    public double hitungVolume(){
        return 0;
    }
    
    public void setNama(String name){
        this.name = name;
    }
    
    void display(double hasil) {
        System.out.println(this.name + " ini memiliki volume : " + hasil);
    }
    
}

class Kubus extends BangunRuang {
    private double sisi;
 
    public Kubus(String name, double sisi) {
        this.setNama(name);
        this.sisi = sisi;
    }
    
    public double hitungVolume() {
        return this.sisi * this.sisi * this.sisi;
    }
       
    public double getSisi(){
        return this.sisi;
    }
    
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    
}

class Kerucut extends BangunRuang {
    private double jari2;
    private double tinggi;
    
    public Kerucut(String name, double jari2, double tinggi){
        this.setNama(name);
        this.jari2 = jari2;
        this.tinggi = tinggi;
        
    }
    
    public double hitungVolume(){
        return 0.33 * (3.14 * this.jari2 * this.jari2) * this.tinggi;
    }
    
    public void setJari2(double jari2) {
        this.jari2 = jari2;
    }
    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
}
        
public class pertemuan7_inheritance {

    public static void main(String args[]) {
        Kubus kubus1 = new Kubus("Kubus", 4);
        kubus1.display(kubus1.hitungVolume());
        kubus1.setSisi(3);
        kubus1.display(kubus1.hitungVolume());
        
        Kerucut kerucut1 = new Kerucut("Kerucut", 5,10);
        kerucut1.display(kerucut1.hitungVolume());
        kerucut1.setJari2(7);
        kerucut1.setTinggi(12);
        kerucut1.display(kerucut1.hitungVolume());
    }
}
