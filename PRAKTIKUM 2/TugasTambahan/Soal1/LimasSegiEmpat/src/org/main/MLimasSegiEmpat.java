package org.main;
import org.bangundatar.*;
import org.bangunruang.*;
public class MLimasSegiEmpat {

    public static void main(String[] args){

        SegiEmpat segiEmpat = new SegiEmpat(10);
        LimasSegiEmpat limasSegiEmpat = new LimasSegiEmpat(segiEmpat, 5, 4);

        System.out.println("Luas Permukaan Limas Segi Empat: " + limasSegiEmpat.hitungLuasPermukaan());
        System.out.println("Volume Limas Segi Empat: " + limasSegiEmpat.hitungVolume());
    }
}
