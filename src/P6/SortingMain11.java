package P6;

public class SortingMain11 {
    public static void main(String[] args) {
        int a[] = { 20, 10, 2, 7, 12 };
        int b[] = { 30, 20, 2, 8, 14 };

        Sorting11 dataUrut1 = new Sorting11(a, a.length);
        Sorting11 dataUrut2 = new Sorting11(b, b.length);

        System.out.println("Data awal 1");
        dataUrut1.tampil();
        dataUrut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataUrut1.tampil();

        System.out.println("Data awal 2");
        dataUrut2.tampil();
        dataUrut2.bubbleSort();
        System.out.println("Data sudah diurutkan dengan Selection SORT (ASC)");
        dataUrut2.tampil();

    }
}
