public class solution {
    public static void main(String[] args) {
        tripleTrouble("this", "test", "lock");
    }

    public static void tripleTrouble(String fst, String snd, String trd) {

        int size1 = fst.length();
        int size2 = snd.length();
        int size3 = trd.length();

        int arrSize = (size1 >= size2 && size1 >= size3) ? size1 : (size2 >= size1 && size2 >= size3) ? size2 : size3;

        String[][] strArr = new String[3][]; // parametor 갯수
        String[][] strArr2 = new String[arrSize][3]; // 최대글자 사이즈 , parametor 갯수
        String result = "";
        strArr[0] = fst.split("");
        strArr[1] = snd.split("");
        strArr[2] = trd.split("");

        // 행열 변환
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                strArr2[j][i] = strArr[i][j];
            }
        }

        for (int i = 0; i < strArr2.length; i++) {
            for (int j = 0; j < strArr2[i].length; j++) {
                result += strArr2[i][j];
            }
        }

        System.out.println(result);

    }

}
