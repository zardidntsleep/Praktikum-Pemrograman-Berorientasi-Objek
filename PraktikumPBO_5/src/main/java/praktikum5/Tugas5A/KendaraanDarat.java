/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5.Tugas5A;

/**
 *
 * @author ThinkPad T14 G2
 */
public class KendaraanDarat extends Kendaraan{
    public int jumlahRoda;

    public KendaraanDarat(String merk, int tahun, int jumlahRoda) {
        super(merk, tahun);
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Roda  : " + jumlahRoda);
    }
}
