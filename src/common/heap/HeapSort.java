package common.heap;

import common.heap.build.Heap;

/*
*
* In-place
* Not Stable (Not same order as before due to swapping)
*
* 2-3 times slower than well implemented QuickSort.REASON:lack of locality reference
*
* https://www.geeksforgeeks.org/heap-sort/
*
* First convert the array into heap data structure using heapify, then one by one delete the root node of the Max-heap and replace it with the last node in the heap and then heapify the root of the heap. Repeat this process until size of heap is greater than 1.
* Build a heap from the given input array.
* Repeat the following steps until the heap contains only one element:
* Swap the root element of the heap (which is the largest element) with the last element of the heap.
* Remove the last element of the heap (which is now in the correct position).
*
* Heapify the remaining elements of the heap.
* The sorted array is obtained by reversing the order of the elements in the input array.
*
*
* Time Complexity: O(N log N)
* Auxiliary Space: O(log n), due to the recursive call stack. However, auxiliary space can be O(1) for iterative implementation.
*  */
public class HeapSort {


    static void heapify(int[] arr, int N, int root){
        Heap.heapify(arr,N,root);
    }

    static void sort(int[] arr, int N){
        int temp=0;
        for(int i= N/2 -1; i >=0; i--){
            heapify(arr,N,i);
        }

        //sorting
        for( int i = N-1; i > 0 ; i--){
            temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,11,13,5,6,7};
        sort(arr,arr.length);
        Heap.printHeap(arr,arr.length);
    }
}
