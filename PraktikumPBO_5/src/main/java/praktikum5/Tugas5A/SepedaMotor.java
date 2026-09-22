/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5.Tugas5A;

/**
 *
 * @author ThinkPad T14 G2
 */
public class SepedaMotor extends KendaraanDarat{
    public String jenisMotor;

    public SepedaMotor(String merk, int tahun, String jenisMotor) {
        super(merk, tahun, 2);
        this.jenisMotor = jenisMotor;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis : " + jenisMotor);
    }
}

