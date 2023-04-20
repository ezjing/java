import java.util.Scanner;

public class Multiple3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 10개 입력 >>");

        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }

        System.out.print("\n3의 정수 >> ");
        for (int i = 0; i < 10; i++) {
            if ((num[i] % 3 == 0) && (num[i] != 0)) {
                System.out.print(num[i] + "\t");
            }
        }
    }
}
