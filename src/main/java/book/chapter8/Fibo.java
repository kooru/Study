package book.chapter8;

public class Fibo {

    static int[] d = new int[10001];

    public static void main(String[] args) {


        System.out.println(fibo(10000));
    }

    private static int fibo(int i) {
//        System.out.println("fibo : " + i);
        if (d[i] != 0) return d[i];
        if (i <= 1) return 1;
        else {
            d[i] = fibo(i - 1) + fibo(i - 2);
            return d[i];
        }
    }

}
