import java.util.Scanner;

abstract class Converter {
    public abstract void run();
}


class Km2Mile extends Converter {

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("km을 mile로 바꿉니다.");
        System.out.print("km을 입력하세요 >>");
        double a = sc.nextDouble();

        double result = a / 1.6;
        System.out.println("변환 결과 : " + result + "mile입니다.");
    }
}

public class ConverterEx {
    public static void main(String[] args) {
        Km2Mile toMile = new Km2Mile();
        toMile.run();
    }
}