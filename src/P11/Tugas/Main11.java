package P11.Tugas;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList11 queue = new QueueLinkedList11(10);

        int pilih;

        do {
            System.out.println("\n=== ANTRIAN LAYANAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Cek Antrian Kosong");
            System.out.println("2. Cek Antrian Penuh");
            System.out.println("3. Kosongkan Antrian");
            System.out.println("4. Tambah Antrian");
            System.out.println("5. Panggil Antrian");
            System.out.println("6. Tampilkan Antrian Terdepan");
            System.out.println("7. Tampilkan Antrian Paling Akhir");
            System.out.println("8. Tampilkan Semua Antrian");
            System.out.println("9. Tampilkan Jumlah Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println(queue.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;

                case 2:
                    System.out.println(queue.isFull() ? "Antrian penuh." : "Antrian belum penuh.");
                    break;

                case 3:
                    queue.clear();
                    break;

                case 4:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();

                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    System.out.print("IPK   : ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();

                    Mahasiswa11 mhs = new Mahasiswa11(nim, nama, kelas, ipk);
                    queue.enqueue(mhs);
                    break;

                case 5:
                    queue.dequeue();
                    break;

                case 6:
                    queue.peekFront();
                    break;

                case 7:
                    queue.peekRear();
                    break;

                case 8:
                    queue.printQueue();
                    break;

                case 9:
                    System.out.println("Jumlah mahasiswa yang masih mengantre: " + queue.getJumlahAntrian());
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);

        sc.close();
    }
}