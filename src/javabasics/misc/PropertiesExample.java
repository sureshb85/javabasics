package javabasics.misc;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) {
		Properties props = new Properties();
		props.load(
				new FileInputStream(System.getProperty("user.dir") + "\\src\\javabasics\\misc\\credentails.properties"));

	}
}
