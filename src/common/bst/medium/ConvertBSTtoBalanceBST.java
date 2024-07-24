package common.bst.medium;

/*
*
*   A Simple Solution:  is to traverse nodes in Inorder and one by one insert into a self-balancing BST like AVL tree.
*    Time complexity of this solution is O(n Log n) and this solution doesn’t guarantee the minimum possible height as in the worst case
*    the height of the AVL tree can be 1.44*log2n.
*
*
*   An Efficient Solution can be to construct a balanced BST in O(n) time with minimum possible height. Below are steps.
*
*    Time Complexity: O(n), As we are just traversing the tree twice. Once in inorder traversal and then in construction of the balanced tree.
*    Auxiliary space: O(n), The extra space is used to store the nodes of the inorder traversal in the vector. Also the extra space taken by recursion call stack is O(h) where h is the height of the tree.
*
*       1. Traverse given BST in inorder and store result in an array. This step takes O(n) time. Note that this array would be sorted as
*               inorder traversal of BST always produces sorted sequence.
*
*           /* This function traverse the skewed binary tree and stores its nodes pointers in vector nodes[]
*               void storeBSTNodes(Node root, Vector<Node> nodes)
*               {
*                   // Base case
*                   if (root == null)
*                       return;
*
*                   // Store nodes in Inorder (which is sorted
*                   // order for BST)
*                   storeBSTNodes(root.left, nodes);
*                   nodes.add(root);
*                   storeBSTNodes(root.right, nodes);
*               }
*       2. Build a balanced BST from the above created sorted array using the recursive approach discussed here. This step also takes O(n) time
*               as we traverse every element exactly once and processing an element takes O(1) time.
*
*        The idea is to find the middle element of the array and make it the root of the tree, then perform the same operation on the left subarray
*        for the root’s left child and the same operation on the right subarray for the root’s right child
*
*
*
*               // Recursive function to construct binary tree
*               Node buildTreeUtil(Vector<Node> nodes, int start,
*                                  int end)
*               {
*                   // base case
*                   if (start > end)
*                       return null;
*
*                   // Get the middle element and make it root
*                   int mid = (start + end) / 2;
*                   Node node = nodes.get(mid);
*
*                       // Using index in Inorder traversal, construct left and right subtress
 *
*                   node.left = buildTreeUtil(nodes, start, mid - 1);
*                   node.right = buildTreeUtil(nodes, mid + 1, end);
*
*                   return node;
*               }
*
*
*
* */
public class ConvertBSTtoBalanceBST {
}
