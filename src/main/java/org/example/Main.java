package org.example;


public class Main {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 3, 6}, {2, 6, 7}, {5, 7, 3}};
        int[][] matrix3 = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};



    }

    public static int diagonalNumberSum(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sum = sum + matrix[i][j];
                    break;
                }
            }
        }

        return sum;
    }


}