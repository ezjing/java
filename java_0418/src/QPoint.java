import java.util.HashMap;
import java.util.Scanner;

public class QPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> h = new HashMap<>();

        int many = 0;
        String big = null;
        for(int i = 0; i < 5; i++) {
            System.out.print("이름과 포인트 입력>>");
            String name = sc.next();
            int point = sc.nextInt();
            h.put(name, point);
            System.out.println("(" + name + "," + point + ")");

            if (name == name) {
                point = point + point;
            }
        }
    }
}
