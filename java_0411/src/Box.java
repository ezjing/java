public class Box {
    private int width, height;
    private char fillChar;
    public Box() {
        this(10, 1);
        
        // 선생님 풀이
//        this.width = 10;
//        this.height = 1;
    }
    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void draw() {
        for (int i = 0; i < height; i++) {
            System.out.println();
            for (int j = 0; j < width; j++) {
                System.out.print(fillChar);
            }
        }
    }
    public void fill(char c) {
        this.fillChar = c;
    }
    public static void main(String[] args) {
        Box a = new Box();
        Box b = new Box(20, 3);
        a.fill('*');
        b.fill('%');
        a.draw();
        b.draw();
    }
}