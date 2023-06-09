public class TryWithResourceEx {
    public static void main(String[] args) {
        // try with resource 방식 사용
        try (FileInputStream fis = new FileInputStream("file.txt")) {
            fis.read();
            throw new Exception();  // 강제로 예외를 발생시키는 구문
        }
        catch (Exception e) {
            System.out.println("예외 처리 코드가 실행되었습니다.");
        }

        System.out.println("\n----- -----\n");  // 아래는 전통적인 방법임, 좀 더 많이 사용되고 있음

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("file.txt");
            fis.read();
            throw new Exception();  // 오류 강제 발생
        }
        catch (Exception e) {
            System.out.println("예외처리 코드가 실행되었습니다.");
        }
        finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            }
            catch  (Exception e) {

            }
        }
    }
}
