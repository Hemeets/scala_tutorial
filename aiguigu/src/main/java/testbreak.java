public class testbreak {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            if (i == 3)
//                break;
//            System.out.println(i);
//        }
        try {
            for (int i = 0; i < 5; i++) {
                if (i == 3)
                    throw new RuntimeException();
                System.out.println(i);
            }
        } catch (Exception e){
            // 什么都不做，只是退出循环
        }
        System.out.println("这个是循环外的代码");
    }
}
