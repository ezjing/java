import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx1 {
    public static void main(String[] args) throws Exception { // throws : 호출한 곳으로 예외 떠넘기기
        // 부모 클래스인 InputStream이 추상 클래스이므로 자식 클래스인 FileInputStream이 상속받아 구현해야함
        // 부모클래스 타입의 변수 is 에 자식 클래스인 FileInputStream 객체를 생성하여 대입함 (지정한 경로의 파일 정보를 가지고 있음)
        InputStream is = new FileInputStream("C:\\smart505\\tokentest.txt");
        // 데이터를 입력받기 위한 변수
        int readData;

        // 파일의 모든 내용을 출력하기 위한 반복문 (무한 반복중)
        while (true) {
            // FileInputStream 객체의 read() 메소드를 통해서 파일에 있는 정보를 1byte가져옴(영어같은건 한글자씩 가져오는데 한글은 2, 4byte씩 해서 두번 받아야 한글자 출력되고 그렇다)
            readData = is.read();

            // 더이상 읽어올 데이터가 없을 경우 -1을 출력, 반복문 종료
            if (readData == -1) {
                break;
            }
            
            // 읽어온 데이터를 char 타입의 강제 타입 변환하여 화면 출력
            System.out.print((char)readData);
        }

        is.close(); // 열어놓은 InputStream을 닫기
    }
}
