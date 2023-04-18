public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("예금액 : " + account.getBalance());

        try {
            account.withdraw(30000);    // 만원들어가있는데 3만원 들어가서
        }
        catch (BlifException e) {   // 이런 오류 메시지 출력
            String message = e.getMessage();    // e.getMessage() 하면 오류 메시지 들고온다
            System.out.println(message);
            System.out.println();
            e.printStackTrace();
        }
    }
}
