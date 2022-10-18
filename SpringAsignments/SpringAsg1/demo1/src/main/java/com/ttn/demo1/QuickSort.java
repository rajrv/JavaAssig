package com.ttn.demo1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Quick")
@Primary
public class QuickSort implements Sorting {

    @Override
    public void sort(int[] numbers)
    {
        quickSort(numbers,0,numbers.length-1);

    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static int partition(int[] arr, int low, int high)
    {

        int pivot = arr[high];


        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}
