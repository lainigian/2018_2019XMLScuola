package utility;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLunmarshaller 
{

	/*private String xmlFileName;
	private String bindPackageName;
	
	public XMLunmarshaller(String fileName, String packageName)
	{
		xmlFileName=fileName;
		packageName=bindPackageName;
	}
	*/
	
	public static Object unmarshal(String fileName, String packageName) throws JAXBException, FileNotFoundException
	{
		Object result;
		JAXBContext context= JAXBContext.newInstance(packageName);
		Unmarshaller unmarshaller=context.createUnmarshaller();
		result=unmarshaller.unmarshal(new FileReader(fileName));
		return result;
	}
	

	
}
