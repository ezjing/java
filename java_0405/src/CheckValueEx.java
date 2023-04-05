public class CheckValueEx {
    public static void main(String[] args) {
        // 자바에서는 기본 데이터 타입에 대해서 더 많은 기능을 사용할 수 있도록 wrapper 클래스 타입이 존재함
        // byte -> Byte, int -> Integer, double -> Double 이런식의 클래스가 있음
        // 해당 wrapper 클래스를 사용하면 추가적인 기능을 제공하는 메소드를 사용할 수 있음

        int i = 128;

        // ||는 논리 합연산이다 (or)
        // MIN_VALUE : -128, MAX_VALUE : 127
        if ((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) {
            System.out.println("byte 타입으로 변환할 수 없습니다.");
            System.out.println("값을 다시 확인해 주세요.");
        }
        else {
            byte b = (byte) i;
            System.out.println(b);
        }

        byte b1 = 127;
        byte b2 = -128;

        System.out.println("b1 : " + b1);
        System.out.println("b2 : " + b2);

        // 시계처럼(숫자 12를 지나가면 1이 나오듯이), 최대값(127)에서 더 커지면 최소값(-128)이 되고 최소값(-128)에서 더 작아지면 최대값(127)이 나온다
        // 이진법 계산 때문에 그럼 0000 0000 1111 1111에서 1이 커지면 0000 0001 0000 0000인데 앞의 두 덩어리가 날아가므로 0000 0000으로 출력되는것임. 최소값으로 보이는 이유(한덩어리당 1bit)
        b1 ++;
        b2 --;

        System.out.println("b1++ 후 : " + b1);
        System.out.println("b2++ 후 : " + b2);
    }
}
