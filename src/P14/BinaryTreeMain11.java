package P14;

public class BinaryTreeMain11 {
    public static void main(String[] args) {
        BinaryTree11 bst = new BinaryTree11();

        bst.add(new Mahasiswa11("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa11("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa11("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa11("244160220", "Dewi", "B", 3.54));

        System.out.println("\n=== IPK Terkecil ===");
        bst.cariMinIPK();

        System.out.println("\n=== IPK Terbesar ===");
        bst.cariMaxIPK();
    }
}
