package edu.gu.dict.io;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import edu.gu.dict.io.DictionaryReader;
import edu.gu.dict.util.LanguageTag;

/**
 * Test for the DictionaryReader
 * @author hajo
 *
 */
public class TestDictionaryReader {

	@Test
	public void testLoadFromFile() throws URISyntaxException,
			MalformedURLException, IOException {
		File f = new File("dict");
		URI uri = f.toURI();
		List<String> data = DictionaryReader.load(uri,
				LanguageTag.en_US, LanguageTag.sv_SV);

		Assert.assertTrue(data != null);
	}

	@Test
	public void testLoadViaHttp() throws URISyntaxException,
			MalformedURLException, IOException {
		URI uri = new URI("http://www.cse.chalmers.se/~hajo/");
		List<String> data = DictionaryReader.load(uri,
				LanguageTag.en_US, LanguageTag.sv_SV);

		Assert.assertTrue(data != null);
	}
	
	
	// TODO Add a simple test here (look in files in /dict-folder
	@Test
	public void simpleTest() throws IOException, URISyntaxException{
		File f = new File("dict");
		URI uri = f.toURI();
		List<String> data = DictionaryReader.load(uri,
				LanguageTag.en_US, LanguageTag.sv_SV);
		Assert.assertTrue(data.get(0).equals("as=eftersom, när, emedan, under tiden, som") );
	}
}
