package common.bst.hard;
/*
*
*
*
*  A tricky solution would be to use Binary Search Trees. We start scanning the array from right to left and insert each element into the BST.
*   For each inserted element, we replace it in the array by its inorder successor in BST. If the element inserted is the maximum so far
*   (i.e. its inorder successor doesn’t exist), we replace it by -1.
*
*   Time complexity: O(n2),  As it uses BST. The worst-case will happen when array is sorted in ascending or descending order. The complexity can easily be reduced to O(nlogn) by using balanced trees like red-black trees.
*   Auxiliary Space: O(h), Here h is the height of the BST and the extra space is used in recursion call stack.
*
*           static void replace(int arr[], int n)
*              {
*                  BinarySearchTree tree = new BinarySearchTree();
*
*                  // start from right to left
*                  for (int i = n - 1; i >= 0; i--) {
*                      succ = null;
*
*                      // Insert current element into BST and
*                      // find its inorder successor
*                      root = tree.insert(root, arr[i]);
*
*                      // Replace element by its inorder
*                      // successor in BST
*                      if (succ != null)
*                          arr[i] = succ.data;
*
*                      // No inorder successor
*                      else
*                          arr[i] = -1;
*                  }
*              }
*
*
*  Another Approach :  Next Greater element using stack (https://www.geeksforgeeks.org/next-greater-element/)
*
*   Time Complexity: O(N log N)
*   Space Complexity: O(N)
*
*       First, we take an array of pairs namely temp, and store each element and its index in this array,i.e. temp[i] will be storing {arr[i],i}.
*       Sort the array according to the array elements.
*       Now get the next greater index for each and every index of the temp array in an array namely index by using Next Greater Element using stack.
*       Now index[i] stores the index of the next least greater element of the element temp[i].first and if index[i] is -1, then it means that there is no least greater element of the element temp[i].second at its right side.
*       Now take a result array where result[i] will be equal to a[indexes[temp[i].second]] if index[i] is not -1 otherwise result[i] will be equal to -1.
*
*
*  Another approach with Sets
*
*   A different way to think about the problem is listing our requirements and then thinking over it to find a solution. If we traverse the array from backwards, we need  a data structure(ds) to support:
*
*       Insert an element into our ds in sorted order (so at any point of time the elements in our ds are sorted)
*       Finding the upper bound of the current element (upper bound will give just greater element from our ds if present)
*       Carefully observing at our requirements, a set is what comes in mind.
*
*       Why not multiset? Well we can use a multiset but there is no need to store an element more than once.
*
*       Let’s code our approach
*
*       Time and space complexity: We insert each element in our set and find upper bound for each element using a loop so its time complexity is O(n*log(n)). We are storing each element in our set so space complexity is O(n)
*
* */
public class ReplaceEveryElementWithLeastGreaterOnRight {
}
