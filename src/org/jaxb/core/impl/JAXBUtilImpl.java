package org.jaxb.core.impl;

import java.io.File;
import java.io.InputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.jaxb.core.JAXBUtil;

public class JAXBUtilImpl implements JAXBUtil {

	@Override
	public void jaxbObjectToXML(Object data, Class<?> mapClass, File outputFile) throws JAXBException {

		JAXBContext jaxbContext = JAXBContext.newInstance(new Class[] { mapClass });
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty("jaxb.formatted.output", Boolean.valueOf(true));
		jaxbMarshaller.marshal(data, outputFile);
	}

	@Override
	public Object jaxbXMLToObject(File dataFile, Class<?> mapClass) throws Exception {
		JAXBContext jc = JAXBContext.newInstance(new Class[] { mapClass });
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		return unmarshaller.unmarshal(dataFile);
	}

	@Override
	public StringWriter marshalRequestObject(Object request, Class<?> mapClass) throws JAXBException {
		StringWriter writer = new StringWriter();

		JAXBContext jaxbContext = JAXBContext.newInstance(new Class[] { mapClass });
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty("jaxb.formatted.output", Boolean.valueOf(true));
		jaxbMarshaller.marshal(request, writer);

		return writer;
	}

	@Override
	public Object unMarshalResponseObject(InputStream responseContent, Class<?> mapClass) throws Exception {
		JAXBContext jc = JAXBContext.newInstance(new Class[] { mapClass });
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		return unmarshaller.unmarshal(responseContent);
	}

	@Override
	public StringWriter jaxbMarshalObjectXSD(Object request, String generatedPakage) throws JAXBException {
		StringWriter writer = new StringWriter();
		JAXBContext jaxbContext = JAXBContext.newInstance(generatedPakage);
		Marshaller jaxbMarshaller=jaxbContext.createMarshaller();
		jaxbMarshaller.marshal(request, writer);
		return writer;
		
	}

	@Override
	public Object jaxbUnMarshalObjectXSD() {
		// TODO Auto-generated method stub
		return null;
	}

}
