import java.io.FileWriter;
import java.io.Writer;

public class WriterEx1 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("C:\\smart505\\writer1.txt");

        char[] data = "이지징".toCharArray();

        for (int i = 0; i < data.length; i++) {
            writer.write(data[i]);
        }

        writer.flush();
        writer.close();
    }
}
