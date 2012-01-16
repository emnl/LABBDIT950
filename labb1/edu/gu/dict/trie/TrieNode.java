package edu.gu.dict.trie;

import java.util.*;


/**
 * @author Emanuel Andersson
 * @author Hugo Tunius
 */
public class TrieNode{
        private char value;//The value of a node
        private TrieNode parent;
        private List<TrieNode> children = new ArrayList<TrieNode>();
        private List<TrieNode> translations = new ArrayList<TrieNode>();
        
        public TrieNode(){
        }
        
        //End nodes don't have left and right nodes
        public TrieNode(TrieNode parent, char value ){
                this.parent = parent;                
                this.value  = value;        
        }
        
        //Create a new node with a parent and a first child node
        public TrieNode(TrieNode parent, TrieNode first, char value){
                children.add(first);
                this(parent,value);        
        }
        

        public List<TrieNode> getTranslations(){
                return translations;        
        }

        public List<TrieNode> setTranslations(List<TrieNode> t){
                this.translations = t;        
        }

        public void addChild(TrieNode t){
                children.add( t );        
        }

        public void addTranslation(TrieNode t){
                translations.add( t );
        }

        public void setValue(char value){
                this.value = value;        
        }

        public char getValue(){
                return value;        
        }

}
