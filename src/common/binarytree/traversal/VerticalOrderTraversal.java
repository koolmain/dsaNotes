package common.binarytree.traversal;


/*
*
*
*   We need to check the Horizontal Distances from the root for all nodes. If two nodes have the same Horizontal Distance (HD),
*   then they are on the same vertical line. The idea of HD is simple. HD for root is 0, a right edge (edge connecting to right subtree)
*   is considered as +1 horizontal distance and a left edge is considered as -1 horizontal distance.
*
*   Follow the below steps to solve the problem:
*
*    Do a preorder traversal of the given Binary Tree.
*    While traversing the tree, we can recursively calculate HDs. We initially pass the horizontal distance as 0 for the root.
*    For the left subtree, we pass the Horizontal Distance as the Horizontal distance of the root minus 1.
*    For the right subtree, we pass the Horizontal Distance as the Horizontal Distance of the root plus 1.
*    For every HD value, we maintain a list of nodes in a hash map. Whenever we see a node in traversal, we go to the hash map entry and add the node to the hash map using HD as a key in a map.
*
*
 * */
public class VerticalOrderTraversal {
}
