package common.binarytree;

/*
*
*
*  Mirror tree
*
*
Time Complexity: O(n), where n is the number of nodes in the tree. This is because we need to visit each node in the tree exactly once to swap its left and right child nodes.
* Auxiliary Space: O(h), where h is the height of the binary tree. This is because the maximum amount of space used by the algorithm at any given time is the size of the call stack, which is at most equal to the height of the binary tree. This is because each recursive call to mirror adds a new frame to the call stack, and the stack grows to a maximum depth of the height of the tree. Therefore, the space used by the algorithm is proportional to the height of the tree.
*
*       Input: INORDER TRAVERSAL :   2 3 4 5 6
*        5
*       / \
*      3   6
*     / \
*    2   4
*
*         Mirror tree will be: INORDER TRAVERSAL (reverse of original) :  6 5 4 3 2
*          5
*         / \
*        6   3
*           / \
*          4   2
*
* */
public class MirrorOfaTree {
}
