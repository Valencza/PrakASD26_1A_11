package P3.Tugas2;

public class Dosen11 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen11 (String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void cetakData(){
        System.out.println("Kode          :" + kode);
        System.out.println("Nama          :" + nama);
        System.out.println("Jenis Kelamin :" + (jenisKelamin ? "Laki Laki" : "Perempuan"));
        System.out.println("Usia          :" + usia + "tahun");
        System.out.println("------------------------------");
    }
}
