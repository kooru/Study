package Chapter3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        int N = 0; // Array Size
        int M = 0; // Count
        int K = 0; // consecutive number


        Scanner sc = new Scanner(System.in);
        String firstLine = "2 4";//sc.nextLine();

        String[] s = firstLine.split(" ");
        N = Integer.valueOf(s[1]);
        M = Integer.valueOf(s[0]);

        int[][] arr = new int[N][M];

        List<String> arrayLine = Arrays.asList(
                "7 3 1 8",
                "3 3 3 4");

        int result = 0;
        for (int i = 0; i < M; i++) {

            int min = Arrays.stream(arrayLine.get(i).split(" ")).mapToInt(value -> Integer.valueOf(value)).min().getAsInt();
            if (min > result) {
                result = min;
            }
        }


        System.out.println(result);


    }

}
