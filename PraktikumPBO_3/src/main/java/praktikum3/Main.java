/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum3;

/**
 *
 * @author ThinkPad T14 G2
 */
public class Main {

    public static void main(String[] args) {
        // Class Mobil
        Mobil mobilA = new Mobil("Toyota", "Fortuner", 2005, "Merah");
        Mobil mobilB = new Mobil("Daihatsu", "Xenia", 2003, "Biru");
        
        mobilA.displayInfo();
        mobilA.startEngine();
        
        mobilB.displayInfo();
        mobilB.startEngine();
        
        System.out.println();
        // Class Hewan
        Hewan kucing = new Hewan("Mimi", 4);
        kucing.Suara();
        kucing.Info();
        
        Hewan anjing = new Hewan("Kino", 7);
        anjing.Info();
        anjing.Berlari();
    }
}
