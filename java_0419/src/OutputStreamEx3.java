import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx3 {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("C:\\smart505\\outputfile3.txt");

        byte[] bytes = "ABCDEFGHIJKLMNOPQ".getBytes();

        os.write(bytes, 5, 10); // 인덱스 5번 글자부터 10개의 글자 저장
        os.flush();
        os.close();
    }
}
