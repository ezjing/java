import java.util.*;

public class QHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> cafe = new HashMap<>();

        cafe.put("에스프레소", 2000);
        cafe.put("아메리카노", 2500);
        cafe.put("카푸치노", 3000);
        cafe.put("카페라떼", 3500);

        Set<String> keys = cafe.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()) {
            String key = it.next();
            Integer value = cafe.get(key);
        }

        System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼 있습니다");
        for(int i = 0; i < 3; i++) {
            System.out.print("주문 >>");
            String menu = sc.next();

            Integer price = cafe.get(menu);
            if(price == null) System.out.println();
            else System.out.println(menu + "는 " + price + "입니다.");
        }
    }
}
