public class Programmer extends Pegawai {
    private int Bonus = 450000;

    public Programmer(String nama){
        super(nama);
    }

    public int getBonus() {
        return this.Bonus;
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus: " + getBonus());
    }
}
