package org.bangundatar;
import org.poligon.Poligon;
public class SegiEmpat extends Poligon{

    private double panjangsisi;

    public SegiEmpat (double panjangsisi){
        this.jumlahSisi = 4;
        this.panjangsisi = panjangsisi;
    }

    public double hitungLuas(){
        return panjangsisi * panjangsisi;
    }

    public double getPanjangsisi(){
        return this.panjangsisi;
    }
}
