package P9;

public class StackTugasMahasiswa11 {
    Mahasiswa11[] stack;
    int size;
    int top;

    StackTugasMahasiswa11(int size) {
        this.size = size;
        stack = new Mahasiswa11[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Mahasiswa11 mhs) {
        top++;
        stack[top] = mhs;
    }

    public Mahasiswa11 pop() {
        if (!isEmpty()) {
            Mahasiswa11 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai. ");
            return null;
        }
    }

    public Mahasiswa11 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan. ");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}