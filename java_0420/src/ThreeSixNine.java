import java.util.Scanner;

public class ThreeSixNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String eng[] = {"student", "love", "java", "happy", "future"};
        String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};

        for (boolean i = true; true;) {
            System.out.print("영어 단어를 입력하세요 >> ");
            String eVal = sc.next();

            int j;
            for (j = 0; j < eng.length; j++) {
                if (eng[j].equals(eVal)) {
                    System.out.println(kor[j]);
                    break;
                }
            }

            if (eVal.equals("exit")) {
                System.out.println("종료합니다.");
                i = false;
                return;
            }

            if (j == eng.length) {
                System.out.println("그런 영어 단어가 없습니다.");
            }
        }


    }
}
