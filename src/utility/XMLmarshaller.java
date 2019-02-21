package utility;


import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XMLmarshaller 
{

	public static void marshal(String packageName, Object object, String fileName) throws JAXBException, IOException
	{
		JAXBContext context=JAXBContext.newInstance(packageName);
		Marshaller marshaller=context.createMarshaller();
		marshaller.marshal(object, new FileWriter(fileName));
	}
	
}
