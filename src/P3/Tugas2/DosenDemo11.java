package P3.Tugas2;

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
        DataDosen11 data = new DataDosen11();

        for (int i = 0; i < jumlahIndex; i++) {
            System.out.println("--------------------------------");
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.println("--------------------------------");
            System.out.print("Masukkan Kode Dosen: ");
            kode = sc.nextLine();
            System.out.print("Masukkan Nama Dosen: ");
            nama = sc.nextLine();

            do {
                System.out.print("Pilih jenis kelamin (L/P): ");
                pilihan = sc.next().charAt(0);
                if (pilihan == 'L' || pilihan == 'l') {
                    jenisKelamin = true;
                    System.out.println("Laki-laki");
                    break;
                } else if (pilihan == 'P' || pilihan == 'p') {
                    jenisKelamin = false;
                    System.out.println("Perempuan");
                    break;
                } else {
                    System.out.println("Inputan tidak sesuai");
                }
            } while (true);

            sc.nextLine();

            System.out.print("Masukkan usia: ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);

            arrDosen[i] = new Dosen11(kode, nama, jenisKelamin, usia);

            System.out.println("-----------------------------------");
        }

        data.dataSemuaDosen(arrDosen);
        data.jumlahDosenPerJenisKelamin(arrDosen);
        data.rerataUsiaDosenPerJenisKelamin(arrDosen);
        data.infoDosenPalingTua(arrDosen);
        data.infoDosenPalingMuda(arrDosen);

        sc.close();
    }
}
