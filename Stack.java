import java.util.Arrays;

public class Stack {
    //push pop peek
    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int s){
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j){
        stackArray[++top] = j;
    }

    public long pop(){
        return stackArray[top--];
    }

    public long peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }

    public static void main(String[] args){
        Stack theStack = new Stack(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        System.out.println(Arrays.toString(theStack.stackArray));

        theStack.pop();
        System.out.println(Arrays.toString(theStack.stackArray));
        
        theStack.push(80);
        System.out.println(Arrays.toString(theStack.stackArray));
        theStack.pop();
        theStack.pop();



        while(!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        //added this to see the array after the stack is empty
        System.out.println("");
        System.out.println(Arrays.toString(theStack.stackArray));
    }
}
