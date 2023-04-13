import java.lang.annotation.Target;

public class DriverEx {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // 각각의 객체를 생성 및 run() 실행
        Vehicle vehicle = new Vehicle();
        vehicle.run();

        Bus bus = new Bus();
        bus.run();

        Taxi taxi = new Taxi();
        taxi.run();

        System.out.println("\n------Driver 클래스의 drive()메소드 실행-----\n");
        // Driver 클래스 타입의 객체 driver의 drive() 메소드를 실행
        // 매개변수를 사용한 다형성
        driver.drive(vehicle);
        driver.drive(bus);
        driver.drive(taxi);

        System.out.println("\n------부모 클래스 타입의 변수 vehicle에 자식 클래스 타입의 객체를 대입 후 부모 클래스 타입의 run() 메소드 실행-----\n");
        vehicle = bus;  // 부모클래스 타입의 객체에 자식클래스 타입의 객체를 넣어준 것
        vehicle.run();
        vehicle = taxi; 
        vehicle.run();

        // 결과 ㄷ ㅏ 동일
        
        
        
        
        
        
        
        
        
    }
}
