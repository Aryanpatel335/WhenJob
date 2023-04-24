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

    public int lastStoneWeight(int[] stones){
        PriorityQueue<Integer> pqHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());

        for(int stone: stones){
            pqHeap.add(stone);
        }

        while(pqHeap.size() > 1){
            int x = pqHeap.remove();
            int y = pqHeap.remove();

            if(x != y){
                pqHeap.add(x-y);
            }
        }
        return pqHeap.isEmpty() ? 0 : pqHeap.peek();
    }
    
}
