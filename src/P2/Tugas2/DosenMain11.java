package P2.Tugas2;

public class DosenMain11 {
    public static void main(String[] args) {
        Dosen11 dosen1 = new Dosen11 ();
        dosen1.idDosen = "D001";
        dosen1.nama = "Bu Hani";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2011;
        dosen1.bidangKeahlian = "Algoritma dan Struktur Data";

        dosen1.tampilInformasi();

        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2026);
        dosen1.ubahKeahlian("Praktek Algoritma dan Struktur Data");

        Dosen11 dosen2 = new Dosen11("D002", "Valen", true, 2025, "Sistem Operasi");

        dosen2.tampilInformasi();
        
        dosen2.setStatusAktif(false);
        dosen2.hitungMasaKerja(2026);
        dosen2.ubahKeahlian("Praktek Sistem Operasi");
    }
}
