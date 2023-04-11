public class Calculator5 {

    public int num1 = 10;   //필드값 선언
    public int num2 = 20;
    public int result = 0;
    public static int staticNum1 = 10;  //정적멤버
    public static int staticNum2 = 20;
    public static int staticResult = 0;

    public void sum() { //일반 메소드
        result = num1 + num2;
        System.out.println("두 수의 덧셈은 " + result + "입니다.");
    }

    public  void  setNumber(int num1, int num2) {   //핃드값에 값을 입력하는 형태의 일반 메소드
        this.num1 = num1;
        this.num2 = num2;
        this.result = 0; //안써도 result 계산결과에는 문제 없는데 초기화를 위해서 넣는다고한다
    }

    public static void staticSum() { //정적멤버 메소드
        staticResult = staticNum1 + staticNum2;
        System.out.println("두 수의 덧셈은 " + staticResult + "입니다.");
    }

    public static void setStaticNumber(int staticNum1, int staticNum2) {   //핃드값에 값을 입력하는 형태의 정적멤버 메소드
        Calculator5.staticNum1 = staticNum1;    //정적멤버는 클래스를 통해서 접근 가능하기 때문에 this 굳이 사용x,객체 자신의 참조인 this 사용 불가(객체를 아직 안만들었기 때문에 this로 접근 불가)
        Calculator5.staticNum2 = staticNum2;
        Calculator5.staticResult = 0;

    }

}
