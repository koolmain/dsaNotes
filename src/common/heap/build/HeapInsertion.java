package common.heap.build;

import java.util.Arrays;

/*
*  Hape insertion using botton up approach
*
* Time Complexity:  O(log(n)) (where n is no of elements in the heap)
* Auxiliary Space: O(n)
*
* The idea is to:
* First increase the heap size by 1, so that it can store the new element.
* Insert the new element at the end of the Heap.
* This newly inserted element may distort the properties of Heap for its parents. So,
* in order to keep the properties of Heap, heapify this newly inserted element following a bottom-up approach.
*
*
* Suppose the Heap is a Max-Heap as:
*      10
*    /    \
*   5      3
*  / \
* 2   4
*The new element to be inserted is 15.
*Process:
*Step 1: Insert the new element at the end.
*      10
*    /    \
*   5      3
*  / \    /
* 2   4  15

* Step 2: Heapify the new element following bottom-up
*        approach.
*-> 15 is more than its parent 3, swap them.
*       10
*    /    \
*   5      15
*  / \    /
* 2   4  3
*-> 15 is again more than its parent 10, swap them.
*       15
*    /    \
*  5      10
*  / \    /
* 2   4  3
*Therefore, the final heap after insertion is:
*       15
*    /    \
*   5      10
*  / \    /
* 2   4  3
*
*
* */
public class HeapInsertion {

    static int size=0;

    //heapify bottom up approach
    static void heapify(int[] arr, int N, int i){
        int temp=0;
        int parent = (i-1) /2;
        if(parent >= 0 ){
            if(arr[i] > arr[parent]){
                temp = arr[parent];
                arr[parent] = arr[i];
                arr[i] = temp;

                heapify(arr, N, parent);
            }
        }
    }

    static void insertNode(int[] arr, int N, int node){
        N+=1;
        arr[N-1] = node;
        heapify(arr, N, N-1);
    }

    public static void main(String[] args) {
        // Array representation of Max-Heap
        //     10
        //    /  \
        //   5    3
        //  / \
        // 2   4

        int MAX=100;
        int[] arr= new int[MAX];

        arr[0] = 10;
        arr[1] = 5 ;
        arr[2] = 3 ;
        arr[3] = 2;
        arr[4] = 4;

        int key = 15;

        insertNode(arr,5,key);

        System.out.println(Arrays.toString(arr));

    }
}
