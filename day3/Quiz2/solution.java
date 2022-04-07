public class solution {

    public static void main(String[] args) {
        
        System.out.println(numPrimorial(3));
        
    }
       
    public static int numPrimorial(int num) {

        int result = 1; //곱하기용 
        int x = 2, y = 2; //소수는 2부터
        
        //소수 : 2이상 이고 자신을 제외한 정수로 나누어지지 않는 숫자
        if(num < 2){
            return 0;
        }

        for (int i = 0; i < num; i++) { // i = 소수 갯수, num = 최대갯수 까지
            while (true) {
                if(x%y==0){
                    if(x==y){ // x == y 될때까지 else 조건에 걸리지 않으면 소수
                        System.out.println("x : " + x);
                        result = result * x;
                        x++;
                        y=2;
                        break;
                    }else {
                        x++;
                        y=2;
                    }
                }else{
                    y++;
                }
            }
        }

        return result;
    }


} 