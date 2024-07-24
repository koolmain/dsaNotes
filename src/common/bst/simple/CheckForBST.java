package common.bst.simple;

/*
*
* The idea is to for each node, check if max value in left subtree is smaller than the node and min value in right subtree greater than the node.
*
*
* Follow the below steps to solve the problem:
*
*   If the current node is null then return true
*   If the value of the left child of the node is greater than or equal to the current node then return false
*   If the value of the right child of the node is less than or equal to the current node then return false
*   If the left subtree or the right subtree is not a BST then return false
*   Else return true
*
*    boolean isBST(Node node) {
*       if (node == null) {
*            return true;
*        }
*
*        // false if the max of the left is > than us
*        if (node.left != null
*        && maxValue(node.left) > node.data) {
*        return false;
*        }
*
*        // false if the min of the right is <= than us
*        if (node.right != null
*        && minValue(node.right) < node.data) {
*        return false;
*        }
*
*        // false if, recursively, the left or right is not a
*          BST
*        if (isBST(node.left) == false
*        || isBST(node.right) == false) {
*        return false;
*        }
*
*        // passing all that, it's a BST
 *       return true;
 *  }
*
* */
public class CheckForBST {
}
