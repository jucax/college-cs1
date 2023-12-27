public class solution3_1_2 {
    public static void main (String[] args) {
        int[][] matrix = new int[20][10];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[j].length; j++){
                matrix[i][j] = 42;
                System.out.print(matrix[i][j]);    
            }
        }
    }
}