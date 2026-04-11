package cm1;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa11[] mhs = new Mahasiswa11[3];
        Buku11[] bk = new Buku11[4];
        Peminjaman11[] pnjm = new Peminjaman11[5];

        int pilih;

        mhs[0] = new Mahasiswa11("22001", "Andi", "Teknik Informatika");
        mhs[1] = new Mahasiswa11("22002", "Budi", "Teknik Informatika");
        mhs[2] = new Mahasiswa11("22003", "Citra", "Sistem Informasi Bisnis");

        bk[0] = new Buku11("B001", "Algoritma", 2020);
        bk[1] = new Buku11("B002", "Basis Data", 2019);
        bk[2] = new Buku11("B003", "Pemrograman", 2018);
        bk[3] = new Buku11("B004", "Fisika", 2024);

        pnjm[0] = new Peminjaman11(mhs[0], bk[0], 7);
        pnjm[1] = new Peminjaman11(mhs[1], bk[1], 3);
        pnjm[2] = new Peminjaman11(mhs[2], bk[2], 10);
        pnjm[3] = new Peminjaman11(mhs[2], bk[3], 6);
        pnjm[4] = new Peminjaman11(mhs[0], bk[1], 4);

        do {
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("Daftar Mahasiswa: ");
                    for (int i = 0; i < mhs.length; i++) {
                        mhs[i].tampilMahasiswa();
                    }
                    break;
                case 2:
                    System.out.println("Daftar Buku:");
                    for (int i = 0; i < bk.length; i++) {
                        bk[i].tampilBuku();
                    }
                    break;
                case 3:
                    System.out.println("Data Peminjaman:");
                    for (int i = 0; i < pnjm.length; i++) {
                        pnjm[i].hitungDenda();
                        pnjm[i].tampilPeminjaman();
                    }
                    break;
                case 4:
                    for (int i = 0; i < pnjm.length; i++) {
                        pnjm[i].hitungDenda();
                    }

                    for (int i = 0; i < pnjm.length; i++) {
                        int max = i;
                        for (int j = i + 1; j < pnjm.length; j++) {
                            if (pnjm[j].denda > pnjm[max].denda) {
                                max = j;
                            }
                        }
                        Peminjaman11 temp = pnjm[max];
                        pnjm[max] = pnjm[i];
                        pnjm[i] = temp;

                    }

                    for (int i = 0; i < pnjm.length; i++) {
                        pnjm[i].tampilPeminjaman();
                    }
                    break;
                case 5:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String cari = sc.nextLine();

                    int left = 0;
                    int right = pnjm.length - 1;
                    int mid;
                    boolean ketemu = false;

                    while (left <= right) {
                        mid = (left + right) / 2;
                        if (pnjm[mid].mhs.nim.equals(cari)) {
                            pnjm[mid].hitungDenda();
                            pnjm[mid].tampilPeminjaman();
                            ketemu = true;
                            break;
                        } else if (pnjm[mid].mhs.nim.compareTo(cari) < 0) {
                            left = mid + 1;
                        } else {
                            right = mid - 1;
                        }
                    }
                    if (!ketemu) {
                        System.out.println("Peminjam dengan NIM " + cari + " tidak ada");
                    }
                    break;
                case 0:
                    System.out.println("Keluar...");
                    break;
            }
        } while (pilih != 0);

        sc.close();
    }
}
