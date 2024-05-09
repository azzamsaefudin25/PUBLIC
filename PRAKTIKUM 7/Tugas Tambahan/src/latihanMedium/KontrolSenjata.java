package latihanMedium;

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata (Senjata s){
        this.senjata = s;
    }

    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println(">>Peluru berhasil ditambah: " + jumPeluru);
    }

    public void menembak(int jumlah) {
        System.out.println(">>Siap menembak " + jumlah + " kali");
        if (isAdaPeluru()) {
            int i=0;
            while (i < jumlah)
            {
                if (senjata.getPeluru() > 0) {
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru()-1);
                }else {
                    System.out.println("Gagal tembak, Peluru Habis");
                }
                i++;
            }
            System.out.println("Peluru sisa: " + senjata.getPeluru());
        }
        else {
            System.out.println("Peluru Habis");
        }
    }

    public String menusuk(){
        return "Menusuk: " + senjata.isMenusuk();
    }

    public void pasangBayonet(){

    }
}
