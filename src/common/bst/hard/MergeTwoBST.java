package common.bst.hard;

/*
*
*Method 1 (Insert elements of the first tree to the second):
*
* Take all elements of the first BST one by one, and insert them into the second BST. Inserting an element to a self-balancing BST takes Logn time (See this)
* where n is the size of the BST. So time complexity of this method is Log(n) + Log(n+1) … Log(m+n-1). The value of this expression will be between mLogn and mLog(m+n-1).
* As an optimization, we can pick the smaller tree as the first tree
*
*
*Method 2 (Merge Inorder Traversals):
*
*  Time complexity: O(m+n), where m and n are the numbers of elements in the two binary search trees.
*  Space complexity: O(m+n). This is because we need to allocate space for the two arrays that store the elements from the two binary search trees,
*       as well as an array to store the merged elements.
*
*   Do inorder traversal of the first tree and store the traversal in one temp array arr1[]. This step takes O(m) time.
*   Do inorder traversal of the second tree and store the traversal in another temp array arr2[]. This step takes O(n) time.
*   The arrays created in steps 1 and 2 are sorted arrays. Merge the two sorted arrays into one array of size m + n. This step takes O(m+n) time.
*   Construct a balanced tree from the merged array using the technique discussed in this post. This step takes O(m+n) time.
*
*
* Method 3 (In-Place Merge using DLL):
*
*       Time Complexity: O(N + M). where N and M are the numbers of nodes in the given trees.
*       Auxiliary Space: O(1), as constant extra space is used.
*
*       We can use a Doubly Linked List to merge trees in place. Following are the steps.
*
*       Convert the given two Binary Search Trees into a doubly linked list in place (Refer to this post https://www.geeksforgeeks.org/the-great-tree-list-recursion-problem/).
*       Merge the two sorted Linked Lists (Refer to this post https://www.geeksforgeeks.org/merge-two-sorted-linked-lists/.
*       Build a Balanced Binary Search Tree from the merged list created in step 2. (Refer to this post https://www.geeksforgeeks.org/in-place-conversion-of-sorted-dll-to-balanced-bst/)

* */
public class MergeTwoBST {
}
