// extends로 People을 상속받아 Student 클래스에는 아무것도 없지만  People의 필드를 상속받아옴
// 부모클래스인 People 클래스를 상속받아 People 클래스가 가지고 있는 멤버인 필드 name, ssn을 Student 클래스에서 사용할 수 있음
public class Student extends People {
    // 상속으로 없어도 이용가능
//    public String name;
//    public String ssn;
    public int studentNo;
//    public String name = "유재석";
//    public String snn - "961023-1000000"
    
    public Student(String name, String ssn, int studentNo) {
        // this : 객체 자신을 호출하는 명령어
        // this() : 객체 자신의 다른 생성자를 호출하는 명령어
        // super : 부모의 객체를 호출하는 명령어, 부모의 필드 및 메소드를 사용할 경우 사용함
        // super() : 부모의 생성자를 호출하는 명령어
        // 자식클래스의 생성자에서 부모의 객체의 생성자를 호출하기 위해서 사용함
        // 매개변수가 없는 super()는 컴파일러가 자동으로 호출되는 부모생성자 이므로 생략이 가능.(기본 생성자가 생략이 가능한것과 같은 원리)
        // 부모 클래스에 기본 생성자가 없을 경우 super(매개변수) 형태로 반드시 입력해야 함
        // super() 는 반드시 자식 생성자의 첫번째 줄에 입력해야 함(부모생성자를 먼저 초기화 하고 자식생성자를 초기화 해야하기 때문에 무조건 첫번째줄)
        super(name, ssn);   // 부모생성자 호출, 부모생성자가 없어지면 오류발생.. 없어지면 자동으로 기본 부모생성자인 super()가 생성되는데 부모클래스인 People에 매개변수가 비어있는 생성자가 없기때문에 오류가 나는것, 부모생성자 호출 완료 후 자식 생성자 호출 완료(부모생성자를 먼저 보자)

        this.studentNo = studentNo;
    }
}
