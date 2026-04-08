package P7;

import java.util.Scanner;

public class MahasiswaDemo11 {
    public static void main(String[] args) {
        MahasiswaBeprestasi11 list = new MahasiswaBeprestasi11();
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            list.tambah(new Mahasiswa11(nim, nama, kelas, ipk));
        }

        System.out.println("\nData sebelum sorting:");
        list.tampil();

        list.bubbleSort();

        System.out.println("\nData yang sudah terurut menggunakan Bubble Sort (DESC):");
        list.tampil();

        list.selectionSort();

        System.out.println("\nData yang sudah terurut menggunakan Selection Sort (ASC):");
        list.tampil();

        list.insertionSort();

        System.out.println("\nData yang sudah terurut menggunakan Insertion Sort (ASC): ");
        list.tampil();

        System.out.println("-------------------------------------");
        System.out.println("Pencarin Data");
        System.out.println("-------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.println("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}