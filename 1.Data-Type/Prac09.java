/*
 * Prac09
 * 중복 숫자 제거하기
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Prac09 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(new HashSet<>(numbers));
    }
}
