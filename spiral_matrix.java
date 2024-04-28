package arrays;
public class spiral_matrix {
    public static void spiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix.length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(matrix[endCol][j] + " ");
            }
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

    public static int digonal(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];// as in diagonal element i ==j
            if (i != matrix.length - i - 1) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }

    
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        // spiral(matrix);
        // int value = digonal(matrix);
        System.out.println(digonal(matrix));
    }
}
