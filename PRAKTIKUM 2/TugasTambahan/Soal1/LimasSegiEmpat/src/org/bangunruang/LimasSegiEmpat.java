package org.bangunruang;
import org.bangundatar.SegiEmpat;

public class LimasSegiEmpat {

    private SegiEmpat permukaan;
    private double tinggiLimas;
    private double tinggisisitegak;

    public LimasSegiEmpat(SegiEmpat permukaan, double tinggiLimas, double tinggisisitegak ) {
        this.permukaan = permukaan;
        this.tinggiLimas = tinggiLimas;
        this.tinggisisitegak = tinggisisitegak;
    }
    public double hitungVolume(){
        double panjangSisi = permukaan.getPanjangsisi();
        return (panjangSisi * panjangSisi * tinggiLimas)/3 ;
    }
    public double hitungLuasPermukaan(){
        double panjangSisi = permukaan.getPanjangsisi();
        double luasSisiTegak = (4 *  panjangSisi * tinggisisitegak)/2 ;
        return (panjangSisi * panjangSisi) + luasSisiTegak;
    }

}
