package com.lew.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToObject {
	public static void main(String[] args) {
		try {

			File file = new File("employee.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Employee employee = (Employee) jaxbUnmarshaller.unmarshal(file);
			System.out.println(employee);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
