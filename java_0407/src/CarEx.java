public class CarEx {
    public static void main(String[] args) {
        Car myCar = new Car();  // Car는 직접 만든 클래스, myCar는 클래스 타입의 변수, Car()는 생성자, new는 객체생성해주는것, new Car();선언이후 myCar를 객체라고 불러도 괜찮게 된다
        System.out.println("제작회사 : " + myCar.company);  // 객체는 new연산자로 생성하고, .연산자로 멤버에 접근
        System.out.println("모델명 : " + myCar.model);
        System.out.println("색상 : " + myCar.color);
        System.out.println("최고속도 : " + myCar.maxSpeed);
        System.out.println("현재속도 : " + myCar.speed);

        myCar.speed = 50;
        System.out.println("수정된 현재 속도 : " + myCar.speed);

        // 하나의 클래스에서 여러개의 객체생성 가능(myCar + yourCar, 하지만 안에 들어가는 데이터는 각각 따로 가지고있음. 객체(myCar객체, yourCar객체)가 다르기 떄문)
        Car yourCar = new Car();
        yourCar.company = "현대자동차";
        yourCar.model = "투싼";
        yourCar.color = "흰색";
        yourCar.maxSpeed = 300;
        yourCar.speed = 80;

        System.out.println("제작회사 : " + yourCar.company);
        System.out.println("모델명 : " + yourCar.model);
        System.out.println("색상 : " + yourCar.color);
        System.out.println("최고속도 : " + yourCar.maxSpeed);
        System.out.println("현재속도 : " + yourCar.speed);

    }
}
