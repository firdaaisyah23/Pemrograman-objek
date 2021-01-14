import java.util.Scanner;


class luas3 {
    private int i;
    public int luas3(){
    Scanner input=new Scanner(System.in);
        int a, t;
        double luas;
        System.out.println("Menghitung Luas segitiga");
        a= 04;
        t= 04;
        luas=0.5*a*t;
        System.out.println("Luas Segitiga : "+luas);
        
        System.out.println("Menghitung keliling segitiga");
        int b = 04;
        int c = 04;
        int keliling = a + b + c; 
        System.out.println("keliling : " +keliling);
        return i; // mengembalikan nilai
    }
}