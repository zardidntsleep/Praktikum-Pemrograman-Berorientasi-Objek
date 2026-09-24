/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum6;

/**
 *
 * @author ThinkPad T14 G2
 */
public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Kucing();
        hewan.bersuara();
        
        System.out.println();
        
        Kucing kucing = new Kucing();
        kucing.bersuara();
        kucing.makan("tahu");
        kucing.makan("ketan", 2);
        
        System.out.println();
        
        Anjing anjing = new Anjing();
        anjing.bersuara();
        anjing.makan("bubur");
    }
}
