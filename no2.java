public class no2 {
    public static void main(String[] args) {

        // Pola huruf A B
        for (int i = 0; i < 3; i++) {          // baris
            for (int j = 0; j < 7; j++) {      // kolom
                if (j % 2 == 0) {
                    System.out.print("A ");
                } else {
                    System.out.print("B ");
                }
            }
            System.out.println(); // pindah baris
        }

        System.out.println(); // pemisah antar pola

        // Pola X dengan garis bawah _
        for (int i = 1; i <= 6; i++) {         // baris
            for (int j = 1; j <= 6; j++) {     // kolom
                if (j <= i) {
                    System.out.print("X ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println(); // pindah baris
        }
    }
}
