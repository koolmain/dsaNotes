package common.binarytree;

/*
*
*
* Time complexity: O(N)
* Auxiliary Space: O(N)
*
* We can solve this problem by considering the fact that both node and its children can’t be in sum at the same time, so when we take a node into our sum, we will call recursively for its grandchildren or if we don’t take this node then we will call for all its children nodes and finally we will choose maximum from both of the results.
*
*   It can be seen easily that the above approach can lead to solving the same subproblem many times, for example in the above diagram node 1 calls node 4 and 5 when its value is chosen and node 3 also calls them when its value is not chosen so these nodes are processed more than once. We can stop solving these nodes more than once by memorizing the result at all nodes
*
*   Follow the below steps to solve the problem:
*
*   Create a map to memorize the results
*   Recur to solve the problem for the root node
*   If the root is NULL return 0 (Base Case)
*   If the answer to this subproblem is already stored in the map, then return it
*   Now either include the current node and recur for its grandchildren
*   or don’t take the current node and recur for its left and the right child
*   Save the answer to this problem equal to the maximum of the above two cases
*   Return the answer
*
*
*  USING PAIR
*
*   Time complexity: O(N)
*   Auxiliary Space: O(N)
*
*   Return a pair for each node in the binary tree such that the first of the pair indicates the
*   maximum sum when the data of a node is included and the second indicates the maximum sum
*   when the data of a particular node is not included
*
*  USING DP
*   https://www.youtube.com/watch?v=m9-H6AUBLgY
*
*   Store the maximum sum by including a node or excluding the node in a dp array or unordered map. Recursively call for grandchildren of nodes
*    if the node is included or calls for its neighbors if the node is excluded
* */
public class MaxSumNodesWithNoTwoAdjacent {
}
