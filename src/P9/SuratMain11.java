package P9;

import java.util.Scanner;

public class SuratMain11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat11 stack = new StackSurat11(5);

        int pilih;

        do {
            System.out.println("\n=== MENU SURAT IZIN ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat Mahasiswa");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().charAt(0);

                    System.out.print("Durasi (Hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat11 s = new Surat11(id, nama, kelas, jenis, durasi);
                    stack.push(s);

                    System.out.println("Surat berhasil dikirim");
                    break;

                case 2:
                    Surat11 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat dari: " + proses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat11 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir dari: " + terakhir.namaMahasiswa);
                    }
                    break;
                
                case 4:
                    System.out.println("Masukkan nama mahasiswa: ");
                    String cari = sc.nextLine();

                    boolean ditemukan = stack.search(cari);
                    if (ditemukan) {
                        System.out.println("Surat ditemukan untuk " + cari);
                    } else {
                        System.out.println("Surat tidak ditemukan");
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih >= 1 && pilih <= 4);

        sc.close();
    }
}
