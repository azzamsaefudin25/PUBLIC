package org.orang;

public class Orang {
    protected String nama;
    protected String nik;

    public Orang(String nama, String nik){
        this.nama = nama;
        this.nik = nik;
    }

    public String getNama(){
        return this.nama;
    }

    public String getNik(){
        return this.nik;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNik(String nik){
        this.nik = nik;
    }
}
