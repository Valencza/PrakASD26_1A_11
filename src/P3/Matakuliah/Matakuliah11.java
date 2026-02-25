package P3.Matakuliah;

public class Matakuliah11 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah11() {
        
    }

    public Matakuliah11(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}