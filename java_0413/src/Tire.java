public class Tire {
    public int maxRotation; // 최대
    public int accRotation; // 누적
    public String location; // 위치

    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    public boolean roll() {
        ++accRotation;

        if (accRotation < maxRotation) {    // 누적횟수 < 최대횟수 일때는 타이어 수명 표시
            System.out.println(location + " Tire 수명 : " + (maxRotation - accRotation) + "회");
            return true;
        }
        else {  // 수명끝나면 펑크 표시
            System.out.println("***" + location + "Tire 펑크 ***");
            return false;
        }
    }
}
