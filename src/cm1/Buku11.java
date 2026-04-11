package cm1;

public class Buku11 {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    Buku11(String kodeBuku, String judul, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    void tampilBuku() {
        System.out.printf("%-10s | %-10s | %-15s%n", "Kode Buku: " + kodeBuku, "Judul: " + judul, "Tahun: " + tahunTerbit);
    }
}