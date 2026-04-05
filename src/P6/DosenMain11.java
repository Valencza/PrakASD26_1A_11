package P6;

import java.util.Scanner;

public class DosenMain11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen11 list = new DataDosen11();
        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble)");
            System.out.println("4. Sorting DSC (Selection)");
            System.out.println("5. Exit");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode  : ");
                    String kode = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("JK (L/P): ");
                    String jkInput = sc.nextLine();
                    boolean jk = jkInput.equalsIgnoreCase("L");
                    System.out.print("Usia  : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen11 d = new Dosen11(kode, nama, jk, usia);
                    list.tambah(d);
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    System.out.println("Data diurutkan ASC!");
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Data diurutkan DESC!");
                    break;

                case 5:
                    System.out.println("Keluar...");
                    break;
            }
        } while (pilih != 5);

        sc.close();
    }
}