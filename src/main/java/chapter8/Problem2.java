package chapter8;

public class Problem2 {

    static int[] d = new int[30001];

    public static void main(String[] args) {
        for (int i = 2; i < d.length - 1; i++) {
            count(i);
        }
        System.out.println(d[101]);
    }

    private static void count(int n) {
        d[n] = d[n - 1] + 1;
        if (n % 5 == 0) {
            d[n] = Math.min(d[n], d[n / 5] + 1);
        }
        if (n % 3 == 0) {
            d[n] = Math.min(d[n], d[n / 3] + 1);
        }
        if (n % 2 == 0) {
            d[n] = Math.min(d[n], d[n / 2] + 1);
        }
    }
}
