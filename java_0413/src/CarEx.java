public class CarEx {
    public static void main(String[] args) {
        Car car = new Car();    // Car 클래스는 퍼블릭이기 때문에 생성자를 호출한것

        for(int i=1; i <= 5; i++) { // 5바퀴 회전
            int problemLocation = car.run();
            switch(problemLocation) {
                // 실행은 부모의 메소드를 실행 했는데, 실제로는 자식의 메소드가 실행된다
                case 1:
                    System.out.println("앞왼쪽 HankookTire로 교체");
                    car.frontLeftTire = new HankookTire("앞왼쪽", 15); // 원래는 new Tire() 하는게 맞는데 다형성 자동타입변환에 의해서 자식클래스인 HankookTire가 온다
                    break;
                case 2:
                    System.out.println("앞오른쪽 KumhoTire로 교체");
                    car.frontRightTire = new KumhoTire("앞오른쪽", 13);
                    break;
                case 3:
                    System.out.println("뒤왼쪽 HankookTire로 교체");
                    car.backLeftTire = new HankookTire("뒤왼쪽", 14);
                    break;
                case 4:
                    System.out.println("뒤오른쪽 KumhoTire로 교체");
                    car.backRightTire = new KumhoTire("뒤오른쪽", 17);
                    break;
            }
            System.out.println("----------------------------------------");
        }

        System.out.println("\n==========================================\n");

        Car2 car2 = new Car2();

        for (int i = 1; i <= 5; i++) {
            int problemLocation = car2.run();

            if(problemLocation != 0) {
                System.out.println(car2.tires[problemLocation - 1]. location + "Hankook Tire로 교체");
                car2.tires[problemLocation - 1] = new HankookTire(car2.tires[problemLocation - 1].location, 15);
            }

            System.out.println("----------------------------------------");
        }
    }
}