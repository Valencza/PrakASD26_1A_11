package P1;

import java.util.Scanner;

public class DeretanBilangan11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nim;
        int n;
        
        System.out.print("Input NIM:");
        nim = sc.nextLine();
        n = duaDigitTerakhir(nim);
        cetakDeretanBilangan(n);

        sc.close();
    }

    public static int duaDigitTerakhir(String nim) {
        int panjang;
        String duaDigitTerakhir;
        int n;

        panjang = nim.length();
        duaDigitTerakhir = nim.substring(panjang - 2);
        n = Integer.parseInt(duaDigitTerakhir);

        if (n < 10) {
            n += 10;
        }
        return n;
    }

    public static void cetakDeretanBilangan(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }

            if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }

}
