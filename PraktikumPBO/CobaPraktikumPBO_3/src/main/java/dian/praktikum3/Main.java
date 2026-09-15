/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dian.praktikum3;

/**
 *
 * @author ThinkPad T14 G2
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Mimi", 3, 40);
        kucing.setUmur(4);
        kucing.suara();
        kucing.info();
        kucing.berlari();
        
        Mobil mobil1 = new Mobil("Avanza", "Sedan", 2010);
        mobil1.displayInfo();
    }
    
}
