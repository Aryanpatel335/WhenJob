import java.util.*;

public class firstNonRepeated{

    String firstNonRepeatedSolution(String input){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int length = input.length();

        for(int i = 0; i < length ; i++){
            char c = input.charAt(i);
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for(int i =0 ; i < length; i++){
            if(map.get(input.charAt(i)) == 1){
                return String.valueOf(input.charAt(i));
            }
        }
        return "" ;

    }
    
    public static void main(String[] args){
        firstNonRepeated fnr = new firstNonRepeated();
        String input = "aabbcc";
        System.out.println(fnr.firstNonRepeatedSolution(input));
    }
}