package edu.gu.dict.core;

import java.util.List;

/**
 * A helper class holding one word in the source language
 * and a list of translations to the target language
 * @author hajo
 *
 */
public final class DictionaryEntry {
	private final String entry;
	private final List<String> translations;

	public DictionaryEntry(String entry, List<String> translations) {
		this.entry = entry;
		this.translations = translations;
	}
	
	public String getEntry() {
		return entry;
	}

	public List<String> getTranslations() {
		return translations;
	}

	// This is good for debug
	@Override
	public String toString() {
		return "[entry=" + entry + ", translations="
				+ translations + "]";
	}
}
