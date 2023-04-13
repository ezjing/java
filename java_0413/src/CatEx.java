public class CatEx {
    public static void main(String[] asrgs) {
        // 부모 클래스인 Animal 클래스 타입의 변수 animal에 Animal 클래스 타입의 객체를 생성
        Animal animal = new Animal();
        // Animal 클래스를 상속받은 Cat 클래스 타입의 변수 cat을 선언하고 Cat 클래스 타입의 객체를 생성
        Cat cat = new Cat();

        // 두 객체를 비교.. 참고로 클래스 타입은 참조타입(스트링..)이다.. 기본타입은 int, byte 등이 있다
        if (animal == cat) {
            System.out.println("두 객체는 같다.");
        } else {
            System.out.println("두 객체는 다르다.");
        }

        // 부모 클래스인 Animal 클래스 타입의 변수 animal에 자식 클래스인 Cat 클래스 타입의 객체를 대입
        // 자동 타입 변환이 발생하면서 부모 클래스인 Animal 클래스 타입의 변수에 자식 클래스인 Cat 클래스인 Cat 클래스 타입의 객체가 저장됨
        animal = cat;   // 참조타입은 주소로 비교를 하게 되는데 = 하게되면 주소가 복사되어 동일시하게 취급 된다

        // 겉 모양은 부모인 Animal 클래스 타입의 변수이지만 실제 데이터는 자식 클래스인 Cat 클래스 타입의 객체임
        if (animal == cat) {
            System.out.println("두 객체는 같다.");
        } else {
            System.out.println("두 객체는 다르다.");
        }
    }
}