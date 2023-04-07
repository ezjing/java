public class Car7 {
    int gas;    // 필드

    void setGas(int gas) {  // 메소드
        this.gas = gas; // 매개변수 가스를 필드가스로 저장
    }

    boolean isLeftGas() {
        if (gas == 0) { // this.gas를 말함
            System.out.println("gas가 없습니다.");
            return false;
        }

        System.out.println("gas가 있습니다.");
        return true;
    }

    void run () {
        if (gas > 0) {
            System.out.println("달립니다. (gas잔량 : " + gas + ")");
            gas -= 1;
        }
        else {
            System.out.println("멈춥니다. (gas잔량 : " + gas + ")");
            return;
        }
    }

}
