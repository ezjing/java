public class Car4 {
    String company;
    String type;
    String model;
    String color;
    int price;

    // 생성자 오버로딩 : 매개변수의 개수, 타입, 순서가 달라야 가능함.(사용자가 다양한 옵션을 선택할수 있도록 하기 위해 ex.자동차 옵션정하기)
    public Car4() {

    }

    // 개수가 다를때
    public Car4(String company) {
        this.company = company;
    }

    public Car4(String company, String type) {
        this.company = company;
        this.type = type;
    }

    public Car4(String company, String type, String model) {
        this.company = company;
        this.type = type;
        this.model = model;
    }

    public Car4(String company, String type, String model, String color) {
        this.company = company;
        this.type = type;
        this.model = model;
        this.color = color;
    }

    // 타입이 다를때
    public Car4(String model, int price) {
        this.model = model;
        this.price = price;
    }

    // 순서가 다를때(데이터 타입의 순서를 따지기 때문에 String 타입의 순서만 바뀌면 에러 발생)
    public Car4(int price, String model) {
        this.price = price;
        this.model = model;
    }

//    public Car4(String type, String company) {
//
//    }
}
