package BinaryTrees;
import java.util.Queue;
import java.util.LinkedList;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val= val;
    }
}
class Pair{
    Node node;
    int level;
    Pair(Node node, int level){
        this.node = node;
        this.level = level;
    }
}
public class Implementation {
    public static void main(String[] args) {
        //         3
        //       /   \
        //      4     2
        //     / \   / \
        //   -1   1  6  9

        //Creating Nodes
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);

        //Attachments
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

//        preOrder(a);
//        System.out.println();
//        inOrder(a);
//        System.out.println();
        postOrder(a);
//        System.out.println(size(a));
//        System.out.println(sum(a));
//        System.out.println(max(a));
//        System.out.println(pro(a));
//        System.out.println(levels(a));
//        levelOrder(a);
//          levelOrderLineWise(a);
    }
        private static int levels(Node root){
        if(root==null) return 0;
        return 1+ Math.max(levels(root.left),levels(root.right));
        }
        private static int sum(Node root) {
            if(root == null) return 0;
            return root.val + sum(root.left) + sum(root.right);
        }
        private static int pro(Node root){
        if(root == null) return 1;
        return root.val * pro(root.left) * pro(root.right);
    }
        private static int max(Node root){
             if(root == null) return Integer.MIN_VALUE;
             return Math.max(root.val,Math.max(max(root.left),max(root.right)));
        }
        private static int size(Node root) {
        if(root==null) return 0;
//        if(root.left==null && root.right==null) return 1;
        return 1 + size(root.left) + size(root.right);

    }

    private static void preOrder(Node root) {
            if (root == null) return;
            System.out.print(root.val + " ");
            preOrder(root.left);    // left ki sari values print kr dega
            preOrder(root.right);  // right  ki sari values print kr dega

        }
    private static void inOrder(Node root) {
        if(root==null) return;
        inOrder(root.left);    // left ki sari values print kr dega
        System.out.print(root.val+" ");
        inOrder(root.right);  // right  ki sari values print kr dega

    }
    private static void postOrder(Node root) {
        if(root==null) return;
        postOrder(root.left);    // left ki sari values print kr dega
        postOrder(root.right);  // right  ki sari values print kr dega
        System.out.print(root.val+" ");
    }


    private static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){ 
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        System.out.println();
    }
    private static void levelOrderLineWise(Node root){
        Queue<Pair> q = new LinkedList<>();
        int currLevel = 0;
        q.add(new Pair(root,0));
        while(q.size()>0){
            Pair front = q.remove();
            Node node = front.node;
            int level = front.level;
            if(front.level!= currLevel) {
                currLevel++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");
            if(node.left!=null) q.add(new Pair(node.left,level+1));
            if(node.right!=null) q.add(new Pair(node.right,level+1));
        }
        System.out.println();
    }


}
