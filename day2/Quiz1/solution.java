import java.util.Arrays;
import java.util.List;

public class solution {

    public static void main(String[] args) {

        //List<Integer> lst = Arrays.asList(1, 2, 3, -4);
        List<Integer> lst = List.of(1, 2, 3, -4); //java9~
        System.out.println(maxDiff(lst));

    }

    public static int maxDiff(List<Integer> lst) {
        return lst.stream().max(Integer::compare).orElse(0) - lst.stream().min(Integer::compare).orElse(0);
    }

    public static int maxDiff_old(List<Integer> lst) {
        int result = 0;
        
        if(lst.size() >= 2){
            int max = lst.get(0);
            int min = lst.get(0);

            for (int num : lst) {
                max = num > max ? num : max;
                min = num < min ? num : min;
            }
            result = max - min;
        }

        return result;
    }
} 