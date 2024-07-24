package common.binarytree;

/*
*
****** All path from Root with sum as K
* https://www.geeksforgeeks.org/print-paths-root-specified-sum-binary-tree/
*
* https://www.youtube.com/watch?v=EKcSdsPro0s
*
*
* Time Complexity: O(N^2), in the worst case, where N is the number of nodes in the tree. This is because we potentially traverse all nodes in the tree,
*                           and for each leaf node, we check the sum of the path, which takes O(N) time in the worst case.
*
* Auxiliary Space: O(h), where h is the height of the binary tree. This is because the maximum amount of space used by the algorithm
*                           at any given time is the size of the path vector, which is at most equal to the height of the binary tree. This is because the path vector is only added to when we are traversing down the tree,
*                           and its size is reduced back to 0 when we are traversing back up the tree. Therefore, the space used by the algorithm is proportional
*                           to the height of the tree.
*
* */
public class AllPathFromRootWithSumK {
}
