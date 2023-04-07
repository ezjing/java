public class Car5 {
    String model;
    String color;
    String price;

    // 기본생성자
    public Car5() {
        model = "토레스";
        color = "회색";
        price = "2800";
    }

    // 생성자오버라이드
    public Car5(String model) {
        this.model = model;
        this.color = "회색";
        this.price = "2800";

    }

    public Car5(String model, String color) {
        this.model = model;
        this.color = color;
        this.price = "2800";
    }

    public Car5(String model, String color, String price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }




}
