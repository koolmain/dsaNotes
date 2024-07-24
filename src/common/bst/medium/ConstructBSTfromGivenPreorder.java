package common.bst.medium;

/*
*
*
*   Naive Approach :
*
*   Time Complexity: O(N2)
*   Auxiliary Space: O(N)
*
*       The first element of preorder traversal is always the root. We first construct the root. Then we find the index of the first element
*       which is greater than the root. Let the index be ‘i’. The values between root and ‘i’ will be part of the left subtree,
*       and the values between ‘i'(inclusive) and ‘n-1’ will be part of the right subtree. Divide the given pre[] at index “i” and
*       recur for left and right sub-trees.
*
*        For example in {10, 5, 1, 7, 40, 50}, 10 is the first element, so we make it root. Now we look for the first element greater than 10,
*        we find 40. So we know the structure of BST is as follows.:
*
*                         10
*                       /    \
*                {5, 1, 7}     {40, 50}
*
*        We recursively follow the above steps for subarrays {5, 1, 7} and {40, 50}, and get the complete tree.
*
*   Another Approach :
*        Using the recursion concept and iterating through the array of the given elements we can generate the BST
*
*       Time Complexity: O(N2)
*        Auxiliary Space: O(N)
*
*       Follow the below steps to solve the problem:
*
*            Create a new Node for every value in the array
*            Create a BST using these new Nodes and insert them according to the rules of the BST
*            Print the inorder of the BST
*
*   Efficient Approach:
*        The trick is to set a range {min .. max} for every node.
*
*       Time Complexity: O(N)
*       Auxiliary Space: O(N)
*
*        Follow the below steps to solve the problem:
*
*            Initialize the range as {INT_MIN .. INT_MAX}
*            The first node will definitely be in range, so create a root node.
*            To construct the left subtree, set the range as {INT_MIN …root->data}.
*            If a value is in the range {INT_MIN .. root->data}, the values are part of the left subtree.
*            To construct the right subtree, set the range as {root->data..max .. INT_MAX}.
*
*
* */
public class ConstructBSTfromGivenPreorder {
}
