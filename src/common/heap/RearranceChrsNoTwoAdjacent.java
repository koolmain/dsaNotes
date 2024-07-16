package common.heap;

/*
*
*Time complexity : O(N log(N))
* Auxiliary Space: O(N), Extra space is used to store the resultant string
*
*The idea is to put the highest frequency character first (a greedy approach). Use a priority queue (Or Binary Max Heap)
* and put all characters and ordered by their frequencies (highest frequency character at root). One by one take the
* highest frequency character from the heap and add it to result. After adding it, just decrease the frequency of the character and
* then temporarily move this character out of priority queue so that it is not picked again next time.
*
*
*
* 2nd Idea
*
*
* Time complexity: O(N)
* Auxiliary Space: O(N+26), as there are 26 lowercase english characters
*
* Fill all the even positions of the result string first, with the highest frequency character. If there are still some even positions remaining,
* fill them first. Once even positions are done, then fill the odd positions. This way, it can be ensured that
* no two adjacent characters are the same.
 * */
public class RearranceChrsNoTwoAdjacent {
}
