import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx3 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("C:\\smart505\\tokentest.txt");
        int readData;
        byte[] readBytes = new byte[8]; // 한번에 8글자 읽어오기
        readData = is.read(readBytes, 2, 3);    // 두번째 인덱스 글자부터 3개 불러오기

        for (int i = 0; i < readBytes.length; i++) {
            System.out.println(readBytes[i]);
        }

        is.close();
    }
}
