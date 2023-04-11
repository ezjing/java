public class Race {
    String title;
    String author;

    void show() {
        System.out.println(title + "" + author);
    }
        public Race() {
            this("", "");
            System.out.println("생성자 호출됨");
        }
        public Race(String title) {
            this(title, "작자미상");
        }
        public Race(String title, String author) {
            this.title = title;
            this.author = author;
        }
        public static void main(String[] args) {
            Race littlePrince = new Race("어린왕자", "생텍쥐페리");
            Race loveStory = new Race("춘향전");
            Race emptyRace = new Race();
//            loveRace.show();
        }
    }

