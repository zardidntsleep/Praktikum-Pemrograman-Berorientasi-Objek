/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5.Tugas5;

/**
 *
 * @author ThinkPad T14 G2
 */
public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan("Umum", "Hewan");
        Kucing kucing = new Kucing("Mimi");
        Anjing anjing = new Anjing("Komo");
 
        hewan.tampilkanInfo();
        System.out.println();
        kucing.tampilkanInfo();
        System.out.println();
        anjing.tampilkanInfo();
    }
}
