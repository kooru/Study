package chapter5;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem_BFS {
    public static void main(String[] args) {


        boolean[] visited = new boolean[9];
        List[] dataSet = new DataSet().listDataSet2();


        new Problem_BFS().bfs(dataSet, 1, visited);
    }

    private void bfs(List[] graph, int start, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int index = queue.poll();
            System.out.print(index + " ");
            graph[index].forEach(o -> {
                int idx = ((DataSet.Node) o).getNodeIdx();
                if (!visited[idx]) {
                    visited[idx] = true;
                    queue.offer(idx);
                }
            });
        }
    }
}
