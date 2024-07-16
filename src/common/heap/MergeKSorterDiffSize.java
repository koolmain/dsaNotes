package common.heap;

/*
* Merge K sorted different sizes
*
* Time Complexity: O(N*K*logK)
* Auxiliary Space: O(N)
*
* An efficient solution is to use a heap data structure. The time complexity of the heap-based solution is O(N Log k).
* 1. Create an output array.
* 2. Create a min-heap of size k and insert 1st element in all the arrays into the heap
* 3. Repeat the following steps while the priority queue is not empty.
* …..a) Remove the minimum element from the heap (minimum is always at the root) and store it in the output array.
* …..b) Insert the next element from the array from which the element is extracted. If the array doesn’t have any more elements, then do nothing.
*
* Heap using Priority Queue
* */
public class MergeKSorterDiffSize {
}
