package P10.Tugas;

public class AntrianKRS11 {
    Mahasiswa11[] data;
    int front;
    int rear;
    int size;
    int max = 10;

    int sudahProses = 0;
    int maxProses = 30;

    public AntrianKRS11() {
        data = new Mahasiswa11[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public void enqueue(Mahasiswa11 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }

        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;

        System.out.println(mhs.nama + " masuk antrian");
    }

    public Mahasiswa11 dequeue() {
        if (isEmpty()) {
            return null;
        }

        Mahasiswa11 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("=== Proses KRS 2 Mahasiswa ===");

        for (int i = 0; i < 2; i++) {
            if (!isEmpty() && sudahProses < maxProses) {
                Mahasiswa11 mhs = dequeue();
                mhs.tampilkanData();
                sudahProses++;
            }
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("=== Semua Antrian ===");
        for (int i = 0; i < size; i++) {
            data[(front + i) % max].tampilkanData();
        }
    }

    public void lihat2Terdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("=== 2 Terdepan ===");
        for (int i = 0; i < 2; i++) {
            if (i < size) {
                data[(front + i) % max].tampilkanData();
            }
        }
    }

    public void lihatTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("=== Terakhir ===");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getSudahProses() {
        return sudahProses;
    }

    public int getBelumProses() {
        return maxProses - sudahProses;
    }
}