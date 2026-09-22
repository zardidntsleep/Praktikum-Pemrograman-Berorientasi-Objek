/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5.Tugas5A;

/**
 *
 * @author ThinkPad T14 G2
 */
public class Kendaraan {
    public String merk;
    public int tahun;

    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    public void tampilkanInfo() {
        System.out.println("Merk  : " + merk);
        System.out.println("Tahun : " + tahun);
    }
}
