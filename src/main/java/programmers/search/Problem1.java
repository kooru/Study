package programmers.search;

import java.util.*;


public class Problem1 {

    public static void main(String[] args) {

        int[] data = new int[]{1, 3, 2, 4, 2};

        System.out.println(Arrays.toString(new Problem1().solution(data)));

    }

    public int[] solution(int[] answers) {
        int[] s1 = new int[]{1, 2, 3, 4, 5};
        int[] s2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] s3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int a1 = 0;
        int a2 = 0;
        int a3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (s1[i % 5] == answers[i]) a1++;
            if (s2[i % 8] == answers[i]) a2++;
            if (s3[i % 10] == answers[i]) a3++;
        }

        List<Integer> an = new ArrayList<>();
        an.add(a1);
        an.add(a2);
        an.add(a3);
        int result = Collections.max(an);

        an = new ArrayList<>();
        if (a1 == result) {
            an.add(1);
        }
        if (a2 == result) {
            an.add(2);
        }
        if (a3 == result) {
            an.add(3);
        }

        return an.stream().mapToInt(value -> value).toArray();
    }
}
