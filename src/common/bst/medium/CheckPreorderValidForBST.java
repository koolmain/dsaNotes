package common.bst.medium;

/*
*
*
*A Simple Solution is to do following for every node pre[i] starting from first one.
*
*   Time Complexity  O(n2)
*
*       1) Find the first greater value on right side of current node.
*          Let the index of this node be j. Return true if following
*          conditions hold. Else return false
*           (i)  All values after the above found greater value are
*                greater than current node.
*           (ii) Recursive calls for the subarrays pre[i+1..j-1] and
*                pre[j+1..n-1] also return true.
*
*
*   An Efficient Solution can solve this problem in O(n) time. The idea is to use a stack. This problem is similar to Next (or closest) Greater Element problem. Here we find the next greater element and after finding next greater, if we find a smaller element, then return false.
*
*   Time Complexity O(n)
*   Auxiliary Space: O(n)
*
*           1) Create an empty stack.
*           2) Initialize root as INT_MIN.
*           3) Do following for every element pre[i]
*                a) If pre[i] is smaller than current root, return false.
*                b) Keep removing elements from stack while pre[i] is greater
*                   then stack top. Make the last removed item as new root (to
*                   be compared next).
*                   At this point, pre[i] is greater than the removed root
*                   (That is why if we see a smaller element in step a), we
*                   return false)
*                c) push pre[i] to stack (All elements in stack are in decreasing
*                   order)
*
*   Another approach: Without Stack
*
*       Time complexity: O(N)
*       Auxiliary Space: O(height of the possible binary tree)
*
*       The idea is to use the similar concept of “Building a BST using narrowing bound algorithm” (https://www.geeksforgeeks.org/construct-bst-from-given-preorder-traversa/).
*       We will recursively visit all nodes, but we will not build the nodes. In the end, if the complete array is not traversed, then that means that array can not
*       represent the preorder traversal of any binary tree.
*
*
*
*
 *
* */
public class CheckPreorderValidForBST {
}
