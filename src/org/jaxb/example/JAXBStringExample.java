package org.jaxb.example;

import java.io.InputStream;
import java.io.StringWriter;

import org.jaxb.core.JAXBUtil;
import org.jaxb.core.impl.JAXBUtilImpl;
import org.jaxb.model.BugCollection;
import org.jaxb.util.PrepareDataUtil;

public class JAXBStringExample {
	
	public static void main(String[] args) {
		
		
		JAXBUtil jaxbUtil = new JAXBUtilImpl();
		StringWriter issueRequest = marshalRequestObject(jaxbUtil);	
		System.out.println(" Request structure ready for passing to HTTP request -- "+issueRequest.toString());
		
		BugCollection result = unMarshalResponse(jaxbUtil);
        System.out.println(" Response structure ready for passing to UI -- " + result.toString());
	}

	private static BugCollection unMarshalResponse(JAXBUtil jaxbUtil) {
		
		try {
			InputStream response = PrepareDataUtil.getBugCollectionResponse();
        	return (BugCollection) jaxbUtil.unMarshalResponseObject(response, BugCollection.class);
        }  catch (Exception e) {
        	System.out.println("Some Exception Occour....");
			e.printStackTrace();
		}
        return null;
	}

	private static StringWriter marshalRequestObject(JAXBUtil jaxbUtil) {
		BugCollection collection = PrepareDataUtil.prepareBugSampleData();
		StringWriter issuRequest = null;
		try {
			issuRequest = jaxbUtil.marshalRequestObject(collection, BugCollection.class);
			System.out.println("XML request has been created successfully !! ");
		} catch (Exception e) {
			System.out.println("Some Exception Occour....");
			e.printStackTrace();
		}
		return issuRequest;
	}


}
