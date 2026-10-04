/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author ThinkPad T14 G2
 */
public class Makanan extends Produk{
    private String tanggalKadaluarsa;
    
    public Makanan(String namaProduk, double harga, String tanggalKadaluarsa){
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    @Override
    public void tampilkanInfo(){
        System.out.println("----- MAKANAN -----");
        super.tampilkanInfo();
        System.out.println("Tgl. Kadaluarsa\t: " + tanggalKadaluarsa);
    }
}
