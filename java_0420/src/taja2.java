import java.util.ArrayList;
import java.util.Scanner;

public class taja2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        String[] a = new String[5]; 배열
        String text = null;
        String fix = null;

        for (int j = 0; j < 10; j++) {
            System.out.print("입력 >> ");

            for (int i = 0; i < 1; i++) {
//                a[i] = sc.next();
                text = sc.next();
                fix = text.replace("q", "e");
//                break;
            }

            System.out.print("출력 >> ");
            for (int i = 0; i < 1; i++) {
//                text = a[i];
//                fix = text.replace("q", "e");
                System.out.println(fix + "\t");

            }
        }
    }
}
