/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6.Tugas6;

/**
 *
 * @author ThinkPad T14 G2
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        keranjang.tambahProduk(new Buku("Pemrograman Java", 100000));
        keranjang.tambahProduk(new Elektronik("Headphone", 500000));
        keranjang.tambahProduk(new Pakaian("Kaos Polos", 80000));

        keranjang.tampilkanProduk();

        System.out.printf("%nTotal setelah diskon: %.2f%n", keranjang.hitungTotalHargaSetelahDiskon());
    }
}
