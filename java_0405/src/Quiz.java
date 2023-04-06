import java.util.Scanner;

public class Quiz {
    public static void quiz01() {
        System.out.println("\n ----- 문제 1 ----- \n");

        Scanner sc = new Scanner(System.in);

        System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
        System.out.print("철수 : ");
        String a = sc.next(); // 철수의 가위, 바위, 보, 문자열을  입력받는다.
        System.out.print("영희 : ");
        String b = sc.next(); // 영희의 가위, 바위, 보, 문자열을 입력받는다.

        if(a.equals("가위")) { // 철수가 가위인 경우
            if(b.equals("가위")) {
                System.out.println("비겼습니다.");
            }
            else if(b.equals("바위")) {
                System.out.println("영희가 이겼습니다.");
            }
            else {
                System.out.println("철수가 이겼습니다.");
            }
        }
        else if(a.equals("바위")) { // 철수가 바위인 경우
            if(b.equals("가위")) {
                System.out.println("철수가 이겼습니다.");
            }
            else if(b.equals("바위")) {
                System.out.println("비겼습니다.");
            }
            else {
                System.out.println("영희가 이겼습니다.");
            }
        }
        else { // 철수가 보인 경우
            if(b.equals("가위")) {
                System.out.println("영희가 이겼습니다.");
            }
            else if(b.equals("바위")) {
                System.out.println("철수가 이겼습니다.");
            }
            else {
                System.out.println("비겼습니다.");
            }
        }
    }

    //  실습문제 2번
//    public static void quiz02() {
//        System.out.println("\n ----- 문제 2 ----- \n");
//
//        System.out.print("몇 층인지 입력하세요 : ");
//        int height = sc.nextInt(); // 정수로 입력받기
//
//        if (height <= 0) {
//            System.out.println("잘못된 데이터 입니다.");
//        }
//        else {
//            System.out.println(height * 5 + "M 입니다.");
//        }
//    }

    public static void quiz02() {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 층인지 입력하세요>>");  // ln없으면 한줄에 칠수있음
        int floor = sc.nextInt();
        int meter = floor * 5;
        System.out.println(meter + "m 입니다.");
    }

    public static void quiz03() {
        Scanner sc = new Scanner(System.in);
        System.out.print("x 값을 입력하세요>>");
        int x = sc.nextInt();
        int y = (x * x) - (3 * x) + 7;
        System.out.println("y=" + y);
    }

    public static void quiz04() {
        Scanner sc = new Scanner(System.in);
        System.out.println("점 (x,y)의 좌표를 입력하세요>>");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x >= 50 && y >= 50) {
            if (x <= 100 && y <= 100) {
                System.out.println("점(" + x + ',' + y + ")은 (50, 50)과 (100, 100)의 사각형 내에 있습니다.");
            }
            else {
                System.out.println("점(" + x + ',' + y + ")은 (50, 50)과 (100, 100)의 사각형 내에 없습니다.");
            }
        }
        else {
            System.out.println("점(" + x + ',' + y + ")은 (50, 50)과 (100, 100)의 사각형 내에 없습니다.");
        }
    }

    public static void quiz05() {
        Scanner sc = new Scanner(System.in);
        System.out.println("논리 연산을 입력하세요>>");

        boolean a = sc.nextBoolean();
        String op = sc.next();
        boolean b = sc.nextBoolean();

        switch (op) {
            case "AND" :
                System.out.println("false");
                break;
            case "OR" :
                System.out.println("true");
                break;
            default :
                System.out.println("잘못된 입력입니다.");
                break;
        }
    }

//    // 틀림 고치기
//    public static void quiz06() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("돈의 액수를 입력하세요>>");
//
//        int m = sc.nextInt();
//
//        if (m >= 10000) {
//            int fm = m / 50000;
//            int om = (m % 50000) / 10000;
//            System.out.println("오만원" + fm + "개");
//            System.out.println("만원" + om + "개");
//            int m2 = m - (fm * 50000) - (om * 10000);
//
//            if (m2 >= 1000) {
//                int ft = m2 / 5000;
//                int ot = (m2 % 5000) / 1000;
//                System.out.println("오천원" + ft + "개");
//                System.out.println("천원" + ot + "개");
//                int m3 = m2 - (ft * 5000) - (ot * 1000);
//
//                if (m3 >= 100) {
//                    int fh = m3 / 500;
//                    int oh = (m3 % 500) / 100;
//                    System.out.println("오백원" + fh + "개");
//                    System.out.println("백원" + oh + "개");
//                    int m4 = m3 - (fh * 500) - (oh * 100);
//
//                    if (m4 >= 10) {
//                        int fw = m4 / 50;
//                        int ow = (m4 % 50) / 10;
//                        System.out.println("오십원" + fw + "개");
//                        System.out.println("십원" + ow + "개");
//                        int m5 = m4 - (fw * 50) - (ow * 10);
//
//                        if (m5 >= 1) {
//                            int fn = m5 / 5;
//                            int on = (m5 % 5) / 1;
//                            System.out.println("오원" + fn + "개");
//                            System.out.println("원" + on + "개");
//
//                        }
//                    }
//                }
//            }
//        } else {
//            int m2 = m;
//            int ft = m2 / 5000;
//            int ot = (m2 % 5000) / 1000;
//            System.out.println("오천원" + ft + "개");
//            System.out.println("천원" + ot + "개");
//            int m3 = m2 - (ft * 5000) - (ot * 1000);
//
//            if (m3 >= 100) {
//                int fh = m3 / 500;
//                int oh = (m3 % 500) / 100;
//                System.out.println("오백원" + fh + "개");
//                System.out.println("백원" + oh + "개");
//                int m4 = m3 - (fh * 500) - (oh * 100);
//
//                if (m4 >= 10) {
//                    int fw = m4 / 50;
//                    int ow = (m4 % 50) / 10;
//                    System.out.println("오십원" + fw + "개");
//                    System.out.println("십원" + ow + "개");
//                    int m5 = m4 - (fw * 50) - (ow * 10);
//
//                    if (m5 >= 1) {
//                        int fn = m5 / 5;
//                        int on = (m5 % 5) / 1;
//                        System.out.println("오원" + fn + "개");
//                        System.out.println("원" + on + "개");
//
//                    }
//                }
//            }
//        }
//    }

    public static void quiz06() {
        System.out.println("\n ----- 문제 6 ----- \n");

        System.out.print("돈의 액수를 입력하세요  : ");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        int n50000 = money / 50000; // 오만원권 개수
        money = money % 50000; // 나머지
        int n10000 = money / 10000; // 만원권 개수
        money = money % 10000; // 나머지
        int n1000 = money / 1000; // 천원권 개수
        money = money % 1000; // 나머지
        int n500 = money / 500; // 오백원 동전 개수
        money = money % 500; // 나머지
        int n100 = money / 100; // 백원 동전 개수
        money = money % 100; // 나머지
        int n10 = money / 10; // 십원 동전 개수
        money = money % 10; // 나머지, 1원 동전 개수

        System.out.println("오만원" + n50000 +"개");
        System.out.println("만원" + n10000 + "개");
        System.out.println("천원" + n1000 + "개");
        System.out.println("500원" + n500 + "개");
        System.out.println("100원" + n100 + "개");
        System.out.println("10원" + n10 + "개");
        System.out.println("1원" + money + "개");
    }



    public static void quiz07() {
        Scanner sc = new Scanner(System.in);
        System.out.println("학점을 입력하세요>>");

        String grade = sc.next();

        switch (grade) {
            case "A" :
            case "B" :
                System.out.println("Excellent");
                break;
            case "C" :
            case "D" :
                System.out.println("Good");
                break;
            case "F" :
                System.out.println("Bye");
                break;
            default :
                System.out.println("잘못된 입력입니다.");
                break;
        }

    }

    public static void quiz08() {
        Scanner sc = new Scanner(System.in);
        System.out.println("커피 주문하세요");

        String coffee = sc.next();
        int cup = sc.nextInt();

        switch (coffee) {
            case "에스프레소" :
                System.out.println(cup * 2000 + "원 입니다.");
                break;

            case "아메리카노" :
                System.out.println(cup * 2500 + "원 입니다.");
                break;

            case "카푸치노" :
                System.out.println(cup * 3000 + "원 입니다.");
                break;

            case "카페라떼" :
                System.out.println(cup * 3500 + "원 입니다.");
                break;
            default :
                System.out.println("잘못된 입력입니다.");
                break;
        }
    }

    // 선생님풀이
//    public static void quiz08() {
//        System.out.println("\n ----- 문제 8 ----- \n");
//
//        System.out.print("커피 주문하세요 : ");
//        String coffee = sc.next(); // 문자열 받기
//        System.out.print("몇잔인지 입력하세요 : ");
//        int count = sc.nextInt(); // 커피 수 입력받기
//
//        if(coffee.equals("에스프레소")) {
//            System.out.println(2000 * count + "원입니다.");
//        }
//        else if(coffee.equals("아메리카노")) {
//            System.out.println(2500 * count + "원입니다.");
//        }
//        else if(coffee.equals("카푸치노")) {
//            System.out.println(3000 * count + "원입니다.");
//        }
//        else if(coffee.equals("카페라떼")) {
//            System.out.println(3500 * count + "원입니다.");
//        }
//        else {
//            System.out.println(coffee + "는 없는 메뉴입니다.");
//        }

        // 여기서 부터 못품
//    public static void quiz09() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("1~99 사이의 정수를 입력하세요>>");
//
//        int num = sc.nextInt();
//
//        if (num <= 99) {
//            int first = num/10; //
//            int second = num - ((num/10) * 10); // 나머지
//
//            if (first % 3 ==< )
//        }
//    }
//
    public static void quiz09() {
        System.out.println("\n ----- 문제 9 ----- \n");

        System.out.print("1~99 사이의 정수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first = n / 10; // 10으로 나눈 몫
        int second = n % 10; // 10으로 나눈 나머지

        if(first == 0) {
            first = 1; // 3의 배수가 아닌 임의의 수로 변경 (0일때 출력 안되기 때문)
        }

        if(second == 0) {
            second = 1; // 3의 배수가 아닌 임의의 수로 변경 (0일때 출력 안되기 때문)
        }

        if(first % 3 == 0 && second % 3 == 0) { // 둘다 3의 배수인 경우
            System.out.println("박수짝짝");
        }
        else if((first % 3 == 0 && second % 3 != 0) ||
                (first % 3 != 0 && second % 3 == 0)) { // 둘 중 하나만 3의 배수인 경우
            System.out.println("박수짝");
        }
        else {
            System.out.println("박수없음");
        }
    }



//    public static void quiz10() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("논리 연산을 입력하세요>>");
//    }

    public static void quiz10() {
        System.out.println("\n ----- 문제 10 ----- \n");

        System.out.print("커피 주문하세요  : ");
        Scanner sc = new Scanner(System.in);
        String coffee = sc.next();
        int count = sc.nextInt();

        if(coffee.equals("에스프레소")) {
            if(count < 10) {
                System.out.println(2000 * count + "원입니다.");
            }
            else {
                System.out.println((int)(2000 * count * 0.95) + "원입니다.");   // 0.95는 double 타입의 데이터이기 때문에 int로 강제데이터변환 해준 모습
            }
        }
        else if(coffee.equals("아메리카노")) {
            System.out.println(2500 * count + "원입니다.");
        }
        else if(coffee.equals("카푸치노")) {
            System.out.println(3000 * count + "원입니다.");
        }
        else if(coffee.equals("카페라떼")) {
            System.out.println(3500 * count + "원입니다.");
        }
        else {
            System.out.println(coffee + "는 없는 메뉴입니다.");
        }
    }

    public static void main(String[] args) {
//        quiz02();
//        quiz03();
//        quiz04();
//        quiz05();
        quiz06();
        quiz07();
        quiz08();
//        quiz09();
//        quiz10();
    }
}
