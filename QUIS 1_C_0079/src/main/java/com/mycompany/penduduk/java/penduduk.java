/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.penduduk.java;

/**
 *
 * @author Antonius Agung
 */
public class penduduk {
    protected String NIK, nama, alamat;
    protected int umur;
    
    public void tampilDataPenduduk(){
        System.out.println("NIK          : " + NIK);
        System.out.println("Nama         : " + nama);
        System.out.println("Umur         : " + umur);
        System.out.println("Alamat       : " + alamat);
    }
}
