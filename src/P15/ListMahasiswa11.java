package P15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa11 {

    List<Mahasiswa11> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa11... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa11 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    public int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(String nim) {
        Collections.sort(mahasiswas, Comparator.comparing(m -> m.nim));

        return Collections.binarySearch(
                mahasiswas,
                new Mahasiswa11(nim, "", ""),
                Comparator.comparing(m -> m.nim));
    }

    public static void main(String[] args) {

        ListMahasiswa11 lm = new ListMahasiswa11();

        Mahasiswa11 m1 = new Mahasiswa11("201234", "Noureen", "021xx1");
        Mahasiswa11 m2 = new Mahasiswa11("201235", "Akhleema", "021xx2");
        Mahasiswa11 m3 = new Mahasiswa11("201236", "Shannum", "021xx3");

        lm.tambah(m1, m2, m3);
        lm.tampil();

        lm.update(lm.binarySearch("201235"), new Mahasiswa11("201235", "Akhleema lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }
}