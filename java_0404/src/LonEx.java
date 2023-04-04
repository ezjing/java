public class LonEx {
    public static void main(String[] args) {
        // 큰 데이터 타입 변수에 작은 데이터 타입의 데이터를 저장하는 것은 문제없음
        long var1 = 10; // int 타입의 데이터 10을 long 타입의 변수 var1에 저장
        long var2 = 20L; // long 타입의 데이터 20을 long 타입의 변수 var2에 저장(숫자 뒤에 L있으면 long 타입 데이터임)
        //        long var3 = 10000000000;  // int 타입의 데이터 100억을 long 타입의 변수 var3에 저장, int 타입의 데이터는 최대 21억까지 표현 가능한데 입력하고자 하는 데이터는 100억 이기 때문에 표현을 하지 못하고 오류가 발생함(int 타입 데이터는 -21억~21억까지 표시됨)
        long var4 = 10000000000L;   // long 타입의 데이터 100억을 long 타입의 변수 var4에 저장

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}
