package Chapter3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        int N = 0; // Array Size
        int M = 0; // Count
        int K = 0; // consecutive number


        Scanner sc = new Scanner(System.in);
        String firstLine = "5 7 2";//sc.nextLine();

        String[] s = firstLine.split(" ");
        N = Integer.valueOf(s[0]);
        M = Integer.valueOf(s[1]);
        K = Integer.valueOf(s[2]);
        firstLine = "3 4 3 4 3";
        Integer[] arr = Arrays.stream(firstLine.split(" ")).map(s1 -> Integer.valueOf(s1)).toArray(Integer[]::new);
        Arrays.sort(arr, Comparator.reverseOrder());

        if (arr.length != N) throw new RuntimeException("Size Not Matching");
        if (K > M) throw new RuntimeException("consecutive number is bigger then total count");

        int q = M / (K + 1);
        int r = M % (K + 1);

        System.out.println((q * arr[0] * K) + (q * arr[1]) + (r * arr[0]));
        System.out.println(answer(M, K, arr));

    }

    private static int answer(int M, int K, Integer[] arr) {
        int result = 0;
        int m = K;
        int first = arr[0];
        int second = arr[1];
        for (int i = 0; i < M; i++) {
            if (m > 0) {
                result += first;
                m--;
            } else {
                result += second;
                m = K;
            }
        }
        return result;
    }


}
