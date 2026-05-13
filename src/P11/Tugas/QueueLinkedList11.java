package P11.Tugas;

public class QueueLinkedList11 {
    Node11 front;
    Node11 rear;
    int size;
    int max;

    public QueueLinkedList11(int max) {
        this.max = max;
        this.size = 0;
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void enqueue(Mahasiswa11 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Mahasiswa tidak dapat mengantri.");
            return;
        }

        Node11 baru = new Node11(mhs);

        if (isEmpty()) {
            front = baru;
            rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }

        size++;
        System.out.println("Mahasiswa berhasil masuk antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa yang dipanggil.");
            return;
        }

        System.out.println("Mahasiswa yang dipanggil:");
        front.data.tampilkanData();

        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan:");
            front.data.tampilkanData();
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling akhir:");
            rear.data.tampilkanData();
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        Node11 temp = front;
        System.out.println("Daftar Antrian:");
        System.out.println("NIM\tNama\tKelas\tIPK");

        while (temp != null) {
            temp.data.tampilkanData();
            temp = temp.next;
        }
    }

    public int getJumlahAntrian() {
        return size;
    }
}