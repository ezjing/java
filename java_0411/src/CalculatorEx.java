public class CalculatorEx {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator(); // 생성자로 객체 만들기 (myCalculator가 객체가 된다)

        // 메소드 오버로딩 : myCalculator.areaRectangle로 이름은 같지만 매개변수의 입력값이 다르다
        double result1 = myCalculator.areaRectangle(10);    // 변수(result1) 선언

        double result2 = myCalculator.areaRectangle(10, 20);

        System.out.println("정사각형의 넓이 : " + result1);
        System.out.println("직사각형의 넓이 : " + result2);

        System.out.println("\n-----메소드 오버로딩 미사용-----\n");

        Calculator2 cal2 = new Calculator2();
        cal2.sumInt(10,3);  // 외부에서 필드값 불러오기(변수.필드명)
        cal2.sumIntDouble(10,3.14);
        cal2.sumDoubleInt(10.5,3);
        cal2.sumDouble(10.5,3.14);

        System.out.println("\n-----메소드 오버로딩 사용-----\n");    //변수명이 같다(sum)

        Calculator3 cal3 = new Calculator3();
        cal3.sum(10,3);
        cal3.sum(10,3.14);
        cal3.sum(10.5,3);
        cal3.sum(10.5,3.14);
    }
}
