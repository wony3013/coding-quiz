import java.util.List;

public class solution {

    public static void main(String[] args) {
        List<Integer> lst = List.of(13,27,49);
        int[] result = rowWeights(lst);
        for (int i : result) {
            System.out.println(i);
        }

    }
       
    public static int[] rowWeights(List<Integer> lst) {

        int wgA = 0;
        int wgB = 0;
        for (int i = 0; i < lst.size(); i++) {
            if(i%2 == 1){
                wgB += lst.get(i);
            }else{
                wgA += lst.get(i);
            }
        }

        int[] result = {wgA, wgB};

        return result;
    }


} 