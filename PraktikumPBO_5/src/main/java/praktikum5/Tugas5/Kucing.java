/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5.Tugas5;

/**
 *
 * @author ThinkPad T14 G2
 */
public class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama, "Kucing");
    }
 
    public void bersuara() {
        System.out.println("Suara : Meong!");
    }
 
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        bersuara(); 
    }
}
