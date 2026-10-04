/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package responsi;

/**
 *
 * @author ThinkPad T14 G2
 */
public class Main {
    public static void main(String[] args) {
        Elektronik produk2 = new Elektronik("Lenovo LOQ", 21000000, 2);
        PegawaiTetap pegawai1 = new PegawaiTetap("Jennie", 2000000, 200000);
                
        //Polimorfisme
        Produk produk1 = new Makanan("Indomie", 3500, "17-09-2027");
        Pegawai pegawai2 = new PegawaiKontrak("Martin", 1500000, 6);
                
        produk1.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
        System.out.println();
        produk2.tampilkanInfo();
        System.out.println();
        pegawai1.tampilkanInfo();
    }
}
