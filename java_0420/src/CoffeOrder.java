import java.util.Scanner;

public class CoffeOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("커피 주문하세요>>");
        String menu = sc.next();
        int num = sc.nextInt();

        switch (menu) {
            case "에스프레소" : System.out.println(2000 * num + "원입니다.");
                break;
            case "아메리카노" : System.out.println(2500 * num + "원입니다.");
                break;
            case "카푸치노" : System.out.println(3000 * num + "원입니다.");
                break;
            case "카페라떼" : System.out.println(3500 * num + "원입니다.");
                break;
            default: System.out.println("없는 메뉴입니다.");
                break;
        }
    }
}
