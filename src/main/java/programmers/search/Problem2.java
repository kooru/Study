package programmers.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem2 {

    public static void main(String[] args) {

        System.out.println(new Problem2().solution("123145125"));
    }

    public int solution(String numbers) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length()-1; i++){
            list.add(Integer.parseInt(numbers.substring(i,i+1)));
        }
        Collections.sort(list,Collections.reverseOrder());



        int answer = 0;
        return answer;
    }

}
