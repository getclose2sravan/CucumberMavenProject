package dataProvider;

import java.util.Properties;

import javax.management.RuntimeErrorException;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

import enums.DriverType;
import enums.EnvironmentType;

public class ConfigFileReader {
	
	private Properties properties;
	private final String propertyFilePath = "configs//Configuration.properties";
	
	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}
	
	public String getDriverPath() {
		String driverPath = properties.getProperty("driverPath");
		if(driverPath != null ) return driverPath;
		else throw new RuntimeException("Could not find the driverPath in config file"); 
	}
	
	public String getUrl() {
		String url = properties.getProperty("url");
		if (url != null) return url;
		else throw new RuntimeException("Could not find the url in config file");
	}
	
	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if (implicitlyWait != null) return Long.parseLong(implicitlyWait);
		else throw new RuntimeException("Could not find the implicit wait time in cofig file");
	}
	
	public DriverType getBrowser() {
		String browserName = properties.getProperty("browser");
		if (browserName == null || browserName.equals("chrome")) 
			return DriverType.CHROME;
		else if (browserName.equalsIgnoreCase("firefox"))
			return DriverType.FIREFOX;
		else if (browserName.equalsIgnoreCase("iexplorer"))
			return DriverType.INTERNETEXPLORER;
		else throw new RuntimeException("Browser Name Key value in configuration.properties is not matched: "+ browserName);
	}
	
	public EnvironmentType getEnvironment() {
		String environmentName = properties.getProperty("environment");
		if (environmentName == null || environmentName.equalsIgnoreCase("local"))
			return EnvironmentType.LOCAL;
		else if (environmentName.equalsIgnoreCase("remote"))
			return EnvironmentType.REMOTE;
		else throw new RuntimeException("Environment Name Key value in configurtaion.properties is not matched: "+ environmentName);
	}
	
	public Boolean getBrowserWindowSize() {
		String windowSize = properties.getProperty("windowMaximize");
		if (windowSize != null) return Boolean.valueOf(windowSize);
		return true;
	}
}
