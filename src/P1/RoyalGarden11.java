package P1;

public class RoyalGarden11 {
    public static void main(String[] args) {
        int[][] stok = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9},
        };

        for (int i = 0; i < stok.length; i++) {
            int pendapatan = hitungPendapatan(
                stok[i][0], 
                stok[i][1], 
                stok[i][2], 
                stok[i][3]
            );

            System.out.println("Royal Garden :" + (i + 1));
            System.out.println("Pendapatan : Rp " + pendapatan);
            System.out.println("Status : " + cekStatus(pendapatan));
        }
    }

    public static int hitungPendapatan(int aglonema, int keladi, int alocasia, int mawar) {
        int hargaAglonema = 75000;
        int hargaKeladi = 50000;
        int hargaAlocasia = 60000;
        int hargaMawar = 10000;

        int total;

        total = (aglonema * hargaAglonema)
              + (keladi * hargaKeladi)
              + (alocasia * hargaAlocasia)
              + (mawar * hargaMawar);
              
                return total;
    }

    public static String cekStatus(int pendapatan) {
        if(pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        } 
    }
}
