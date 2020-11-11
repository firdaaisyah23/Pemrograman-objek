/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungIPK;



/**
 *
 * @author windows 10
 */
public class hitungIPK {
    
    public static void main(String[] args) {
        String nama = "Firda Nur Aisyah",
               Nim = "201969040004",
               Jurusan = "Teknik Informatika",
               Smstr = "3",
               kls = "A";
        int OOP = 70;
        int BS = 85;
        int JK = 80;
        int IP,totalnilaimk;
        totalnilaimk = OOP + BS + JK;
        IP = totalnilaimk/3;
        
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + Nim);
        System.out.println("Jurusan : " + Jurusan);
        System.out.println("Kelas : " + Smstr+kls);
        System.out.println("Nilai Total Mata Kuliah");
        System.out.println("Nilai IP : " + IP);
        
        char Predikat;
        if(IP >=81) {
            Predikat = 'A';
        }else if (IP>=61){
            Predikat = 'B';
        }else if (IP>=60){
            Predikat = 'C';
        }else
            Predikat = 'D';
        System.out.println("Selamat Anda Mendapatkan Predikat");
        }
        
    }
        
        
        
        
               
               
                
        
        
        
    
    

