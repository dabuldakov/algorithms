package org.example.sorts;


import org.example.sorts.sortImpl.BubbleSort;
import org.example.sorts.sortImpl.QuickSort;
import org.example.sorts.sortImpl.SelectionSort;
import org.example.sorts.sortImpl.Sort;
import org.example.sorts.util.UtilsStudy;

public class Main {
    public static void main(String[] args) {

        int[] array = UtilsStudy.prepareArray(7);
        int[] array2 = UtilsStudy.copyArray(array);
        int[] array3 = UtilsStudy.copyArray(array);

        //task14: important
        //task14: important
        //task14: important
        //task14: important
        //task14: important
        //task14: important
        //task14: important
        //task14: important
        //task14: important

        Sort quickSort = new QuickSort(array);
        Sort bubbleSort = new BubbleSort(array2);
        Sort selectionSort = new SelectionSort(array3);
        UtilsStudy.printSort(quickSort);
        UtilsStudy.printSort(bubbleSort);
        UtilsStudy.printSort(selectionSort);

    }

}
