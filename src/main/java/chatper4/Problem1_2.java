package chatper4;

import java.util.Scanner;

public class Problem1_2 {
    public static void main(String[] args) {
        int N = 0; // Array Size


        Scanner sc = new Scanner(System.in);
        String firstLine = "5";//sc.nextLine();

        String[] s = firstLine.split(" ");
        N = Integer.valueOf(s[0]);
        if (N > 23 || N < 0) throw new RuntimeException("N Over");

        int count = 0;
        int count2 = 0;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    String time = String.format("%02d", i).concat(":" + String.format("%02d", j)).concat(":" + String.format("%02d", k));
                    if (time.contains("3")) {
                        count++;
                    } else {
                        count2++;
                    }
                }

            }
        }
        System.out.println(count);
        System.out.println(count+count2);
    }
}
