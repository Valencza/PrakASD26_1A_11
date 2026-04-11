package cm1;

public class Mahasiswa11 {
    String nim;
    String nama;
    String prodi;

    Mahasiswa11(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa() {
        System.out.printf("%-10s | %-10s | %-15s%n ", "NIM: " + nim, "Nama: " + nama, "Prodi: " + prodi);
    }
}
