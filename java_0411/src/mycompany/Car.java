package mycompany;

// import문 : 패키지가 다른 클래스를 사용해야할 경우
import hyundai.Engine;  // 지정한 클래스 1개를 가져오기
import hyundai.*;   // 지정한 패키지 안의 모든 클래스 가져오기
import hankook.SnowTire;
import kumho.BigWidthTire;
// Tire라는 클래스가 hankook 패키지의 Tire 클래스인지, kumho 패키지의 Tire 클래스인지 알 수 없음
// 서로 다른 패키지의 동일한 이름의 클래스를 동시에 import하여 사용해야 할 경우 많이 사용하는 패키지의 클래스를 import로 가져오고, 사용 빈도가 낮은 패키지의 클래스를 패키지명과 함께 전체 다 입력하는 방식으로 사용해야 함
import hankook.Tire;


public class Car {
    Engine engine = new Engine();
    SnowTire tire1 = new SnowTire();
    BigWidthTire tire2 = new BigWidthTire(); // 만약 import문이 안써져 있을 경우 클래스명 클릭하고 알트엔터하면 자동으로생김
    
    // import 없이 해당 클래스를 가져오는 방식
    // 해당 클래스가 존재하는 패키지명과 클래스명을 모두 입력하여 가져오기(한국, 금호에도 Tire란 클래스가 존재하기 때문에 import문으로 들고오면 어떤 회사의Tire인지 구분할수 없어서 오류발생)
    // 클래스 명 앞에 패키지 명을 붙여주고있기 때문에 오류발생 X
    Tire tire3 = new Tire();    // Tire라는 이름으로 사용한건 전부 hankook 패키지의 Tire이다
    kumho.Tire tire4 = new kumho.Tire();
}
