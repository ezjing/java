public class Calculator4Ex {
    public static void main(String[] args) {
        // 정적멤버 : 클래스명.필드명, 클래스명.메소드, 정적멤버는 클래스를 통해서 접근하는게 올바른 방법이고 객체를 통해서 접근하는것은 올바른방법 아니다.(다만 사용은 가능)
        // 정적(static) 멤버 : 클래스의 멤버로 동작하는 필드와 메소드
        // 객체 생성 없이 클래스의 이름을 통해서 필드와 메소드에 접근이 가능
        // 정적 멤버는 데이터를 공유(인스턴스멤버는 서로 다른 객체이기 때문에 데이터를 공유하지 않는다)
        // 클래스명.멤버명 으로 접근
        // 일반 인스턴스 멤버는 정적 멤버 사용할 수 있음(메소드까지 다 로딩이 된 상태 = 정적멤버도 로딩이 됐다는 뜻. 그러므로 사용 가능)
        // 정적 멤버는 일반 인스턴스 멤버를 사용할 수 없음 (정적멤버는 클래스 로딩시 함께 로딩이 되기 때문에, 메인메소드 로딩 전에 이미 로딩된다. 그래서 정적멤버가 동작할때 인스턴스 멤버가 만들어졌는지 아닌지 알수 없다. 안만들어졌는데 실행이 될수 있다는 말임)
        // 필드로서 사용할때 : 공용적인 데이터를 사용해ㅑ야할때 사용(인스턴스필드는 객체마다 데이터를 가지고 있어야할때)
        // 메소드로서 사용할때 : 인스턴스필드로 작업하지 않는 메소드(인스턴스는 인스턴스 필드로 작업해야 할 메소드)
        double result1 = 10 * 10 * Calculator4.pi;  //Calculator4.pi가 정적멤버이다. 클래스로 바로 접근함

        int result2 = Calculator4.plus(10, 5);
        int result3 = Calculator4.minus(10, 5);

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);

//        기존방법(올바르지 못한 방법)
//        Calculator4 cal4 = new Calculator4();
//        int result2 = cal4.plus(10, 5); ....


    }
}
