package TREE;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
    }
}
public class BinaryTree {
    Node root;
    // BinaryTree(int key){
    //     root = new Node(key);
    // }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

    }
    
}
