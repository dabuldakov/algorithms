package org.example;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] matrix2 = {{1, 3, 6}, {2, 6, 7}, {5, 7, 3}};
//        int[][] matrix3 = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
//
//        int[] zeroNum = {0, 1, 0, 3, 12, 5, 0};
//        List<String> names = Arrays.asList("John", "Mary", "Peter", "Alice");
//        int[] toReverse = {1, 2, 3, 4, 5, 6, 7};
//        int[] toSort = {11, 2, 3, 4, 7, 6, 10, 5, 5};

//        System.out.println(Arrays.toString(toSort));
//        bubbleSort(toSort);
//        System.out.println(Arrays.toString(toSort));

        var testIterator = new MyIterator(new String[]{"qwe", "asd", "zxc"});

        for (String item : testIterator) {
            System.out.println(item);
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static boolean isPalindromeWord(String word) {
        char[] charArray = word.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1])
                return false;
        }
        return true;
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            swap(array, i, array.length - i - 1);
        }
    }

    public static List<String> sortStringList(List<String> names) {
        return names.stream()
                .map(s -> s.substring(1))
                .sorted((o1, o2) -> o2.compareToIgnoreCase(o1))
                .toList();
    }

    public static void zeroNumbersToEndSwap(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] == 0 && array[i + 1] != 0) {
                    swap(array, i, i + 1);
                }
            }
        }
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

    private static void swap(int[] array, int index1, int index2) {
        int save = array[index1];
        array[index1] = array[index2];
        array[index2] = save;
    }
}