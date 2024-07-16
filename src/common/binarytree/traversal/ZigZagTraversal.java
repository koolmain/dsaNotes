package common.binarytree.traversal;

/*
*
* Two stack approach:
*
* Time Complexity: O(n)
* Space Complexity: O(n)+(n)=O(n)
*
* Assume the two stacks are current: currentlevel and nextlevel. We would also need a variable to keep track of
* the current level order(whether it is left to right or right to left). We pop from the currentlevel stack and print the nodes value.
* Whenever the current level order is from left to right, push the nodes left child, then its right child to the stack nextlevel.
* Since a stack is a LIFO(Last-In-First_out) structure, next time when nodes are popped off nextlevel, it will be in the reverse order.
*  On the other hand, when the current level order is from right to left, we would push the nodes right child first, then its left child.
* Finally, do-not forget to swap those two stacks at the end of each level(i.e., when current level is empty)
*
* Recursive Approach:
*        The approach used here is the observable similarity to the level order traversal. Here we need to include an extra parameter
*         to keep a track of printing each level in left-right or right-left way.
*
*  Using Deque :
*           use a deque to solve the problem. Push and pop in different ways depending on if the level is odd or level is even.
*
*     Time Complexity: O(N)
*     Auxiliary Space: O(N) for deque data structure
*
* Using DFS :
*
*   Create a function zigzagLevelOrder that takes a pointer to the root node of the binary tree as input and returns a vector of vectors of integers.
*   Inside the zigzagLevelOrder function, create an empty result vector to store the nodes at each level of the binary tree.
*   Perform a modified preorder traversal of the binary tree using DFS. To do this, create a recursive helper function traverse that takes the current node, its level, and the result vector as input. In the helper function, if the level is greater than or equal to the size of the result vector, create a new list for the current level in the result vector and add the current node to that list. Otherwise, simply add the current node to the list for the current level in the result vector. Then recursively call the traverse function on the left subtree and the right subtree of the current node, incrementing the level by 1 for each subtree.
*   Once the traversal is complete, reverse the order of the lists at odd levels in the result vector to get the zigzag order.
*
*       Time Complexity: (N) , where n is the number of nodes in the binary tree,
*       Auxiliary Space: O(H) , where h is the height of the tree. The space complexity is O(h) because we are storing the nodes at each level in a separate list,
 * * */
public class ZigZagTraversal {
}
