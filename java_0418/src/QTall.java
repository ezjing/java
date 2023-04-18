import java.util.Scanner;
import java.util.Vector;

public class QTall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();

        System.out.println("2000~2009년 까지 1년 단위로 키(cm)를 입력");
        System.out.print(">>");

        for (int i = 0; i < 10; i++) {
            int tall = sc.nextInt();
            v.add(tall);
        }
        
        int big = v.get(1) - v.get(0);
        int year = 0;

        for (int i = 0; i < v.size()-1; i++) {
            if (big < v.get(i + 1) - v.get(i)) {
                big = v.get(i + 1) - v.get(i);
                year = i;   // i 는 5일때가 2004년
            }
        }
        System.out.println("가장 키가 많이 자란 년도는 200" + year + "년 " + big + ".0cm");
    }
}

