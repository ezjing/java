public class Exception1 { // 파일이름과 동일한 클래스만 public을 붙일 수 있다
    public static void main(String[] args) {
        // 예외 발생 nullpoinexception
//        String data = null;
//        System.out.println(data.toString());    //주소가 없는데 주소의 데이터를 사용하겠다 해서 nullpoinexception 오류 발생

        // ArrayIndexOutOfBoundsException이 발생함
//        int[] arrNum = new int[] {10, 20, 30};
//
//        for (int i = 0; i < 5; i++) {   //3,4 인덱스없는데 출력 하라 해서 ArrayIndexOutOfBoundsException 오류 발생
//            System.out.println("arrNum[" + i + "] : " + arrNum[i]);
//        }

        Dog dog = new Dog();
        changeDog(dog);


        // ClassCastException이 발생함  원본이 Cat인데 Dog로 변경 하려다가 오류 발생(자식클래스를 부모 클래스로 변경시킬때 오류나느거 처럼)
        Cat cat = new Cat();
        changeDog(cat);


    }

    public static void changeDog(Animal animal) {
        Dog dog = (Dog) animal;
    }
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
