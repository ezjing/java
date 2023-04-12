package pack2;

import pack1.A;

public class D extends A {  // D가 A의 값을 모두 상속 받음, 상속 받았기 때문에 사용 가능
    public D() {
        // 부모객체의 생성자 호출, D 클래스의 부모인 A 클래스의 생성자 호출
        super();    
        // 부모객체의 field, method()를 상속받아 사용
        this.field = "value";
        this.method();
    }
}
