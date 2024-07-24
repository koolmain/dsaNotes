package common.bst.medium;

/*
*
*
*   Solution (Use Reverse Inorder Traversal)
*       Traverse the given tree in reverse inorder traversal and keep track of previously visited node. When a node is being visited,
*       assign a previously visited node as next.
*
*       Reverse InOrder Traversal :
*              Right   Root   Left
*
*   Time Complexity: O(n)
*   Auxiliary Space : O(1)
*
*
* void populateNext(Node node)
*       {
*           // The first visited node will be the rightmost node
*           // next of the rightmost node will be NULL
*           if (node != null) {
*               // First set the next pointer in right subtree
*               populateNext(node.right);    //RIGHT
*
*               // Set the next as previously visited node in
*               // reverse Inorder
*               node.next = next;   //ROOT
*
*               // Change the prev for subsequent node
*               next = node;
*
*               // Finally, set the next pointer in left subtree
*               populateNext(node.left);    //LEFT
*           }
*       }
*
* */
public class InorderSuccessorForAllNodes {
}
