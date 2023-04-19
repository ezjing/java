import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        // Stack : 후입선출 구조 (탄알집 같은느낌)
        Stack<Coin> coinBox = new Stack<>();
        
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));
        
        while (!coinBox.isEmpty()) {
            Coin coin = coinBox.pop();
            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");    // 입력과 정 반대의 순서대로 나옴. (후입선출)
        }
    }
}
