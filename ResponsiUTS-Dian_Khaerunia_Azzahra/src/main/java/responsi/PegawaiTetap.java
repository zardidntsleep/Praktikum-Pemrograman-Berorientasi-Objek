/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author ThinkPad T14 G2
 */
public class PegawaiTetap extends Pegawai{
    private double tunjangan;
    
    public PegawaiTetap(String namaPegawai, double gaji, double tunjangan){
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    
    @Override
    public void tampilkanInfo(){
        System.out.println("----- PEGAWAI TETAP -----");
        super.tampilkanInfo();
        System.out.println("Tunjangan\t: Rp" + tunjangan);
    }
}
