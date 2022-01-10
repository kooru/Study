package book.chapter5;

import java.util.Arrays;
import java.util.List;

public class DataSet {

    public List[] listDataSet() {
        List[] graph2 = new List[]{
                Arrays.asList(
                        new Node(1, 7),
                        new Node(2, 5)
                ),
                Arrays.asList(
                        new Node(0, 7)
                ),
                Arrays.asList(
                        new Node(0, 5)
                )
        };
        return graph2;
    }

    public List[] listDataSet2() {
        List[] graph2 = new List[]{
                Arrays.asList(),
                Arrays.asList(new Node(2), new Node(3), new Node(8)),
                Arrays.asList(
                        new Node(1, 7),
                        new Node(7, 5)
                ),
                Arrays.asList(
                        new Node(1), new Node(4), new Node(5)
                ),
                Arrays.asList(
                        new Node(3), new Node(5)
                ),
                Arrays.asList(
                        new Node(3), new Node(4)
                ),
                Arrays.asList(
                        new Node(7)
                ),
                Arrays.asList(
                        new Node(2), new Node(6), new Node(8)
                ),
                Arrays.asList(
                        new Node(1), new Node(7)
                )
        };
        return graph2;
    }

    public int[][] arrayDataSet() {
        return new int[][]{{0, 7, 5}, {7, 0, -1}, {5, -1, 0}};
    }

    class Node {
        int nodeIdx;
        int length;

        public Node(int nodeIdx) {
            this.nodeIdx = nodeIdx;
        }

        public Node(int nodeIdx, int length) {
            this.nodeIdx = nodeIdx;
            this.length = length;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "nodeIdx=" + nodeIdx +
                    ", length=" + length +
                    '}';
        }

        public int getNodeIdx() {
            return nodeIdx;
        }

        public void setNodeIdx(int nodeIdx) {
            this.nodeIdx = nodeIdx;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

    }

}