public class Earth {
    // 상수 : 불변의 정적필드, 대문자, _ 사용, 상수로 쓸지 객체의 읽기전용으로 쓸지 구분해서 사용
    static final double EARTH_RADIUS = 6400;
    final static double EARTH_SURFACE_AREA; // static final 순서 바꿔 써도 상관없다

    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS; // PI는 Math에서(java자체적으로) 상수로 정해져있는 상수이다
    }
}
