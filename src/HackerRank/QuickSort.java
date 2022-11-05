package HackerRank;

public class QuickSort {

    public static void main(String[] args){

        int[] array = new int[] {8, 0, -1, 7, 4, 20, 9};
        quickSort(array, 0, array.length - 1);

        for(int i : array){
            System.out.println(i + " ");
        }
    }

    public static void quickSort(int[] array, int left, int right){
        if(left >= right)
            return;

        int pivot = array[(left + right) / 2];
        int index = partition(array, left, right, pivot);
        quickSort(array, left, index - 1);
        quickSort(array, index, right);

    }

    public static int partition(int[] array, int left, int right, int pivot){
        while(left <= right){
            while(array[left] < pivot)
                left++;
            while(array[right] > pivot)
                right--;

            if(left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }

        return left;
    }

    public static void swap(int[] array, int left, int right){
        int temp = array[right];
        array[right] = array[left];
        array[left] = temp;
    }
}
