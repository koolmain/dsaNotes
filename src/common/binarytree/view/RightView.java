package common.binarytree.view;


/*
*
*
* Using Recursion:
*
*   The idea is to use recursion and keep track of the maximum level also.
*   And traverse the tree in a manner that the right subtree is visited before the left subtree.
*
*               // Base Case
*        if (node == null)
*            return;
*
*        // If this is the last Node of its level
*        if (max_level.max_level < level) {
*            System.out.print(node.data + " ");
*            max_level.max_level = level;
*        }
*
*        // Recur for right subtree first, then left subtree
*        rightViewUtil(node.right, level + 1, max_level);
*        rightViewUtil(node.left, level + 1, max_level);
*
* Using Level Order traversal
*   The idea is to use Level Order Traversal as the last node every level gives the right view of the binary tree.
*
*   Time Complexity: O(N), where N is the number of nodes in the binary tree.
*   Auxiliary Space: O(N) since using auxiliary space for queue
*
* Using Morris Traversal:
*
*
*
* Time Complexity: O(n) , The time complexity of the Morris Traversal approach is O(n), where n is the number of nodes in the binary tree. This is because we visit each node exactly twice (once when we find its inorder predecessor, and once when we visit it from its inorder predecessor).
* Auxiliary Space:  O(1) , The space complexity of the Morris Traversal approach is O(1), because we only use a constant amount of extra space for the res, curr, and next pointers. We do not use any additional data structures or recursive function calls that would increase the space complexity.
*
* */
public class RightView {
}
