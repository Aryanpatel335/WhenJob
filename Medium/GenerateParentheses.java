package Medium;

import java.util.*;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n){
        List<String> result = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        backTrack(result, curr, 0, 0 , n);
        return result;

    }

    public void backTrack(List<String> ans, StringBuilder curr, int open, int closed, int max){
        if(curr.length() == max * 2){
            ans.add(curr.toString());
            return; 
        }

        if(open < max){
            curr.append('(');
            backTrack(ans, curr, open+1, closed,max);
            curr.deleteCharAt(curr.length()- 1);
        }
        if(closed < open){
            curr.append(')');
            backTrack(ans, curr, open, closed + 1, max);
            curr.deleteCharAt(curr.length()-1);
        }
        
    }
    
}
