package org.mahasiswa;
import org.walimahasiswa.WaliMahasiswa;
import org.orang.Orang;
public class Mahasiswa extends Orang{
    
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa(String nama, String nik, String nim, String jurusan, WaliMahasiswa wali){
        super(nama, nik);
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public String getNim(){
        return this.nim;
    }
    public String getJurusan(){
        return this.jurusan;
    }

    public WaliMahasiswa getWali(){
        return this.wali;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali){
        this.wali = wali;
    }

    public void cetak(){
        System.out.println("Nama: " + getNama());
        System.out.println("NIK: " + getNik());
        System.out.println("NIM: " + getNim());
        System.out.println("Jurusan: " + getJurusan());
        System.out.println("Nama Wali: " + wali.getNama());
        System.out.println("NIK Wali: " + wali.getNik());
        System.out.println("Nomor HP Wali: " + wali.getNomorHp());
        System.out.println("Alamat Wali: " + wali.getAlamat());
    }
}
