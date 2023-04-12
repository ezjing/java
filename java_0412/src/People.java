public class People {
    public String name;
    public String ssn;

    // 부모클래스인 People의 생성자
    // 자식클래스인 생성자에서 super() 사용 시 호출되는 생성자
    public People(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}
