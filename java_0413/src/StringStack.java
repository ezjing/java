import java.util.Scanner;

public class StringStack extends StackClass {
    String ob;
    @Override
    int length() {
        return 5;
    }

    @Override
    String pop() {
        return null;
    }

    @Override
    boolean push(String ob) {
        this.ob = ob;
        System.out.println(ob);
        return false;
    }
}