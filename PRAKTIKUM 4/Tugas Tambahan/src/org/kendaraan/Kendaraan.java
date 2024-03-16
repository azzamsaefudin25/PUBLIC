package org.kendaraan;

public class Kendaraan {
    private String nama;
    private int kecepatan;

    public Kendaraan(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getKecepatan(){
        return this.kecepatan;
    }

    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
    }

    public void cetakInfo(){
        System.out.println("nama: " + getNama());
        System.out.println("kecepatan kendaraan: " + getKecepatan() + " km/jam");
    }

    public void gas(int kecepatan, int durasi){
        this.kecepatan += kecepatan * durasi;
    }
    
    public void berhenti(){
        this.kecepatan = 0;
        System.out.println( getNama() + " berhenti: "+ getKecepatan() + " km/jam");
    }

    public void klakson(){
        System.out.println( getNama() + " membunyikan klakson");
    }
}
