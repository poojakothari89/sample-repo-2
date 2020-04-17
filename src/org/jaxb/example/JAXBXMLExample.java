package org.jaxb.example;

import java.io.File;

import org.jaxb.core.JAXBUtil;
import org.jaxb.core.impl.JAXBUtilImpl;
import org.jaxb.model.BugCollection;
import org.jaxb.util.PrepareDataUtil;

public class JAXBXMLExample {
	
	

	private static final String BUG_COLLECTION_XML = "./XML/Bug-Collection.xml";


	public static void main(String[] args) {
		
		JAXBUtil jaxbUtil = new JAXBUtilImpl();
		// Marshalling...
		objectToXmlTest(jaxbUtil);
		// UnMarshalling .. 
		BugCollection collection = xmlToObjectTest(jaxbUtil);
        System.out.println(collection.toString());

	}

	private static void objectToXmlTest(JAXBUtil jaxbUtil) {
		BugCollection collection = PrepareDataUtil.prepareBugSampleData();
		try {
			jaxbUtil.jaxbObjectToXML(collection, BugCollection.class, new File(BUG_COLLECTION_XML));
			System.out.println("XML file has been created successfully !! ");
		} catch (Exception e) {
			System.out.println("Some Exception Occour....");
			e.printStackTrace();
		}
	}
	
	private static BugCollection xmlToObjectTest(JAXBUtil jaxbUtil) {
        try {
        	return (BugCollection) jaxbUtil.jaxbXMLToObject(new File(BUG_COLLECTION_XML), BugCollection.class);
        }  catch (Exception e) {
        	System.out.println("Some Exception Occour....");
			e.printStackTrace();
		}
        return null;
    }

	

	
	
	
	
}
