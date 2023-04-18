import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapEx {
    public static void main(String[] args) {

        // Map<키타입, 값타입>
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("김경아", 85);
        map.put("이지원", 90);
        map.put("카리나", 80);
        map.put("윈터", 95);
        System.out.println("총 Entry 수 : " + map.size());

        System.out.println("\t 이지원: " + map.get("이지원"));
        System.out.println();

        Set<String> keyset = map.keySet();
        Iterator<String> keyIter = keyset.iterator();

        while (keyIter.hasNext()) {
            String key = keyIter.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " + value); // 순서가 없기 때문에 출력시 마음대로 출력
        }

        System.out.println();

        map.remove("카리나");
        System.out.println("총 Entry 수 : " + map.size());

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();

        while (entryIter.hasNext()) {
            Map.Entry<String, Integer> entry = entryIter.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + " : " + value);
        }

        System.out.println();

        map.clear();
        System.out.println("총 Entry : " + map.size());

    }
}
