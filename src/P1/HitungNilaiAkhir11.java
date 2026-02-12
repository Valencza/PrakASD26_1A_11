package P1;

import java.util.Scanner;

public class HitungNilaiAkhir11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tugas;
        double kuis;
        double uts;
        double uas;
        double nilaiAkhir;

        System.out.println("Program Menghitung Nilai Akhir Mahasiswa");
        System.out.println("=========================================");
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        uts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        uas = sc.nextDouble();

        System.out.println("=========================================");
        System.out.println("=========================================");

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid");
        } else {
            nilaiAkhir = (0.2 * tugas) + (0.3 * kuis) + (0.3 * uts) + (0.2 * uas);
            System.out.printf("Nilai Akhir Mahasiswa: %.2f%n", nilaiAkhir);
            if (nilaiAkhir > 80) {
                System.out.println("Nilai Huruf :A");
            } else if (nilaiAkhir > 73) {
                System.out.println("Nilai Huruf :B+");
            } else if (nilaiAkhir > 65) {
                System.out.println("Nilai Huruf :B");
            } else if (nilaiAkhir > 60) {
                System.out.println("Nilai Huruf :C");
            } else if (nilaiAkhir > 50) {
                System.out.println("Nilai Huruf :C");
            } else if (nilaiAkhir >= 39) {
                System.out.println("Nilai Huruf :D");
            } else {
                System.out.println("Nilai Huruf :E");
            }

            System.out.println("=========================================");
            System.out.println("=========================================");

            if (nilaiAkhir < 39) {
                System.out.println("nilai tidak valid");
            } else {
                System.out.print("SELAMAT ANDA LULUS");
            }
            System.out.println("=========================================");
            System.out.println("=========================================");
        }
        sc.close();
    }
}