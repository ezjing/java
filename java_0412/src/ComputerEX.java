public class ComputerEX {
    public static void main(String[] args) {
        int r = 10;

        Calculator cal = new Calculator();
        System.out.println("원면적 : " + cal.areaCircle(r));

        System.out.println("\n---------\n");

        Computer com = new Computer();
        // 오버라이딩된 메소드 실행
        System.out.println("원면적 : " + com.areaCircle(r));

        System.out.println("\n---------\n");

        // @Override 어노테이션 : 해당 메소드가 재정의된 메소드임을 나타내는 명령어
        // 컴파일러에게 해당 메소드가 재정의된 메소드임을 알려줘서 혹시라도 발생할 수 있는 오류를 줄임

        int result = 0;
        com.total(10,20);   // 오버라이딩이 잘못 되어도 값은 나온다. 새로운 메소드를 선언한 격이다.

        result = com.sum(10, 20);    // 제대로 오버라이딩이 된 경우

        System.out.println(result);
    }
}
