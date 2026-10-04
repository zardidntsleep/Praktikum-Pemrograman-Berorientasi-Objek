/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author ThinkPad T14 G2
 */
public class Produk {
    private String namaProduk;
    private double harga;
    
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    public String getNamaProduk() {
        return namaProduk;
    }
    
    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public void setHarga(double harga){
        this.harga = harga;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Produk\t: " + getNamaProduk());
        System.out.println("Harga Produk\t: Rp" + getHarga());
    }
}
