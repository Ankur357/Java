public class StackUsingArray {
    int size;
    int arr[];
    int top;
    StackUsingArray(int size){
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (size-1 == top);
    }

    public void push(int element){
        if(!isFull()){
            top++;
            arr[top] = element;
            //System.out.println("pushed element " + element);
        }
        else{
            System.out.println("Stack is full");
        }
    }
    public int pop(){
        if(!isEmpty()){
            int topElement = top;
            top--;
            //System.out.println("popped element " + arr[topElement]);
            return arr[topElement];
        }
        else{
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public int peek(){
        if(!this.isEmpty()) return arr[top];
        else{
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public static void main(String args[]){
        StackUsingArray s = new StackUsingArray((4));
        s.push(1);
        s.push(2);
        s.push(3);
        //s.pop();
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

