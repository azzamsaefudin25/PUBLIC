public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch (AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

// jawaban no 1: baris 12 dieksekusi, di as.cobaAngka(10) akan dieksekusi sehingga terprint 10 bukan angka sial.
// jawaban no 2: baris 21 dieksekusi karena angka 13 masuk ke dalam if (angka == 13) sehingga throw ke AngkaSialExceotion dan mengeprint hati-hati memasukkan angka
