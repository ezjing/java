public class Car6 {
    String model;
    String color;
    String price;

    // this() : 다른 생성자를 호출하는 기능
    public Car6() {
        this("토레스");    // Car6(String model)로 대입(호출)
    }

    public Car6(String model) {
        this(model, "회색");  // 상위에서 토레스 대입받음, 회색 직접 입력 후 Car6(String model, String color)로 대입
    }

    public Car6(String model, String color) {
        this(model, color, "2800"); // 상위에서 토레스, 회색 대입받음, 2800 직접 입력 후 Car6(String model, String color, String price)로 대입
    }

    public Car6(String model, String color, String price) { // 상위에서 토레스, 회색, 2800 대입받은 값 메소드에 입력 이후 this.필드값 으로 출력
        this.model = model;
        this.color = color;
        this.price = price;
    }
}
