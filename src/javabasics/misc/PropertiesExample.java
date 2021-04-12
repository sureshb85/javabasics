package javabasics.misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String projectDirectory = System.getProperty("user.dir");

		// File.pathSeparator
		String propFile = System.getProperty("user.dir") + "\\src\\javabasics\\misc\\credentials.properties";
		System.out.println(projectDirectory);

		createProperties();
		readPropertiesFromFile();
	}

	private static void readPropertiesFromFile() throws FileNotFoundException, IOException {
		String propFile = System.getProperty("user.dir") + "\\src\\javabasics\\misc\\credentials.properties";
		System.out.println(propFile);

		Properties prop = new Properties();
		prop.load(new FileReader(propFile));

		System.out.println("Key:username - " + prop.getProperty("username"));
		System.out.println("Key:password - " + prop.getProperty("password"));

	}

	private static void createProperties() {
		Properties prop = new Properties();
		prop.setProperty("browser", "chrome");
		prop.setProperty("url", "https://www.google.com");
		prop.setProperty("username", "user1");
		prop.setProperty("password", "pass1");

		System.out.println("Key:browser and value: " + prop.getProperty("browser"));
		System.out.println("Key:url and value: " + prop.getProperty("url"));
		System.out.println("Key:username and value: " + prop.getProperty("username"));
		System.out.println("Key:password and value: " + prop.getProperty("password"));
	}
}
