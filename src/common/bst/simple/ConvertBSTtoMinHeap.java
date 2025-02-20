package common.bst.simple;

/*
*
*   https://www.youtube.com/watch?v=4r91P4VeQxc
*
*   BST to min heap Heap
*
*       Inorder and then Preorder traversal as   Root(smallest) --> Left (smaller) --> Right (number) as inorder are sorted list
*
*   BST to max heap
*
*       Inorder and then Postorder traversal as   Left(smallest) --> Right (smaller) --> Root (number) as inorder are sorted list
 *
 *
 *  BST to MIN HEAP
*   Store the inorder traversal of the BST in array and then do preorder traversal of the BST and while doing preorder traversal copy the values of inorder traversal
*   into the current node, as copying the sorted elements while doing preorder traversal will make sure that a Min-Heap is constructed with the condition
*   that all the values in the left subtree of a node are less than all the values in the right subtree of the node.
*
*   Follow the given steps to solve the problem:
*
*       Create an array arr[] of size N, where N is the number of nodes in the given BST.
*       Perform the inorder traversal of the BST and copy the node values in the arr[] in sorted order.
*       Now perform the preorder traversal of the tree.
*       While traversing the root during the preorder traversal, one by one copy the values from the array arr[] to the nodes of the BST.
*
*
*
* */
public class ConvertBSTtoMinHeap {
}
