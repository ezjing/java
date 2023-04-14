public class DriverEx {
    public static void main(String[] args) {
        Driver dr = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        // 매개변수의 다형성
        dr.drive(bus);
        dr.drive(taxi);
    }
}
