/*
 * Prac08
 * 맵에서 값 추출하기
 */

import java.util.HashMap;

public class Prac08 {
    public static void main(String[] args) {
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        System.out.println(grade.remove("B"));
    }
}
