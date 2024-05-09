package latihanMedium;

public class Senjata {
    private String bunyi;
    private int peluru;
    private boolean menusuk;

    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.peluru = peluru;
        this.menusuk = menusuk;
    }

    public String getBunyi() {
        return this.bunyi;
    }

    public int getPeluru() {
        return this.peluru;
    }

    public boolean isMenusuk() {
        return this.menusuk;
    }

    public void setBunyi(java.lang.String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }
}
