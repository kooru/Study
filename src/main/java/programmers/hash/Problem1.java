package programmers.hash;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem1 {

    public static void main(String[] args) {
        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] completion = new String[]{"eden", "kiki"};

        System.out.println(new Problem1().solution(participant,completion));
    }

    public String solution(String[] participant, String[] completion) {
        Map<String,Long> whiteList = Arrays.stream(participant).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Arrays.stream(completion).forEach(s -> {
            long count = whiteList.get(s);
                whiteList.put(s,--count);
        });
        return whiteList.keySet().stream().filter(s -> whiteList.get(s).longValue() > 0).findFirst().get();
    }
}
