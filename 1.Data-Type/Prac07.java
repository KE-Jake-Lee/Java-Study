/*
 * Prac07
 * 리스트를 문자열로 만들기
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Prac07 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        System.out.println(String.join(" ", myList));
    }
}
