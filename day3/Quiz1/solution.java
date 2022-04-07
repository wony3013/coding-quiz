import java.util.List;

public class solution {

    public static void main(String[] args) {
        List<Integer> lst = List.of(4,8,6);
        System.out.println(getListDiff(lst));
        
    }
       
    public static int getListDiff(List<Integer> lst) {

        int result = 0;

        if(lst.size() > 0){
            int max = lst.stream().max(Integer::compare).orElse(0);
            int min = lst.stream().min(Integer::compare).orElse(0);
    
            int oriCnt = lst.size();
            int newCnt = max - min + 1;

            result = newCnt - oriCnt;
        }
        return result;
    }


} 
