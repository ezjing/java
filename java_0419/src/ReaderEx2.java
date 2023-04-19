import java.io.FileReader;
import java.io.Reader;

public class ReaderEx2 {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("C:\\smart505\\tokentest.txt");

        int readData;
        // 파일에서 가져올 문자를 저장하는 버퍼 메모리로 사용하는 byte[] 배열
        char[] cbuf = new char[2];
        String data = "";

        while (true) {
            readData = reader.read(cbuf);

            if (readData == -1) {
                break;
            }
            data += new String(cbuf, 0, readData);  // 이름은 cbuf쓸꺼고 offset : 시작자리 0번째부터 readData(2글자) 만큼 문자열로 만들어 주겠다
        }
        System.out.println(data);

        reader.close();
    }
}
