package common.bst.hard;
/*
*
*
*
*   Method 1: Using Inorder Traversal (O(n) time and O(h) auxiliary space)
*
*           Time complexity: O(n) where n is the number of nodes in a binary search tree.
*           Auxiliary Space: O(h) where h is the height of the binary search tree.
*
*           The Inorder Traversal of a BST traverses the nodes in increasing order. So the idea is to traverse the tree in Inorder. While traversing,
*           keep track of the count of the nodes visited. If the count becomes k, print the node.
*
*    Method 2: Using Any Tree Traversal (pre-in-post) than return kth smallest easily.
*
*           Time Complexity: O(nlogn) i.e O(n) time for preorder and nlogn time for sorting.
*           Auxiliary Space: O(n) i.e for vector/array storage.
*
*       Here we use pre order traversal than sort it and return the kth smallest element.
*
*      Algorithm:
*           Here we have tree we will take preorder of it as :
*           And store it in array/vector.
*           After taking preorder we will sort it and than return k-1 element from the array.
*
*
*   Method 3: Augmented Tree Data Structure (O(h) Time Complexity and O(h) auxiliary space)
*
*       Time complexity: O(h) where h is the height of the tree.
*       Auxiliary Space: O(h)
*
*           The idea is to maintain the rank of each node. We can keep track of elements in the left subtree of every node while building the tree. Since we need the K-th smallest element, we can maintain the number of elements of the left subtree in every node.
*           Assume that the root is having ‘lCount’ nodes in its left subtree. If K = lCount + 1, root is K-th node. If K < lCount + 1, we will continue our search (recursion) for the Kth smallest element in the left subtree of root. If K > lCount + 1, we continue our search in the right subtree for the (K – lCount – 1)-th smallest element. Note that we need the count of elements in the left subtree only.
*
*
*   Method 4: Iterative approach using Stack:
*
*       Time Complexity: O(h+ k), The time complexity of the Iterative Approach using Stack to find the kth smallest element in a BST is O(h + k), where h is the height of the BST and k is the value of k.
*       Auxiliary Space: O(h+k), The space complexity of the code is O(h + k), where h is the height of the BST and k is the maximum size of the stack.
*
*       The basic idea behind the Iterative Approach using Stack to find the kth smallest element in a Binary Search Tree (BST) is to traverse the tree in an inorder fashion using a stack until we find the kth smallest element. Follow the steps to implement the above idea:
*
*           Create an empty stack and set the current node to the root of the BST.
*           Push all the left subtree nodes of the current node onto the stack until the current node is NULL.
*           Pop the top node from the stack and check if it is the k-th element. If it is, return its value.
*           Decrement the value of k by 1.
*           Set the current node to the right child of the popped node.
*           Go to step 2 if the stack is not empty or k is not equal to 0.
*
*

*
*
*
* */
public class KthSmallestElementInBST {
    /*
    *
    *
    *   Method 1: For each node value a in BST 1, search the value (x – a) in BST 2. If value found then increment the count. For searching a value in BST.
    *
    *       Time complexity: O(n1 * h2), here n1 is number of nodes in first BST and h2 is height of second BST.
    *
    *    Method 2: Traverse BST 1 from smallest value to node to largest.
    *
    *       Time Complexity: O(n1 + n2)
    *       Auxiliary Space: O(h1 + h2), Where h1 is height of first tree and h2 is height of second tree
    *
    *
    *        This can be achieved with the help of iterative inorder traversal. Traverse BST 2 from largest value node to smallest. This can be achieved with the help of reverse inorder traversal. Perform these two traversals simultaneously. Sum up the corresponding node’s value from both the BSTs at a particular instance of traversals. If sum == x, then increment count. If x > sum, then move to the inorder successor of the current node of BST 1, else move to the inorder predecessor of the current node of BST 2. Perform these operations until either of the two traversals gets completed.
    *
    *
    *    Method 3 :
    *
    *       Time Complexity: O(n1 * n2), As for every node in the BST1 we need to traverse the BST2 and check if it is equal to diff or not.
    *       Auxiliary Space: O(h1 + h2), Here h1 is the height of BST1 and h2 is the height of the BST2.
    *
    *           Recursive approach to solving this question.
    *           Traverse the BST1 and for each node find the diff i.e. (x – root1.data) in BST2 and increment the count.
    *
    *   Method 4 : Using BinarySearch Tree Iterator ( A more general way of doing this )
    *
    *   Time Complexity: O(n1 + n2)
    *   Auxiliary Space: O(h1 + h2), Where h1 is height of first tree and h2 is height of second tree
    *
    *           Create two class one as BSTIterator1 and other as BSTIterator2. These two class corresponds to inOrder and reverse inOrder traversal respectively.
    *
    *           Each class will have three methods:
    *
    *               hasNext : will return true when traversal is not yet completed
    *               next : will move the pointer to the next node
    *               peek : will return current node in the traversal
    *               After creating two such classes, simple run the iterator while both have next node and find the sum. If sum == x, increment the next pointer of iterator1 and iterator2 and if sum > x ,increment the next pointer of iterator2 else increment the next pointer of iterator1 i.e when sum < x.

    *

    *
    *
    * */
    public static class CountPairsFromTwoBSTsumisGivenValue {
    }
}
