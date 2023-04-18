public class TryCatchRuntimeEx {
    public static void main(String[] args) {    // args의 배열에 값을 전혀 넣지 않았기 때문에 0개짜리 배열임
        // finally : try ~ catch 구문에서 가장 마지막에 실행되는 코드 블록
        // finally 코드 블록은 오류가 발생하거나 발생하지 않거나 상관없이 무조건 실행되야 하는 소스 코드를 입력하는 코드 블록
        // 파일 및 네트워크와 같은 외부 리소스를 사용 시 자바에서 해당 외부 리소스는 가비지 컬렉터가 메모리를 처리하지 않음 (사용자가 직접 메모리 해제를 해야 함) (메모리 누수 현상 방지) 
        // finally를 사용하여 외부 리소스의 메모리 해제를 진행해야 함(무조건 실행되는 finally 특성을 이용하여 close() 같은걸 넣으면 됨) (메모리 누수 현상 방지)
        String data1 = null;
        String data2 = null;

//        data1 = args[0];
//        data2 = args[1];
        try {   // 한번 실행 해보고 프로그램 인수 입력 후 다시 실행해보기
            data1 = args[0];
            data2 = args[1];
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개값의 수가 부족합니다.");
            System.out.println("[실행 방법]");
            System.out.println("java TryCatchRuntimeEx num1 num2");
            return;
        }

        try {   // 프로그램 인수에 문자 넣어서 다시 실행해보기
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(data1 + " + " + data2 + " = " + result);
        }
        catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        }
        finally {   // 무조건 실행
            System.out.println("다시 실행하세요 : ");
        }

        System.out.println("\n-----프로그램 종료-----\n");
    }
}
