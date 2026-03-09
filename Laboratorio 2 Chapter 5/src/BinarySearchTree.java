

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        left =right=null;
    }
}

public class BinarySearchTree {
    public Node root;

    public BinarySearchTree() {
        root = null;

    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = new Node(100);
        bst.root.left = new Node(50);
        bst.root.right = new Node(125);
        bst.root.left.left = new Node(25);
        bst.root.left.right = new Node(55);
        bst.root.right.left = new Node(120);
        bst.root.right.right = new Node(99999);

        Node current = bst.root;
        int target =120;
        nodeSlay(current,target);

    }
    public static void nodeSlay(Node current,int target) {
        while(current != null){
            if(current.data == target){
                System.out.println("Was found: "+current.data);
                return;
            }
            else if(current.data > target){
                current = current.left;
            }
            else if (current.data < target){
                current = current.right;
            }


        }
        System.out.println("Was not found");
    }
}
