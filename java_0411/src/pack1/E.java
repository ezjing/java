package pack1;

// 생성자에대한 접근제한자
public class E {
    // 자기자신 클래스 사용하여 객체 생성
    E e1 = new E(true);
    E e2 = new E(1);
    E e3 = new E("문자열");

    // 접근 제한자를 public 으로 지정한 생성자
    public E(boolean b) {

    }
    // 접근 제한자를 default 으로 지정한 생성자
    E(int e) {

    }
    // 접근 제한자를 private 으로 지정한 생성자
    private E(String e) {

    }
}
