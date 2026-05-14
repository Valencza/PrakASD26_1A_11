package cm2;

public class DoubleLinkedListPesanan11 {
    NodePesanan11 head;
    NodePesanan11 tail;

    public boolean isEmpty() {
        return head == null;
    }

    void tambahPesanan(Pesanan11 pe) {
        NodePesanan11 newNode = new NodePesanan11(pe);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void cetakPesanan() {
        if (isEmpty()) {
            System.out.println("Pesanan kosong");
            return;
        } 

        NodePesanan11 current = head;

        while (current != null) {
            System.out.printf("%-12d %-15s %-15s%n",
                current.data.kodePesanan,
                current.data.namaPesanan,
                current.data.harga
            );
            current = current.next;
        }
    }

}
