public class CharEx {
    public static void main(String[] args) {
        // js에서는 문자 타입과 문자열 타입을 구분하지 않음(전부 문자열데이터로 통합하여 사용)
        // js에서는 ''이나 ""를 동일하게 문자열을 표현하는데 사용함
        // java에서는 문자 타입과 문자열 타입을 구분함
        // java에서 문자 타입은 기본 데이터 타입이며, 정수타입(숫자타입)이고, java에서 문자열 타입은 참조 타입(주소저장)이며 String 클래스 타입임
        // java에서 문자 타입은 문자 1개를 저장하고, ''를 사용하여 표현함
        // java에서 문자열 타입은 문자 여러개를 동시에 저장하고, ""를 사용하여 표현함
        // 'A'와 "A"는 자바에서는 서로 다른 데이터 타입
        char c1 = 'A';  // char 문자 타입, 문자를 직접 입력
        char c2 = 65;   // char 타입에 숫자 65를 저장
        char c3 = '\u0041'; // 유니코드표를 사용하여 0041을 저장 '역슬래시u' 유니코드 (16진수)

        char c4 = '가';  // char 타입의 변수에 문자 '가'를 직접 저장
        char c5 = 44032; // char 타입의 변수에 10진수 정수 44032를 저장
        char c6 = '\uac00'; // char 타입의 변수에 유니코드(16진수) ac00(10진수로 치환하면 44032)을 저장

        int uniCode = c1;  // 문자 타입의 데이터 'A'를 정수 타입인 int 타입의 변수에 저장 시 10진수 정수값이 저장됨(int 10진수 정수타입)

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(uniCode);
    }
}
