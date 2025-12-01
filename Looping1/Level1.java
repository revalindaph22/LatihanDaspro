public class Level1 {

    public static void main(String[] args) {
        int i = 0;
        while (i < 20) {
            if (i % 2 == 0) { // i dibagi 2 sisanya 0
                System.out.print(i+1); // print i sesuai looping ditambah 1 karena i=0
            }
            i++; // mengulang i=0 i=1 sampai batas yg ditentukan (i<20)
        }
    }
}