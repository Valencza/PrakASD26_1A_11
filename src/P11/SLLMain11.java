package P11;

public class SLLMain11 {
    public static void main(String[] args) {

        SingleLinkedList11 sll = new SingleLinkedList11();

        Mahasiswa11 mhs1 = new Mahasiswa11("123", "Garcia", "TI-1B", 3.8);
        Mahasiswa11 mhs2 = new Mahasiswa11("124", "Fernanda", "3A", 3.7);
        Mahasiswa11 mhs3 = new Mahasiswa11("125", "Valenca", "2A", 3.9);
        Mahasiswa11 mhs4 = new Mahasiswa11("126", "Archadea", "1A", 3.9);

        sll.print();

        sll.addFirst(mhs4);
        sll.print();

        sll.addLast(mhs1);
        sll.print();

        sll.insertAfter("Archadea", mhs3);
        sll.insertAt(2, mhs2);

        sll.print();

        System.out.println("data Index 1: ");
        sll.getData(1);

        System.out.println("data mahasiswa an Valenca berada pada index: " + sll.indexOf("Valenca"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}