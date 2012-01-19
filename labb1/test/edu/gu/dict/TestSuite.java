package edu.gu.dict;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import edu.gu.dict.core.TestDictionary;
import edu.gu.dict.core.TestDictionaryReader;
import edu.gu.dict.core.TestTrie;

/**
 * A test suite run all tests at once
 * 
 * @author hajo
 * 
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ TestTrie.class, TestDictionaryReader.class,
		TestDictionary.class, })
public class TestSuite {
	// Not much use
}
