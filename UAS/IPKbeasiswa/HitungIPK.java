
package IPKbeasiswa;


public class HitungIPK {
    public static void main(String[] args) {
        String nama = "Firda Nur Aisyah",
               Nim = "201969040004",
               Jurusan = "Teknik Informatika",
               Smstr = "3",
               kls = "A";
        double PO = 4*4; //jumlah (SKS x Poin)
        double BD = 4*4; //jumlah (SKS x Poin)
        double JK = 5*4; //jumlah (SKS x Poin)
        double IMK = 3*3; //jumlah (SKS x Poin)
        double SP = 3*4; //jumlah (SKS x Poin)
        double SKS = 19; //jumlah SKS
        double jumlahkumulatif, ipk;
     
        jumlahkumulatif = PO + BD + JK + IMK + SP;
        ipk = jumlahkumulatif/SKS;
        
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + Nim);
        System.out.println("Jurusan : " + Jurusan);
        System.out.println("Kelas : " + Smstr+kls);
        System.out.println("Nilai MK-pemrograman objek : " + PO);
        System.out.println("Nilai MK-basis data : " + BD);
        System.out.println("Nilai MK-jaringan komputer : " + JK);
        System.out.println("Nilai MK-interaksi manusia dan komputer : " + IMK);
        System.out.println("Nilai MK-statistik & probabilitas : " + SP);
        System.out.println("Nilai Total Mata Kuliah");
        System.out.println("Nilai IPK      : " + ipk);
        
        char Predikat;
        if(ipk >=3.25) {
            System.out.println("Selamat Anda Mendapatkan Beasiswa");
        }else if (ipk < 3.25){
            System.out.println("Maaf Anda Tidak Mendapatkan BeasiswA");
        }
   
    
    }
}
        
    

