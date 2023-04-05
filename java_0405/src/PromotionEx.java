public class PromotionEx {
    public static void main(String[] args) {
        // 데이터 타입 변환 : 작은데이터타입 -> 큰데이터 타입 (정수형보다 실수형이 더 큰 데이터 타입(소수점까지 표현 되니까) : byte(1) < short(2) = char(2) < int(4) < long(8) < float(4) < double(8)) (int, double정도만 실습에서 사용)


        // 자동(묵시적)타입변환 사용 (작은 데이터 타입 -> 큰 데이터 타입)
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println(intValue);

        // 문자 데이터 타입 -> 숫자 데이터 타입 (char타입은 2바이트로 short와 동급, byte를 제외하고 가장 작다, -가 없는대신 양수로 short 두배 입력 가능)
        char charValue = '가';
        intValue = charValue;
        System.out.println("'가'의 유니코드 : " + intValue);

        // 작은 데이터 타입 -> 큰 데이터 타입
        intValue = 500;
        long longValue = intValue;
        System.out.println(longValue);

        // 정수 타입 -> 실수 타입
        intValue = 200;
        double doubleValue = intValue;
        System.out.println(doubleValue);



    }
}
