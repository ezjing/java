public class FileInputStream implements AutoCloseable {
    private String file;

    public FileInputStream(String file) {
        this.file = file;
    }

    public void read() {
        System.out.println(file + " 을 읽습니다.");
    }

    @Override  // close 부분 오버라이딩 해줘야함
    public void close() throws Exception {
        System.out.println((file + "을 닫습니다."));
    }

}
