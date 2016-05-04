package top.weeklybuy.www.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by zxnui on 16-5-3.
 */
public class PropertiesUtil {
    public static String filePath = "/config.properties";

    private static Properties props = new Properties();
    static {
        try {
            props.load(PropertiesUtil.class.getResourceAsStream(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getValue(String key) {
        return props.getProperty(key);
    }
}
