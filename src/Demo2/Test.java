package Demo2;

public class Test {

    {
        System.out.println("匿名代码块");
    }

    static {
        System.out.println("静态代码块");
    }

    Test() {
        System.out.println("构造函数");
    }

    public static void main(String[] args) {
        new Test();
    }
}
