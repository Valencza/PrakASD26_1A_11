package P6;

public class MahasiswaBeprestasi11 {
    Mahasiswa11[] listMhs;
    int idx;

    MahasiswaBeprestasi11(int jumlah) {
        listMhs = new Mahasiswa11[jumlah];
    }

    void tambah(Mahasiswa11 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa11 m : listMhs) {
            m.tampilInformasi();
            System.out.println("-----------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa11 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }
}