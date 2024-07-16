package common.binarytree.traversal;

/*
*
* NOTE: Preorder : Print during thread CREATION
*
*
* */
public class MorrisPreOrderTraversal {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    void morrisPreorderTraversal(Node root){
        Node current = root, pre =null;

        while(current != null){
            //condition for leaf
            if(current.left == null){
                System.out.println(current.data + "-->");
                current = current.right;

            } else {
                pre = current.left;
                while(pre.right != null && pre.right != current )
                    pre = pre.right;

                //condition for first travel as threads are not created
                if(pre.right == null){
                    pre.right = current;
                    System.out.println(current.data + "-->");
                    current = current.left;
                }

                //condition for second visit as threads already available
                if(pre.right == current){
                    pre.right = null;
                    //System.out.println(current.data + "-->");
                    current = current.right;
                }
            }
        }
    }

    public static void main(String[] args) {
        MorrisPreOrderTraversal mt = new MorrisPreOrderTraversal();
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        mt.morrisPreorderTraversal(root);
    }
}
