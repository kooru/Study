package chapter8;

public class Problem3 {
    static int d[] = new int[101];

    public static void main(String[] args) {
        int[] data = new int[]{1, 3, 1, 5};

        d[0] = data[0];
        d[1] = Math.max(data[0], data[1]);
        for (int i = 2; i < data.length; i++) {
            count(data, i);
        }
        System.out.println(d[3]);
    }

    private static void count(int[] data, int n) {
        d[n] = Math.max(data[n] + d[n - 2], d[n - 1]);
    }
}
