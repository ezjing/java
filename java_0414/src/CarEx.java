public class CarEx {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        myCar.frontLeftTire = new KumhoTire();
        myCar.backRightTire = new KumhoTire();

        myCar.run();

        System.out.println("-------------------------------");

        Car2 yourCar = new Car2();

        yourCar.run();

        yourCar.tires[0] = new HankookTire();
        yourCar.tires[3] = new HankookTire();

        yourCar.run();
    }
}
