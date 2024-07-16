package common.heap;

import java.util.Deque;
import java.util.LinkedList;

/*
* SLIDING WINDOW MAXIMUM Using Deque
*
* https://www.youtube.com/watch?v=MCvGwtkqJS0
*
* Time Complexity: O(N). It seems more than O(N) at first look. It can be observed that every element of the array is added and removed at most once. So there are a total of 2n operations.
* Auxiliary Space: O(K). Elements stored in the dequeue take O(K) space.
*
* Create a Deque, Qi of capacity K, that stores only useful elements of current window of K elements.
* An element is useful if it is in current window and is greater than all other elements on right side of it in current window.
* Process all array elements one by one and maintain Qi to contain useful elements of current window and
* these useful elements are maintained in sorted order. The element at front of the Qi is the largest
* and element at rear/back of Qi is the smallest of current window.
*
* Other options :
*
*
* */
public class MaxOfAllSubarrayOfSizeK {

    static void maxSubArrayElement(int[] arr, int N, int K){

        Deque<Integer> deq = new LinkedList<>();

        //process first k elements
        //maintaining elements such that it is in decreasing order. front with max and last with minimum.
        for(int i=0; i< K; i++){
            while(!deq.isEmpty() && arr[i] > arr[deq.peekLast()])
                deq.removeLast();

            deq.addLast(i);
        }

        //Processing other all elements after K elements
        for(int i = K; i< arr.length; i++){
            System.out.println(arr[deq.peek()] + " --> ");

            //remove all elements from first if it is not part of window (i to i-k) elements
            while(!deq.isEmpty() && deq.peek() <= (i-K))
                deq.removeFirst();

            while(!deq.isEmpty() && arr[i] > arr[deq.peekLast()])
                deq.removeLast();

            deq.addLast(i);
        }

        System.out.println(arr[deq.peek()]);
    }

    public static void main(String[] args) {
        int[] arr = {12,1,78,90,57,89,56};
        int K =3;
        maxSubArrayElement(arr, arr.length, K);
    }


}
