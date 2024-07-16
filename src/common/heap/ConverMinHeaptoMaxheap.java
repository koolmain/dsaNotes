package common.heap;


/*
* Convert Min heap to Max heap
*
* Time Complexity: O(N), for details, please refer: Time Complexity of building a heap (https://www.geeksforgeeks.org/time-complexity-of-building-a-heap/)
* Auxiliary Space: O(N)
*
* 1. Start at the last non-leaf node of the heap (i.e., the parent of the last leaf node). For a binary heap, this node is located
* at the index floor((n – 1)/2), where n is the number of nodes in the heap.
*
* 2. For each non-leaf node, perform a “heapify” operation
* to fix the heap property. In a min heap, this operation involves checking whether the value of the node is greater than
* that of its children, and if so, swapping the node with the smaller of its children. In a max heap, the operation involves
* checking whether the value of the node is less than that of its children, and if so, swapping the node with the larger of its children.
*
* 3. Repeat step 2 for each of the non-leaf nodes, working your way up the heap. When you reach the root of the heap,
* the entire heap should now be a max heap.
*
*
*
*
* */
public class ConverMinHeaptoMaxheap {
}
