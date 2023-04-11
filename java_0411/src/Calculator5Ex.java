public class Calculator5Ex {
    public static void  main(String[] args) {
        Calculator5 c1 = new Calculator5();
        Calculator5 c2 = new Calculator5();

        c1.sum();
        c2.sum();

        //이제 c1, c2가 가지고 있는 int값이 달라짐 (내가 입력값을 다르게 줬으니까)
        c1.setNumber(100, 200);
        c2.setNumber(1000, 2000);

        c1.sum();
        c2.sum();

        System.out.println("----static 있는부분----");
        c1.staticSum();
        c2.staticSum();

        c1.setStaticNumber(100, 200); // c1, c2이런식으로 객체를 만들어도 정적멤버는 같은 클래스끼리 데이터를 공유하기때문에 전부 다 클래스 Calculator5에 저장된다고 보면 된다 각각의 객체가 아니라 그래서 c2랑 c1이랑 입력값이 다르지만 나중에 입력한 c2의 값을Calculator5에서 가져와 c1에서도 똑같이 출력된다고 보면 된다
        c2.setStaticNumber(1000, 2000);

        c1.staticSum();
        c2.staticSum();


        System.out.println("-----인스턴스 멤버-----");
        
        System.out.println("c1의 num1 : " + c1.num1);
        System.out.println("c1의 num2 : " + c1.num2);
        System.out.println("c2의 num1 : " + c2.num1);
        System.out.println("c2의 num2 : " + c2.num2);

        c1.num1 = 10;
        c1.num2 = 20;
        c2.num1 = 10000;
        c2.num2 = 20000;

        System.out.println("c1의 num1 : " + c1.num1);
        System.out.println("c1의 num2 : " + c1.num2);
        System.out.println("c2의 num1 : " + c2.num1);
        System.out.println("c2의 num2 : " + c2.num2);

        System.out.println("-----정적 멤버-----");

        System.out.println("c1의 staticNum1 : " + c1.staticNum1);
        System.out.println("c1의 staticNum2 : " + c1.staticNum2);
        System.out.println("c2의 staticNum1 : " + c2.staticNum1);
        System.out.println("c2의 staticNum2 : " + c2.staticNum2);

        // 객체쪽으로 값을 넣어도 클래스로 데이터공유가 돼서 10000, 20000가 출력됨
        c1.staticNum1 = 10;
        c1.staticNum2 = 20;
        c2.staticNum1 = 10000;
        c2.staticNum2 = 20000;

        System.out.println("c1의 staticNum1 : " + c1.staticNum1);
        System.out.println("c1의 staticNum2 : " + c1.staticNum2);
        System.out.println("c2의 staticNum1 : " + c2.staticNum1);
        System.out.println("c2의 staticNum2 : " + c2.staticNum2);

        Calculator5.staticNum1 = 100;
        Calculator5.staticNum2 = 200;

        System.out.println("c1의 staticNum1 : " + c1.staticNum1);
        System.out.println("c1의 staticNum2 : " + c1.staticNum2);
        System.out.println("c2의 staticNum1 : " + c2.staticNum1);
        System.out.println("c2의 staticNum2 : " + c2.staticNum2);
    }
}
