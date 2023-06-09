import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) {
        // Properties : 키 값을 String 타입으로 제한한 Map 컬렉션, 확장자가 .properties 인 파일을 읽어 들일 때 주로 사용
        Properties properties = new Properties();

        String path = PropertiesEx.class.getResource("database.properties").getPath();  // 파일 들고오기

        System.out.println(path);   // 파일 경로 출력

        try {
            // 파일 경로 가져오기
            path = URLDecoder.decode(path, "UTF-8");    // 기본값은 영어인데 utf-8로 한글도 읽을수 있게끔 한것
            
            
            // properties 클래스의 load() 메소드로 파일 내용을 읽어옴
            properties.load(new FileReader(path));

            // getProperties(key) : 지정한 키값과 연동된 value를 가져옴
            // setProperties(key, value) : 키와 값을 설정
            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");

            System.out.println("driver : " + driver);
            System.out.println("url : " + url);
            System.out.println("username : " + username);
            System.out.println("password : " + password);
        }
        catch (IOException e){

        }




    }
}
