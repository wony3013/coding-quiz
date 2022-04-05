public class solution {

    public static void main(String[] args) {
        pinChk("0000");
    } 

    public static void pinChk(String pinNum) {

        int strChk = pinNum.replaceAll("[0-9]", "").length();
        int numChk = pinNum.replaceAll("[^0-9]", "").length();
        System.out.println("strChk : " + strChk);
        System.out.println("numChk : " + numChk);
        if( strChk == 0 && ( numChk == 4 || numChk == 6 ) ){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        
    }

}