/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.model;
//import java.sql.*;
/**
 *
 * @author Azzam
 */
public class Mahasiswa {
    // atribut
    private int id;
    private String nama;

    // Constructor
    public Mahasiswa() {
        this.id = 0;
        this.nama = "";
    }

    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    
    @Override
    public String toString(){
        return "Mahasiswa(" + "id=" + id + ", nama=" + nama + ')';
    }
}