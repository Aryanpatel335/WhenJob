

public class SubarraySumsDivByK {
    public int subarraysDivByK(int[] nums, int k){
        int result = 0;
        int prefixMod = 0;
        
        int[] modGroups = new int[k];

        for(int num: nums){
            prefixMod = (prefixMod + num % k + k) % k;

            if(prefixMod % k == 0) result++;

            result+= modGroups[prefixMod];  
            modGroups[prefixMod]++;
        }
        return result;

    }
}
