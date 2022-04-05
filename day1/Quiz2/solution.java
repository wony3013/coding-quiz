public class solution {

    public static void main(String[] args) {
        repeatStr(6, "bye_");
    }
 
    public static void repeatStr(int cnt, String src) {
        String result = "";
        for (int i = 0; i < cnt; i++) {
            result += src;
        }

        System.out.println(result);

        // return result;
    }
}