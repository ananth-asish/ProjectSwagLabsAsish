package genericlibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLibrary implements FrameworkConstant {

	static FileInputStream fis;
	static FileOutputStream fos;
	static Properties property;

	public static String readData(String key) {
		// 1. convert the external file into java readable file
		try {
			fis = new FileInputStream(propertyPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// 2. create an object for properties class
		Properties property = new Properties();

		// 3. load the properties
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// read the data
		return property.getProperty(key);

	}

	public static void writeData(String newkey, String newvalue, String message) {
		// 1. convert the external file into java readable file

		try {
			fis = new FileInputStream(propertyPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// 2. create an object for properties class
		Properties property = new Properties();

		// 3. load the properties
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 4. Put the new data inside properties file
		property.put(newkey, newvalue);

		// 5. Convert java readable into external file

		try {
			fos = new FileOutputStream(propertyPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// 6. Store the new data
		try {
			property.store(fos, message);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("writeData success");

	}

}
