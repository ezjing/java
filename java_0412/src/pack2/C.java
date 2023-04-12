package pack2;

import pack1.A;

public class C {    // C에서는 extends로 A가 상속이 안됐기 때문에 사용 불가능
    public void method() {
        // 클래스 A와 클래스 B는 서로 다른 패키지에 포함되어 있음
        // 클래스 A의 멤버는 모두 protected로 설정되어 다른 패키지에서 사용할 수 없음
//        A a = new A();
//        a.filed = "value";
//        a.method();
    }
}
