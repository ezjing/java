public class Singleton {
    // 자신 타입(Singleton)의 객체를 생성
    // 외부에서 직접적인 접근은 차단
    private static Singleton singleton = new Singleton(); // private이더라도 자기자신의 클래스 안에서 생성자 쓰는건 상관없음

    // 생성자
    private Singleton() {}

    //정적메소드 선언
    // 미리 만들어 놓은 객체를 우회하여 사용하도록 제공(private이 안붙었기 때문에 사용가능)
    static Singleton getInstance() {    //정적멤버를 사용하기 위해 정적메소드 선언
        //정적 필드인 singleton을 외부로 전달(리턴 반환)
        return singleton;
    }
}
