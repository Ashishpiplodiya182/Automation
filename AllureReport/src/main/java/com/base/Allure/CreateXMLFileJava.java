package com.base.Allure;


	 
	import java.io.File;
	import javax.xml.parsers.DocumentBuilder;
	import javax.xml.parsers.DocumentBuilderFactory;
	import javax.xml.parsers.ParserConfigurationException;
	import javax.xml.transform.Transformer;
	import javax.xml.transform.TransformerException;
	import javax.xml.transform.TransformerFactory;
	import javax.xml.transform.dom.DOMSource;
	import javax.xml.transform.stream.StreamResult;
	import org.w3c.dom.Attr;
	import org.w3c.dom.Document;
	import org.w3c.dom.Element;
	 
	public class CreateXMLFileJava {
	 
	    public static final String xmlFilePath = "C:\\Users\\Dell\\Desktop\\Ashish_Appium\\AllureReport\\allure-results\\environment.xml";
	 
	    public static void main(String argv[]) {
	 
	        try {
	 
	            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
	 
	            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
	 
	            Document document = documentBuilder.newDocument();
	 
	            // root element
	            Element root = document.createElement("environment");
	            document.appendChild(root);
	 
	            // employee element
	            Element employee = document.createElement("parameter");
	 
	            root.appendChild(employee);
	 
	            // set an attribute to staff element
//	            Attr attr = document.createAttribute("id");
//	            attr.setValue("10");
//	            employee.setAttributeNode(attr);
	 
	            //you can also use staff.setAttribute("id", "1") for this
	 
	            // firstname element
	            Element firstName = document.createElement("Key");
	            firstName.appendChild(document.createTextNode("Environment"));
	            employee.appendChild(firstName);
	 
	            // lastname element
	            Element lastname = document.createElement("value");
	            lastname.appendChild(document.createTextNode("QA"));
	            employee.appendChild(lastname);
//	 
//	            // email element
//	            Element email = document.createElement("email");
//	            email.appendChild(document.createTextNode("james@example.org"));
//	            employee.appendChild(email);
//	 
//	            // department elements
//	            Element department = document.createElement("department");
//	            department.appendChild(document.createTextNode("Human Resources"));
//	            employee.appendChild(department);
//	 
	            // create the xml file
	            //transform the DOM Object to an XML File
	            TransformerFactory transformerFactory = TransformerFactory.newInstance();
	            Transformer transformer = transformerFactory.newTransformer();
	            DOMSource domSource = new DOMSource(document);
	            StreamResult streamResult = new StreamResult(new File(xmlFilePath));
	 
	            // If you use
	             StreamResult result = new StreamResult(xmlFilePath);
	            // the output will be pushed to the standard output ...
	            // You can use that for debugging 
	 
	            transformer.transform(domSource, result);
	 
	            System.out.println("Done creating XML File");
	 
	        } catch (ParserConfigurationException pce) {
	            pce.printStackTrace();
	        } catch (TransformerException tfe) {
	            tfe.printStackTrace();
	        }
	    }
	}


