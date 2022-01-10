package programmers.hash;

import java.util.Arrays;
import java.util.Comparator;

public class Problem2 {

    public static void main(String[] args) {

        String[] data = new String[]{"119", "1195524421", "97674223"};
        String[] data1 = new String[]{"123", "456", "789"};
        System.out.println(new Problem2().solution(data1));
    }

//    public boolean solution(String[] phone_book) {
//        boolean answer = true;
//        phone_book = Arrays.stream(phone_book).sorted(Comparator.comparingInt(value -> value.length())).toArray(String[]::new);
//        for (int i = 0; i < phone_book.length; i++) {
//            for (int j = i + 1; j < phone_book.length; j++) {
//                if(phone_book[i].hashCode() == phone_book[j].substring(0,phone_book[i].length()).hashCode()) answer = false;
//            }
//        }
//        return answer;
//    }

//    public boolean solution(String[] phone_book) {
//        boolean answer = true;
//        for (String s : phone_book) {
//            System.out.println(s.hashCode());
//            System.out.println(s.substring(0,2).hashCode());
//        }
//        return answer;
//    }

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.stream(phone_book).forEach(s -> {

        });
        return answer;
    }
}
