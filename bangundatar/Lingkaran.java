/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.bangundatar;

/**
 *
 * @author windows 10
 */
public class Lingkaran implements BangunDatar {
    
    private final double pi = 3.1415;
    Lingkaran() {
    }
    @Override
    public double luas(int s1, int s2) {
        return 0;
    }
    @Override
    public double keliling(int s1, int s2) {
        return 0;
    }
    public double luas(int r) { //metode overload
        return (pi * r * r);
    }
    public double keliling(int r) { //methode overload
        return (2 * pi * r);
    }
}

    

