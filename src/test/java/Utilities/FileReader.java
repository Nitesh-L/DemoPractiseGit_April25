package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReader
{
    public String ConfidReader(String s ) throws IOException {
        Properties prop = new Properties();
        FileInputStream file = new FileInputStream("src/test/resources/Config.properties");
        prop.load(file);
        return prop.getProperty(s);

    }
}
