/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.datetime;

/**
 *
 * @author windows 10
 */
import java.util.Calendar;
 
public class ExampleCalendar {
    public static void main(String[] args) {
 
        // Menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());
    }
}