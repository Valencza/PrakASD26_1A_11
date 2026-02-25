package P3.Matakuliah;

import java.util.Scanner;

public class MatakuliahDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String kode, nama, dummy;
        int sks, jumlahJam, jumlahMatkul;

        System.out.println("Masukkan jumlah matakuliah :");
        jumlahMatkul = sc.nextInt();
        sc.nextLine();

        Matakuliah11[] arrayOfMatakuliah = new Matakuliah11[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode : ");
            kode = sc.nextLine();
            System.out.print("Nama : ");
            nama = sc.nextLine();
            System.out.print("Sks: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);

            arrayOfMatakuliah[i] = new Matakuliah11();
            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);

            System.out.println("---------------------------");
        }

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }

        sc.close();
    }
}