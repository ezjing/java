import java.util.Scanner;

public class RectEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rect[] rect = new Rect[4];  // 배열 생성자 호출(배열을 만들었지만 내용은 비어있음)

        for(int i = 0; i < rect.length; i++) {
            System.out.print((i + 1) + " 너비와 높이 >>");

            int width = sc.nextInt(); // 스캐너...명령어 주의
            int height = sc.nextInt();

            rect[i] = new Rect(width, height);  // 배열에 데이터를 넣는 생성자 호출
        }


        System.out.print("저장하였습니다...");

        int total = 0 ;

        for (int i = 0; i < rect.length; i++) {
            total += rect[i].getArea();
        }

        System.out.print("사격형의 전체 합은 " + total);
    }
}
