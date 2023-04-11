public class Calculator {
    //개수가 다른 경우의 오버로딩
    double areaRectangle(double width) {
        return width * width;
    }

    double  areaRectangle(double width, double height) {
        return width * height;
    }
}
