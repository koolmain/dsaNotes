package common.binarytree;

/*
*
*
*
*  Diameter = 1 + leftHeight + rightHeight
*
* */
public class DiameterOfaTree {

    static int totalDiameter=Integer.MIN_VALUE;
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right =null;
        }
    }

    static int height(Node root){
        if(root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

       totalDiameter = Math.max(leftHeight + rightHeight + 1, totalDiameter);
       return 1+ Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        height(root);
        System.out.println("Diameter is " + totalDiameter);
    }
}
