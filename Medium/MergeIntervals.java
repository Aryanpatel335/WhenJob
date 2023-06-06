 
import java.util.*;

public class MergeIntervals{

    public int[][] merge(int[][] intervals){

        //input: [[1,3],[2,6],[8,10],[15,18]]
        //output: [[1,6],[8,10],[15,18]]

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();

        for(int[] curr : intervals){
            if(merged.isEmpty() || merged.getLast()[1] < curr[0]){
                merged.add(curr);
            }
            else{
                merged.getLast()[1] = Math.max(merged.getLast()[1], curr[1]);
        
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
    
}