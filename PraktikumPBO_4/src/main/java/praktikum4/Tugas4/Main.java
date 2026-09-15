/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4.Tugas4;

import praktikum4.Tugas4.Pekerja;

/**
 *
 * @author ThinkPad T14 G2
 */
public class Main {
    public static void main(String[] args) {
        Pekerja pekerja1 = new Pekerja("Andi", 30, "Karyawan MBG", 2000000);
        
        System.out.println("INFORMASI PEKERJA");
        System.out.println(pekerja1.toString());
        
        pekerja1.setNama("Gojo");
        System.out.println("\nINFORMASI PEKERJA DIUBAH");
        System.out.println(pekerja1.toString());
        
        // System.out.println("Nama: " + pekerja1.nama); --> Jika dijalankan akan ERROR
        // System.out.println("Gaji: " + pekerja1.gaji); --> Jika dijalankan akan ERROR
        System.out.println("Usia: " + pekerja1.usia);
        System.out.println("Pekerjaan: " + pekerja1.pekerjaan);
    }
}
