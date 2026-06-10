package P15.Tugas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main11 {

    static ArrayList<Mahasiswa11> daftarMhs = new ArrayList<>();
    static ArrayList<MataKuliah11> daftarMK = new ArrayList<>();
    static ArrayList<Nilai11> daftarNilai = new ArrayList<>();

    static void isiDataAwal() {

        daftarMhs.add(new Mahasiswa11("20001", "Thalhah", "021xxx"));
        daftarMhs.add(new Mahasiswa11("20002", "Zubair", "021xxx"));
        daftarMhs.add(new Mahasiswa11("20003", "Abdur-Rahman", "021xxx"));
        daftarMhs.add(new Mahasiswa11("20004", "Sa'ad", "021xxx"));
        daftarMhs.add(new Mahasiswa11("20005", "Sa'id", "021xxx"));
        daftarMhs.add(new Mahasiswa11("20006", "Ubaidah", "021xxx"));

        daftarMK.add(new MataKuliah11("00001", "Internet of Things", 3));
        daftarMK.add(new MataKuliah11("00002", "Algoritma dan Struktur Data", 2));
        daftarMK.add(new MataKuliah11("00003", "Algoritma dan Pemrograman", 2));
        daftarMK.add(new MataKuliah11("00004", "Praktikum Algoritma dan Struktur Data", 3));
        daftarMK.add(new MataKuliah11("00005", "Praktikum Algoritma dan Pemrograman", 3));
    }

    static void tampilMahasiswa() {
        System.out.println("\nDAFTAR MAHASISWA");
        System.out.println("================================================");
        System.out.printf("%-8s %-15s %-10s\n", "NIM", "Nama", "Telp");

        for (Mahasiswa11 m : daftarMhs) {
            System.out.printf("%-8s %-15s %-10s\n",
                    m.nim, m.nama, m.telp);
        }
    }

    static void tampilMK() {
        System.out.println("\nDAFTAR MATA KULIAH");
        System.out.println("==============================================================");
        System.out.printf("%-8s %-40s %-5s\n",
                "Kode", "Mata Kuliah", "SKS");

        for (MataKuliah11 mk : daftarMK) {
            System.out.printf("%-8s %-40s %-5d\n",
                    mk.kodeMK, mk.namaMK, mk.sks);
        }
    }

    static void inputNilai(Scanner sc) {

        System.out.print("Kode Nilai : ");
        String kode = sc.nextLine();

        System.out.print("Nilai : ");
        double nilai = sc.nextDouble();
        sc.nextLine();

        tampilMahasiswa();

        System.out.print("\nPilih mahasiswa by NIM : ");
        String nim = sc.nextLine();

        Mahasiswa11 mhsDipilih = null;

        for (Mahasiswa11 m : daftarMhs) {
            if (m.nim.equals(nim)) {
                mhsDipilih = m;
                break;
            }
        }

        tampilMK();

        System.out.print("\nPilih MK by kode : ");
        String kodeMK = sc.nextLine();

        MataKuliah11 mkDipilih = null;

        for (MataKuliah11 mk : daftarMK) {
            if (mk.kodeMK.equals(kodeMK)) {
                mkDipilih = mk;
                break;
            }
        }

        daftarNilai.add(new Nilai11(mhsDipilih, mkDipilih, nilai));

        System.out.println("Data nilai berhasil ditambahkan!");
    }

    static void tampilNilai() {

        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("========================================================================");
        System.out.printf("%-8s %-15s %-40s %-5s %-8s\n",
                "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");

        for (Nilai11 n : daftarNilai) {
            System.out.printf("%-8s %-15s %-40s %-5d %-8.2f\n",
                    n.mahasiswa.nim,
                    n.mahasiswa.nama,
                    n.matkul.namaMK,
                    n.matkul.sks,
                    n.nilai);
        }
    }

    static void cariMahasiswa(Scanner sc) {

        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();

        int totalSKS = 0;

        System.out.println("\nHASIL PENCARIAN");
        System.out.println("========================================================================");
        System.out.printf("%-8s %-15s %-40s %-5s %-8s\n",
                "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");

        for (Nilai11 n : daftarNilai) {
            if (n.mahasiswa.nim.equals(nim)) {

                totalSKS += n.matkul.sks;

                System.out.printf("%-8s %-15s %-40s %-5d %-8.2f\n",
                        n.mahasiswa.nim,
                        n.mahasiswa.nama,
                        n.matkul.namaMK,
                        n.matkul.sks,
                        n.nilai);
            }
        }

        System.out.println("Total SKS yang telah diambil : " + totalSKS);
    }

    static void urutNilai() {

        Collections.sort(daftarNilai,
                Comparator.comparingDouble(n -> n.nilai));

        tampilNilai();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        isiDataAwal();

        int pilih;

        do {

            System.out.println("\n============================================");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA");
            System.out.println("============================================");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    inputNilai(sc);
                    break;

                case 2:
                    tampilNilai();
                    break;

                case 3:
                    cariMahasiswa(sc);
                    break;

                case 4:
                    urutNilai();
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while (pilih != 5);
    }
}