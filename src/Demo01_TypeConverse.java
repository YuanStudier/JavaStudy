/**
 *
 */
public class Demo01_TypeConverse {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //低到高自动转换，float > long
        long a = 12;
        float b = a;

        byte c = 12;
        char d = 'a';
        short e = 12;
        //short比byte高，char和他们不能自动转换，但是可以强制转换
//        e = d;
//        d = e;
        e = c;
//        c = e;
//        c = d;
//        d = c;
        e = (short) d;
        d = (char) e;
        c = (byte) d;
        d = (char) e;

        new Student();


    }

    public static class Student {
        int age;

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        String name;

        public Student() {

        }

        private void Study() {
            System.out.println(this.name + "在学习");
        }
    }
}
