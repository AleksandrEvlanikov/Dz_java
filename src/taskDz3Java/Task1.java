package taskDz3Java;

import java.util.Arrays;

public class Task1 {

    public static void mergeSort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        if (arr.length <= 1) {
            return;
        }
        int mid = arr.length / 2;
        int[] leftArr = Arrays.copyOfRange(arr, 0, mid);
        int[] rightArr = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(leftArr);
        mergeSort(rightArr);

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                i++;

            }else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightArr.length) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr));


    }
}