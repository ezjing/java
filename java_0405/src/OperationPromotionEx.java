public class OperationPromotionEx {
    public static void main(String[] args) {
        // 연산 시 발생하는 자동 타입 변환
        // 정수 타입 끼리 연산 시 int 타입으로 연산이 진행됨
        byte byteValue1 = 10;
        byte byteValue2 = 30;
        // byte 타입의 변수에 저장된 데이터를 꺼내와서 연산 시 int 타입으로 연산됨
        // 꼭 byte 타입에 저장하려면 연산 결과를 강제 타입 변환하여 저장해야함
//        byte byteValue3 = byteValue1 + byteValue2;    // byteValue1과 byteValue2는 사실은 int 타입의 연산이다. 큰 데이터타입을 작은 데이터 타입에 넣어서 계산한것(오류발생), byte(byteValue1 + byteValue2); 강제타입변환 하면 실행됨
        int intValue1 = byteValue1 + byteValue2;
        System.out.println(intValue1);

        char charValue1 = 'A';
        char charValue2 = 1;
        // charValue1 과 charValue2의 연산 시 두 변수의 값이 int 타입으로 자동타입 변환되어 연산되어 그 결과가 int 타입의 데이터임
//        char charValue3 = charValue1 + charValue2;    // 연산할때는 'A'대신 65가 출력되기 때문에 65 + 1 임
        int intValue2 = charValue1 + charValue2;
        System.out.println("유니코드 : " + intValue2);
        // 강제 타입 변환으로 문자로 출력
        System.out.println("출력문자 : " + (char)intValue2);

        int intValue3 = 10;
        int intValue4 = intValue3 / 4;
        // 정수타입은 소수점이 없기때문에 나머지 발생시 그냥 버려버림
        System.out.println(intValue4);

        int intValue5 = 10;
        // 서로 다른 데이터 타입끼리 연산 시 더 큰 데이터 타입으로 자동 타입 변환이 발생됨
        // int 타입의 데이터와 double 타입의 데이터를 연산하여 둘다 double 타입의 데이터로 변환되고 연산되어 그 결과가 double 타입임
        // 해당 double 타입의 데이터를 int 타입의 변수에 저장하려고 하기 때문에 오류가 발생 함
//        int intValue6 = 10 / 4.0; // 굳이 int 타입으로 저장하려면 int(10 / 4.0); 강제 타입 변환 필요
        double doubleValue = intValue5 / 4.0;
        System.out.println(doubleValue);    // 자동으로 double타입으로 변환되기때문에 정상 출력


    }
}
