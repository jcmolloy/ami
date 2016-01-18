package org.xmlcml.ami2.dictionary.species;

import java.io.File;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.xmlcml.ami2.dictionary.DefaultAMIDictionary;


/** from taxdump
 * 
 * @author pm286
 *
 */
public class TaxDumpGenusDictionary extends DefaultAMIDictionary {

	private static final String TAXDUMP = "taxdump";
	private static final Logger LOG = Logger.getLogger(TaxDumpGenusDictionary.class);
	static {
		LOG.setLevel(Level.DEBUG);
	}
	
	private final static File TAXDUMP_DIR = new File(SPECIES_DIR, TAXDUMP);
	private final static File TAXDUMP_XML_FILE = new File(TAXDUMP_DIR, "taxdumpGenus.xml");
	
	
	public TaxDumpGenusDictionary() {
		init();
	}
	
	private void init() {
		readTAXDUMPXML();
	}

	private void readTAXDUMPXML() {
		if (!TAXDUMP_XML_FILE.exists()) {
			// read text file
//			readTAXDUMPJson();
//			createDictionaryElementFromHashMap(TAXDUMP);
//			writeXMLFile(TAXDUMP_XML_FILE);
		} else {
			readDictionary(TAXDUMP_XML_FILE);
		}
	}


}