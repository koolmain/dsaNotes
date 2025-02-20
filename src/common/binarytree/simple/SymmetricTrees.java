package common.binarytree.simple;

/*
*
*   Mirror of itself
*
*   The idea is to write a recursive function isMirror() that takes two trees as an argument and returns true
*   if trees are the mirror and false if trees are not mirrored. The isMirror() function recursively checks two roots and subtrees under the root.


 *
*    // if both trees are empty, then they are mirror image
*        if (node1 == null && node2 == null)
*            return true;
*
*        // For two trees to be mirror images, the following
*        // three conditions must be true
*        // 1.) Their root node's key must be same
*        // 2.) left subtree of left tree and right subtree
*        // of right tree have to be mirror images
*        // 3.) right subtree of left tree and left subtree
*        // of right tree have to be mirror images
*        if (node1 != null && node2 != null
*            && node1.key == node2.key)
*            return (isMirror(node1.left, node2.right)
*                    && isMirror(node1.right, node2.left));
*
*        // if none of the above conditions is true then
*        // root1 and root2 are not mirror images
*        return false;
*
* */
public class SymmetricTrees {
}
