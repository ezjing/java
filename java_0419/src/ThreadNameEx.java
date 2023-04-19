public class ThreadNameEx {
    public static void main(String[] args) {
        Thread mainTread = Thread.currentThread();  // 현재실행하고 있는 스레드를 가져옴 (main)
        System.out.println("프로그램 사직 스레드 이름 : " + mainTread.getName());

        ThreadA threadA = new ThreadA();
        System.out.println("작업 스레드 이름 : " + threadA.getName());
        threadA.start();

        ThreadB threadB = new ThreadB();    // setName() 없는데 Thread-1이 기본값인듯
        System.out.println("작업 스레드 이름 : " + threadB.getName());
        threadB.start();
    }
}

