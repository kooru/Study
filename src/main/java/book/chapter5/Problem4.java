package book.chapter5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
//        String firstLine = "4 5";//sc.nextLine();
        String firstLine = sc.nextLine();

        int N = Integer.parseInt(firstLine.split(" ")[0]); // Array Height
        int M = Integer.parseInt(firstLine.split(" ")[1]); // Array width

        int[][] data = new int[N][M];
        boolean visted[][] = new boolean[N][M];
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

        bfs(data, visted, 0, 0, N, M);
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

    private static int bfs(int data[][], boolean visted[][], int x, int y, int N, int M) {

        final int[] DR = {1, 0, -1, 0};
        final int[] DC = {0, 1, 0, -1};

        int dist = Integer.MAX_VALUE;
        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(x, y, 0));
        while (!queue.isEmpty()) {
            Position cur = queue.poll();
            for (int i = 0; i < DR.length; i++) {
                int nextR = cur.r + DR[i];
                int nextC = cur.c + DC[i];
                int nextDist = cur.dist + 1;
                if (nextR == N - 1 && nextC == M - 1) {
                    dist = Math.min(dist,nextDist);
                }
                if (nextR < 0 || nextR >= N || nextC < 0 || nextC >= M || visted[nextR][nextC] == true || data[nextR][nextC] == 0) {
                    continue;
                }
                queue.add(new Position(nextR, nextC, nextDist));
                visted[nextR][nextC] = true;
            }
        }
        if (visted[N-1][M-1]){
            System.out.println("Found");
        }
        System.out.println(dist);
        return dist;
    }

}
