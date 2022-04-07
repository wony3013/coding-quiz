import java.util.HashMap;

public class solution {

    public static int currX = 0; // 현재 x 좌표
    public static int currY = 0; // 현재 y 좌표
    public static int maxX = 0; // 배열 최대 x 크기
    public static int maxY = 0; // 배열 최대 y 크기



    public static void main(String[] args) {
        
        int[][] maze = {{1,1,1,1,1,1,1},
                        {1,0,0,0,0,0,3},
                        {1,0,1,0,1,0,1},
                        {0,0,1,0,0,0,1},
                        {1,0,1,0,1,0,1},
                        {1,0,0,0,0,0,1},
                        {1,2,1,0,1,0,1}};

        String[] input = {"N","N","N","N","N","E","E","E","E","E"};

        System.out.println(mazeRunner(maze, input));
        
    }
    /**
     * O1. maze 배열에서 2값의 좌표를 x,y에 저장
     * O2. E = x, y + 1 
     *     W = x, y - 1
     *     S = x + 1, y
     *     N = x - 1, y
     * R1. 한 방향으로 이동 후 상태 체크
     *       0 = 다음 단계 진행
     *       1 = 벽 -> return "Dead"
     *       2 = 다음 단계 진행
     *       3 = return "Finish"
     * R2. 배열 밖으로 이동 시(에러 예외처리(에러 발생시 1회) or 범위값 저장(매번 범위 체크 로직 들어감)) return "Dead"  
     * R3. move 배열 종료 시 return "Lost"       
     */
    public static String mazeRunner(int[][] maze, String[] input) {

        Stgring result = "None";

        if(getStart(maze)){ // start 지점 찾을 시 시작
            // x,y 이동
            for (String way : input) {
                runMaze(input);
                // 범위 체크
                if(maxX > currX && maxY > currY){
                    // 상태값 불러온 후 상태체크하여 결과 return
                    int helth = maze[y][x];
                    switch (helth) {
                        case 1: // 벽
                            return "Dead";
                            break;
                        case 3: // 종료
                            return "Finish";
                            break;
                        default:
                            break;
                    }
                } else {
                    // 범위밖 
                    return "Dead";
                }
            }
        } else {
            return "ERROR - Start Point Empty";
        }
        // 배열 종료 
        return "Lost";
    }
    
    // 이동후 상태체크 호출
    public static void runMaze(String way) {
        switch (way) {
            case "E":
                currX = currX + 1;
                break;
            case "W":
                currX = currX - 1;
                break;
            case "S":
                currY = currY + 1;
                break;
            case "N":
                currY = currY - 1;
                break;
            default:
                break;
        }
    }

    // Start 찾기
    public static Boolean getStart(int[][] maze) {

        // Start 찾기
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                if(maze[i][j] == 2){
                    currX = j;
                    currY = i;  
                    return true;
                }
            }
        }
        return false;
    }


} 
