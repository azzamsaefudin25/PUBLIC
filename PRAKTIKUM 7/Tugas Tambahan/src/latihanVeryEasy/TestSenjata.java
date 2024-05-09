package latihanVeryEasy;

public class TestSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");

        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 mengisi peluru");
        ak47.setPeluru(5);
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 menembak");
        ak47.menembak();
        ak47.menembak();
        System.out.println("");
        System.out.println("Jumlah Peluru M16: " + m16.getPeluru());
        System.out.println("M16 mengisi peluru");
        m16.setPeluru(10);
        System.out.println("Jumlah Peluru M16: " + m16.getPeluru());
        System.out.println("M16 menembak");
        m16.menembak();
        m16.menembak();
    }
}