package P10.Tugas;

import java.util.Scanner;

public class LayananKRSMain11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS11 antrian = new AntrianKRS11();

        int pilih;

        do {
            System.out.println("\n=== MENU KRS DPA ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses KRS (2 mahasiswa)");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Terdepan");
            System.out.println("5. Lihat Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Sudah Diproses");
            System.out.println("8. Belum Diproses");
            System.out.println("9. Clear");
            System.out.println("0. Exit");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();

                    Mahasiswa11 mhs = new Mahasiswa11(nim, nama, prodi, kelas);
                    antrian.enqueue(mhs);
                    break;

                case 2:
                    antrian.prosesKRS();
                    break;

                case 3:
                    antrian.tampilkanSemua();
                    break;

                case 4:
                    antrian.lihat2Terdepan();
                    break;

                case 5:
                    antrian.lihatTerakhir();
                    break;

                case 6:
                    System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
                    break;

                case 7:
                    System.out.println("Sudah diproses: " + antrian.getSudahProses());
                    break;

                case 8:
                    System.out.println("Belum diproses: " + antrian.getBelumProses());
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilih != 0);

        sc.close();
    }
}