package inclass;

import edu.princeton.cs.algs4.StdOut;

public class BinaryTree {

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public BinaryTree() {
        root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(8);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(4);
        root.right.right = new Node(3);
    }

    public void levelOrder() {
        Queue<Node> q = new LinkedQueue<>();
        q.enqueue(root);
        while (!q.isEmpty()) {
            Node n = q.dequeue();
            if (n != null) {
                StdOut.println(n.value);
                q.enqueue(n.left);
                q.enqueue(n.right);
            }
        }
    }

//    public void preorder() {
//        Stack<Node> q = new LinkedStack<>();
//        q.push(root);
//        while (!q.isEmpty()) {
//            Node n = q.pop();
//            if (n != null) {
//                StdOut.println(n.value);
//                q.push(n.right);
//                q.push(n.left);
//            }
//        }
//    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(Node n) {
        if (n != null) {
            StdOut.println(n.value);
            preorder(n.left);
            preorder(n.right);
        }
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(Node n) {
        if (n != null) {
            inorder(n.left);
            StdOut.println(n.value);
            inorder(n.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree();
        t.inorder();
    }

}
