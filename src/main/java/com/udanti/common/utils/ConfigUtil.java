package com.udanti.common.utils;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ConfigUtil {

	final String[] configFiles = { "udnati_table_prop" };
	final static ConfigUtil configUtil = new ConfigUtil();

	private ConfigUtil() {

	}

	public String getPropertVal(final String property)
			throws ParserConfigurationException, SAXException, IOException {

		for (String fileToRead : configFiles) {
			final Document doc = getDocForConfigFile(fileToRead);

			NodeList propNode = doc.getElementsByTagName(property);

			if (null != propNode) {
				for (int itr = 0; itr < propNode.getLength(); itr++) {

					Node nNode = propNode.item(itr);
					System.out.println("\nCurrent Element :"
							+ nNode.getNodeName());

					if (nNode.getNodeType() == Node.ELEMENT_NODE) {

						Element eElement = (Element) nNode;

						return eElement.getAttribute("id");

					}
				}
			}

		}
		return StringUtils.EMPTY;
	}

	private Document getDocForConfigFile(final String fileToRead)
			throws ParserConfigurationException, SAXException, IOException {
		final ClassLoader classLoader = getClass().getClassLoader();
		final File configFile = new File(classLoader.getResource(fileToRead)
				.getFile());
		final DocumentBuilderFactory dbFactory = DocumentBuilderFactory
				.newInstance();
		final DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		final Document doc = dBuilder.parse(configFile);

		doc.getDocumentElement().normalize();

		System.out.println("Root element :"
				+ doc.getDocumentElement().getNodeName());
		return doc;
	}

	public static ConfigUtil getConfigUtil() {
		return configUtil;
	}
}
