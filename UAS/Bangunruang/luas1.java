import java.util.Scanner;


class luas1 {
    public int i;
    public int luas1(){
        Scanner nilai = new Scanner (System.in);
           int panjang , lebar ;
           panjang = 04;
           lebar = 04;
           int Luas , Keliling ;
           Keliling = 2*panjang + 2*lebar;
           System.out.println("Keliling Persegi Panjang = "+Keliling);
           Luas = panjang * lebar;
           System.out.println("Luas Persegi Panjang = "+Luas); 
           return i; //mengembalikan nilai
    }
    }