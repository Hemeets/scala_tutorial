public class testrecursion {
    public static void main(String[] args) {
        // 计算阶乘
        System.out.println(factorial(5));
        System.out.println(fact(5));


    }


    // 循环
    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    // 递归
    public static int fact(int n){
        if (n == 0) return 1;
        return fact(n - 1) * n;
    }

}
