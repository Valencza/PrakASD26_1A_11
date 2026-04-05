package P5;

public class MainMahasiswa11 {
    public static void main(String[] args) {
        Mahasiswa11[] mhs = {
                new Mahasiswa11("Ahmad", 220101001, 2022, 78, 82),
                new Mahasiswa11("Budi", 220101002, 2022, 85, 88),
                new Mahasiswa11("Cindy", 220101003, 2021, 90, 87),
                new Mahasiswa11("Dian", 220101004, 2021, 76, 79),
                new Mahasiswa11("Eko", 220101005, 2023, 92, 95),
                new Mahasiswa11("Fajar", 220101006, 2020, 88, 85),
                new Mahasiswa11("Gina", 220101007, 2023, 80, 83),
                new Mahasiswa11("Hadi", 220101008, 2020, 82, 84)
        };

        NilaiMahasiswa11 nm = new NilaiMahasiswa11();

        int maxUTS = nm.maxUTS(mhs, 0, mhs.length - 1);
        int minUTS = nm.minUTS(mhs, 0, mhs.length - 1);
        double rataUAS = nm.rataUAS(mhs);

        System.out.println("Nilai UTS tertinggi: " + maxUTS);
        System.out.println("Nilai UTS terendah: " + minUTS);
        System.out.println("Rata-rata nilai UAS: " + rataUAS);
    }
}
