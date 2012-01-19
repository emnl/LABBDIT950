package edu.gu.dict.trie;

import static org.junit.Assert.assertTrue;
import junit.framework.Assert;

import org.junit.Test;

import edu.gu.dict.trie.Trie;
import edu.gu.dict.trie.TrieNode;

/**
 * Testing the Trie classes 
 * 
 * Right click > Run as > Junit Test
 * 
 * NOTE: It's possible to run this in debugger
 * 
 * @author hajo
 * 
 */
public class TestTrie { 

	// Possible create methods for the testing of RI's -------------------

	// Use methods in test-methods below to check RI's

	// End RI's-------------------------------

	
	@Test
	public void testAddAndGet() {
		// Using the factory method to get a Trie object
		Trie t = (Trie) Trie.newInstance();
		Assert.assertNotNull(t);  // Must be true else test will fail

		TrieNode n = t.add("aaa");

		assertTrue(n != null);// Must be true else test will fail
		
		String s = t.getWord(n);
		
		assertTrue(s.equals("aaa"));// Must be true else test will fail
		
	}

	
	// TODO  More test here
	 
}
