/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_polymorphisme;

/**
 *
 * @author User
 */
public class Segitiga extends BangunDatar {
    int alas;
    int tinggi;
    
    public Segitiga (int alas,int tinggi){
        this.alas=alas;
        this.tinggi=tinggi;
    } 
    
    public float luas (){
        return this.alas*this.tinggi;
    }
    
}
