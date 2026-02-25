package P3.Tugas1;

import java.util.Scanner;

public class DosenDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kode, nama, dummy;
        Boolean jenisKelamin;
        int usia;
        char pilihan;

        int jumlahIndex;

        System.out.print("Masukkan jumlah dosen yang diinputkan: ");
        jumlahIndex = sc.nextInt();

        sc.nextLine();

        Dosen11[] arrDosen = new Dosen11[jumlahIndex];

        for (int i = 0; i < jumlahIndex; i++) {
            System.out.println("--------------------------------");
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.println("--------------------------------");
            System.out.print("Masukkan Kode Dosen: ");
            kode = sc.nextLine();
            System.out.print("Masukkan Nama Dosen: ");
            nama = sc.nextLine();
            System.out.print("Pilih jenis kelamin (L/P): ");
            pilihan = sc.next().charAt(0);
            jenisKelamin = (pilihan == 'L' || pilihan == 'l');
            sc.nextLine();

            if (jenisKelamin) {
                System.out.println("Jenis Kelamin " + nama + " : Laki-laki");
            } else {
                System.out.println("Jenis Kelamin " + nama + " : Perempuan");
            }

            System.out.print("Masukkan usia: ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);

            arrDosen[i] = new Dosen11(kode, nama, jenisKelamin, usia);

            System.out.println("-----------------------------------");
        }

        for (int i = 0; i < jumlahIndex; i++) {
            System.out.println("------------------------------");
            System.out.println("Data dosen ke-" + (i + 1));
            System.out.println("------------------------------");
            arrDosen[i].cetakData();
        }

        sc.close();
    }
}
