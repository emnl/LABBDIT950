package edu.gu.dict.trie;

import java.util.*;

/**
 * @author Emanuel Andersson
 * @author Hugo Tunius
 */

public class TrieNode {
	private char value;// The value of a node
	private TrieNode parent;
	private List<TrieNode> children = new ArrayList<TrieNode>();
	private List<TrieNode> translations = new ArrayList<TrieNode>();

	public TrieNode() {
	}

	// End nodes don't have left and right nodes
	public TrieNode(TrieNode parent, char value) {
		this.parent = parent;
		this.value = value;
	}

	// Create a new node with a parent and a first child node
	public TrieNode(TrieNode parent, TrieNode first, char value) {
		this(parent, value);
		children.add(first);
	}

	public List<TrieNode> getTranslations() {
		return translations;
	}

	public void setTranslations(List<TrieNode> t) {
		this.translations = t;
	}

	public void addChild(TrieNode t) {
		children.add(t);
	}

	public void addTranslation(TrieNode t) {
		translations.add(t);
	}

	public void setValue(char value) {
		this.value = value;
	}

	public char getValue() {
		return value;
	}

	public TrieNode getParent() {
		return parent;
	}
	
	public TrieNode getChildByValue(char v){
		for ( TrieNode n : children ){
			if ( n.getValue() == v )
				return n;
		}
		return null;
	}

}
