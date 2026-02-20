package P1;

import java.util.Scanner;

public class JadwalKuliah11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, sc);
        tampilSemua(jadwal);

        System.out.print("\nCari berdasarkan hari: ");
        String hari = sc.nextLine();
        tampilBerdasarkanHari(jadwal, hari);

        System.out.print("\nCari berdasarkan nama mata kuliah: ");
        String mk = sc.nextLine();
        tampilBerdasarkanMK(jadwal, mk);

        sc.close();
    }

    public static void inputJadwal(String[][] jadwal, Scanner sc) {

        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();

            System.out.print("Ruangan          : ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari             : ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Jam              : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    public static void tampilSemua(String[][] jadwal) {

        System.out.println("\n=== DAFTAR JADWAL ===");
        System.out.printf("%-20s %-15s %-10s %-15s\n",
                "Mata Kuliah", "Ruangan", "Hari", "Jam");

        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%-20s %-15s %-10s %-15s\n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }
    }

    public static void tampilBerdasarkanHari(String[][] jadwal, String hari) {

        System.out.println("\nJadwal Hari " + hari + ":");

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " | " +
                                   jadwal[i][1] + " | " +
                                   jadwal[i][3]);
            }
        }
    }

    public static void tampilBerdasarkanMK(String[][] jadwal, String mk) {

        System.out.println("\nHasil pencarian mata kuliah:");

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println(jadwal[i][0] + " | " +
                                   jadwal[i][1] + " | " +
                                   jadwal[i][2] + " | " +
                                   jadwal[i][3]);
            }
        }
    }
}
