public class Car3Ex {
    public static void main(String[] args) {
        // 컴파일러가 자동으로 기본 생성자를 생성하기 때문에 기본생성자를 이용하여 객체를 생성
        Car3 c1 = new Car3();
        System.out.println(c1.company);
        System.out.println(c1.type);
        System.out.println(c1.price);

        // 생성자가 없는경우 아래처럼 일일이 지정해줘야한다
//        c1.model = "트레일블레이저"


        // c2에 매개변수로 바로 해당 데이터 집어넣어준거임. 기본값은 쉐보레~~
        Car3 c2 = new Car3("르노자동차", "세단", "SM6", "밝은 회색", 2850);
        System.out.println(c2.company);
        System.out.println(c2.type);
        System.out.println(c2.model);
        System.out.println(c2.color);
        System.out.println(c2.price);
    }
}
