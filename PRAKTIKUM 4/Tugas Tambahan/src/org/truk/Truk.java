package org.truk;
import org.kendaraan.Kendaraan;

public class Truk extends Kendaraan{
    private int kapasitasMuatan;
    private int beratMuatan;

    public Truk(String nama, int kapasitasMuatan){
        super(nama);
        this.kapasitasMuatan = kapasitasMuatan;
    }
    
    public int getKapasitasMuatan(){
        return this.kapasitasMuatan;
    }
    public void setKapasitasMuatan(int kapasitasMuatan){
        this.kapasitasMuatan = kapasitasMuatan;
    }
    public int getberatMuatan(){
        return this.beratMuatan;
    }
    public void setberatMuatan(int beratMuatan){
        this.beratMuatan = beratMuatan;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Kapasitas Muatan: " + getKapasitasMuatan() + " ton");
        System.out.println("Berat Muatan: " + getberatMuatan() + " ton");
    }

    public void muatBarang(int berat){
        if ((beratMuatan + berat) <= kapasitasMuatan){
            beratMuatan += berat;
            System.out.println("Muatan truk bertambah menjadi " + getberatMuatan() + " ton");
        }else{
            System.out.println("Muatan truk sudah penuh");
        }
    }

    public void klakson(){
        System.out.println( getNama() + " berbunyi, graw!");
    }
}
