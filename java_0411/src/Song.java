public class Song {
    String title;   // private으로 선언하면 보안이 좋아짐

    public Song(String title) {
        this.title = title;
    }

    public String getTitle() {  // private쓰면 getter, setter 필요
        return title;
    }

}
