/*
 * Prac10
 * 매직넘버 제거하기
 */

import java.util.HashMap;

public class Prac10 {
    private enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        LATTE
    };

    static void printCoffeePrice(CoffeeType type) {
        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.AMERICANO, 3000);  // 1: 아메리카노
        priceMap.put(CoffeeType.ICE_AMERICANO, 4000);  // 2: 아이스 아메리카노
        priceMap.put(CoffeeType.LATTE, 5000);  // 3: 카페라떼
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }

    public static void main(String[] args) {
        printCoffeePrice(CoffeeType.AMERICANO);  // "가격은 3000원 입니다." 출력
    }
}
