/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ThinkPad T14 G2
 */
public class Kendaraan {
    public String nama;
    public int kecepatan;
    
    public Kendaraan(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }
        
    public void tampilkanInfo() {
        System.out.println("Nama kendaraan: " + nama);
        System.out.println("Kecepatan kendaraan: " + kecepatan + " km/jam");
    }
}
