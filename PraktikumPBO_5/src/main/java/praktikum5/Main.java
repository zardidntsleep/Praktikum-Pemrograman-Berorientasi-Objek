/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum5;

/**
 *
 * @author ThinkPad T14 G2
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 180, 4);
        
        System.out.println("INFORMASI MOBIL");
        mobil.tampilkanInfo();
        
        SepedaMotor motor = new SepedaMotor("Yamaha", 120, "2-tak");
        
        System.out.println("INFORMASI MOTOR");
        motor.tampilkanInfo();
    }
}
