import java.util.Scanner;
import java.util.Vector;

public class QVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Double> v = new Vector<>();

        for (int i = 0; i < 5; i++) {
            double num = sc.nextDouble();
            v.add(num);
        }

        double big = v.get(0);
        for (int i = 0; i < v.size(); i++) {
            if (big < v.get(i)) {
                big = v.get(i);
            }
        }
        System.out.println("가장 큰 수는" + big);
    }


}
