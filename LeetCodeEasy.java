import java.util.*;

public class LeetCodeEasy {


    //leetcode 387. First Unique Character in a String
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> mapH = new HashMap<>();

        for(int i=0 ; i < s.length(); i++){
            char c = s.charAt(i);
            mapH.put(c, mapH.getOrDefault(c, 0) + 1);
        }

        for(int j = 0; j< s.length(); j++){
            if(mapH.get(s.charAt(j)) == 1){
                return j;
            }
        }
        return -1;
    }


    
}
