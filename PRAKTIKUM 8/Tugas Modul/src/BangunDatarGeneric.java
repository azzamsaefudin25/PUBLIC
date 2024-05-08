public class BangunDatarGeneric <T123 extends BangunDatar>{
    private T123 bangunDatar;

    public void set(T123 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T123 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
