import java.util.Scanner;

public class KafeIbuMariana {

    public static void DataMenu() {
        System.out.println("==== Menu Kafe Ibu Mariana ====");
        System.out.println("1. Kopi");
        System.out.println("2. Teh");
        System.out.println("3. Es Kelapa Muda");
        System.out.println("4. Roti Bakar");
        System.out.println("5. Gorengan");
        System.out.println("================================");
    }

    public static void DataPenjualan(int Hari, int Terjual) {
        System.out.println("Hari ke-" + Hari + " terjual sebanyak: " + Terjual);
    }

    public static int PjTertinggi(int[] Data) {
        int max = Data[0];
        int index = 0;

        for (int i = 0; i < Data.length; i++) {
            if (Data[i] > max) {
                max = Data[i];
                index = i;
            }
        }
        return index;
    }

    public static double RataRata(int[] Data) {
        int Total = 0;
        for (int i = 0; i < Data.length; i++) {
            Total += Data[i];
        }
        double rata = (double) Total / Data.length;
        return rata;
    }

    public static void InputData(int[] Data) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < Data.length; i++) {
            System.out.print("Masukkan penjualan hari ke-" + (i+1) + ": ");
            Data[i] = input.nextInt();
        }
    }

    public static void TampilkanDataMenu(int[] Data, String namaMenu) {
        System.out.println("=== Data Penjualan " + namaMenu + " ===");
        for (int i = 0; i < Data.length; i++) {
            DataPenjualan(i+1, Data[i]);
        }
    }

    public static void main(String[] args) {

        DataMenu();

        int[] Kopi = new int[7];
        int[] Teh = new int[7];
        int[] EsKelapaMuda = new int[7];
        int[] RotiBakar = new int[7];
        int[] Gorengan = new int[7];

        System.out.println("\nINPUT PENJUALAN KOPI:");
        InputData(Kopi);

        System.out.println("\nINPUT PENJUALAN TEH:");
        InputData(Teh);

        System.out.println("\nINPUT PENJUALAN ES KELAPA MUDA:");
        InputData(EsKelapaMuda);

        System.out.println("\nINPUT PENJUALAN ROTI BAKAR:");
        InputData(RotiBakar);

        System.out.println("\nINPUT PENJUALAN GORENGAN:");
        InputData(Gorengan);

        TampilkanDataMenu(Kopi, "Kopi");
        TampilkanDataMenu(Teh, "Teh");
        TampilkanDataMenu(EsKelapaMuda, "Es Kelapa Muda");
        TampilkanDataMenu(RotiBakar, "Roti Bakar");
        TampilkanDataMenu(Gorengan, "Gorengan");

        String[] namaMenu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
        int[] totalMenu = {
            Kopi[PjTertinggi(Kopi)],
            Teh[PjTertinggi(Teh)],
            EsKelapaMuda[PjTertinggi(EsKelapaMuda)],
            RotiBakar[PjTertinggi(RotiBakar)],
            Gorengan[PjTertinggi(Gorengan)]
        };

        int indexTertinggi = PjTertinggi(totalMenu);
        System.out.println("\nMenu dengan penjualan tertinggi adalah: " + namaMenu[indexTertinggi] +
            " dengan jumlah: " + totalMenu[indexTertinggi]);

        System.out.println("\n=== RATA-RATA PENJUALAN SETIAP MENU ===");
        System.out.println("Rata-rata Kopi: " + RataRata(Kopi));
        System.out.println("Rata-rata Teh: " + RataRata(Teh));
        System.out.println("Rata-rata Es Kelapa Muda: " + RataRata(EsKelapaMuda));
        System.out.println("Rata-rata Roti Bakar: " + RataRata(RotiBakar));
        System.out.println("Rata-rata Gorengan: " + RataRata(Gorengan));

    }
}
