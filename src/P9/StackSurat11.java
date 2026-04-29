package P9;

public class StackSurat11 {
    Surat11[] stack;
    int size;
    int top;

    public StackSurat11(int size) {
        this.size = size;
        stack = new Surat11[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat11 s) {
        if (!isFull()) {
            top++;
            stack[top] = s;
        } else {
            System.out.println("Stack Penuh ");
        }
    }

    public Surat11 pop() {
        if (!isEmpty()) {
            Surat11 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Tidak ada surat untuk diproses");
            return null;
        }
    }

    public Surat11 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack Kosong");
            return null;
        }
    }

    public boolean search(String nama) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].idSurat + " | " +
                    stack[i].namaMahasiswa + " | " +
                    stack[i].kelas + " | " +
                    stack[i].jenisIzin + " | " +
                    stack[i].durasi);
        }
    }
}
