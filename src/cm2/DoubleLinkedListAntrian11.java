package cm2;

public class DoubleLinkedListAntrian11 {
    NodeAntrian11 head;
    NodeAntrian11 tail;
    int nomor = 1;

    public DoubleLinkedListAntrian11() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    int tambahAntrian(Pembeli11 p) {
        NodeAntrian11 newNode = new NodeAntrian11(nomor, p);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        nomor++;
        return newNode.noAntrian;
    }

    Pembeli11 pangggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }

        Pembeli11 p = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return p;
    }

    void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
            return;
        }

        NodeAntrian11 current = head;

        while (current != null) {
            System.out.printf("%-12d %-15s %-15s%n",
                    current.noAntrian,
                    current.data.namaPembeli,
                    current.data.NoHp);

            current = current.next;
        }
    }
}
