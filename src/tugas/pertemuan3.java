package tugas;

public class pertemuan3 {

    public static void main(String args[]) {
        
        int a = 8;
        int b = 4;
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        
        System.out.println("========== OPERATOR ARITMATIKA =========");
        
        int penjumlahan = a + b;
        System.out.println("Hasil jumlah = " + penjumlahan);
        
        int pengurangan = a - b;
        System.out.println("Hasil kurang = " + pengurangan);
        
        int perkalian = a * b;
        System.out.println("Hasil kali = " + perkalian);
        
        double pembagian = a / b;
        System.out.println("Hasil bagi = " + pembagian);
        
        System.out.println("=========== OPERATOR RELASIONAL ===========");
        System.out.println("Apakah a == b ?\t: " + (a == b));
        System.out.println("Apakah a != b ?\t: " + (a != b));
        System.out.println("Apakah a > b ?\t: " + (a > b));
        System.out.println("Apakah a < b ?\t: " + (a < b));
        System.out.println("Apakah a >= b ?\t: " + (a >= b));
        System.out.println("Apakah a <= b ?\t: " + (a <= b));
        
        System.out.println("=========== OPERATOR LOGIKA ===========");
        boolean c = true;
        boolean d = false;
        System.out.println("Nilai c = " + c);
        System.out.println("Nilai d = " + d);
        System.out.println("Benarkah c && d ? : " + (c && d));
        System.out.println("Benarkah c || d ? : " + (c || d));
        System.out.println("Benarkah !(c && d) ? : " + (!(c && d)));
        System.out.println("Benarkah !(c || d) ? : " + (!(c || d)));
        
        System.out.println("============ OPERATOR BITWISE ==========");
        System.out.println("AND (&)");
        System.out.println("0 & 0 : " + (0 & 0));
        System.out.println("0 & 1 : " + (0 & 1));
        System.out.println("1 & 1 : " + (1 & 1));
        System.out.println("OR (|)");
        System.out.println("0 | 0 : " + (0 | 0));
        System.out.println("0 | 1 : " + (0 | 1));
        System.out.println("1 | 1 : " + (1 | 1));
        System.out.println("XOR (^)");
        System.out.println("0 ^ 0 : " + (0 ^ 0));
        System.out.println("0 ^ 1 : " + (0 ^ 1));
        System.out.println("1 ^ 1 : " + (1 ^ 1));
        
    }
}
