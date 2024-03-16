package org.mobil;

import org.kendaraan.Kendaraan;

public class Mobil extends Kendaraan{
    private int jumlahPintu; 

    public Mobil(String nama ,int jumlahPintu){
        super(nama);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu(){
        return this.jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu){
        this.jumlahPintu = jumlahPintu;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("jumlah pintu mobil: " + getJumlahPintu());
    }

    public void bukaPintu(int nomorPintu){
        System.out.println("Pintu mobil yang terbuka: Pintu " + nomorPintu);
    } 

    public void klakson(){
        System.out.println(getNama() + " berbunyi, Vroom Vroom!");
    }
}

