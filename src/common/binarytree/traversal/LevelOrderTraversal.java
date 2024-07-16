package common.binarytree.traversal;


/*
*
*   Find height of tree. Then for each level, run a recursive function by maintaining current height. Whenever the level of a node matches, print that node.
*
*       int h = height(root);
*        int i;
*        for (i = 1; i <= h; i++)
*            printCurrentLevel(root, i);
*
*            // Print nodes at the current level
*    void printCurrentLevel(Node root, int level)
*    {
*        if (root == null)
*            return;
*        if (level == 1)
*            System.out.print(root.data + " ");
*        else if (level > 1) {
*            printCurrentLevel(root.left, level - 1);
*            printCurrentLevel(root.right, level - 1);
*        }
*    }
* */
public class LevelOrderTraversal {
}
