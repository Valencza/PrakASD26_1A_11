package cm2;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DoubleLinkedListAntrian11 antrian = new DoubleLinkedListAntrian11();
        DoubleLinkedListPesanan11 pesanan = new DoubleLinkedListPesanan11();

        int pilih;

        do {
            System.out.println("\n===========================");
            System.out.println("\nSISTEM ANTRIAN ROYAL DELISH");
            System.out.println("\n===========================");

            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");

            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("======================");
                    System.out.println("   Tambah Antrian");
                    System.out.println("======================");

                    System.out.print("Nama Pembeli: ");
                    String namaPembeli = sc.nextLine();
                    System.out.print("No HP: ");
                    String noHp = sc.nextLine();

                    Pembeli11 pBaru = new Pembeli11(namaPembeli, noHp);
                    int noAntrianBaru = antrian.tambahAntrian(pBaru);

                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + noAntrianBaru);

                    break;
                case 2:
                    System.out.println("===========================");
                    System.out.println("  Daftar Antrian Pembeli");
                    System.out.println("===========================");

                    System.out.printf("%-12s %-15s %-15s%n", "No Antrian", "Nama", "No HP");
                    antrian.cetakAntrian();

                    break;

                case 3:
                    System.out.println("============================");
                    System.out.println("  Hapus Antrian dan Pesan");
                    System.out.println("============================");

                    Pembeli11 p = antrian.pangggilAntrian();

                    if (p != null) {
                        System.out.println("Pelanggan Dipanggil: " + p.namaPembeli);

                        System.out.print("Kode Pesanan: ");
                        int kodePesanan = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Pesanan: ");
                        String namaPesanan = sc.nextLine();
                        System.out.print("Harga: ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        Pesanan11 pe = new Pesanan11(kodePesanan, namaPesanan, harga);
                        pesanan.tambahPesanan(pe);

                        System.out.println(p.namaPembeli + " telah memesan " + pe.namaPesanan);

                        break;
                    }

                    break;

                case 4:
                    System.out.println("=======================");
                    System.out.println("Daftar Antrian Pembeli");
                    System.out.println("=======================");

                    System.out.printf("%-12s %-15s %-15s%n", "Kode Pesanan", "Nama Pesanan", "Harga");

                    pesanan.cetakPesanan();

                    break;

                case 0:
                    System.out.println("Keluar.");
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid!");
                    break;
            }
        } while (pilih != 0);

        sc.close();
    }
}
