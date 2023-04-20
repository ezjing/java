import java.util.ArrayList;
import java.util.Scanner;

public class taja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> a = new ArrayList<>();

//        while (true) {
            System.out.print("입력 >> ");
            for (int i = 0; i < 5; i++) {
                String text = sc.next();
                String fix = text.replace("q", "e");
                a.add(fix);
            }

            System.out.print("출력 >> ");
            for (int i = 0; i < a.size(); i++) {
                String allFix = a.get(i);
                System.out.print(allFix + " ");
            }

//            for (int i = 0; i < a.size(); i++) {
//                if (a.get(i).equals("exit")) {
//                    break;
//                }
//            }

//        }

    }
}
