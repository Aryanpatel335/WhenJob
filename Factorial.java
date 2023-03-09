public class Factorial {

    public static int factorialfunc(int n){
        if(n <= 0 ){
            return 1;
        }
        return n * factorialfunc(n - 1);
    }
    public static void main(String[] args){
        System.out.println(factorialfunc(4));
    }
    
}
