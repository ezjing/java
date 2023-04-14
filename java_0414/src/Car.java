public class Car {
    // 인터페이스 타입의 변수 선언
    // 해당 변수에 자식 클래스 타입의 객체를 저장
    Tire frontLeftTire = new HankookTire(); // Tire가 인터페이스 이기 때문에 객체를 만들수 없어서 자식클래스의 객체를 넣어 만든것
    Tire frontRightTire = new HankookTire();
    Tire backLeftTire = new HankookTire(); // 집에가서 어제했던 이거랑 비교해서 다시 보기 어제했던건 객체도 Tire거였음 그 차이
    Tire backRightTire = new HankookTire();

    void run() {
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }
}
