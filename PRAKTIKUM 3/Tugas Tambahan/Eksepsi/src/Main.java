public class Main {
    public static void main(String[] args) {

        Anggota anggota1 = new Anggota("Rooney");
        Anggota anggota2 = new Anggota("Azzam");
        Anggota anggota3 = new Anggota("Timo");

        Buku buku1 = new Buku("Sains");
        Buku buku2 = new Buku("Informatics");
        Buku buku3 = new Buku("Bahasa Indonesia");
        Buku buku4 = new Buku("Matematika");
        Buku buku5 = new Buku("Java Language");
        Buku buku6 = new Buku("Web Development");
        try {
            anggota1.pinjamBuku(buku1);
            anggota1.pinjamBuku(buku2);
            anggota1.pinjamBuku(buku3);
            anggota1.pinjamBuku(buku4);
            anggota2.pinjamBuku(buku5);
            anggota2.pinjamBuku(buku4);
            // anggota3.pinjamBuku(buku4);
            anggota3.pinjamBuku(buku6);

        }catch(MaksimumBukuTerpinjamException a) {
            System.out.println(a.getMessage());
        }catch(BukuTidakTersediaException a) {
            System.out.println(a.getMessage());
        }
    }
}
