package latihanVeryEasy;

public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.peluru = peluru;
    }

    public String getBunyi(){
        return this.bunyi;
    }

    public int getPeluru() {
        return this.peluru;
    }

    public void menembak(){
        if (getPeluru() > 0) {
            System.out.println(getBunyi());
            this.peluru--;
            System.out.println("Sisa Peluru: " + (getPeluru()));
        }
    }

    public void setBunyi(java.lang.String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}
