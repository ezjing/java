import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ArrayList :  배열과 같음, 요소를 추가/삭제 가능, 최대크기 변경 가능
public class ArrayListEx {
    public static void main(String[] args) {
        // 빈 리스트 생성
        List<String> list = new ArrayList<String>(); // List에서 String 넣으면 ArrayList에서 굳이 안넣어도 됨 동작함

        // 리스트에 데이터 추가
        list.add("java");
        list.add("JDBC");
        list.add("Serlet/JSP");
        list.add(2, "Database");    // 2는 순서를 지정해준것
        list.add("mybatis");

        int size = list.size();
        System.out.println("리스트의 총 크기 : " + size);
        System.out.println();

        String skill = list.get(2);
        System.out.println("2 : " + skill);
        System.out.println();

        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            System.out.println(i + " : " + str);
        }

        System.out.println();

        list.remove(2); // Database 삭제
        list.remove(2); // Serlet/JSP 삭제
        list.remove("mybatis"); // mybatis 삭제

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + " : " + str);
        }

        System.out.println("\n---------------------\n");

        // asList(배열) : Arrays 클래스에서 제공한 배열을 ArrayList로 변환하는 메소드
        System.out.println("-----배열을 리스트로 변경-----");
        List<String> list1 = Arrays.asList("김경아", "이지원", "카리나");

        for (String name : list1) {
            System.out.println(name);
        }

        // 리스트로 변경 시 기본 데이터 타입을 사용하면 오류가 발생함
        // <> 안에 기본 데이터 타입의 래퍼 클래스 타입(int는 Integer이런 추가 기능을 가진 타입)을 사용함
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        for (int value : list2) {
            System.out.println(value);
        }

        String[] arrStr = {"JAVA", "JSP", "Spring"};
        List<String> list3 = Arrays.asList(arrStr);
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }

        // toArray() : ArrayList 클래스에서 제공하느 arrayList를 배열로 변환하는 메소드
        // 배열은 크기가 고정되어 있기 때문에 리스트의 크기르ㅗ 배열의 크기를 지정해서 배열을 생성
        // 만들어진 배열에 toArray() 메소드를 사용하여 배열로 변경
        System.out.println("-----리스트를 배열로 변경-----");
        String[] arrStr2 = new String[list3.size()];
        arrStr2 = list3.toArray(arrStr2);
        
        for (int i = 0; i < arrStr2.length; i++) {
            System.out.println(arrStr[i]);
        }
        
    }
}
