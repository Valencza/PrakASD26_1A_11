package P11;

public class Mahasiswa11 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa11() {
    }

    public Mahasiswa11(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilkanInformasi() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println("---------------------------");
    }
}