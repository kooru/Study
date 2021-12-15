package chatper4;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        int N = 0; // Array Size

        Scanner sc = new Scanner(System.in);
        String firstLine = "d4";//sc.nextLine();

        char[] input = firstLine.toCharArray();
        int x = (int) input[0] - 97;
        int y = (int) input[1] - 48;

        //(2,1),(2,-1),(-2,1),(-2,-1),(1,2),(1,-2),(-1,2),(-1,-2)
        int[] dx = {-2, -1, 2, 1, 2, 1, -2, -1};
        int[] dy = {1, 2, 1, 2, -1, -2, -1, -2};

        int count = 0;
        for (int i = 0; i < 8; i++) {
            if ((x + dx[i]) >= 0 && (x + dx[i]) < 8 &&
                    (y + dy[i]) >= 0 && (y + dy[i]) < 8) {
                count++;
            }
        }

        System.out.println(count);

    }
}
