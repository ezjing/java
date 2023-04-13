public class ChildEx {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        System.out.println("-------Parent 클래스 타입의 객체 p-------");
        p.method1();
        p.method2();

        System.out.println("-------Child 클래스 타입의 객체 c-------");
        c.method1();    // Child엔 없어도 상속받았기 때문에 실제로는 있는것임
        c.method2();
        c.method3();

        System.out.println("-------Parent에 Child를 c-------");
        p = c;
        p.method1();
        // 부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 대입하면 부모 클래스 타입의 객체처럼 보이지만 '실제로는 자식 클래스 타입'의 객체이므로 데이터는 자식 클래스 타입의 객체가 가지고 있던 것을 그대로 가지고 있음(겉모양은 바뀌었지만 알맹이는 같다)
        p.method2();
        // 부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 대입하면 부모 클래스 타입의 멤버만 사용이 가능
//        p.method3();  // ex. 김동현이 김동현 아버지의 옷을 입고 흉내내고 있는데(안들켜야함) method3이 ufc실력이라고하면 아버지인척 해야하기 때문에 사용할 수 없다
    }
}

//
