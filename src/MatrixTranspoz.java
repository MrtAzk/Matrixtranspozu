public class MatrixTranspoz {
    public static void main(String[] args) {

        // Orijinal matrisi tanımla
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
        };

        // Transpoz matrisini oluştur (satır ve sütunları yer değiştirerek)
        int[][] matrix2 = new int[matrix[0].length][matrix.length];

        // Matrisin transpozunu al
        for (int row = 0; row < matrix.length; row++) {
            for (int columns = 0; columns < matrix[row].length; columns++) {
                matrix2[columns][row] = matrix[row][columns];
            }
        }

        // Transpoz matrisini ekrana yazdır
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " "); // Yan yana yazdır
            }
            System.out.println(); // Satır bitince alt satıra geç
        }
    }
}
