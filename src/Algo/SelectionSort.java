package Algo;

public class SelectionSort {

    public static void main(String[] args){

        int[] array = {20, 35, -15, 7, 55, 1, 55};

        for(int lastUnsortedIndex = array.length - 1;
            lastUnsortedIndex > 0; lastUnsortedIndex--){

            int largestIndex = 0;
            for(int i = 1; i <= lastUnsortedIndex; i++){
                if(array[i] > array[largestIndex])
                    largestIndex = i;
            }

            swap(array, largestIndex, lastUnsortedIndex);
        }

        for(int sorted : array){
            System.out.println(sorted);
        }

    }

    public static void swap(int[] array, int i, int j){

        if (array[i] == array[j])
            return;

        int temp = array[i];
        array[i] =  array[j];
        array[j] = temp;
    }
}
