package org.jaxb.core;

import java.io.File;
import java.io.InputStream;
import java.io.StringWriter;

public interface JAXBUtil {

	// Marshal/Convert Object into XML file
	public void jaxbObjectToXML(Object data, Class<?> mapClass, File outputFile) throws Exception;

	// UnMarshal/Convert XML file into Object
	public Object jaxbXMLToObject(File dataFile, Class<?> mapClass) throws Exception;

	public StringWriter marshalRequestObject(Object request, Class<?> mapClass) throws Exception;

	public Object unMarshalResponseObject(InputStream responseContent, Class<?> mapClass) throws Exception;
	
	public StringWriter jaxbMarshalObjectXSD(Object request, String generatedPakage) throws Exception;
	
	public Object jaxbUnMarshalObjectXSD() throws Exception;

}
