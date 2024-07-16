package common.trie.build;

/*
*   Print unique rows
*   https://www.geeksforgeeks.org/print-unique-rows/
*
*
*   Approach :
*
*   Approach:  BINARY SEARCH TREE :  The process must begin from finding the decimal equivalent of each row and inserting them into a BST. As we know, each node of the BST will contain two fields, one field for the decimal value, other for row number. One must not insert a node if it is duplicated. Finally, traverse the BST and print the corresponding rows.

*     Algorithm:

*           Create a BST in which no duplicate elements can be stored. Create a function to convert a row into decimal and to convert the decimal value into binary array.
*           Traverse through the matrix and insert the row into the BST.
*           Traverse the BST (inorder traversal) and convert the decimal into binary array and print it.
*
*     Complexity Analysis:
*        Time complexity: O( ROW x COL + ROW x log( ROW ) ).
*        To traverse the matrix time complexity is O( ROW x COL) and to insert them into BST time complexity is O(log ROW) for each row. So overall time complexity is O( ROW x COL + ROW x log( ROW ) )
*        Auxiliary Space: O( ROW ).
*        To store the BST O(ROW) space is needed.
*
*
*   Approach : TRIE :  Since the matrix is boolean, a variant of Trie data structure can be used where each node will be having two children one for 0 and other for 1. Insert each row in the Trie. If the row is already there, don’t print the row. If the row is not there in Trie, insert it in Trie and print it.
*
*            Algorithm:
*                 Create a Trie where rows can be stored.
*                 Traverse through the matrix and insert the row into the Trie.
*                 Trie cannot store duplicate entries so the duplicates will be removed
*                 Traverse the Trie and print the rows.
*
*       Complexity Analysis:
*                Time complexity: O( ROW x COL ).
*                To traverse the matrix and insert in the HashSet the time complexity is O( ROW x COL)
*                Auxiliary Space: O( ROW ).
*                To store the HashSet O(ROW x COL) space complexity is needed.
*
* */
public class PrintUniqueRows {
}
