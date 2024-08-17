package org.example.leetCode;

import java.util.Arrays;

public class LeetCode {

    public static void main(String[] args) {

//        int[] array = new int[]{1, 1, 3, 2, 2, 5, 6, 6, 7, 6};
//        System.out.println(findFirstUniqueNumber(array));

//        int[] array = {0, 2, 3, 0, 0, 0, 3, 3, 0};
//        addZeroToZero(array);
//        System.out.println(Arrays.toString(array));
//        System.out.println(countHappyTickets());

        int[] array1 = {3, 5, 6, 0, 0, 0};
        int[] array2 = {1, 3, 5};
        mergeTwoArray(array1, array2, 3, 3);
        System.out.println(Arrays.toString(array1));


    }

    private static void mergeTwoArray(int[] nums1, int[] nums2, int m, int n) {
        if (n == 0) {
            return;
        }

        if (nums1[0] == 0) {
            for (int i = 0; i < nums1.length; i++) {
                nums1[i] = nums2[i];
            }
        }

        int[] toArray = new int[nums1.length];
        int offsetNums1 = 0;
        int offsetNums2 = 0;
        int lastIndexToArray = 0;
        int minLength = m < n ? m : n;

        for (int i = 0; i < minLength; i++) {
            if (nums1[i - offsetNums1] < nums2[i - offsetNums2]) {
                toArray[lastIndexToArray] = nums1[i - offsetNums1];
                offsetNums2++;
            } else if (nums1[i - offsetNums1] > nums2[i - offsetNums2]) {
                toArray[lastIndexToArray] = nums2[i - offsetNums2];
                offsetNums1++;
            } else {
                toArray[lastIndexToArray] = nums1[i - offsetNums1];
                lastIndexToArray++;
                toArray[lastIndexToArray] = nums2[i - offsetNums2];
                lastIndexToArray++;
            }
        }

        for (int i = 1; i <= offsetNums1; i++) {
            toArray[lastIndexToArray] = nums1[minLength - 1 - i];
            lastIndexToArray++;
        }

        for (int i = 1; i <= offsetNums2; i++) {
            toArray[lastIndexToArray] = nums2[minLength - 1 - i];
            lastIndexToArray++;
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = toArray[i];
        }
    }

    private static int countHappyTickets() {
        int count = 0;

        for (int i = 0; i < 1000000; i++) {
            String string = "00000" + i;
            if (sumNumbers(string, string.length() - 6, string.length() - 3)
                    == sumNumbers(string, string.length() - 3, string.length())) {
                count++;
            }
        }

        return count;
    }

    private static int sumNumbers(String ticket, int indexFrom, int indexTo) {
        String stringTicket = ticket.substring(indexFrom, indexTo);
        int sum = 0;
        for (int i = 0; i < stringTicket.length(); i++) {
            sum = sum + stringTicket.charAt(i);
        }
        return sum;
    }


    private static void addZeroToZero(int[] array) {
        int[] toArray = new int[array.length];
        int offset = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                if ((i + offset) < array.length) {
                    toArray[i + offset] = 0;
                }
                offset++;
                if ((i + offset) < array.length - 1) {
                    toArray[i + offset] = 0;
                }
            } else {
                if ((i + offset) < array.length) {
                    toArray[i + offset] = array[i];
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = toArray[i];
        }
    }

}
