public class SingletonEx {
    public static void main(String[] args) {
//        Singleton obj1 = new Singleton(); //private 사용하면 new 사용불가
//        Singleton obj2 = new Singleton();   //new는 메모리에서 새로운 공간을 만들어내는것이기 때문에 서로 다른 객체가 됨

        //싱글톤 방식
        Singleton obj1 = Singleton.getInstance();   //스태틱으로 정적멤버로서 클래스에서 호출했기때문에 같은 객체임. (객체를 정적멤버처럼 쓰려고 이런걸쓰나..?)
        Singleton obj2 = Singleton.getInstance();
        
        if (obj1 == obj2) {
            System.out.println("obj1과 obj2는 같은 객체입니다.");
        }
        else {
            System.out.println("obj1과 obj2는 다른 객체입니다.");
        }
    }
}
