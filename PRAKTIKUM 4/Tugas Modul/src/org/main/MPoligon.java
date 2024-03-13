package org.main;
import org.bangundatar.*;
public class MPoligon {
    public static void main(String[] args){
        Segitiga segitga = new Segitiga(10,6,3);
        segitga.printInfo();
        System.out.println("Luas Segitiga adalah " + segitga.hitungLuas());
    }

}
