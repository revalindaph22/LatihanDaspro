import java.util.Scanner;

public class TotalNilaiMhs {

    public static int[] isianArray(int angka) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[angka];
        int i = 0;

        while (i < array.length) {
            System.out.print("Masukkan elemen array ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
            i++;
        }
        return array;
    }

    public static void tampilArray(int[] arr) {
        int i = 0;

        System.out.println("\n--- Isi Array ---");
        while (i < arr.length) {
            System.out.println("Elemen ke-" + (i + 1) + ": " + arr[i]);
            i++;
        }
        System.out.println("-----------------");
    }

    public static int hitTot(int[] arr) {
        int i = 0;
        int total = 0; 
        
        while (i < arr.length) {
            total += arr[i];
            i++;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int total = 0;
        int jum;
        int[] dataArray;

        System.out.print("Masukkan jumlah elemen array (jum): ");
        jum = input.nextInt();

        dataArray = isianArray(jum);

        tampilArray(dataArray);

        total = hitTot(dataArray);

        System.out.println("\nTotal (jumlah) seluruh elemen array adalah: " + total);

        input.close();
    }
}