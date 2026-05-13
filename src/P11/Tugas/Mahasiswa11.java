package P11.Tugas;

public class Mahasiswa11 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa11(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilkanData() {
        System.out.println(nim + "\t" + nama + "\t" + kelas + "\t" + ipk);
    }
}