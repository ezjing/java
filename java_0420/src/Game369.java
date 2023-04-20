import java.util.Scanner;

public class Game369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (boolean i = true; true;) {
            System.out.print("1 ~ 99 사이의 정수를 입력하세요 >>");

            int num = sc.nextInt();

            int ten = num / 10; // 10의 자리 숫자 1~9
            int one = num % 10; // 1의 자리 숫자 1~9

            if (ten == 0) {
                ten = 1;    // 10의 자리가 0일때
            }
            if (one == 0) {
                one = 1;    // 1의 자리가 0일때
            }

            if (ten % 3 == 0 && one % 3 == 0) {
                System.out.println("박수짝짝");
            }
            else if (ten % 3 != 0 && one % 3 == 0) {
                System.out.println("박수짝");
            }
            else if (ten % 3 == 0 && one % 3 != 0) {
                System.out.println("박수짝");
            }
            else if (num == 0) {
                System.out.println("종료합니다.");
                i = false;
                return;
            }
        }
    }
}
