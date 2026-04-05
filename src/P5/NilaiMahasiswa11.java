package P5;

public class NilaiMahasiswa11 {
    int maxUTS(Mahasiswa11[] arr, int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }

        int mid = (l + r) / 2;
        int left = maxUTS(arr, l, mid);
        int right = maxUTS(arr, mid + 1, r);

        return Math.max(left, right);
    }

    int minUTS(Mahasiswa11[] arr, int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }

        int mid = (l + r) / 2;
        int left = minUTS(arr, l, mid);
        int right = minUTS(arr, mid + 1, r);

        return Math.min(left, right);
    }

    double rataUAS(Mahasiswa11[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].uas;
        }
        return total / arr.length;
    }
}
