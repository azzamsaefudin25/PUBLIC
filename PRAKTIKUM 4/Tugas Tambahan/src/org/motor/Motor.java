package org.motor;

import org.kendaraan.Kendaraan;

public class Motor extends Kendaraan {
    private int cc;

    public Motor(String nama, int cc){
        super(nama);
        this.cc = cc;
    }

    public int getCC(){
        return this.cc;
    }

    public void setCC(int cc){
        this.cc = cc;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Kapasitas mesin cc motor: " + getCC());
    }

    public double hitungHorsepower(int angka){
            return cc/angka;
    }

    public void klakson(){
        System.out.println( getNama() + " berbunyi, Brem Brem!");
    }
}
