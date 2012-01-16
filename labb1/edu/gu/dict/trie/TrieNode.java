package edu.gu.dict.trie;

/**
 * @author Emanuel Andersson
 * @author Hugo Tunius
 */
public class TrieNode{
        TrieNode left;
        TrieNode right;
        TrieNode parent;
        
        public TrieNode(){
        }

        public TrieNode(TrieNode parent){
                this.parent = parent;                
        }

        public TrieNode(TrieNode left, TrieNode right,TrieNode){
                this.left = left;
                this.right = right;
                this.parent = parent;        
        }




}
