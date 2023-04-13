// Vehicle 상속 및 메소드 오버라이드
public class Taxi extends Vehicle {
    @Override
    public void run() {
        System.out.println("텍시가 달립니다.");
    }
}
