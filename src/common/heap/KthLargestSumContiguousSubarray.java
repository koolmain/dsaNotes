package common.heap;

/*
*
*   1. Kth largest sum contiguous subarray using Min-Heap:
*
*   Time Complexity: O(N2 log K)
*    Auxiliary Space: O(N), but this can be reduced to O(K) for min-heap and we can store the prefix sum array in the input array itself as it is of no use.
*
*   The key idea is to store the pre-sum of the array in a sum[] array. One can find the sum of contiguous subarray
*   from index i to j as sum[j] – sum[i-1]. Now generate all possible contiguous subarray sums and push them into the Min-Heap
*   only if the size of Min-Heap is less than K or the current sum is greater than the root of the Min-Heap.
*   In the end, the root of the Min-Heap is the required answer
*
*   2. Kth largest sum contiguous subarray using  Prefix Sum and Sorting approach:
*
*  The basic idea behind the Prefix Sum and Sorting approach is to create a prefix sum array and use it to calculate all possible subarray sums. The subarray sums are then sorted in decreasing order using the sort() function. Finally, the K-th largest sum of contiguous subarray is returned from the sorted vector of subarray sums.

*  Follow the Steps to implement the approach:
*
*  Create a prefix sum array of the given array.
*  Create a vector to store all possible subarray sums by subtracting prefix sums.
*  Sort the vector of subarray sums in decreasing order using the sort() function.
*  Return the K-th largest sum of contiguous subarray from the sorted vector of subarray sums.
*
* Time Complexity: O(n^2 log n) ,The time complexity of the above code for the Prefix Sum and Sorting approach is O(n^2logn), where n is the size of the input array. This is due to the nested loop used to calculate all possible subarray sums and the sort() function used to sort the vector of subarray sums.
* Auxiliary Space: O(n^2), The auxiliary space complexity of the above code is O(n). This is due to the creation of the prefix sum array(O(n)) and the vector to store all possible subarray sums(O(n^2))
*
*
*
 *
* */
public class KthLargestSumContiguousSubarray {
}
