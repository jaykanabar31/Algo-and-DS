package HackerRank;

public class MergeSort {

    public static void main(String[] args){

        int[] input = new int[] {8, 0, -1, 7, 4, 20, 9};
        splitArray(input, new int[input.length], 0, input.length - 1);

        for(int i : input){
            System.out.println(i + " ");
        }
    }

    public static void splitArray(int[] input, int[] temp, int leftStart, int rightEnd){
        if(leftStart >= rightEnd)
            return;

        int mid = (leftStart + rightEnd) / 2;
        splitArray(input, temp, leftStart, mid);
        splitArray(input, temp, mid + 1, rightEnd);
        mergeHalves(input, temp, leftStart, rightEnd);
    }

    public static void mergeHalves(int[] input, int[] temp, int leftStart, int rightEnd){
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while(left <= leftEnd && right <= rightEnd)
            temp[index++] = (input[left] <= input[right]) ? input[left++] : input[right++];

        System.arraycopy(input, left, temp, index, leftEnd - left + 1);
        System.arraycopy(input, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, input, leftStart, size);
    }
}
