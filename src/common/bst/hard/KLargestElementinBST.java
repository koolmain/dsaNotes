package common.bst.hard;

/*
*
* Method 1:
*
*   Time complexity: O(n)
*
* Method 2: With Augmentation
*
*   Time complexity: O(h)  (h - height of BST)
*
* Method 3:
*
*       The idea is to do reverse inorder traversal of BST. Keep a count of nodes visited.
*       The reverse inorder traversal traverses all nodes in decreasing order, i.e, visit the right node then centre then left and continue traversing the nodes recursively.
*       While doing the traversal, keep track of the count of nodes visited so far.
*       When the count becomes equal to k, stop the traversal and print the key.
*
* */
public class KLargestElementinBST {
}
