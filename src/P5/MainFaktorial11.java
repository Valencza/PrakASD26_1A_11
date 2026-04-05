package P5;

import java.util.Scanner;

public class MainFaktorial11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai inputan :");
        int nilai = input.nextInt();

        Faktorial11 fk = new Faktorial11();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));

        input.close();
    }
}