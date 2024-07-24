package common.bst.hard;
/*
*
*
*
*
*  Method 2
*
*   Time Complexity : O(n)
*   Space complexity: O(n) For call stack since using recursion
*
*   The idea is based on method 3 of check if a binary tree is BST article (https://www.geeksforgeeks.org/a-program-to-check-if-a-binary-tree-is-bst-or-not/).
*       A Tree is BST if following is true for every node x.
*
*       The largest value in left subtree (of x) is smaller than value of x.
*       The smallest value in right subtree (of x) is greater than value of x.
*       We traverse the tree in a bottom-up manner. For every traversed node, we return the maximum and minimum values in the subtree rooted at that node. The idea is to determine whether the subtree rooted at each node is a Binary Search Tree (BST). If any node follows the properties of a BST and has the maximum size, we update the size of the largest BST.
*
*
*  Method 3 (Shorter, Smarter and More Efficient)
*
*       In this section, a different O(n) solution is discussed. This solution is simpler than the solutions discussed in Set-1 and Set-2 and works in O(n) time. In this method, we do not need to check explicitly if the binary tree is BST. A Tree is BST if the following is true for every node x.
*
*       1. The largest value in the left subtree (of x) is smaller than the value of x.
*       2. The smallest value in the right subtree (of x) is greater than the value of x.
*
*       So, we will just check if the largest value of the left subtree is less than the value of the root node and the smallest value of right subtree is greater than the value of root node.


* */
public class LargestBSTinGivenBinaryTree {
}
