// /**
//  * File      : Garis.java		28/2/2024
//  * Nama penulis   : Azzam Saefudin Rosyidi
//  * NIM       : 24060122130076
//  * Deskripsi : Kelas yang berisi body dari Garis
//  *
//  */

// public class Garis
// {
//     private Titik titikAwal;
//     private Titik titikAkhir;

//     // Konstruktor
//     public Garis(Titik titikAwal, Titik titikAkhir) {
//         this.titikAwal = titikAwal;
//         this.titikAkhir = titikAkhir;
//     }

//     public Titik getTitikAwal() {
//         return titikAwal;
//     }

//     public void setTitikAwal(Titik titikAwal) {
//         this.titikAwal = titikAwal;
//     }

//     // Getter dan setter untuk titikAkhir
//     public Titik getTitikAkhir() {
//         return titikAkhir;
//     }

//     public void setTitikAkhir(Titik titikAkhir) {
//         this.titikAkhir = titikAkhir;
//     }

//     public double getPanjang() {
//         double XX = titikAkhir.getX() - titikAwal.getX();
//         double YY = titikAkhir.getY() - titikAwal.getY();
//         return Math.sqrt(Math.pow(XX, 2) + Math.pow(YY, 2));
//     }

//     public double getGradien() {
//         double YY = titikAkhir.getY() - titikAwal.getY();
//         double XX = titikAkhir.getX() - titikAwal.getX();
//         return YY / XX;
//     }

//     public Garis getRefleksiY() {
//         Titik titikAwalRefleksi = new Titik(titikAwal.getX(), -titikAwal.getY());
//         Titik titikAkhirRefleksi = new Titik(titikAkhir.getX(), -titikAkhir.getY());
//         return new Garis(titikAwalRefleksi, titikAkhirRefleksi);
//     }

//     public boolean isTegakLurus(){

//     }
// }