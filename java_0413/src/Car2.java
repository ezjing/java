public class Car2 {
    // 배열로 간단하게 만들기
//    Tire[] tires = new Tire[4];
//    tires[0] = new Tire ("앞왼쪽", 6);
    Tire[] tires = {
            new Tire("앞왼쪽", 6),
            new Tire("앞오른", 2),
            new Tire("뒤왼쪽", 3),
            new Tire("뒤오른쪽", 5)
    };

//    Tire[] tires;
//    public Car2() {
//        tires = Tire[4];
//        tires[0] = new Tire("앞왼쪽", 6);
//        tires[1] = new Tire("앞왼쪽", 6);
//        tires[2] = new Tire("앞왼쪽", 6);
//        tires[3] = new Tire("앞왼쪽", 6);
//
//    }

    int run() {
        System.out.println("[자동차가 달립니다.]");

        for (int i = 0; i < tires.length; i++) {
            if (tires[i].roll() == false) {
                stop();
                return (i + 1); // 첫번째 타이어가 터졌을때 1을 리턴해야하기 때문에 + 1 붙은것.(0+1 = 1)
            }
        }
        return 0;
    }

    void stop() {
        System.out.println("[자동차가 멈춥니다.]");
    }
}