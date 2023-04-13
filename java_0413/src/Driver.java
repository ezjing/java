public class Driver {
    public void drive(Vehicle vehicle) {    // Vehicle 타입의 vehicle 매개변수, 생성자를 호출하지 않아도 다른 클래스를 매개변수로서 사용 가능한가보다.
        vehicle.run();  // 매개변수 vehicle을 넣고 run()실행
    }
}
