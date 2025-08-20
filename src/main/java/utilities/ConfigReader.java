package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    static Properties prop;

    public static String getProperty(String key) throws Exception {
        if (prop == null) {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("config/config.properties");
            prop.load(fis);
        }
        return prop.getProperty(key);
    }
}
