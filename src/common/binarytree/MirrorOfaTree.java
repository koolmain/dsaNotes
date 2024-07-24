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
*   1. Iterate over map of stack
*      Push all connected nodes of each node of first tree in map of  stack.
*
*  2. Again iterate over map for each node of second tree
*      For example :
*
*      Let us take one node X of second tree
*
*      For this node X , check in map which stack is used
*
*      a = Top of that stack for node X present in second tree;
*      b = Connected node of X in second tree
*      if (a != b)
*           return false;
*      pop node X from stack.
*
*
*  Approach 2: Using LinkedList
*
*   The main approach is to use one list of stack and one list of queue to store to value of nodes given in the form of two arrays.
*
*    1) Initialize both the lists with empty stack and empty queues respectively.
*    2) Now, iterate over the lists
*        Push all connected nodes of each node of first tree in list of stack and second tree list of queue.
*    3) Now iterate over the array and pop item from both stack and queue and check if they are same, if not same then return 0.
*
* */
public class MirrorOfaTree {
}
