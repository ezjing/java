package pack2;

// import로 다른 패키지에서 들고오기
import pack1.H;

public class J {
    public J() {
        H h = new H();
        h.field1 = 1;
        // default이기 때문에 다른 패키지에서 사용 불가
//        h.field2 = 1;
        // private이기 때문에 사용 불가
//        h.field3 = 1;

        h.method1();
        // default이기 때문에 다른 패키지에서 사용 불가
//        h.method2();
        // private이기 때문에 사용 불가
//        h.method3();

    }
}
