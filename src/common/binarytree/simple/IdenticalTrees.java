package common.binarytree.simple;

/*
*
*
*
*       If both trees are empty then return 1(Base case)
*       Else If both trees are non-empty
*           Check data of the root nodes (tree1->data ==  tree2->data)
*           Check left subtrees recursively
*           Check right subtrees recursively
*       If the above three statements are true then return 1
*       Else return 0 (one is empty and the other is not)
*
*
*         if (a == null && b == null)
*            return true;
*
*        // 2. both non-empty -> compare them
*        if (a != null && b != null)
*        return (a.data == b.data
*                    && identicalTrees(a.left, b.left)
*                    && identicalTrees(a.right, b.right));
*
*        // 3. one empty, one not -> false
*        return false;
*
*
* */
public class IdenticalTrees {
}
