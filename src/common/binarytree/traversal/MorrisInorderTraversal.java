package common.binarytree.traversal;


/*
*
* Morris Inorder Traversal
*
*
* Time Complexity: O(n) If we take a closer look, we can notice that every edge of the tree is traversed at most three times. And in the worst case, the same number of extra edges (as input tree) are created and removed.
* Auxiliary Space: O(1) since using only constant variables
*
*
*  NOTE: Inorder : Print during thread removal
*
* 1. Initialize current as root
* 2. While current is not NULL
*   If the current does not have left child
*      a) Print current’s data
*      b) Go to the right, i.e., current = current->right
*   Else
*      a) Find rightmost node in current left subtree OR
*              node whose right child == current.
*         If we found right child == current
*             a) Update the right child as NULL of that node whose right child is current
*             b) Print current’s data
*             c) Go to the right, i.e. current = current->right
*         Else
*             a) Make current as the right child of that rightmost
*                node we found; and
*             b) Go to this left child, i.e., current = current->left
* */
public class MorrisInorderTraversal {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    void morrisInorderTraversal(Node root){
        Node current = root;
        Node pre = null;

        while(current != null ){

            if(current.left == null){
                System.out.print(current.data + "-->");
                current = current.right;
            }else{
                pre = current.left;
                while(pre.right != null && pre.right != current)
                    pre = pre.right;
                if(pre.right == null){
                    pre.right = current;
                    current = current.left;
                }else {
                    pre.right = null;
                    System.out.print(current.data + "-->");
                    current = current.right;
                }
            }
        }
    }

    public static void main(String[] args) {
        MorrisInorderTraversal mt = new MorrisInorderTraversal();
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        mt.morrisInorderTraversal(root);



    }
}
