package book.chapter8;

import java.util.Arrays;

public class Problem5 {
    static int d[] = new int[10001];

    public static void main(String[] args) {
        Arrays.setAll(d, operand -> 10001);
        int a = 15;
        int[] k = new int[]{2, 3};

        d[0] = 0;
        count(a, k);

        System.out.println(Arrays.toString(d));
        System.out.println(d[15]);
    }

    private static void count(int a, int[] k) {
        for (int i = 0; i < k.length; i++) {
            for (int j = k[i]; j < a; j++) {
                if(d[j-k[i]] != 10001){
                    d[j] = Math.min(d[j],d[j-k[i]]+1);
                }
            }
        }
    }
}
