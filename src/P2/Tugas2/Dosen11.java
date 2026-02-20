package P2.Tugas2;

public class Dosen11 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    int tahunSekarang = 2026;

    public Dosen11() {

    }

    public Dosen11(String uuid, String nm, boolean status, int thnBergabung, String bngKeahlian) {
        idDosen = uuid;
        nama = nm;
        statusAktif = status;
        tahunBergabung = thnBergabung;
        bidangKeahlian = bngKeahlian;
    }

    void tampilInformasi() {
        System.out.println("===== Informasi Dosen " + nama + " =====");
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama : " + nama);
        System.out.println("Status Dosen : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println(
                "Tahun Bergabung : " + tahunBergabung + "( Masa Kerja : " + (tahunSekarang - tahunBergabung) + "tahun )");
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println();
    }

    void setStatusAktif(boolean status) {
        System.out.println("==== Perubahan Status Dosen " + nama + " ====");
        statusAktif = status;
        System.out.println("Status Dosen Sekarang :" + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println();
    }

    void hitungMasaKerja (int thnSkrg) {
        System.out.println("==== Perhitungan Masa Kerja Dosen " + nama + " ====");
        int masaKerja = thnSkrg - tahunBergabung;
        System.out.println("Masa Kerja Dosen : " + masaKerja + " tahun");
        System.out.println();
    }

    void ubahKeahlian(String bidang) {
        System.out.println("==== Perubahan Bidang Keahlian Dosen " + nama + " ====");
        bidangKeahlian = bidang;
        System.out.println("Bidang Keahlian Dosen " + nama + " Berhasil Diubah menjadi : " + bidangKeahlian);
        System.out.println();
    }
}
