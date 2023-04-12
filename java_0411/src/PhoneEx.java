import java.util.Scanner;

public class PhoneEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 선생님 풀이
        Phone[] phones = new Phone[2];  // 배열이 2개로 고정되어있기 때문에 더 넣고싶어도 더 못넣는다. 나중에 배울 list를 써서 하는게 맞다

        for (int i = 0; i < phones.length; i++) {
            System.out.println("이름과 전화번호 입력 >> ");
            String name = sc.next();
            String tel = sc.next();

            phones[i] = new Phone(name, tel);
        }

        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].getName() + "의 번호" + phones[i].getTel());
            System.out.println(phones);
        }



//        System.out.print("이름과 전화번호 입력>>");
//        String name1 = sc.next();
//        String tel1 = sc.next();
//        System.out.print("이름과 전화번호 입력>>");
//        String name2 = sc.next();
//        String tel2 = sc.next();
//
//        Phone friend1 = new Phone(name1, tel1); // 생성자를 선언하지 않고 호출하였지만 안보이는곳에 기본생성자 자동으로 생성된다
//        Phone friend2 = new Phone(name2, tel2);
//
//        System.out.println(name1 + "의 번호 " + tel1);
//        System.out.println(name2 + "의 번호 " + tel2);
    }
}
