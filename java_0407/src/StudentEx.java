public class StudentEx {
    public static void main(String[] args) {
        Student s1 = new Student(); // 클래스타입이기도 하지만 데이터타입 이기도함
        System.out.println("Student 클래스 타입의 변수 s1이 Student 클래스 타입의 객체를 참조합니다.");

        Student s2; // s2는 Student 타입의 변수 현재 안에있는 데이터는 null
        s2 = new Student(); // new Student가 메모리에 객체 생성하여 s2에 주소를 넘겨주게 되면서, s2가 객체라고 불려도 괜찮은 상태가 되는것임
        System.out.println("Student 클래스 타입의 변수 s2가 Student 클래스 타입의 객체를 참조합니다.");
    }
}
