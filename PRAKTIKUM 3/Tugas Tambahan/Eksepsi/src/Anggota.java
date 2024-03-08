public class Anggota {
    private String nama;
    private Buku[] bukuPinjaman;
    private int jumlahBukuPinjaman;

    public Anggota(String nama) {
        this.nama = nama;
        bukuPinjaman = new Buku[3];
        jumlahBukuPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public Buku[] getBukuPinjaman() {
        return bukuPinjaman;
    }

    public int getJumlahBukuPinjaman() {
        return jumlahBukuPinjaman;
    }

    public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException, BukuTidakTersediaException {
      
        if (jumlahBukuPinjaman >= 3) {
            throw new MaksimumBukuTerpinjamException("Anggota tidak boleh meminjam buku lebih dari 3");
        }
       
        if (!buku.isTersedia()){
            throw new BukuTidakTersediaException("Buku yang ingin dipinjam tidak tersedia");
        }
        buku.setTersedia(false);
        bukuPinjaman[jumlahBukuPinjaman] = buku;
        jumlahBukuPinjaman++;
        System.out.println("Nama Peminjam: " + getNama());
        System.out.println("Judul Buku: " + buku.getJudul());
    }
}

