package chapter8;

public class Problem4 {
    static int d[] = new int[1000];

    public static void main(String[] args) {
        d[1] = 1;
        d[2] = 3;
        for (int i = 3; i < 1000; i++){
            count(i);
        }
        System.out.println(d[4]);
    }

    private static void count(int n) {
        d[n] = d[n - 1] + d[n - 2] * 2;
    }
}
