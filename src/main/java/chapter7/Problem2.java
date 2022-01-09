package chapter7;


import java.util.*;
import java.util.stream.Collectors;

public class Problem2 {

    public static void main(String[] args) {
        int[] data = new int[]{8, 3, 7, 9, 2};
        int[] result = new int[]{5, 7, 9};
        searchBinary(data,result);
    }



    private static void searchBinary(int[] data, int[] result){
        data = Arrays.stream(data).sorted().toArray();
        for (int a: result){
            if(Arrays.binarySearch(data,a)>0){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }

    private static void searchSet(int[] data, int[] result){
        Set<Integer> dataSet = new HashSet<>();
        Arrays.stream(data).forEach(operand -> dataSet.add(operand));
        for (int a: result){
            if(dataSet.contains(a)){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }

}


