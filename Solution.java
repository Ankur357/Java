import java.io.*;
import java.util.*;

public class Solution {
    static Queue<Integer>queue;
    static void reverse(int k){
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<k;i++){
            stack.push(queue.peek());
            queue.remove();
        }
        while(!stack.empty()){
            queue.add(stack.peek());
            stack.pop();
        }
        for(int i=0;i<queue.size()-k;i++){
            queue.add(queue.peek());
            queue.remove();
        }
    }
    static void Print(){
        while(!queue.isEmpty()){
            System.out.print(queue.peek()+" ");
            queue.remove();
        }
    }

    public static void main(String[] args) {
        queue=new LinkedList<Integer> ();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            queue.add(arr[i]);
        }
        reverse(k);
        Print();
        
        
    }
}