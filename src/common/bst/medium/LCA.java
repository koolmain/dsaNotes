package common.bst.medium;

/*
*
*   Let T be a rooted tree. The lowest common ancestor between two nodes n1 and n2 is defined as the lowest node in T that has both n1 and n2 as descendants
*   (where we allow a node to be a descendant of itself). The LCA of n1 and n2 in T is the shared ancestor of n1 and n2 that is located farthest from the root
*   [i.e., closest to n1 and n2].
*
*   Time Complexity: O(H). where H is the height of the tree.
*   Auxiliary Space: O(H), If recursive stack space is ignored, the space complexity of the above solution is constant.
*
*   For Binary search tree, while traversing the tree from top to bottom the first node which lies in between the two numbers n1 and n2 is the LCA of the nodes,
*   i.e. the first node n with the lowest depth which lies in between n1 and n2 (n1<=n<=n2) n1 < n2.
*
*   So just recursively traverse the BST , if node’s value is greater than both n1 and n2 then our LCA lies in the left side of the node,
*   if it is smaller than both n1 and n2, then LCA lies on the right side. Otherwise, the root is LCA (assuming that both n1 and n2 are present in BST)
*
*   Follow the given steps to solve the problem:
*
*       Create a recursive function that takes a node and the two values n1 and n2.
*       If the value of the current node is less than both n1 and n2, then LCA lies in the right subtree. Call the recursive function for the right subtree.
*       If the value of the current node is greater than both n1 and n2, then LCA lies in the left subtree. Call the recursive function for the left subtree.
*       If both the above cases are false then return the current node as LCA.
*
*       Node lca(Node node, int n1, int n2)
*           {
*               if (node == null)
*                   return null;
*
*               // If both n1 and n2 are smaller than root, then LCA
*               // lies in left
*               if (node.data > n1 && node.data > n2)
*                   return lca(node.left, n1, n2);
*
*               // If both n1 and n2 are greater than root, then LCA
*               // lies in right
*               if (node.data < n1 && node.data < n2)
*                   return lca(node.right, n1, n2);
*
*               return node;
*           }
*
*
*   Lowest Common Ancestor in a Binary Search Tree using Morris traversal:
*
*   In the context of finding the lowest common ancestor of two nodes in a binary search tree,we can use the Morris Traversal approach to performan in−order traversal
*   of the tree while keeping track of the traversal path.During the traversal,we can check if either of the two nodes were interested in is found,and if so,
*   we return it as the lowest common ancestor.
*
*          Follow the steps to implement the above approach:
*
*          Initialize a pointer curr to the root of the tree.
*          While curr is not NULL, do the following:
*          If curr has no left child, check if curr is either of the two nodes we are interested in. If it is, return curr. Otherwise, move curr to its right child.
*          If curr has a left child, find the inorder predecessor pre of curr by moving to the rightmost node in the left subtree of curr.
*          If the right child of pre is NULL, set it to curr and move curr to its left child.
*          If the right child of pre is curr, set it to NULL and restore the original tree structure. Then check if curr is either of the two nodes we are interested in. If it is, return curr. Otherwise, move curr to its right child.
*          If the two nodes we are interested in are not found during the traversal, return NULL
*
**       public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
*              if (root == null || root == p || root == q) {
*                  return root;
*              }
*
*                      TreeNode leftLCA = lowestCommonAncestor(root.left, p, q);
*              TreeNode rightLCA = lowestCommonAncestor(root.right, p, q);
*
*                      if (leftLCA != null && rightLCA != null) {
*                  return root;
*              }
*
*                      return (leftLCA != null) ? leftLCA : rightLCA;
*    }
*
*
* */
public class LCA {
}
