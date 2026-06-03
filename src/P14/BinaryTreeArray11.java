package P14;

public class BinaryTreeArray11 {
    Mahasiswa11[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray11() {
        this.dataMahasiswa = new Mahasiswa11[10];
        this.idxLast = -1;
    }

    void populateData(Mahasiswa11[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void add(Mahasiswa11 data) {
        if (idxLast + 1 < dataMahasiswa.length) {
            dataMahasiswa[++idxLast] = data;
        } else {
            System.out.println("Array penuh");
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {

                dataMahasiswa[idxStart].tampilInformasi();

                traversePreOrder(2 * idxStart + 1);

                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}