package pack1;

//필드, 메소드에 대한 접근제한자
public class H {
    public int field1;
    int field2;
    private int field3;

    public H() {
        field1 = 1;
        field2 = 1;
        field3 = 3;

        method1();
        method2();
        method3();
    }

    public void method1() {
    }

    void method2() {
    }

    private void method3() {
    }
}
