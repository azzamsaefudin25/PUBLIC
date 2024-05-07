public class Pegawai {

    private String nama;
    private int gajiPokok = 5000000;

    public Pegawai(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getGajiPokok(){
        return this.gajiPokok;
    }

    public void tampilData(){
        System.out.println("Nama: " + getNama() + ", " +  "Gaji pokok: " + getGajiPokok());
    }
}
