import java.util.Scanner;

public class BuildingHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 층인지 입력하세요 >>");
        int num = sc.nextInt();

        int result = num * 5;
        System.out.println(result + "m입니다.");
    }
}
