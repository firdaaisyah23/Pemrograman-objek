import java.util.Scanner; // menginpor paket Scanner(inputan)

public class bangunruang {
    Scanner in = new Scanner(System.in);

    public static void main(String [] args){

        char lagi ='y'; //variabel awal untuk mengulang di Looping
        bangunruang object = new bangunruang(); 
        object.menu(); 

    }  

    public void menu(){ // metode void menu

        System.out.println("");
        System.out.print(" 1. Luas dan keliling persegi \n " +

                          "2. Luas dan keliling lingkaran \n " +

                          "3. Luas dan keliling segitiga \n " +
                          "Masukan Pilihan : ");

        int pilih = in.nextInt(); // menginput pilihan
        switch(pilih){ 
        case 1 : { 
        luas1 luas = new luas1(); 
        luas.luas1(); 
        menu(); 
        break; // keluar
        }

        case 2 : { //jika pilih 2
            luas2 luas = new luas2(); 
            luas.luas2(); 
           menu(); 
            break; 
            }

        case 3 : { // jika plih 3
            luas3 luas = new luas3(); 
            luas.luas3(); 
            menu(); // kembali menampilkan metode void menu
            break; // keluar
            }

        case 0 : { System.exit(0); //jika pilih 0, maka akan keluar
            }

        default : { // jika tidak ada pilihan diatas maka akan mengeksekusi ini
          System.err.println("tidak tercantum dalam daftar pilihan"); System.exit(0); }

        }

    }

}