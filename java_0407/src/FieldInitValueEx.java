public class FieldInitValueEx {
    public static void main(String[] args) {
        FieldInitValue fiv = new FieldInitValue();

        // 필드의 기본 초기값
        // 객체 외부에서 필드를 가져오는것이기 때문에 "변수.필드이름"으로 접근
        // 객체 내부(생성자나, 메소드에서 직접 사용할 때)에서 사용하면 "필드이름"으로 바로 접근
        System.out.println("byteField : " + fiv.byteField);
        System.out.println("shortField : " + fiv.shortField);
        System.out.println("intField : " + fiv.intField);
        System.out.println("longField : " + fiv.longField);

        System.out.println("booleanField : " + fiv.booleanField);
        System.out.println("charField : " + fiv.charField);

        System.out.println("floatField : " + fiv.floatField);
        System.out.println("doubleField : " + fiv.doubleField);

        // Array와 String은 참조타입이기 때문에 null
        System.out.println("intArrField : " + fiv.intArrField);
        System.out.println("StringField : " + fiv.StringField);
    }
}
