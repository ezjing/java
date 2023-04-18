public class Account {
    private long balance;

    public Account() {}

    public long getBalance() {  // 저금금액
        return balance;
    }
    public void deposit(int money) {    // 현재 저금금액 + 추가금액
        balance += money;
    }
    public void withdraw(int money) throws BlifException {  // 데이터 출력(출금)
        if (balance < money) {
            throw new BlifException("잔고 부족 : " + (money - balance) + "모자람");    // 출금하는 돈이 모아둔 돈 보다 많으면 만든 오류 출력
        }
        balance -= money;
    }
}
