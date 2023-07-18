package Demo03;

public class Service01Impl implements Service01{
    @Override
    public void add(String str) {
        try {
            System.out.println(1/0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
