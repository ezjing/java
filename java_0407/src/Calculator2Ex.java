public class Calculator2Ex {
    public static void main(String[] args) {
        // 동일한 클래스의 멤버끼리 이름만 사용
        // Calculator2 클래스 타입의 변수 myCal에 Calculator2 클래스의 객체 생성 후 대입
        Calculator2 myCal = new Calculator2();
        // Calculator2 클래스 타입의 객체 myCal의 멤버 메소드 중 execute() 를 호출
        // execute() 메소드를 myCal 객체 외부에서 접근해서 호출함
        // 객체 외부에서 접근
        myCal.execute();

        // 메소드의 4가지 형태(js와 동일)
        // 1. 매개변수 x, 반환값 x
        // 2. 매개변수 o, 반환값 x
        // 3. 매개변수 x, 반환값 o
        // 4. 매개변수 o, 반환값 o
    }
}
