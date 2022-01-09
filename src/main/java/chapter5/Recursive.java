package chapter5;

public class Recursive {

    public static void main(String[] args) {
        System.out.println(factorial(5));

    }

    static void printf(int count) {
        System.out.println("Call " + count);
        printf(++count);
    }

    static int factorial(int i) {
        if (i == 1) return 1;
        return i * factorial(i - 1);
    }
}
