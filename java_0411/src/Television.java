public class Television {
    public static String company = "SAMSUNG";

    public static String model = "LED";

    public static String info;

    // 정적초기화 블록 : 정적멤버용 생성자, 객체가 없어도 실행 가능, 블록 내부에 인스턴스 필드나 인스턴스 메소드 사용 불가(정적 멤버 호출 시 해당 객체가 없을수 있다. 로딩이 아직 안됐을수 있기 때문에), 객체 자신의 참조인 this 사용 불가(객체를 아직 안만들었기 때문에 this로 접근 불가)
    static {
        info = company + " - " + model; // 정적 멤버들끼리만 사용 가능하다
    }


}
