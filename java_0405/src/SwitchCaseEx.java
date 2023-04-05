public class SwitchCaseEx {
    public static void main(String[] args) {

        int num = (int)(Math.random() * 6) + 1; // int는 정수타입 데이터 이기 때문에 소수점을 따로 날릴 필요 없다

        switch (num) {
            case 1 :
                System.out.println("1번이 나왔습니다.");
                break;
            case 2 :
                System.out.println("2번이 나왔습니다.");
                break;
            case 3 :
                System.out.println("3번이 나왔습니다.");
                break;
            case 4 :
                System.out.println("4번이 나왔습니다.");
                break;
            case 5 :
                System.out.println("5번이 나왔습니다.");
                break;
            case 6 :
                System.out.println("6번이 나왔습니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }


    }
}
