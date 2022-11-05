package Algo;

public class MergeSort {

    //Main method - entry point
    public static void main(String[] args){
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        splitArrays(array, 0, array.length);

        //print the sorted array
        for(int sorted : array){
            System.out.println(sorted);
        }
    }

    public static void splitArrays(int[] input, int start, int end){

        //Breaking condition
        if(end - start < 2)
            return;

        int mid = (start + end) / 2;

        //split the left sub part
        splitArrays(input, start, mid);
        //split the right sub part
        splitArrays(input, mid, end);

        //Sort and merge the array
        sortAndMerge(input, mid, start, end);
    }

    public static void sortAndMerge(int[] input, int mid, int start, int end){

        if(input[mid - 1] <= input[mid])
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] tempArray = new int[end - start];

        while(i < mid && j < end)
            tempArray[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];

        //Copy the remaining elements
        System.arraycopy(input, i, input, start + tempIndex, mid - i);

        //Finally copy the entire array
        System.arraycopy(tempArray, 0, input, start, tempIndex);
    }
}
