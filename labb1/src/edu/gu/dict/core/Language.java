package edu.gu.dict.core;

import edu.gu.dict.util.LanguageTag;

/**
 * A language. Only relevant part for now is the tag.
 * (used internally in application).
 * 
 * @author hajo
 *
 */
public class Language {
	private final LanguageTag tag;
	public Language(LanguageTag tag){
		this.tag = tag;
	}
	// private setter??
	
	public LanguageTag getTag() {
		return tag;
	}
	
	@Override
	public String toString(){
		return tag.toString();
	}
	
}
