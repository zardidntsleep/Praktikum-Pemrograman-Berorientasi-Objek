/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dian.praktikum3;

/**
 *
 * @author ThinkPad T14 G2
 */
public class Hewan {
    private String nama;
    private int umur;
    private int kecepatan;
    
    public Hewan(String nama, int umur, int kecepatan) {
        this.nama = nama;
        this.umur = umur;
        this.kecepatan = kecepatan;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public int getKecepatan() {
        return kecepatan;
    }
    
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    void suara(){
        System.out.println("Hewan bersuara");
    }
    
    void info() {
        System.out.println("Nama: " + getNama() + ", Umur: " + getUmur());
    }
    
    void berlari() {
        System.out.println("Hewan sedang berlari dengan kecepatan " + getKecepatan() + "km/detik");
    }
}
