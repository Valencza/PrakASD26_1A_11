package P3.Matakuliah;

import java.util.Scanner;

public class MatakuliahDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah11[] arrayOfMatakuliah = new Matakuliah11[3];


        System.out.println("Input data matakuliah 1 (lengkap)");
        System.out.print("Kode       : ");
        String kode = sc.nextLine();
        System.out.print("Nama       : ");
        String nama = sc.nextLine();
        System.out.print("SKS        : ");
        int sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam : ");
        int jumlahJam = Integer.parseInt(sc.nextLine());
        arrayOfMatakuliah[0] = new Matakuliah11(kode, nama, sks, jumlahJam);

        System.out.println("------------------------------------");

        System.out.println("Input data matakuliah 2 (kode & nama saja)");
        System.out.print("Kode : ");
        kode = sc.nextLine();
        System.out.print("Nama : ");
        nama = sc.nextLine();
        arrayOfMatakuliah[1] = new Matakuliah11(kode, nama);

        System.out.println("------------------------------------");

        System.out.println("Data matakuliah 3 menggunakan constructor default");
        arrayOfMatakuliah[2] = new Matakuliah11();

        System.out.println("====================================");

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMatakuliah[i].nama);
            System.out.println("SKS        : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("------------------------------------");
        }

        sc.close();
    }
}