// 상속 : 자식클래스가 부모클래스의 맴버(필드, 메소드)를 물려받는것
// CellPhone 클래스를 상속받아 사용하고 있음
public class DmbCellPhone extends CellPhone{
    // 필드로 channel만 가지고 있음
    int channel;

    //생성자
    DmbCellPhone(String model, String color, int channel) {
        // 생성자 생성자 없으면 기본생성자를 컴파일러가 자동추가 super()도 마찬가지
//        super();  //  부모생성자호출 (기본형임)
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    // 메소드도 turnOnDmb, turnOffDmb, changeChannelDmb 3개만 가지고 있음
    void turnOnDmb() {
        System.out.println("채널" + channel + "번 DMB 방송을 수신합니다");
    }
    void turnOffDmb() {
        System.out.println("DMB 방송 수신을 종료합니다");
    }

    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.println("채널" + channel + "번 방송으로 바꿉니다");
    }
}
