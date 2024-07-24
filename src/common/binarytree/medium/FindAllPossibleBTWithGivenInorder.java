package common.binarytree.medium;

/*
*
*   when we consider in[i] as root, all elements from in[0] to in[i-1] will be in left subtree and in[i+1] to n-1 will be in right subtree.
*   If in[0] to in[i-1] can form x different trees and in[i+1] to in[n-1] can from y different trees then we will have x*y total trees when in[i] as root.
*
* So we simply iterate from 0 to n-1 for root. For every node in[i], recursively find different left and right subtrees.
*    If we take a closer look, we can notice that the count is basically n’th Catalan number. We have discussed different approaches
*    to find n’th Catalan number here.
*
*   Time Complexity: O(n^3).
*        The time complexity of the above algorithm is O(n^3). The getTrees() function is called for every element of the array.
*           Inside the function, two for loops are used for constructing left and right subtrees for every element of the array.
*
*    Space Complexity: O(n^2).
*        The space complexity of the above algorithm is O(n^2). The getTrees() function is called for every element of the array.
*         Inside the function, two for loops are used for constructing left and right subtrees for every element of the array.
*          Vector of size n is used for storing the list of trees.
*
*
*       1) Initialize list of Binary Trees as empty.
*       2) For every element in[i] where i varies from 0 to n-1,
*           do following
*       ......a)  Create a new node with key as 'arr[i]',
*                 let this node be 'node'
*       ......b)  Recursively construct list of all left subtrees.
*       ......c)  Recursively construct list of all right subtrees.
*       3) Iterate for all left subtrees
*          a) For current leftsubtree, iterate for all right subtrees
*               Add current left and right subtrees to 'node' and add
*               'node' to list.
*
*
*
* */
public class FindAllPossibleBTWithGivenInorder {
}
