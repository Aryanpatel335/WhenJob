import java.util.*;

public class Practice {
    public int helper(){
        return -1;
    }

    public int findFirstNonRepeating(String str){
        HashMap<Character, Integer> charCounts = new HashMap<>();
        for (char c: str.toCharArray()){
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        // for(char c: str.toCharArray()){
        //     if (charCounts.get(c) == 1){
        //         return c;
        //     }
        // }
        char[] char_ArrayList = str.toCharArray();

        for (int i =0 ; i < str.length(); i++){
            if (charCounts.get(char_ArrayList[i]) == 1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        Practice p = new Practice();
        String input1 = "aabbcgcddeeff";
        String input2 = "aabbcfcdd";

        int result1 = p.findFirstNonRepeating(input1);
        int result2 = p.findFirstNonRepeating(input2);

        System.out.println("Input: " + input1 + ", First non-repeating: " + result1);
        System.out.println("Input: " + input2 + ", First non-repeating: " + result2);
    }

}
