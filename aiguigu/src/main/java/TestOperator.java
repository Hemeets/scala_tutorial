public class TestOperator {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");

        Boolean isEqual = s1 == s2;
        System.out.println(isEqual);
        System.out.println(s1.equals(s2));

        System.out.println("=================");

        byte b = 10;
        b = (byte) (b + 1);
        b += 1;
        System.out.println(b);

        // 自增
        int x = 15;
        int y = x++;
        System.out.println(x);
        System.out.println(y);

    }
}
