import java.util.Scanner;

public class NilaiMahasiswa {

    static void BacaDataNilai(int[][] nilai, Scanner sc) {
        String[] matkul = {"Algoritma & Struktur Data", "Basis Data", "Statistik"};
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i+1));
            for (int j = 0; j < 3; j++) {
                System.out.print(" Nilai " + matkul[j] + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }
    }


    static double HitungRata(int[] nilaiMhs) {
        int total = 0;
        for (int i = 0; i < 3; i++) {
            total += nilaiMhs[i];
        }
        return total / 3.0;
    }

    static String StatusKelulusan(double rata) {
        if (rata >= 60)
            return "LULUS";
        else
            return "TIDAK LULUS";
    }

    static void TampilHasil(String[] nama, int[][] nilai) {
        System.out.println("\n=== HASIL AKHIR ===");
        for (int i = 0; i < 5; i++) {
            double rata = HitungRata(nilai[i]);
            String status = StatusKelulusan(rata);
            System.out.println(nama[i] + " | Rata-rata: " + rata + " | Status: " + status);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] nama = new String[5];
        int[][] nilai = new int[5][3];

        System.out.println("Masukkan nama 5 mahasiswa:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nama mahasiswa ke-" + (i+1) + ": ");
            nama[i] = sc.next();
        }

        BacaDataNilai(nilai, sc);

        TampilHasil(nama, nilai);

        sc.close();
    }
}

