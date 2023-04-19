import java.awt.*;

public class BeepPrintEx1 {
    public static void main(String[] args) {

        // 메인스레도 1개만 동작
        // 싱글스레드로 프로그램을 동작했을 경우, 소리가 먼저 울리고 띵이 출력된다
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            }
            catch (Exception e) {

            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            }
            catch (Exception e) {

            }
        }
    }
}
