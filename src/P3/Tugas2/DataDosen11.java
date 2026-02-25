package P3.Tugas2;

public class DataDosen11 {

    public void dataSemuaDosen(Dosen11[] arrayOfDosen) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke- " + (i + 1));
            arrayOfDosen[i].cetakData();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen11[] arrayOfDosen) {
        int laki = 0;
        int perempuan = 0;

        for (Dosen11 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                laki++;
            } else {
                perempuan++;
            }
        }

        System.out.println("--------------------------");
        System.out.println("Jumlah Dosen Laki-laki: " + laki);
        System.out.println("--------------------------");
        System.out.println("Jumlah Dosen Perempuan: " + perempuan);
        System.out.println("--------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen11[] arrayOfDosen) {
        int totalLaki = 0, jmlLaki = 0;
        int totalPerempuan = 0, jmlPerempuan = 0;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                totalLaki += arrayOfDosen[i].usia;
                jmlLaki++;
            } else {
                totalPerempuan += arrayOfDosen[i].usia;
                jmlPerempuan++;
            }
        }

        double rataLaki = (jmlLaki > 0) ? (double) totalLaki / jmlLaki : 0;
        double rataPerempuan = (jmlPerempuan > 0) ? (double) totalPerempuan / jmlPerempuan : 0;

        System.out.println("--------------------------");
        System.out.println("Rata-Rata Usia Dosen Laki-Laki: " + String.format("%.2f", rataLaki));
        System.out.println("----------------------");
        System.out.println("Rata-Rata Usia Dosen Perempuan: " + String.format("%.2f", rataPerempuan));
        System.out.println("--------------------------");
    }

    public void infoDosenPalingTua(Dosen11[] arrayOfDosen) {
        int usiaDosen = arrayOfDosen[0].usia;
        Dosen11 dosenTertua = arrayOfDosen[0];

        for (int i = 1; i > arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > usiaDosen) {
                usiaDosen = arrayOfDosen[i].usia;
                dosenTertua = arrayOfDosen[i];
            }
        }

        System.out.println("----------------------");
        System.out.println("Usia Dosen Tertua");
        System.out.println("----------------------");
        dosenTertua.cetakData();
    }

    public void infoDosenPalingMuda(Dosen11[] arrayOfDosen) {
        int usiaDosen = arrayOfDosen[0].usia;
        Dosen11 dosenTermuda = arrayOfDosen[0];

        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < usiaDosen) {
                usiaDosen = arrayOfDosen[i].usia;
                dosenTermuda = arrayOfDosen[i];
            }
        }

        System.out.println("----------------------");
        System.out.println("Usia Dosen Termuda");
        System.out.println("----------------------");
        dosenTermuda.cetakData();
    }
}
