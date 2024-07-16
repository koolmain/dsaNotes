package common.heap;


/*
*
* Merge K Sorted Array (https://www.geeksforgeeks.org/merge-k-sorted-arrays/)
*
* https://medium.com/outco/how-to-merge-k-sorted-arrays-c35d87aa298e
*
* MIN heap
*
* Time Complexity: O(N*K*logK)
* Auxiliary Space: O(N)
*
* Time Complexity: O(N * K * log K), Insertion and deletion in a Min Heap requires log K time.
* Auxiliary Space: O(K), If Output is not stored then the only space required is the Min-Heap of K elements.
*
* The idea is to use Min Heap. This MinHeap based solution has the same time complexity which is O(NK log K).
* But for a different and particular sized array, this solution works much better. The process must start with creating a MinHeap
* and inserting the first element of all the k arrays. Remove the root element of Minheap and
* put it in the output array and insert the next element from the array of removed element.
* To get the result the step must continue until there is no element left in the MinHeap.
 *
* Tricks :
*  Merge K sorted arrays using merging:
*  Merge K sorted arrays using Min-Heap:
*
 * */
public class MergeKSortedArray {

    static Node[] heap = new Node[3];
    static class Node {
        int index;
        int arraySource;
        int val;

        public Node(int index, int arraySource, int val){
            this.index = index;
            this.arraySource = arraySource;
            this.val = val;
        }
    }

    static void heapifyNode(Node[] arr, int N, int i ){

        int l = 2*i +1;
        int r = 2*i+2;
        int largest = i;
        Node temp;

        if( l < N && arr[l].val < arr[i].val)
            largest = l;
        if(r < N && arr[r].val < arr[largest].val)
            largest = r;

        if(largest != i ){
            temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapifyNode(arr, N, largest);
        }
    }

    static void mergeKsorted(int[][] arr){
        int resultsize = arr.length * arr[0].length; 
        for (int i = 0; i < 3; i++) {
            heap[i] = new Node(0,i,arr[i][0]);
        }
        int N=3;
        for(int i= N/2 -1; i >=0; i--){
            heapifyNode(heap,N,i);
        }

        for (int i = 0; i < resultsize; i++) {

            Node min = heap[0];
            System.out.println(min.val + " arr["+min.arraySource+"] -->");

            if(++min.index < arr[min.arraySource].length)
                min.val = arr[min.arraySource][min.index];
            else
                min.val = Integer.MAX_VALUE;

            heap[0] = min;
            heapifyNode(heap,N,0);
        }
    }

    public static void main(String[] args) {

        int[][] arr = { { 2, 6, 12, 34 },
                { 1, 9, 20, 1000 },
                { 23, 34, 90, 2000 } };

        mergeKsorted(arr);

    }


}
