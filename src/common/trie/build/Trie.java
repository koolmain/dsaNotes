package common.trie.build;


/*
*  TRIE DATA Structure
*
* https://www.geeksforgeeks.org/introduction-to-trie-data-structure-and-algorithm-tutorials/
*
* Operation	Time Complexity	Auxiliary Space
* Insertion	O(n)	O(n*m)
* Searching	O(n)	O(1)
* Deletion	O(n)	O(1
*
* */
public class Trie {

    TrieNode root = new TrieNode();

    //Trie node repesents each node in a trie data structure.
    class TrieNode{
        public TrieNode[] children;
        public int workCount;

        public TrieNode(){
            children = new TrieNode[26];
            workCount =0;
        }
    }

    public void insert(String key){
        TrieNode currentNode = root;

        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';

            if(currentNode.children[index] == null ){
                currentNode.children[index] = new TrieNode();
            }

            currentNode = currentNode.children[index];
        }
        currentNode.workCount++;
    }

    /**
     * Types of searches
     * 1. Find whether the given word exists in Trie.
     * 2. Find whether any word that starts with the given prefix exists in Trie.
     * @param key
     * @return
     */
    public boolean search(String key){
        TrieNode currentNode = root;

        for (char c: key.toCharArray()){
            if(currentNode.children[c-'a'] == null)
                return false;

            currentNode = currentNode.children[c-'a'];
        }
        return  true;
    }

    /**
     *  There are three scenarios while deleting a key from Trie data structure
     *
     *  1. The deleted word is a prefix of other words in Trie.
     *          Sol: a delete operation for this case is to just decrement the wordCount by 1 at the ending node of the word.
     *
     *  2. The deleted word shares a common prefix with other words in Trie.
     *          Sol: to delete all the nodes starting from the end of the prefix to the last character of the given word.
     *
     *  3. The deleted word does not share any common prefix with other words in Trie.
     *          Sol: to delete all the nodes.
     * @param key
     * @return
     */
    public boolean deletion(String key){
        return false;
    }
}
