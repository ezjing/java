import java.awt.*;

public class BeepThread extends Thread {    // Thread 클래스 상속 받았을때
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            }
            catch (Exception e) {

            }
        }
    }
}
