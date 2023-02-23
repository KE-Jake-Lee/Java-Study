/*
 * Prac02
 * 3의 배수의 합
 */

public class Prac02 {
    public static void main(String[] args) {
        int i = 1, result = 0;
        while (i <= 1000) {
            if (i % 3 == 0) {
                result += i;
            }
            ++i;
        }
        System.out.println("result = " + result);
    }
}
