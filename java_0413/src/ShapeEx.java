import java.util.Scanner;

public class ShapeEx {
    // 추상 클래스인 Shape 클래스 타입의 배열에 저장되는 데이터 위치
    private static int position = 0;

    // 추상 클래스인 Shape 클래스 타입의 배열 선언 (shape 에 line, rect, circle 대입 가능 (다형성))
    private static Shape[] shapes = new Shape[10];  // Shape클래스 타입의 배열이 만들어진것이기 때문에 new가 가능. 객체가 생성된것이 아님, 추상클래스는 객체 생성 불가 (변수는 생성가능)

    Scanner sc = new Scanner(System.in);

    // 메뉴 선택용 변수
    int choice = 0;

    // 무한 반복
    while (choice != 4) {   // choice != 4 를 true로 적어도 상관 없다
        // 화면에 메뉴 출력
        System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
        // 메뉴 선택
        choice = sc.nextInt();

        // 메인 메뉴 선택에 따라 다르게 동작
        switch (choice) {
            case 1:
                // 서브 메뉴 출력
                System.out.print("도형 종류 Line(1), Rect(2), Circle(3) >> ");
                // 서브 메뉴 입력 받기
                int type = sc.nextInt();

                // 서브 메뉴 클릭 시 1 미만, 3초과일 경우 오류 내용 출력 하면서 break로 스위치문 종료
                if (type < 1 || type > 3) {
                    System.out.println("잘못 입력하였습니다.");
                    break;  //  switch 문 강제 종료, while 반복문 재시작
                }

                // 배열에 Shape 클래스 타입의 배열에 데이터 추가
                insert(type);
                break;

            case 2:
                System.out.print("삭제할 도형의 위치 >> ");
                int index = sc.nextInt();
                if (!delete(index)) {
                    System.out.println("삭제할 수 없습니다.");
                }
                break;

            case 3:
                String tmp = "";
                for (int i = 0; i < shapes.length; i++) {
                    if (shapes[i] != null) {
                        tmp += shapes[i] + "\n";
                    }
                }
                System.out.println(tmp);
                break;

            case 4:
                System.out.println("프로그램을 종료합니다...");
                break;

            default:
                System.out.println("잘못 입력하였습니다.");
                break;
        }
    }


    // shapes 배열에 데이터 입력
    public static void insert(int type) {
        // 부모인 추상 클래스 Shape 타입의 변수 선언
        Shape obj = null;

        // 매개변수로 받아온 데이터에 따라 Shape 타입의 변수에 저장할 자식 클래스의 객체를 생성함
        switch (type) {
            case 1:
                obj = new Line();
                break;

            case 2:
                obj = new Rect();
                break;

            case 3:
                obj = new Circle();
                break;
        }

        // 추상 클래스 타입의 배열 shpaes에 데에터 추가
        shapes[position] = obj;
        position++;
    }

    // 추상 클래스 타입의 배열 shapes에 저장된 내용 삭제
    public static boolean delete(int index) {
        int count = 0;
        shapes[index] = null;   // 객체가 들어가있기 때문에 해당 index 에 null 삽입


        // 배열 크기 측정
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == null) {
                count++;
            }
        }

        if (count == shapes.length) {
            return false;
        }
        return true;
    }
}
