import java.util.Scanner;


class luas2 {
    private int i;
    public int luas2(){
        Scanner scan = new Scanner(System.in);
        final double PHI = 3.14;
        double jarijari, phi= 04, luas, keliling;
        System.out.println("Menghitung Luas Lingkaran");
        jarijari = 04;
        luas = PHI * jarijari * jarijari;
        System.out.println("Luas = " + luas );
        
        System.out.println("Menghitung keliling Lingkaran");
        keliling = 2 * phi * jarijari;
        System.out.println("keliling = " + keliling);
        return i; //mengembalikan nilai
    }
}