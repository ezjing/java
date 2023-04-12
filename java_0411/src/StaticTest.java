    class Circle {
        private  int radius;    // 반지름
        public Circle(int radius) {this.radius = radius;}   // 생성자 반지름값 입력받음
        public int getRadius() {return this.radius;}    // 메소드 반지름값 입력받은걸 출력(반환)
        public void setRadius(int radius) {this.radius = radius;}   // 메소드 getRadius에서 반지름 입력받아 수정
    }

    class CircleManager {
        public static void copy(Circle src, Circle dest) {  // 이제 보니까.. Circle 클래스의 src변수같다
            dest.setRadius(src.getRadius());    // 변수.메소드
        }
        public static boolean equals(Circle a, Circle b) {  // 마찬가지로 Circle 클래스의 변수 a, b
            if(a.getRadius() == b.getRadius()) {return true;}   // 객체가 같은지 아닌지를 확인하는게 아니고 반지름의값을 확인하는것이기 때문에 겟 레디우스 사용..(통상적으로는 객체 확인하는걸 많이 쓰긴함 요기서 그렇게한다면 a == b)
            else {return false;}
        }
    }

    public class StaticTest {
        public static void main (String[] args) {
            Circle pizza = new Circle(5);
            Circle waffle = new Circle(1);

            boolean res = CircleManager.equals(pizza, waffle);
            if(res == true)
                System.out.println("pizza와 waffle 크기 같음");
            else
                System.out.println("pizza와 waffle 크기 다름");

            CircleManager.copy(pizza, waffle);
            res = CircleManager.equals(pizza, waffle);
            if(res == true)
                System.out.println("pizza와 waffle 크기 같음");
            else
                System.out.println("pizza와 waffle 크기 다름");
        }
    }

