public class InstanceofEx {
    public static void main(String[] args) {
        System.out.println("-----원본이 Child3 일 경우-----");
        //  원본이 Child3 타입의 객체
        Parent3 p1 = new Child3();
        method1(p1);
        method2(p1);

        System.out.println("-----원본이 Parent3 일 경우-----");
        Parent3 p2 = new Parent3();
        method1(p2);
        method2(p2);
    }

    public static void method1(Parent3 p) {
        if (p instanceof Child3) {  // instanceof : 앞의 객체가 뒤의 타입이 맞는지 검사, 맞으면 true, 틀리면 false
            Child3 c = (Child3) p;
            System.out.println("method1 - Child3으로 변환 성공");
        }
        else {
            System.out.println("method1 - Child3으로 변환되지 않음");
        }
    }
    
    public static void method2(Parent3 p) {
        Child3 c = (Child3) p;
        System.out.println("method2 - Child3으로 변환 성공");

    }
}
// 부모가 자식의 시퀀스를 모두 가지고 있다고 보장할 수 없기때문에 강제 타입변환은 원본이 자식 클래스여야한다(자식에서 부모로 자동변환될때 자식이 갖고있던 전용 시퀀스는 보류(손실X), 다시 자식으로 강제타입변환될때 자식 전용 시퀀스 되살아난다)