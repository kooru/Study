package chapter5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
//        String firstLine = "4 5";//sc.nextLine();
        String firstLine = sc.nextLine();

        int N = Integer.parseInt(firstLine.split(" ")[0]); // Array Height
        int M = Integer.parseInt(firstLine.split(" ")[1]); // Array width

        int[][] data = new int[N][M];

        int lineCount = 0;
        while (sc.hasNext()) {
            String line = sc.nextLine();
            char[] lineData = line.toCharArray();
            if (M != lineData.length) System.out.println("ERROR INPUT");
            for (int i = 0; i < lineData.length; i++) {
                data[lineCount][i] = (int) lineData[i] - 48;
            }
            if (++lineCount == N) break;
        }

        int result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (bfs(data, i, j, N, M)) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }

    private static boolean dfs(int data[][], int x, int y, int N, int M) {
        if (x <= -1 || x >= N || y <= -1 || y >= M) {
            return false;
        }
        if (data[x][y] == 0) {
            data[x][y] = 1;
            dfs(data, x - 1, y, N, M);
            dfs(data, x, y - 1, N, M);
            dfs(data, x + 1, y, N, M);
            dfs(data, x, y + 1, N, M);
            return true;
        } else {
            return false;
        }
    }

    private static boolean bfs(int data[][], int x, int y, int N, int M) {

        final int[] DR = {1, 0, -1, 0};
        final int[] DC = {0, 1, 0, -1};

        Queue<Position> queue = new LinkedList<>();
        if(data[x][y] == 1) return false;
        queue.add(new Position(x,y,0));
        data[x][y] = 1;
        while (!queue.isEmpty()) {
            Position cur = queue.poll();
            for (int i = 0; i < DR.length; i++) {
                int nextR = cur.r + DR[i];
                int nextC = cur.c + DC[i];
                int nextDist = cur.dist + 1;
                if (nextR < 0 || nextR >= N || nextC < 0 || nextC >= M || data[nextR][nextC] == 1) {
                    continue;
                }
                queue.add(new Position(nextR, nextC, nextDist));
                data[nextR][nextC] = 1;
            }
        }
        return true;
    }

}
