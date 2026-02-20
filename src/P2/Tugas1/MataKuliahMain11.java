package P2.Tugas1;

public class MataKuliahMain11 {
    public static void main(String[] args) {
        MataKuliah11 mk1 = new MataKuliah11();
        mk1.kodeMK = "asd01";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 2;
        mk1.jumlahJam = 3;

        mk1.tampilInformasi();

        mk1.ubahSKS(3);
        mk1.tambahJam(4);
        mk1.tampilInformasi();

        mk1.kurangJam(6);
        mk1.tampilInformasi();

        mk1.kurangJam(2);
        mk1.tampilInformasi();

        MataKuliah11 mk2 = new MataKuliah11("bd01", "Basis Data", 3, 4);
        mk2.tampilInformasi();

        mk2.ubahSKS(4);
        mk2.tampilInformasi();

        mk2.tambahJam(1);
        mk2.tampilInformasi();

        mk2.kurangJam(2);
        mk2.tampilInformasi();

        mk2.kurangJam(4);
        mk2.tampilInformasi();
    }
}
