/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.penduduk.java;

/**
 *
 * @author Antonius Agung
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PendudukJava {

    public static void main(String[] args) {

        MahasiswaJava m = new MahasiswaJava();
        MahasiswaJava mm = new MahasiswaJava();
        DosenJava d = new DosenJava();
        DosenJava dd = new DosenJava();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("NIK     : ");
            m.NIK = br.readLine();
            System.out.println("Nama    : ");
            m.nama = br.readLine();
            System.out.println("Umur    : ");
            m.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat  : ");
            m.alamat = br.readLine();
            System.out.println("NIM     : ");
            m.nim = br.readLine();
            System.out.println("IPK     : ");
            m.ipk = Float.parseFloat(br.readLine());
            System.out.println();
            
            System.out.println("NIK     : ");
            mm.NIK = br.readLine();
            System.out.println("Nama    : ");
            mm.nama = br.readLine();
            System.out.println("Umur    : ");
            mm.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat  : ");
            mm.alamat = br.readLine();
            System.out.println("NIM     : ");
            mm.nim = br.readLine();
            System.out.println("IPK     : ");
            mm.ipk = Float.parseFloat(br.readLine());
            System.out.println();
            
            System.out.println("NIK             : ");
            d.NIK = br.readLine();
            System.out.println("Nama            : ");
            d.nama = br.readLine();
            System.out.println("Umur            : ");
            d.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat          : ");
            d.alamat = br.readLine();
            System.out.println("NIDN            : ");
            d.nidn = br.readLine();
            System.out.println("Golongan        : ");
            d.gol_3043 = Integer.parseInt(br.readLine());
            System.out.println("Gaji Pokok      : ");
            d.gajiPokok_3043 = Integer.parseInt(br.readLine());
            System.out.println("");
            
            System.out.println("NIK             : ");
            dd.NIK = br.readLine();
            System.out.println("Nama            : ");
            dd.nama = br.readLine();
            System.out.println("Umur            : ");
            dd.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat          : ");
            dd.alamat = br.readLine();
            System.out.println("NIDN            : ");
            dd.nidn = br.readLine();
            System.out.println("Golongan        : ");
            dd.gol_3043 = Integer.parseInt(br.readLine());
            System.out.println("Gaji Pokok      : ");
            dd.gajiPokok_3043 = Integer.parseInt(br.readLine());
            System.out.println("");
            m.tampilDataMahasiswa();
            m.tampilDataBeasiswa();
            d.tampilDataDosen();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
