/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author ThinkPad T14 G2
 */
public class Elektronik extends Produk{
    private int garansi;
    
    public Elektronik(String namaProduk, double harga, int garansi){
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    
    @Override
    public void tampilkanInfo(){
        System.out.println("----- ELEKTRONIK -----");
        super.tampilkanInfo();
        System.out.println("Garansi\t\t: " + garansi + " tahun");
    }
}
