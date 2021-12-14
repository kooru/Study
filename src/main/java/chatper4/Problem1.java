package chatper4;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        int N = 0; // Array Size


        Scanner sc = new Scanner(System.in);
        String firstLine = "5";//sc.nextLine();

        String[] s = firstLine.split(" ");
        N = Integer.valueOf(s[0]);

        int w = N;
        int h = N;
        int x = 1;
        int y = 1;

        String secondLine = "R R R U D D";//sc.nextLine();
        s = secondLine.split(" ");
        for (int i = 0; i < s.length; i++) {
            String d = s[i];
            switch (d) {
                case "L":
                    x--;
                    break;
                case "R":
                    x++;
                    break;
                case "U":
                    y--;
                    break;
                case "D":
                    y++;
                    break;
            }
            if (x > w) x = w;
            if (y > h) y = w;
            if (x < 1) x = 1;
            if (y < 1) y = 1;
        }
        System.out.println(y + " " + x);


    }

}
