public class RecursionPrac {

    public static int fibFunc(int n){
        if(n <= 1){return n;} 
        return fibFunc(n - 1)  + fibFunc(n - 2);
    }
    public static int factorialfunc(int n){
        if(n <= 1 ){
            return 1;
        }
        return n * factorialfunc(n - 1);
    }
    public static void main(String[] args){
        System.out.println(factorialfunc(4));
        System.out.println(fibFunc(2));
    }
    
}
