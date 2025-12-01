public class Level1 {

    public static void main(String[] args) {
        int i = 1;
        while (i < 21) {
            if (i %2 == 0) { // i dibagi 2 sisanya 0
                System.out.print(i); // print i sesuai looping
            }
            i++; // mengulang i=1, i=2 dst. sampai batas yg ditentukan (i<20)
        }
    }
}