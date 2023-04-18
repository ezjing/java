public class TryCatchEx {
    public static void main(String[] args) {
        
        //  예외 처리 코드 : try : 오류 가능성이 있는 소스 넣고 오류 발생 시 catch로 넘어감, catch : 오류 발생시 출력, 미발생시 미출력, 마지막 finally : 모든상황 다 출력
        try {
            Class clazz = Class.forName("java.lang.String2");   // Class clazz = Class.forName("java.lang.String2"); 오류 가능성이 있는 소스...   Class.forName("java.lang.String2") 해당하는 클래스가 존재하는지 알려주는 기능
            System.out.println("클래스가 존재합니다.");
        }
        catch (Exception e) {
            System.out.println("클래스가 존재하지 않습니다.");
        }

        System.out.println("\n-----프로그램 종료-----\n");
    }
}
