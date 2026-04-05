package P6;

import java.util.Scanner;

public class MahasiswaDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();

        MahasiswaBeprestasi11 list = new MahasiswaBeprestasi11(n);

        for (int i = 0; i < n; i++) {
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

            Mahasiswa11 m = new Mahasiswa11(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\nData sebelum sorting:");
        list.tampil();

        list.bubbleSort();

        System.out.println("\nData yang sudah terurut menggunakan Bubble Sort (DESC):");
        list.tampil();

        list.selectionSort();

        System.out.println("\nData yang sudah terurut menggunakan Selection Sort (ASC):");
        list.tampil();
        
    }
}