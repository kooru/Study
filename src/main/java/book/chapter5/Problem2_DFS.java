package book.chapter5;

import java.util.List;

public class Problem2_DFS {
    public static void main(String[] args) {

        boolean[] visited = new boolean[9];

        List[] dataSet = new DataSet().listDataSet2();

        new Problem2_DFS().dfs(dataSet, 1, visited);
    }

    private void dfs(List[] graph, int index, boolean[] visited) {
        visited[index] = true;
        System.out.print(index + " ");
        graph[index].forEach(o -> {
            int idx = ((DataSet.Node) o).getNodeIdx();
            if(!visited[idx]) dfs(graph,idx,visited);
        });
    }

}
