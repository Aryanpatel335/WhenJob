// import java.util.*;
public class PairsOfSongs {

    //brute force implementation
    public int numPairsDivisibleBy60BruteForce(int[] time) {
        int count =0;
        int n = time.length;

        for(int i = 0; i < n; i++){
            for(int j = i +1; j < n;j++){
                if((time[i]+ time[j])% 60 == 0)
                    count++;
            }
        }
        return count;
    }

    //optimized implementation

    public int numPairsDivisibleBy60(int[] time){
        int count = 0;
        int[] remainder = new int[60];
        for(int t : time){
            if(t % 60 == 0){
                count += remainder[0];
            }
            else{
                //finding the compliment by doing 60 - t%60
                count += remainder[60-t%60];
            }
            remainder[t%60]++;
        }
        return count;
    }
    
}
