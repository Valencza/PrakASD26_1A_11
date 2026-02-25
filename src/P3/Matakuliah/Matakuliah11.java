package P3.Matakuliah;

public class Matakuliah11 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah11(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    
    public Matakuliah11(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.sks = 0;
        this.jumlahJam = 0;
    }

    public Matakuliah11() {
        this.kode = "XXX";
        this.nama = "Belum Ditentukan";
        this.sks = 0;
        this.jumlahJam = 0;
    }
}