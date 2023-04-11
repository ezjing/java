public class Person {
    // final 키워드를 통해서 읽기 전용 필드 생성
    final String nation = "Korea"; //final 붙은애들 : 읽기전용 필드, 선언과 동시에 데이터를 단 한번만 입력가능
    final String ssn;
    String name;

    public Person(String ssn, String name) {
        this.ssn = ssn; //생성자를 통해서 단 한번만 입력가능
        this.name = name;
    }
}
