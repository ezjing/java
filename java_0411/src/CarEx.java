public class CarEx {
    public  static void main(String[] args) {
        // 인스턴스 멤버 : 인스턴스(객체)마다 갖고있는 필드와 메소드, 인스턴스에 소속된 것이기에 객체없이 사용 불가, 얘들은 서로 객체가 다름 정보 공유 X
        Car myCar = new Car("포르쉐");
        Car yourCar = new Car("벤츠");

        myCar.run();    // 메소드를 갖고있는 인스턴스 멤버
        yourCar.run();
    }
}
