import java.util.HashMap;
import java.util.Scanner;

public class QPopulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> h = new HashMap<>();

        System.out.println("나라 이름과 인구를 5개 입력하세요.(예: Korea 5000)");


        int many = 0;
        String big = null;
        for(int i = 0; i < 5; i++) {
            System.out.print("나라 이름, 인구 >>");
            String nation = sc.next();
            int population = sc.nextInt();
            h.put(population, nation);

            if (many < population) {
                many = population;
                nation = h.get(population);
                big = nation;
            }
        }
        System.out.println("제일 인구가 많은 나라는 (" + big + ", " + many + ")");
    }
}
