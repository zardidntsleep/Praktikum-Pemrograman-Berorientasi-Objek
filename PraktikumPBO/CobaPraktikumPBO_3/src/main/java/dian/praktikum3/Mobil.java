/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dian.praktikum3;

/**
 *
 * @author ThinkPad T14 G2
 */
public class Mobil {
    private String merk;
    private String model;
    private int tahun;

    public Mobil (String merk, String model, int tahun) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
    }
    
    public String getMerk() {
        return merk;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getTahun() {
        return tahun;
    }
    
    void displayInfo() {
        System.out.println("Mobil dengan merk " + getMerk() + " memiliki model " + getModel() + " dan keluar tahun " + getTahun());
    }
    
}
