package common.binarytree;

/*
*
*   A tree can be folded if the left and right subtrees of the tree are structure-wise mirror images of each other.
*   An empty tree is considered foldable.
*
*        Input:
*              10
*            /     \
*          7      15
*            \     /
*           9  11
*       Output: Can be folded
*
*       Input:
*               10
*              /  \
*            7   15
*          /    /
*       5   11
*       Output: Cannot be folded
*
*   Approach:
*       The idea is to change the left subtree to its mirror then check that left subtree with its right subtree.
*
*   Time complexity: O(N), Visiting all the nodes of the tree of size N.
*   Auxiliary Space: O(N), If stack space is considered else O(1)
*
*   Follow the steps below to solve the problem:
*
*       1) If tree is empty, then return true.
*       2) Convert the left subtree to its mirror image
*       3) Check if the structure of left subtree and right subtree is same and store the result.
*           res = isStructSame(root->left, root->right). isStructSame() recursively compares structures of two subtrees and returns true if structures are same
*       4) Revert the changes made in step (2) to get the original tree.
*       5) Return result res stored in step 3.
*
*
*  Approach :
*       The idea is to check the left and right subtree whether they are mirror or not.
*
*   Time Complexity: O(N), Visiting every node of the tree of size N.
*   Auxiliary Space: O(N), If stack space is considered
*
*
*       1) If tree is empty then return true.
*       2) Else check if left and right subtrees are structure wise mirrors of each other. Use utility function IsFoldableUtil(root->left, root->right) for this.
*       3) Checks if n1 and n2 are mirror of each other.
*           a) If both trees are empty then return true.
*           b) If one of them is empty and other is not then return false.
*           c) Return true if following conditions are met
*               n1->left is mirror of n2->right
*               n1->right is mirror of n2->left
*
*   Approach :
*       The idea is to use Queue for traversing the tree and using the BFS approach.
*
*   Time complexity: O(N), Visiting all the nodes of the tree of size N.
*   Auxiliary Space: O(N), Using queue for storing nodes
*
*   Follow the steps below to solve the problem:
*
*       The left child of the left subtree = the right child of the right subtree. Both of them should be not null.
*       The right child of the left subtree = left child of the right subtree. Both of them should be null or not null.
*
*           Insert in the same order:
*              1. left of left subtree       q.add(p.left);
*              2. right of right subtree     q.add(r.right);
*              3.right of left subtree      q.add(p.right);
*              4.left of right subtree      q.add(r.left);
*
* */
public class FoldableBinaryTrees {
}
