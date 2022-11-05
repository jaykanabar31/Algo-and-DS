package Iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subSetSeq(arr);

        for(List list : ans){
            System.out.println(list);
        }
    }

    static List<List<Integer>> subSetSeq(int[] arr){
        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for(int i = 0; i < arr.length ; i++){
            start = 0;
            if(i > 0 && arr[i] == arr[i-1])
                start = end + 1;
            int n = outer.size();
            end = n - 1;
            for(int j = start; j < n ; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
