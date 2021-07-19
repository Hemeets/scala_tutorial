public class TestDataTypeConversion {
    public static void main(String[] args) {
        byte b = 10;
        test(b);  // 自动类型转换：最近的更高精度的类型
        char c = 'a';
        test(c);
    }

//    public static void test(byte b) {
//        System.out.println("bbbb");
//    }

//    public static void test(short s) {
//        System.out.println("ssss");
//    }

//    public static void test(char c) {
//        System.out.println("cccc");
//    }

    public static void test(int i) {
        System.out.println("iiii");
    }

}
