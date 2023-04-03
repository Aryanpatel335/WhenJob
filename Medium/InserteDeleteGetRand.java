package Medium;
import java.util.*;


//arraylist
//hashmap key: value where key is the val and the index is the value

public class InserteDeleteGetRand {


    ArrayList<Integer> list;
    HashMap<Integer, Integer> map;

    Random rand = new Random();

    public InserteDeleteGetRand(){
        list = new ArrayList<>();
        map = new HashMap<>();
        
    }


    // val = 123 --- {key: val} -> {123 : 0} 
    // val = 423 --- {key: val} -> {123 : 0, 423 : 1}
    public boolean insert(int val){

        if(map.containsKey(val)) return false;
        
        list.add(val);
        map.put(val, list.size());

        return true;

    }

    public boolean remove(int val){
        if(!map.containsKey(val)) return false;

        int lastElement = list.get(list.size() - 1);
        int index = map.get(val);

        //swap
        //replace last element with the elemetn to be removed
        list.set(index, lastElement);
        map.put(lastElement, index);

        list.remove(list.size() - 1);
        map.remove(val);

        return true;


    }

    public int getRandom(){

        return list.get(rand.nextInt(list.size()));

    }
}
