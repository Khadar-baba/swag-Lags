package com.auto.learn.config.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesSwagLags {
	public static Properties readproProperties() throws IOException {
		Properties properties = new Properties();
		FileInputStream file = new FileInputStream(new String("src\\main\\resources\\config.properties"));
		properties.load(file);
		return properties;

	}

}

