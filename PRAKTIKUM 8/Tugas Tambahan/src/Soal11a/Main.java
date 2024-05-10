package Soal11a;

class Kupu {
    public void gerak(){}
}

class Ulat extends Kupu{
    public void gerak(){
        System.out.println("ulat merayap");
    }
}
class Data <T> {
    T isi;
    public T getIsi(){
        return this.isi;
    }

    public void setIsi(T x){
        this.isi = x;
    }
}

public class Main {
    public static void main(String[] args) {
        // kamus
        Ulat K;
        Data <Kupu> anu;
        // algoritma
        K = new Ulat();
        anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
    }
}