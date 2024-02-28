/**
 * File      : Titik.java		28/2/2024
 * Nama penulis   : Azzam Saefudin Rosyidi
 * NIM       : 24060122130076
 * Deskripsi : Kelas yang berisi body dari Titik
 *
 */

public class Titik
{
    private double absis;
    private double ordinat;


    public Titik()
    {
        absis = 0;
        ordinat = 0;
    }

    public void setAbsis(double abs){
        this.absis = abs;
    }
    public double getAbsis(){
        return this.absis;
    }
    public void setOrdinat(double ord){
        this.ordinat = ord;
    }
    public double getOrdinat(){
        return this.ordinat;
    }

    public void refleksiX(Titik titik){
        double ordinat = titik.getOrdinat();
        ordinat = ordinat * -1;
        titik.setOrdinat(ordinat);
    }
    public void refleksiY(Titik t){
        double absis = t.getOrdinat();
        absis = absis * -1;
        t.setAbsis(absis);
    }
    public void getRefleksiX(Titik t){
        refleksiX(t);
    }
    public void getRefleksiY(Titik t){

        refleksiY(t);
    }
    public double getJarakPusat(){
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
//       return Math.sqrt((absis*absis)+(ordinat*ordinat));

    }

}