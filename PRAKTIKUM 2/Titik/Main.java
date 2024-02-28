/**
 * File      : Main.java		28/2/2024
 * Nama penulis   : Azzam Saefudin Rosyidi
 * NIM       : 24060122130076
 * Deskripsi : Kelas yang berisi main/driver
 *
 */
class MTitik
{
    public static void main(String[] args)
    {
        Titik t1;
        Titik t2;
//        Titik t3;
//        Titik t4;

        t1 = new Titik();
        t2 = new Titik();
//        t3 = new Titik(5,6);

        t1.setAbsis(1);
        t1.setOrdinat(2);

        t2.setAbsis(3);
        t2.setOrdinat(4);

//        System.out.println("Jumlah objek titik : " + Titik.getCounterTitik());
//        System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ") ");
//        System.out.println("t2(" + t2.getAbsis() + "," + t2.getOrdinat() + ") ");
//        System.out.println("t3(" + t3.getAbsis() + "," + t3.getOrdinat() + ") ");

        double jarakPusat = t1.getJarakPusat();
        System.out.println("Jarak titik ke pusat: " + jarakPusat);
        t1.refleksiX(t1);
        System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ") ");
        t2.refleksiX(t2);
        System.out.println("t2(" + t2.getAbsis() + "," + t2.getOrdinat() + ") ");

    }
}