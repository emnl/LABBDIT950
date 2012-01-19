package edu.gu.dict.io;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.gu.dict.util.LanguageTag;

/**
 * A URI based dictionary data loader. Low level.
 * 
 * To use with text files;
 * 
 * File f = new File("dict"); // Name of folder for lexicon files
 * 
 * URI uri = f.toURI(); DictionaryLoader.load(uri, ... , ...) {
 * 
 * File names must be: from2to.dict where from and to are country and region
 * codes for example sv_SV2en_US.dict
 * 
 * File format for data;
 * 
 * Row Row Row ...
 * 
 * Where Row is;
 * 
 * word=translation1, translation2,....translationN \n
 * 
 * Rows starting with # are comments
 * 
 * @author hajo
 * 
 */
public final class DictionaryReader {

    private static final String FILE_SUFFIX = ".dict";
    private static final String FILENAME_CONNECTOR = "2";
    private static final char COMMENT = '#';
    private static final int EMPTY_LINE = 0;

    /**
     * Load dictionary data as text lines from URI. Throws a lot of exceptions.
     * Just pass them along (throws).
     * 
     * @param uri
     *            , location of data
     * @param from
     *            , language name constant
     * @param to
     *            , language name constant
     * @return The rows of the dictionary (see fileformat)
     * @throws URISyntaxException
     * @throws IOException
     * @throws MalformedURLException
     */
    public static List<String> load(URI uri, LanguageTag from, LanguageTag to)
            throws IOException, URISyntaxException {
        String fileName = from.toString() + FILENAME_CONNECTOR + to.toString()
                + FILE_SUFFIX;
        URI u = new URI(uri.toString() + fileName);
        Scanner sc = null;
        List<String> entries = new ArrayList<String>();
        if ("file".equals(uri.getScheme())) {
            sc = new Scanner(new File(u));
        } else if ("http".equals(uri.getScheme())) {
            sc = new Scanner(u.toURL().openStream());
        } else {
            throw new IllegalArgumentException("Bad scheme");
        }
        try {
            String line = null;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                if (line.length() > EMPTY_LINE && line.charAt(0) != COMMENT) {
                    entries.add(line.trim());
                }
            }
        } finally {
            sc.close();
        }
        return entries;
    }
}
