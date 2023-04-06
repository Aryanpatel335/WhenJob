package Medium;
import java.util.*; 
public class MinRoundsToComplete {

    public int minimumRounds(int[] tasks){
        Map<Integer, Integer> freq = new HashMap<>();

        for(int x : tasks){
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        int minRounds = 0 ;

        for(int y : freq.values()){
            if(y == 1){
                return -1;
            }
            if(y % 3 == 0){
                minRounds += y/3;
            }else{
                
                minRounds += y/ 3  + 1;
        
            }
        
        }

        return minRounds;

    }

    
}
