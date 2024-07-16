package common.binarytree;

import jdk.dynalink.NoSuchDynamicMethodException;

import java.util.HashSet;

/*
*
*  An Efficient solution based on tree serialization and hashing. The idea is to serialize subtrees as strings and store the strings in hash table.
*  Once we find a serialized tree (which is not a leaf) already existing in hash-table, we return true.
*
*  Time Complexity: O(n)
* Auxiliary Space: O(n)
*
*
* */
public class DuplicateBinaryTree {

    static char MARKER = '$';
    static  class Node{
        char data;
        Node left;
        Node right;

        Node(char data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            return data+" -> "+ left.data+" -> "+ right.data;
        }
    }
    static String duplicateUtil(Node root, HashSet<String> subtrees){
        String s ="";

        if(root == null)
            return s+MARKER;

        String lStr = duplicateUtil(root.left, subtrees);
        if(lStr.equals(s)) {
            System.out.println("Root Left"+root.data + " String "+s );
            return s;
        }

        String rStr = duplicateUtil(root.right, subtrees);
        if(rStr.equals(s)) {
            System.out.println("Root Right"+root.data + " String "+s );
            return s;
        }

        s = s+ root.data+ "%"+lStr + "%"+ rStr;

        if(s.length() > 7 && subtrees.contains(s))
            return "";

        subtrees.add(s);
        return s;
    }


    public static void main(String[] args) {
        Node root = new Node('A');
        root.left = new Node('B');
        root.right = new Node('C');
        root.left.left = new Node('D');
        root.left.right = new Node('E');
        root.right.right = new Node('B');
        root.right.right.right = new Node('E');
        root.right.right.left = new Node('D');

        String str = duplicateUtil(root, new HashSet<>());
        System.out.println(str);

    }
}
