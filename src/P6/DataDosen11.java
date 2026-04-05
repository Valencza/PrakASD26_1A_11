package P6;

public class DataDosen11 {
    Dosen11[] dataDosen11 = new Dosen11[10];
    int idx;

    void tambah(Dosen11 dsn) {
        if (idx < dataDosen11.length) {
            dataDosen11[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen11[i].tampil();
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen11[j].usia < dataDosen11[j - 1].usia) {
                    Dosen11 temp = dataDosen11[j];
                    dataDosen11[j] = dataDosen11[j - 1];
                    dataDosen11[j - 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen11[j].usia > dataDosen11[max].usia) {
                    max = j;
                }
            }
            Dosen11 temp = dataDosen11[max];
            dataDosen11[max] = dataDosen11[i];
            dataDosen11[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen11 temp = dataDosen11[i];
            int j = i;
            while (j > 0 && dataDosen11[j - 1].usia > temp.usia) {
                dataDosen11[j] = dataDosen11[j - 1];
                j--;
            }
            dataDosen11[j] = temp;
        }
    }
}