package P2.Tugas1;

public class MataKuliah11 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah11() {

    }

    public MataKuliah11(String mk, String nm, int sk, int jam) {
        kodeMK = mk;
        nama = nm;
        sks = sk;
        jumlahJam = jam;
    }

    void tampilInformasi() {
        System.out.println("==== Informasi Mata Kuliah ====");
        System.out.println("Kode MK : " + kodeMK);
        System.out.println("Nama : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("===============================");
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangJam(int jam) {
        if (jam > jumlahJam) {
            System.out.println("Pengurangan gagal! jumlah jam tidak boleh minus");
        } else {
            jumlahJam -= jam;
            System.out.println("Pengurangan berhasil! jumlah jam sekarang: " + jumlahJam);
        }
    }
}
