package config;

import com.janas.test.MainTest;

import java.io.*;
import java.util.Properties;

public class PropertiesFile {

    static Properties prop = new Properties();

    public static void main(String[] args) {
        readPropertiesFile();
        writePropertiesFile();
    }

    public static void readPropertiesFile() {

        try {
            InputStream input = new FileInputStream("C:\\Users\\JanAs\\IdeaProjects\\SeleniumTesting1\\src\\config\\config.properties");
            prop.load(input);
            prop.getProperty("browser");
            System.out.println(prop.getProperty("browser"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writePropertiesFile() {

        try {
            OutputStream output = new FileOutputStream("C:\\Users\\JanAs\\IdeaProjects\\SeleniumTesting1\\src\\config\\config.properties");
            prop.setProperty("browser", "Chrome");
            prop.store(output, null);
            System.out.println(prop.getProperty("browser"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
