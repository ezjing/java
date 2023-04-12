public class SupersonicAirplane extends Airplane {
    public static final int NORMAL = 1; // 상수 : static + final

    public static final int SUPERSONIC = 2; // 상수

    public int flyMode = NORMAL; // 필드

    @Override   // 부모생성자를 재정의 한것을 @Override로 표시
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속 비행 합니다.");
        }
        else {
            super.fly();    //super. : 부모객체호출(수정되기전 부모객체를 호출하였다), flyMode != SUPERSONIC인 경우 부모(Airplane) fly객체를 사용하란 의미
        }
    }
}
