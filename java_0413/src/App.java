import java.util.Scanner;

abstract class Calculator {
    protected int a, b;
    abstract protected int calc();  // 추상메소드
    protected void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 2개를 입력하세요>>");
        a = scanner.nextInt();
        b = scanner.nextInt();
    }
    public void run() {
        input();
        int res = calc();
        System.out.println("계산된 값음 " + res);
    }
}

class Adder extends Calculator {

    @Override   // 추상메소드 오버라이드시 super()이 아니고 return을 쓰나보다
    protected int calc() {
        return 0;
    }

    @Override
    public void run() {
        input();
        int res = a + b;
        System.out.println("계산된 값음 " + res);
    }
}

class Subtracter extends Calculator {
    @Override
    protected int calc() {
        return 0;
    }

    @Override
    public void run() {
        input();
        int res = a - b;
        System.out.println("계산된 값음 " + res);
    }
}

public class App {
    public static void main(String[] args) {
        Adder adder = new Adder();
        Subtracter sub = new Subtracter();

        adder.run();
        sub.run();
    }
}