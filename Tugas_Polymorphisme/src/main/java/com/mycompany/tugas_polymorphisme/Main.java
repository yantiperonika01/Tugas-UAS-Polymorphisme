/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_polymorphisme;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[]args) {
         BangunDatar Bd = new BangunDatar();
        Persegi Ps = new Persegi(4);
        Segitiga Sg = new Segitiga (6,3);
        Lingkaran Lk = new Lingkaran (10);
        
        
        Bd.luas();
        Bd.keliling();
        
        System.out.println("luas persegi:"+Ps.luas());
        System.out.println("keliling persegi:"+Ps.keliling());
        System.out.println("luas segitiga:"+Sg.luas());
        System.out.println("luas lingkaran:"+Lk.luas());
        System.out.println("keliling lingkaran:"+Lk.keliling());
        
    }
}
        
       
        
    

     
    

