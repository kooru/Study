package book.chapter7;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String firstLine = "4 5";//sc.nextLine();
        String firstLine = sc.nextLine();
        int N = Integer.parseInt(firstLine.split(" ")[0]); // Array Height
        int M = Integer.parseInt(firstLine.split(" ")[1]); // Array width
        int lineCount = 0;
        int[] data = null;
        if (sc.hasNext()) {
            String line = sc.nextLine();
            data = Arrays.stream(line.split(" ")).mapToInt(value -> Integer.parseInt(value)).toArray();
        }

        searchBinary(data, M);
    }


    private static int searchBinary(int[] data, int base) {
        data = Arrays.stream(data).sorted().toArray();
        int start = data[0];
        int end = data[data.length-1];
        int result = 0;

        while (start <= end) {
            int total = 0;
            int mid = (start + end) / 2;
            total = Arrays.stream(data).filter(value -> value > mid).map(value -> value - mid).sum();
            if (total < base) {
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }
        System.out.println(result);
        return result;
    }


}


