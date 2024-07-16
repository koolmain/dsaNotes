package common.binarytree.view;


/*
*
* Keep track of the level of a node by passing the level as a parameter to all recursive calls and also keep track of the maximum level.
* Whenever, we see a node whose level is more than maximum level so far, we print the node because this is the first node in its level
* Note: We traverse the left subtree before right subtree.
*
* Recursion :
*
*   Time Complexity: O(N), The function does a simple traversal of the tree, so the complexity is O(n).
*   Auxiliary Space: O(h), due to the stack space during recursive call. ‘h’ here is the height of the binary tree.
*
* Using Level Order :
*   The left view contains all nodes that are the first nodes in their levels. A simple solution is to do level order traversal and print the first node in every level.
*
*   Time Complexity: O(N), where n is the number of nodes in the binary tree.
*   Auxiliary Space: O(N) since using space for auxiliary queue
*
*        while (!queue.isEmpty()) {
*            // number of nodes at current level
*            int n = queue.size();
*
*            // Traverse all nodes of current level
*            for (int i = 1; i <= n; i++) {
*                Node temp = queue.poll();
*                               // Print the left most element at
*                // the level
*                if (i == 1)
*                    System.out.print(temp.data + " ");
*
*                // Add left node to queue
*                if (temp.left != null)
*                    queue.add(temp.left);
*
*                // Add right node to queue
*                if (temp.right != null)
*                    queue.add(temp.right);
*            }
*        }
*
* Print Left View of a Binary Tree Using queue and a null pointer:
*       Use queue and a null pointer to mark the first element of each level. Insert a null pointer in the first and as
*       the null pointer is reached mark bool as true and take the next element as left view element.
*
*   Time Complexity: O(N) where N is the total number of nodes.
*   Auxiliary Space: O(N) due to the space occupied by queue.
*
*
* */
public class LeftView {
}
