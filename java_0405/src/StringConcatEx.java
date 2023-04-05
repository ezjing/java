public class StringConcatEx {
    public static void main(String[] args) {
        // 산술연산자
        // 문자열과 다른 데이터 타입의 연산 시 모두 문자열로 변환되어 연산됨
        String str1 = "JDK" + 17.0;
        String str2 = str1 + "특징";
        System.out.println(str2);

        String str3 = "JDK" + 10.0 + 7; // 연산방향 : 왼쪽 -> 오른쪽.. 문자열데이터로서 선행 계산이 되어 처음부터 쭉 문자열데이터로서 계산됨
        String str4 = 10.0 + 7 + "JDK"; // 10.0 + 7 은 정수끼리 숫자데이터로서 계산이 되고..(17.0) 이후 문자열데이터로 계산되어 JDK와 합쳐짐
        System.out.println(str3);
        System.out.println(str4);
    }
}