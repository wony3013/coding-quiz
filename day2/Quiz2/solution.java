public class solution {

    public static void main(String[] args) {

        System.out.println(factorial2(3));

    }
    
    public static int factorial2(int num) {
        if(num > 1) return factorial2(num-1) * num; // 재귀호출, stack
        else return 1;
    }

    public static int factorial(int num) {
        int result = 1;
        for (int i = num; i > 1; i--) {
            result = result * i;
        }

        return result;
    }

} 