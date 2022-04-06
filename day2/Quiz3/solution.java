import java.util.List;

// #### 🤔 문제 설명
// - 몇 사람이 두 팀으로 나뉘어 줄지어 서 있다. 첫 번째 사람은 1팀, 두 번째 사람은 2팀, 세 번째 사람은 1팀으로 간다.
// - 양의 정수(인간의 체중)를 배열한 경우, 두 개의 정수 중 새로운 배열/튜플을 반환하십시오. 

// - 첫 번째 배열은 1팀의 총 체중이고 두 번째 배열은 2팀의 총 체중이다.

// - 배열 크기는 최소 1이다.

// - 모든 숫자는 양수일 것이다.

// #### 🎯 TestCase
// ```javascript
// rowWeights([13, 27, 49])  ==>  return (62, 27)
// rowWeights([50, 60, 70, 80])  ==>  return (120, 140)
// rowWeights([80])  ==>  return (80, 0)
// ```

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