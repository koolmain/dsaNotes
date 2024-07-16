package common.heap;

import common.heap.build.Heap;

import java.util.Arrays;

/*
*
*  K largest elements in an array using Priority Queue(Min-Heap): https://www.geeksforgeeks.org/k-largestor-smallest-elements-in-an-array/
* https://www.youtube.com/watch?v=yAs3tONaf3s
*
* Other Tricks
* K largest elements in an array using Quick Sort partitioning algorithm:
K largest elements in an array using Binary Search:

 *
* The intuition behind this approach is to maintain a minheap (priority queue) of size K
* while iterating through the array. Doing this ensures that the min heap always contains the K largest elements encountered so far.
* If the size of the min heap exceeds K, remove the smallest element this step ensures that
* the heap maintains the K largest elements encountered so far. In the end, the min heap contains the K largest elements of the array.
*
*
* Time Complexity: O(N * log(K))
* Auxiliary Space: O(K)
*
**/
public class KLargest {


    static void kLargest(int[] arr, int N, int K){

        int temp=0;

        //Min heapify for first K elements. Can use a priority queue to store the heap with k element
        for(int i=0; i < K; i++){
            Heap.heapifyMin(arr, K, i);
        }

        System.out.println(Arrays.toString(arr));

        for(int i=N-1; i >= K; i--){
            //if current element is greater than top in min heap
            if(arr[i] > arr[0]) {
                temp = arr[i];
                arr[i] = arr[0];
                arr[0] = temp;

                Heap.heapifyMin(arr, K, 0);
            }
            System.out.println(temp +" --> " + Arrays.toString(arr));
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int N = arr.length;
        int K=3;
        kLargest(arr,N,K);

        Arrays.stream(arr).forEachOrdered(System.out::println);
    }
}
