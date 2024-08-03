package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 3, 6}, {2, 6, 7}, {5, 7, 3}};
        int[][] matrix3 = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};

        int[] zeroNum = {0, 1, 0, 3, 12, 5, 0};
        zeroNumbersToEndSwap(zeroNum);
        System.out.println(Arrays.toString(zeroNum));

    }

    public static void zeroNumbersToEndSwap(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length-1-j; i++) {
                if (array[i] == 0 && array[i+1] !=0) {
                    swap(array, i, i+1);
                }
            }
        }
    }

    private static void swap(int[] array, int a, int b) {
        int save = array[a];
        array[a] = array[b];
        array[b] = save;
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