public class SmartTelevisionEx {
    public static void main(String[] args) {
        // 인터페이스 RemoteControl, Searchable 를 다중 상속받은 클래스 SmartTelevision 타입의 변수 stv 를 선언과 동시에 객체를 생성
        SmartTelevision stv = new SmartTelevision();

        // RemoteControl의 멤버와 Searchable의 멤버를 모두 사용할 수 있음
            stv.turnOn();
            stv.setVolume(50);
            stv.setVolume(5);
            stv.setMute(true);
            stv.setMute(false);
            stv.search("ps vr 2");
            stv.turnOff();

            RemoteControl irc = null;  // 인터페이스 타입을 나타내기 위한 i
            Searchable is = null;
            
            irc = stv;
            irc.turnOn();
            irc.setVolume(-100);
            irc.setMute(true);
            // irc는 RemonteControl 인터페이스 타입의 변수이므로 인터페이스 RemonteControl의 멤버만 사용할 수 있음 
//            irc.search("ps vr2");   // 오류 발생
            irc.turnOff();
            
            is = stv;
            is.search("ps vr2");
            // is는 Searchabble 인터페이스 타입의 변수이므로 인터페이스 Searchable의 멤버만 사용할 수 있음
//            is.turnOn();  // 오류 발생
//            is.turnOff();

    }
}

// 인터페이스 단일 상속 : 부모타입변수에 자식객체 대입 부모타입의 멤버만 사용 가능
// 인터페이스 다중 상속 : 부모타입과 자식타입의 멤버 둘 다 사용 가능