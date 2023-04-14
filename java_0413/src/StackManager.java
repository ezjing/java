import java.util.Scanner;

public class StackManager {
    public static void main(String[] args) {

//        StringStack stack = new StringStack();
//
//        stack.push(I);
//        stack.push(love);
//        stack.push(sunny);
//        stack.push(very);
//        stack.push(much);
//
//        stack.pop();
//
//        Scanner sc = new Scanner(System.in);
//
//        for(int i = 0; i < strArr.length; i++) {
//            System.out.print(">>");
//             = sc.next();
//            strArr[i] = new StringStack();
//        }

        // StringStack 클래스  타입의 변수 선언 및 객체 생성
        // 매개변수를 정수 10을 사용하여 스택 구조로 사용하는 배열의 크기를 10으로 설정
        StringStack stack = new StringStack(10);
        Scanner sc = new Scanner(System.in);

        System.out.print(" >> ");

        // 5번은 사용자 키보드 입력
        for (int i = 0; i < 5; i++) {
            String text = sc.next();
            // StringStack 클래스 타입의 객체 stack의 메소드 push를 사용하여 데이터를 입력받은 데이터를 저장
            stack.push(text);
        }

        // StringStack 클래스 타입의 객체 stack의 메소드 length()를 사용하여 스택 구조의 배열 저장된 데이터의 크기를 가져옴, 카운트 값 확인 가능
        int count = stack.length();

        // 입력된 내용을 출력
        for (int i = 0; i < count; i++) {
            // StringStack 클래스 타입의 객체 stack의 메소들 pop()을 사용하여 스택 구조의 배열에 저장된 데이터를 하나씩 가져옴
            System.out.print(stack.pop() + " ");
        }
    }
    }
// 배열을 쓰는 문제인거같음, 입력은 배열 정순 ,출력은 배열 역순

// >>I love sunny very much
// much very sunny love I
