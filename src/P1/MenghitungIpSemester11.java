package P1;

import java.util.Scanner;

public class MenghitungIpSemester11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mataKuliah = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Criticial Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja",
        };

        int sks = 2;

        double totalBobot = 0;
        int totalSKS = 0;

        double[] nilaiAngka = new double[mataKuliah.length];

        System.out.println("================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
        }

        System.out.println("=========================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=========================");
        System.out.printf("%-50s %-12s %-12s %-12s \n", 
        "Mk", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 1; i < mataKuliah.length; i++) {
            double bobot = konversiNilai(nilaiAngka[i]);
            String huruf = nilaiHuruf(nilaiAngka[i]);

            totalBobot += bobot * sks;
            totalSKS += sks;

            System.out.printf("%-50s %-12s %-12s %-12.2f\n",
                mataKuliah[i],
                nilaiAngka[i],
                huruf,
                bobot
            );
        }

        double ip = totalBobot / totalSKS;

        System.out.println("===============================");
        System.out.printf("IP : %.2f\n", ip);

        sc.close();
    }

    public static double konversiNilai(double nilaiAngka) {
        if (nilaiAngka > 80 && nilaiAngka <= 100) {
            return 4.0;
        } else if (nilaiAngka > 73) {
            return 3.5;
        } else if (nilaiAngka > 65) {
            return 3.0;
        } else if (nilaiAngka > 60) {
            return 2.5;
        } else if (nilaiAngka > 50) {
            return 2.0;
        } else if (nilaiAngka > 39) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    public static String nilaiHuruf(double nilaiAngka) {
        if (nilaiAngka > 80 && nilaiAngka <= 100) {
            return "A";
        } else if (nilaiAngka > 73) {
            return "B+";
        } else if (nilaiAngka > 65) {
            return "B";
        } else if (nilaiAngka > 60) {
            return "C+";
        } else if (nilaiAngka > 39) {
            return "C";
        } else if (nilaiAngka > 39) {
            return "D";
        } else {
            return "E";
        }
    }
}
