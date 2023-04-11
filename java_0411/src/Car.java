public class Car {
    String model;   //필드값 선언
    int speed;

    public Car(String model) {  //생성자
        this.model = model; // 매개변수와 필드명이 동일할 때 인스턴스 필드임을 명확히 하기 위해 사용
    }

    public void setSpeed(int speed) {   // 메소드
        this.speed = speed;
    }
    public void run() {
        for (int i = 10; i <= 50; i++) {
            this.setSpeed(i);
            System.out.println(this.model + "가 달립니다.(시속 : " + this.speed + "km/h");
        }
    }
}
