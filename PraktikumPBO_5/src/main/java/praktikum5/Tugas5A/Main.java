/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5.Tugas5A;

/**
 *
 * @author ThinkPad T14 G2
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 2022, 4);
        SepedaMotor motor = new SepedaMotor("Honda", 2023, "Matic");

        mobil.tampilkanInfo();
        System.out.println();
        motor.tampilkanInfo();
    }
}
