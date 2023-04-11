public class PersonEx {
    public static void  main(String[] args) {
        Person p1 = new Person("123456-1234567", "홍길동");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

//        p1.nation = "USA";    //nation과 ssn은 final키워드가 사용돼서 일기전용 필드이기 때문에 수정 불가
//        p1.ssn = "961023-1904000";
        p1.name = "이지원";
    }
}
