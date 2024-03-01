package org.main;
import org.mahasiswa.*;
import org.walimahasiswa.*;

public class Main {

    public static void main(String[] args){
        WaliMahasiswa waliMahasiswa = new WaliMahasiswa("Bambang", "312456789", "08123456789","Jalan Tirtosari");
        Mahasiswa mahasiswa= new Mahasiswa("Sae", "312459865", "24060122130076", "Informatika", waliMahasiswa);
        mahasiswa.cetak();
    }
}
