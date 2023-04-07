public class Calculator {
    int num1;
    int num2;
    int result;

    public Calculator() {
        num1 = 10;
        num2 = 3;
        result = 0;
    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = 0;
    }
    
    public void sum() {
        result = num1 + num2;
        System.out.println("두 수의 덧셈은 " + result + "입니다.");
    }
    
    public void sub() {
        result = num1 - num2;
        System.out.println("두 수의 뺄셈은 " + result + "입니다.");
    }

    // 메소드의 원형 (public(접근제한자) void(반환값) multi(메소드이름)(int num1, int num2)(매개변수)), 메소드 사용방법
    public void multi(int num1, int num2) {
        result = num1 * num2;
        System.out.println("두 수의 곱셈은 " + result + "입니다.");
    }

    public void divide(int num1, int num2) {
        result = num1 / num2;
        System.out.println("두 수의 나눗셈은 " + result + "입니다.");
    }
}
