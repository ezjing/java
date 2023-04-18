import java.util.ArrayList;
import java.util.Scanner;

public class QArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("빈 칸으로 분리하여 5 개의 학점을 입력(A/B/C/D/F)>>");


        ArrayList<String> a = new ArrayList<>();

        for (int i = 0 ; i < 5; i++) {
            String grade = sc.next();   // 반복문 바깥에 있으면 여러개가 입력안된다. 처음 입력한 딱 하나만 출력된다
            a.add(grade);
        }

        String A = "A";
        String B = "B";
        String C = "C";
        String D = "D";
        String F = "F";
        
        
        for (int i = 0 ; i < a.size(); i++) {
            String score = a.get(i);
//            switch (score) {
//                case "A" : System.out.println("4.0");
//                    break;
//                case "B" : System.out.println("3.0");
//                    break;
//                case "C" : System.out.println("2.0");
//                    break;
//                case "D" : System.out.println("1.0");
//                    break;
//                case "F" : System.out.println("0.0");
//                    break;
//            }

            if (score .equals(A)) {System.out.println("4.0");}
            else if (score .equals(B)) {System.out.println("3.0");}
            else if (score .equals(C)) {System.out.println("2.0");}
            else if (score .equals(D)) {System.out.println("1.0");}
            else if (score .equals(F)) {System.out.println("0.0");}

        }
    }
}

