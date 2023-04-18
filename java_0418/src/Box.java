public class Box {
    private Object object;

    public void setData(Object object) {
        this.object = object;
    }

    public Object getData() {   // Object 클래스는 자바의 모든 최상위 클래스
        return object;
    }
}
