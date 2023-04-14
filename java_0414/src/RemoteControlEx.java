public class RemoteControlEx {
    public static void main(String[] args) {
        // 인터페이스 타입의 변수 rc 선언
        // 인터페이스도 추상클래스 처럼 객체를 만들 수 없지만 변수는 생성 가능
        RemoteControl rc = null;

        // 부모 타입의 변수에 자식 클래스 타입의 객체를 저장하는 것이 가능함 (다형성 규격화)
        // 부모타입 변수에 자식 객체를 대입하면 부모의 멤버만 사용가능, 내용은 자식객체 (다형성 규격화)
        rc = new Audio();
        rc.turnOn();
        rc = new Television();
        rc.setVolume(10);
        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();

        rc = new Television();
        rc.turnOn();
        rc.setMute(true);
        rc.setVolume(5);
        rc.setMute(false);
        rc.turnOff();
    }
}
