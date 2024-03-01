package org.walimahasiswa;
import org.orang.Orang;
public class WaliMahasiswa extends Orang{

    private String nomorHp;
    private String alamat;

    public WaliMahasiswa(String nama, String nik, String nomorHp, String alamat ){
        super(nama, nik);
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    public String getNomorHp(){
        return this.nomorHp;
    }

    public String getAlamat(){
        return this.alamat;
    }
    public void setNomorHp(String nomorHp){
        this.nomorHp = nomorHp;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}
