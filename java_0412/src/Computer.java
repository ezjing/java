// 클래스 Computer는 클래스 Calculator을 상속받아 모든 멤버(필드 생성자 메소드)를 가져옴
public class Computer extends Calculator {

    // 부모클래스인 Calculator 클래스에서 상속해준 areaCircle()메소드
    // 오버라이딩 : 상속받은 메소드의 접근제한자, 반환값, 메소드 이름, 매개변수의 개수/타입/순서까지 동일하게 구성하고 코드 블록의 내용만 수정한 메소드
    @Override   // 오버라이딩이 제대로 됐기 때문에정상 출력
    double areaCircle(double r) {
        System.out.println("Com 객체의 areaCircle() 실행");
        return Math.PI * r * r; // 오버라이딩(수정)한 부분
    }

    public int sum(int x, int y) {
        System.out.println("Computer 클래스의 오버라이딩 된 sum() 메소드");
        int result = x + y;
        System.out.println("두 수의 덧셈은 " + result + "입니다.");
        return result;
    }

    // 오버라이딩된 메소드
    // 오버라이딩하려고 했지만 사용자의 실수(sum을 total로 잘못씀 or 타입을 잘못 씀)에 의해서 선언부의 변경이 있을 경우 오버라이딩이 되지 않고 자식 클래스 전용의 메소드로 인식됨
//    @Override // 주석 해제하면 잘못된 오버라이드 이기 때문에 오류 표시 뜬다
    public int total(double x, int y) {
        System.out.println("Computer 클래스의 잘못 오버라이딩 된 total() 메소드");
        double result = x + y;
        System.out.println("두 수의 덧셈은 " + result + "입니다.");
        return (int)result;
    }
}

