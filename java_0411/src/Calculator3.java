public class Calculator3 {
    //타입이 다른 경우의 오버로딩
    public void sum(int x, int y) {
        int result = x + y;
        System.out.println("두 수의 덧셈은 : " + result);
    }

    //순서가 다른 경우의 오버로딩
    public void sum(int x, double y) {
        double result = x + y;
        System.out.println("두 수의 덧셈은 : " + result);
    }

    //순서가 다른 경우의 오버로딩
    public void sum(double x, int y) {
        double result = x + y;
        System.out.println("두 수의 덧셈은 : " + result);
    }

    public void sum(double x, double y) {
        double result = x + y;
        System.out.println("두 수의 덧셈은 : " + result);
    }
}
