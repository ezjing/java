// interface 선언은 클래스 선언방식과 동일하며 interface 대신 class 넣으면 클래스 파일로 인식한다
// 클래스와 동일한 방식으로 이름을 설정
public interface RemoteControl {
    // 인터페이스의 필드 (상수)
    // 선언과 동시에 데이터 입력, static 초기화 불록 사용 불가
    int MAX_VOLUME = 10;

    public static final int MIN_VALUE = 0;  // public static final이 생략 가능하기 때문에(기본값임) 회색으로 표시됨

    // 인터페이스의 멤버인 추상 메소드
    // public abstract 키워드를 생략해도 자동으로 추가
    // 자식클래스는 반드시 추상 메소드를 상속받아 구현해야함
    // 상속받은 추상 메소드를 구현하지 않으면 해당 클래스도 추상 클래스가 됨(추상메소드가 있다고 인터페이스가 되는것이 아님)
    void turnOn();
    void turnOff();
    void setVolume(int MAX_VOLUME);

    // 인터페이스의 추가된 멤버, 디폴트 메소드(코드 작성 돼있어야한다)
    default void setMute(boolean mute) {    // 디폴트 메소드는 default 키워드 반드시 붙여줘야함 인터페이스의 기본값은 public 이기 때문
        if(mute) {
            System.out.println("무음 모드 입니다.");
        }
        else {
            System.out.println("무음 모드 해제 합니다.");
        }
    }

    // 인터페이스의 추가된 멤버, 정적 메소드
    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }


}
