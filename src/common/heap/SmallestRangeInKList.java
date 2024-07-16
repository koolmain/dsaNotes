package common.heap;

/*
*
* Smallest Range in K list
*
* Time complexity: O(N * K * log K)
* Auxiliary Space: O(K)
* https://www.youtube.com/watch?v=Fqal25ZgEDo
*
* Min-Heap can be used to find the maximum and minimum value in logarithmic time or log k time instead of linear time. Rest of the approach remains the same.
*
*
* create a Min-Heap to store K elements, one from each array, and a variable minrange initialized to a maximum value and also keep a variable max to store the maximum integer.
* Initially put the first element from each list and store the maximum value in max.
* Repeat the following steps until at least one list exhausts :
*       To find the minimum value or min, use the top or root of the Min heap which is the minimum element.
*       Now update the minrange if the current (max-min) is less than minrange.
*       remove the top or root element from the priority queue, insert the next element from the list containing the min element, and update the max with the new element inserted.
 * */
public class SmallestRangeInKList {
}
