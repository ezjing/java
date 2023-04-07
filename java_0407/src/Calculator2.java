public class Calculator2 {
    int plus(int x, int y) {
        // return이 있으므로 result를 int 타입으로 맞춰줘야한다(x, y가 int 타입)
        int result = x + y;
        return result;
    }

    double avg(int x, int y) {
        // plus()메소드는 동일한 클래스의 멤버이므로 메소드의 이름으로만 호출이 가능
        // 자동타입변환에 의해서 plus()메소드의 반환값이 double 타입의 변수 sum에 저장됨
        double sum = plus(x, y);
        // 큰데이터타입과 작은데이터타입을 연산시 큰데이터타입으로 자동타입변환이 발생
        // return이 있으므로 result를 double 타입으로 맞춰줘야한다(sum이 double 타입)
        double result = sum / 2;
        return result;
    }


    void execute() {
        // avg() 메소드를 직접 호출해서 사용
        // 동일한 클래스의 멤버이므로 메소드의 이름으로만 호출이 가능
        double result = avg(7, 10);
        println("실행 경과 : " + result);
    }
    
    // 프린트 출력부분만 재활용 하기 위해 쓴것
    void println(String message) {
        System.out.println(message);
    }
}
