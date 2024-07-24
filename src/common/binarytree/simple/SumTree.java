package common.binarytree.simple;

/*
*   The idea is to traverse the tree in a Postorder fashion because here we have to think bottom-up. First, calculate the sum of the left subtree
*   then the right subtree, and check if
*       sum_left + sum_right + cur_node = sum
*   is satisfying the condition that means any subtree with a given sum exists. Below is the recursive implementation of the algorithm.
 *
*
*   // base condition
*    if (ptr == null)
*    {
*        cur_sum = new INT(0);
*        return false;
*    }
*
*    // Here first we go to left
*    // sub-tree, then right subtree
*    // then first we calculate sum
*    // of all nodes of subtree having
*    // ptr as root and assign it as
*    // cur_sum. (cur_sum = sum_left +
*    // sum_right + ptr.data) after that
*    // we check if cur_sum == sum
*    INT sum_left = new INT(0),
*        sum_right = new INT(0);
*    return (sumSubtreeUtil(ptr.left, sum_left, sum) ||
*            sumSubtreeUtil(ptr.right, sum_right, sum) ||
*        ((cur_sum.v = sum_left.v +
*                      sum_right.v + ptr.data) == sum));
*
* */
public class SumTree {
}
