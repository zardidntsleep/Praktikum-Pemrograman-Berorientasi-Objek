/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author ThinkPad T14 G2
 */
public class PegawaiKontrak extends Pegawai{
    private int lamaKontrak;
    
    public PegawaiKontrak(String namaPegawai, double gaji, int lamaKontrak){
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    
    @Override
    public void tampilkanInfo(){
        System.out.println("----- PEGAWAI KONTRAK -----");
        super.tampilkanInfo();
        System.out.println("Lama Kontrak\t: " + lamaKontrak + " bulan");
    }
}
