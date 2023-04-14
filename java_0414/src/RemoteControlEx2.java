public class RemoteControlEx2 {
    public static void main(String[] args) {
        // 익명구현객체 : 인터페이스를 통해서 1회용 클래스를 생성하고 바로 new 생성자()를 통해서 객체를 생성하는 방식
        // 클래스의 이름이 존재하지 않기 때문에 추가적으로 객체를 생성할 수 없음(재활용 불가능)
        // 인터페이스 변수로 접근 불가
        // 추가적으로 필드와 메소드 선언 가능하나 익명 객체 안에서만 사용
        // 인터페이스의 추상 메소드들을 모두 재정의하는 실체 메소드 있어야함
        RemoteControl rc = new RemoteControl() {    // 익명구현객체. 원래는 객체 생성이 불가능 하나, ()뒤에 실체 메소드가 있는 코드블록을 넣으면 구현가능해진다. 실체 메소드들은 클래스로 만들어야하는데 코드블록 안에 넣어버린것, 외부인터페이스 이름 리모트컨트롤 클래스 이름이 아님

            private int volume;

            @Override
            public void turnOn() {

                System.out.println("전원을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("전원을 끕니다.");
            }

            @Override
            public void setVolume(int MAX_VOLUME) {
                if (volume > RemoteControl.MAX_VOLUME) {
                    this.volume = RemoteControl.MAX_VOLUME;
                }
                else if (volume < RemoteControl.MIN_VALUE) {
                    this.volume = RemoteControl.MIN_VALUE;
                }
                else {
                    this.volume = volume;
                }
                System.out.println("현재 볼륨 : " + this.volume);
            }
        };
        rc.turnOn();
        rc.setVolume(5);
        rc.setVolume(10);
        rc.turnOff();
    }
}
