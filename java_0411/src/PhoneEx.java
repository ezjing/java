import java.util.Scanner;

public class PhoneEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름과 전화번호 입력>>");
        String name1 = sc.next();
        String tel1 = sc.next();
        System.out.print("이름과 전화번호 입력>>");
        String name2 = sc.next();
        String tel2 = sc.next();

        Phone friend1 = new Phone(name1, tel1);
        Phone friend2 = new Phone(name2, tel2);

        System.out.println(name1 + "의 번호 " + tel1);
        System.out.println(name2 + "의 번호 " + tel2);
    }
}
