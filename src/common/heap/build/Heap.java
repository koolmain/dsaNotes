package common.heap.build;

/*
* https://www.geeksforgeeks.org/building-heap-from-array/
*
* The above approach can be optimized by observing the fact that the leaf nodes need
* not to be heapified as they already follow the heap property. Also, the array representation
* of the complete binary tree contains the level order traversal of the tree. So the idea is
* to find the position of the last non-leaf node and perform the heapify operation of each non-leaf node
* in reverse level order.
*
* We will be following 0-based indexing.
*
* Last non-leaf node = parent of last-node.
* or, Last non-leaf node = parent of node at (n-1)th index.
* or, Last non-leaf node = Node at index ((n-1) – 1)/2 = (n/2) – 1.
*
* Time Complexity: O(N)
* Auxiliary Space: O(N) (Recursive Stack Space)
 *
* */
public class Heap {

    // N is the total length of an array (1 based numbering)
    public static void heapifyMin(int arr[], int N, int root) {

        int left = 2*root +1;
        int right = 2 * root + 2;
        int largest = root, temp=0;

        if(left < N && arr[left] < arr[largest])
            largest = left;
        if(right < N && arr[right] < arr[largest])
            largest = right;

        if(largest != root){
            temp = arr[largest];
            arr[largest] = arr[root];
            arr[root] = temp;


            heapifyMin(arr, N, largest);
        }
    }

    public static void heapify(int arr[], int N, int root) {

        int left = 2*root +1;
        int right = 2 * root + 2;
        int largest = root, temp=0;

        if(left < N && arr[left] > arr[largest])
            largest = left;
        if(right < N && arr[right] > arr[largest])
            largest = right;

        if(largest != root){
            temp = arr[largest];
            arr[largest] = arr[root];
            arr[root] = temp;


            heapify(arr, N, largest);
        }
    }

    static void buildheap(int arr[], int N){
        int lastNonLeaf = N/2 -1;
        for(int i= lastNonLeaf; i >= 0; i--){
            heapifyMin(arr,N,i);
        }
//        for(int i= lastNonLeaf; i >= 0; i--){
//            heapifyMax(arr,N,i);
//        }
    }

   public static void printHeap(int[] arr, int N){
        System.out.println(
                "Array representation of Heap is:");

        for (int i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,4,6,13,10,9,8,15,17};
        int N = arr.length;
        buildheap(arr,N);
        printHeap(arr,N);
    }
}
