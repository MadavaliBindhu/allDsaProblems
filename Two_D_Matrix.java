public class BorderSumCalculator {

	    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {1, 2, 3},
            
        };

        int sum = calculateBorderSum(array);
        System.out.println("Sum of border elements: " + sum);
    }

    public static int calculateBorderSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int borderSum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    borderSum += matrix[i][j];
                }
            }
        }

        return borderSum;
    }

}

