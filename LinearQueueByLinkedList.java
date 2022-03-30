import java.util.Scanner;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class LinearQueueByLinkedList {
    Node front, rear;
    public boolean isEmpty(){
        return front == null && rear == null;
    }
    public void enqueue(Node n){
        if(isEmpty()) front = rear = n;
        else{
            rear.next = n;
            rear = n;
        }
    }
    public void dequeue(){
        if(isEmpty()) System.out.println("Queue is empty");
        else {
            front = front.next;
        }
    }
    public void display(){
        if(isEmpty()) System.out.println("Queue is empty");
        else {
            Node temp = front;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinearQueueByLinkedList obj = new LinearQueueByLinkedList();
        obj.enqueue(new Node(5));
        obj.enqueue(new Node(4));
        obj.enqueue(new Node(2));
        obj.dequeue();
        obj.display();
    }
}