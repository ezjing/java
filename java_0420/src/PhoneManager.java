import java.util.Scanner;

public class PhoneManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("인원수>>");
        Phone2[] phones = new Phone2[sc.nextInt()];

        for (int i = 0; i < phones.length; i++) {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
            String name = sc.next();
            String tel = sc.next();

            phones[i] = new Phone2(name,tel);
        }


        System.out.println("저장되었습니다...");

        while (true) {
            System.out.print("검색할 이름>>");
            String name = sc.next();
            for (int j = 0; j < phones.length; j++) {
                if (name.equals(phones[j].getName())) {
                    System.out.println(phones[j].getName() + "의 번호는 " + phones[j].getTel() + " 입니다.");
                }
            }

            if (name.equals("exit")) {
                System.out.println("프로그램을 종료합니다...");
                break;
            }
        }
    }
}
