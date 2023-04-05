public class CastEx {
    public static void main(String[] args) {
        // 강제(명시적) 타입 변환 : 큰 데이터 타입 -> 작은 데이터 타입 (훼손될수 있는 데이터가 있을수도 있기때문에 확인차 넣는것이라고 보면 됨)
        
        // 강제타입변환 사용
        // 원래 정수 -> 문자 는 자동 형변환이 일어나지 않음(byte 제외)
        int intValue = 44032; // 16진수 : AC00
        // (char)로 강제 형변환을 시켜주면 문자타입으로 제대로 출력됨 2bit가 넘어가는 큰 숫자들은 내용이 잘려서 출력)
        char charValue = (char)intValue;
        System.out.println(charValue);

        // 큰데이터타입 -> 작은데이터타입 강제 타입변환
        long longValue = 500;
        intValue = (int)longValue;
        System.out.println(intValue);

        // 실수타입 -> 정수타입 변환을 위해 강제 타입 변환
        double doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println(intValue);
    }
}
