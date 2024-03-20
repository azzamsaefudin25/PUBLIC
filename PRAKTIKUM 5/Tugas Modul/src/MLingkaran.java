// interface
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
//        Lingkaran l = new Lingkaran(10.2);
        System.out.print("masukkan jari-jari lingkaran: ");
        double jejari = scan.nextDouble();
        Lingkaran l2 = new Lingkaran(jejari);
//        System.out.println("Luas lingkaran dengan"+"jejari 10.2 satuan adalah "+ l.hitungLuas());
        System.out.println("Luas lingkaran dengan jejari "+ jejari + " adalah " + l2.hitungLuas());
    }
}
