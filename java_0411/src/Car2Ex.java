public class Car2Ex {
    public static void main(String[] args) {
        Car2 car = new Car2();

        // Setter를 사용하여 speed를 수정
        car.setSpeed(-50);

        // Getter를 사용하여 speed를 가져옴
        System.out.println("현재 속도 : " + car.getSpeed());    // return값을 받아서 car.getSpeed()에 넘어온다

        car.setSpeed(60);

        System.out.println("현재 속도 : " + car.getSpeed());

        if (!car.isStop()) {    // car.isStop의 반대결과를 true로 출력
            car.setStop(true);
        }

        System.out.println("현재 속도 : " + car.getSpeed());
    }
}
