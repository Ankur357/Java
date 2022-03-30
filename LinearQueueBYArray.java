import java.util.Scanner;

public class LinearQueueBYArray {
    int head, tail;
    int[] arr;
    LinearQueueBYArray(int n){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array");
        // arr = new int[sc.nextInt()];
        arr = new int[n];
    }
    public boolean isFull(){
        return tail == arr.length;
    }
    public boolean isEmpty(){
        return head == tail;
    }
    public void enqueue(int data){
        if(isFull()) System.out.println("Queue is full");
        else {
            arr[tail] = data;
            tail++;
        }
    }
    public void dequeue(){
        if(isEmpty()) System.out.println("Queue is empty");
        else {
            arr[head] = 0;
            head++;
        }
    }
    public void traverse(){
        for(int i=head; i<tail; i++) System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        LinearQueueBYArray obj = new LinearQueueBYArray(5);
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.dequeue();
        obj.dequeue();
        obj.traverse();
    }
}