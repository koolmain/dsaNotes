package common.binarytree;


/*
*
* CHECK TWO BINARY TREE ISOMORPHISM
*
* Definition : Two trees are called isomorphic if one of them can be obtained from other by a series of flips,
*               i.e. by swapping left and right children of a number of nodes. Any number of nodes at any level can have their children swapped.
*               Two empty trees are isomorphic.
*
*
* Time Complexity: The above solution does a traversal of both trees. So time complexity is O(min(m,n)*2) or O(min(m,n)) where m and n are number of nodes in given trees.
* Auxiliary Space: O(log min(n, m)), due to auxiliary stack space used by recursion calls.
*
*
*       Data of n1 and n2 is same.
*          One of the following two is true for children of n1 and n2
*          ……a) Left child of n1 is isomorphic to left child of n2 and right child of n1 is isomorphic to right child of n2.
*          ……b) Left child of n1 is isomorphic to right child of n2 and right child of n1 is isomorphic to left child of n2.
*
*
*     // There are two possible cases for n1 and n2 to be isomorphic
*        // Case 1: The subtrees rooted at these nodes have NOT been
*        // "Flipped".
*        // Both of these subtrees have to be isomorphic.
*        // Case 2: The subtrees rooted at these nodes have been "Flipped"
*        return (isIsomorphic(n1.left, n2.left) &&
*                                         isIsomorphic(n1.right, n2.right))
*        || (isIsomorphic(n1.left, n2.right) &&
*                                         isIsomorphic(n1.right, n2.left));
* */
public class IsomorphismOfBinaryTree {
}
