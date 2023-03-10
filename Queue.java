public class Queue {

    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;

    public Queue(int s){
        maxSize = s + 1;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
    }

    public void insert(long j){
        if(rear == maxSize - 1){
            rear = -1;
        }
        queArray[++rear] = j;
    }

    public long remove(){
        long temp = queArray[front++];
        if(front == maxSize){
            front = 0;
        }
        return temp;
    }

    public long peekFront(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return (rear + 1 == front || (front + maxSize - 1 == rear));
    }

    public boolean isFull(){
        return (rear + 2 == front || (front + maxSize - 2 == rear));
    }

    public int size(){
        if(rear >= front){
            return rear - front + 1;
        } else {
            return (maxSize - front) + (rear + 1);
        }
    }


    public static void main(String[] args){
        Queue theQueue = new Queue(5);
        theQueue.insert(10);
        theQueue.insert(270);
        theQueue.insert(420);
        theQueue.insert(540);
        theQueue.insert(550);
        theQueue.insert(560);
        theQueue.insert(570);
        theQueue.insert(580);
   



        while(!theQueue.isEmpty()){
            long n = theQueue.remove();
            System.out.print(n);
            System.out.print(" ");
        }


        System.out.println("");

    }


    
}
