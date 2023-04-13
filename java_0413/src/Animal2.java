// 추상 클래스로 선언한 Animal2 클래스, abstract빼면 오류가 난다 왜냐면 추상 메소드가 포함돼 있으면 무조건 추상 클래스 이기 때문에 표시를 해야하기 때문
public abstract class Animal2 {
    public String kind;

    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    // 추상 메소드
    public abstract void sound();   // 추상 메소드 코드블록이 없으니까 세미콜론 붙이는것
}
