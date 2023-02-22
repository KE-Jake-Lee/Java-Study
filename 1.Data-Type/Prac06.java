/*
 * Prac06
 * 리스트 역순 정렬하기
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Prac06 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        myList.sort(Comparator.naturalOrder());
        System.out.println(myList);
    }
}
