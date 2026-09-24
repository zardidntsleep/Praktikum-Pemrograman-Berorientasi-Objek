/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6.Tugas6;

/**
 *
 * @author ThinkPad T14 G2
 */

import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> daftarProduk;

    public KeranjangBelanja() {
        daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.getHargaSetelahDiskon();
        }
        return total;
    }

    public void tampilkanProduk() {
        for (Produk product : daftarProduk) {
            System.out.println("Nama: " + product.getNama());
            System.out.println("Harga: " + product.getHarga());
            System.out.println("Potongan Diskon: " + product.hitungDiskon());
            System.out.println("Harga Setelah Diskon: " + product.getHargaSetelahDiskon());
            System.out.println();
        }
    }
}
