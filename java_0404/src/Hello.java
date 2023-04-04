public class Hello {
    // 메소드(자바스크립트의 함수와 동일한 기능을 가지고 있음)
    // 클래스의 멤버인 함수를 메소드라고 함
    // 클래스의 멤버가 아닐 경우 함수라고 함
    // 클래스 코드는 {}내에 모두 작성, {}안의 내용은 코드블록이라고 한다
    // 1. class의 이름은 해당 class 파일명
    // 2. 하나의 파일에 하나의 class 작성
    // 3. 클래스 이름은 첫글자는 대문자, 나머지는 소문자
    // 4. 2개 이상의 단어로 이름을 정할 경우 각 단어의 첫글자는 대문자, 나머지는 소문자
    // 5. 파일명과 같은 클래스만 public(접근제한자) 사용 가능


    // main()메소드 자바프로그램은 main()에서 실행 시작, public static void로 선언, String[] args로 실행인자 전달 받음
    // 메소드는 클래스 바깥에 쓸수없다

    // 자바는 매개변수에 데이터 타입(int)까지 확실히 적어야함
    public static int sum(int n, int m) {
        return n + m;
    }

    // 자바 프로그램의 시작점(main())(메인 메소드)
    // void는 반환값을 뜻함
    public static void main(String[] args) {
        // 마찬가지로 데이터 타입 구분중 int, char
        // 해당 데이터 타입으로 변수 선언
        // javascript의 지역변수와 같음
        int i = 20;
        int s;
        char a;
        // 변수, 메소드 : 첫단어는 모두 소문자, 두번째 이후의 단어는 첫글자 대문자, 나머지 소문자

        s = sum(i, 10);
        a = '?';

        // console.log()와 동일함. 모니터에 출력.
        System.out.println(a);
        System.out.println("Hello");
        System.out.println(s);
    }






}

// 식별자 이름
// 1. 영어사용(한글 사용 가능은 한데 비추천)
// 2. 대소문자 구분
// 3. 특수문자 사용불가 (_, $)제외
// 4. 숫자 사용 가능 (2번째 이후로 사용)
// 5. 자바 예약어(if) 사용불가, true, false, null 사용불가
// 6. 첫단어는 모두 소문자 두번째 이후는 첫글자 대문자 나머지는 소문자
// 6-1. 클래스는 무조건 첫글자 대문자, 나머지 소문자

// 자바의 데이터 타입
// 기본타입 : 데이터 자체를 저장하는 타입
// boolean - 논리형. js의 논리형과 동일 (true, false)
// char : 문자형이면서 정수형.(아스키코드, 유니코드)
// byte, short, int, long : 정수형. 소수점이 없는 숫자데이터 타입, 음수, 양수 byte(1byte), short(2byte), int(4byte(기본형)), long(8byte)
// float, double : 실수형. 소수점이 있는 숫자 데이터 타입, 음수, 양수. float(4byte), double(8byte(기본형))
// 레퍼런스(참조)타입 : 데이터가 존재하는 메모리 주소 저장하는 타입
// 클래스(class)
// 인터페이스(interface)
// 베열(array)
















