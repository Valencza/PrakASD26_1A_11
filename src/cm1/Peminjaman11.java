package cm1;

public class Peminjaman11 {
    Mahasiswa11 mhs;
    Buku11 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    public Peminjaman11(Mahasiswa11 mhs, Buku11 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    }

    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;

            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

     void tampilPeminjaman() {
        System.out.printf("%-15s | %-10s | %-10s | %-10s | %-10s%n", "Nama: " + mhs.nama, "Judul: " + buku.judul, "Lama: " + lamaPinjam, "Terlambat: " + terlambat, "Denda: " + denda);
    }
}
