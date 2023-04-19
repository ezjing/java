import java.io.FileWriter;
import java.io.Writer;

public class WriterEx2 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("C:\\smart505\\writer2.txt");

        char[] data = "김경아이지원카리나윈터".toCharArray();

        // char[] 배열의 내용을 한번에 쓰기
        // writer.write(data);
        // char[] 배열의 내용 중 일부만 쓰기
        writer.write(data, 3, 6);   // 3번인덱스 글자부터 6글자 출력
        writer.flush();
        writer.close();
    }
}
