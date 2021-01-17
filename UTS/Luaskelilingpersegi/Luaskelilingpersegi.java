/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Luaskelilingpersegi;

import java.util.Scanner;

/**
 *
 * @author windows 10
 */
public class Luaskelilingpersegi {
    
    public static void main(String[] args){
        Scanner nilai = new Scanner (System.in);
        int sisi = 44;
        int Luas,keliling;
        
        Luas = sisi*sisi;
        System.out.println("Luas persegi adalah " + Luas);
        keliling = 4*sisi;
        System.out.println("Keliling persegi adalah " + keliling);
    }
    
}
