package P14;

public class BinaryTreeArrayMain11 {
    public static void main(String[] args) {

        BinaryTreeArray11 bta = new BinaryTreeArray11();

        bta.add(new Mahasiswa11("244160121", "Ali", "A", 3.57));
        bta.add(new Mahasiswa11("244160185", "Candra", "C", 3.41));
        bta.add(new Mahasiswa11("244160221", "Badar", "B", 3.75));
        bta.add(new Mahasiswa11("244160220", "Dewi", "B", 3.35));

        System.out.println("\n=== PreOrder Traversal ===");
        bta.traversePreOrder(0);

        System.out.println("\n=== InOrder Traversal ===");
        bta.traverseInOrder(0);
    }
}