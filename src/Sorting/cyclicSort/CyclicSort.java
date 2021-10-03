package Sorting.cyclicSort;

import java.util.Arrays;

//when given no are from 1 to N, use cyclic sort, missing in the array,
public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {

        int i = 0;
        while (i < arr.length) {

            int correctIndexForElement = arr[i] - 1;
// if the element is at correct Index if not swap with correct index
            if (arr[correctIndexForElement] != arr[i]) {
                swap(arr, correctIndexForElement, i);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int start, int end) {

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }
}
