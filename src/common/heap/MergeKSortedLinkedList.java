package common.heap;


/*
*
* Merge K sorted linked lists using Min Heap:
*
* Time Complexity: O(N*K*LogK)
* Auxiliary Space: O(K)
*
*   This solution is based on the Min Heap approach. The process must start with creating a MinHeap and inserting the first element
*   of all the K Linked Lists. Remove the root element of Minheap and put it in the output Linked List and insert the next element
*   from the Linked List of the removed element. To get the result the step must continue until there is no element left in the MinHeap.
* */
public class MergeKSortedLinkedList {

    class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    class LL{
        Node head;

        public  boolean addNode(Node head, int val){

            Node next = head;
            while (next.next != null){
                next = next.next;
            }
            next.next = new Node(val);

            return true;
        }
    }




    public static void main(String[] args) {

    }
}
