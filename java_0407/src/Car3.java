public class Car3 {
    String company = "쉐보레";
    String model;
    String type = "SUV";
    String color;
    int price;

    // 생성자를 사용하여 필드를 초기화, 기본생성자는 매개변수가 없으므로 ()는 비워두기
    public Car3() {
        // 필드를 객체 내부에서 사용 "필드이름"으로 바로 접근
        model = "트레일블레이저";  // model 앞에 원래는 this가 붙어있음, 매개변수가 없으므로 필드타입인지 매개변수 타입인지 구분 가능하기때문
        color = "파란색";
        price = 2571;
    }


    // 매개변수가 있는 생성자, 사용자가 직접 만들어야함
    // 객체 생성 시 매개변수로 받은 데이터를 기반으로 필드를 초기화함
    public Car3(String company, String type, String model, String color, int price) {
        // this : 클래스 내부에서 객체 자기 자신임을 나타내는 키워드. ex) 필드의 company인지 매개변수의 company인지 구분해야할 경우
        // 매개변수의 이름과 클래스의 멤버 변수인 필드의 이름이 같을 경우 서로 구분하기 위해서 사용함
        this.company = company; // this 뒤의 copany는 제일 위에있는 String으로 지정한 필드로서의 company를 말한다. = 이후 company는 매개변수로서의 company이다
        this.type = type;
        this.model = model;
        this.color = color;
        this.price = price;

        // car3Ex에서 입력한 르노자동차~ 입력내용이 매개변수로 넘어오고 매개변수가 필드 초기값으로 초기화 됨.
    }
}
