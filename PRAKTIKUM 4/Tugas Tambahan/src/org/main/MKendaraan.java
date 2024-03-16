package org.main;
import org.kendaraan.*;
import org.mobil.Mobil;
import org.motor.Motor;
import org.truk.Truk;

public class MKendaraan {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("Kendaraan Azzam");
        
        Mobil mobil = new Mobil("Ferrari 488 Pista Spider", 2);
        Motor motor = new Motor("Yamaha YZR-M1", 1000);
        Truk truk = new Truk("Scania R730 V8 Topline", 30);

        kendaraan.klakson();
        mobil.klakson();
        motor.klakson();
        truk.klakson();

        System.out.println("");
        mobil.setKecepatan(40);
        mobil.gas(90, 2);
        mobil.cetakInfo();
        mobil.bukaPintu(1);
        mobil.berhenti();
        
        System.out.println("");
        motor.setKecepatan(50);
        motor.gas(100, 2);
        motor.cetakInfo();
        double hitungHorsepower1 = motor.hitungHorsepower(15);
        double hitungHorsepower2 = motor.hitungHorsepower(16);
        double hitungHorsepower3 = motor.hitungHorsepower(17);
        System.out.println("Motor "+ motor.getNama() + " diperkirakan memiliki tenaga " + hitungHorsepower2 + " dengan batas atas: " + hitungHorsepower1 + " dan batas bawah: " + hitungHorsepower3);
        motor.berhenti();
        
        System.out.println("");
        truk.setKecepatan(20);
        truk.setberatMuatan(5);
        truk.gas(20, 3);
        truk.cetakInfo();
        truk.muatBarang(20);
        truk.muatBarang(30);
        truk.berhenti();
    }
}
