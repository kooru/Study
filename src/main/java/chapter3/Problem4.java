package chapter3;

import java.util.Scanner;

public class Problem4 {


    public static void main(String[] args) {
        int N = 0; // Array Size
        int M = 0; // Count


        Scanner sc = new Scanner(System.in);
        String firstLine = "29 3";//sc.nextLine();

        String[] s = firstLine.split(" ");
        N = Integer.valueOf(s[0]);
        M = Integer.valueOf(s[1]);


        int count = 0;
        while (N > 1) {
            if (N % M == 0) {
                N /= M;
            } else {
                N -= 1;
            }
            count++;
        }
        System.out.println(count);
    }
}
