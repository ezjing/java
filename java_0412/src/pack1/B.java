package pack1;

public class B {    // 같은 패키지 안이기 때문에 상속 안받아도 바로 A 사용 가능
    public void method() {
        A a = new A();
        a.field = "value";
        a.method();
    }
}
