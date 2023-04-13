public class PromotionEx {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        // 자동타입 변환 : 프로그램 실행 도중 자동 타입 변환이 일어남, 바로 위의 부모가 아니더라도 상속 계층의 상위면 자동 타입 변환 가능, 변환 후에는 부모 클래스 멤버만 접근 가능
        // 자식 -> 부모 상속관계, 자동타입 변환
        A a1 = b;
        A a2 = c;

        // 손자 -> 조부모 상속관계, 자동타입 변환
        A a3 = d;
        A a4 = e;

        // 자식 -> 부모 상속관계, 자동타입 변환
        B b1 = d;
        C c1 = e;

        // B와 E는 상속관계에 있지 않음, C와 D는 상속관계에 있지 않음, 자동타입 변환 X
//        B b2 = e;
//        C c2 = d;
    }
}
