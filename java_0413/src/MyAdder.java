public class MyAdder extends AdderClass {   // 추상메소드가 여러개인 경우 오류 여러개면 여러개 다 오버라이드 해줘야함
    @Override
    int add(int x, int y) {
        int res = x + y;
        return res;
    }

    @Override
    int add(int n) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += (i + 1);
        }
        return sum;
    }
}
