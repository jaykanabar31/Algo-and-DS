package Algo;

public class BubbleSort {

    public static void main(String[] args){

        int[] array = {20, 35, -15, 7, 55, 1, -22};

        for(int lastSortedElement = array.length - 1;
        lastSortedElement > 0; lastSortedElement--){

            for(int i = 0; i < lastSortedElement; i++){
                if(array[i] > array[i+1])
                    swap(array, i , i+1);
            }
        }

        for(int sorted : array){
            System.out.println(sorted);
        }

    }

    public static void swap(int[] array, int i, int j){

        if (i == j)
            return;

        int temp = array[i];
        array[i] =  array[j];
        array[j] = temp;
    }

}
