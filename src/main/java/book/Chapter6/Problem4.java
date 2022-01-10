package book.Chapter6;

import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String firstLine = "4 5";//sc.nextLine();
        String firstLine = sc.nextLine();

        int N = Integer.parseInt(firstLine.split(" ")[0]);
        int M = Integer.parseInt(firstLine.split(" ")[1]);

        String input = sc.nextLine();
        int[] a = Arrays.stream(input.split(" ")).mapToInt(s -> Integer.parseInt(s)).sorted().toArray();
        input = sc.nextLine();
        int[] b = Arrays.stream(input.split(" ")).map(s -> Integer.parseInt(s)).sorted(Collections.reverseOrder()).mapToInt(value -> value).toArray();

        for (int i = 0 ; i < M ; i++){
            int temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }

        System.out.println(Arrays.stream(a).reduce((left, right) -> left+right).getAsInt());


    }
}
