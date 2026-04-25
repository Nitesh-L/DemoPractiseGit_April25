package Utilities;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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
    public String JsonReader(String s) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONObject json = (JSONObject) jsonParser.parse(new java.io.FileReader("src/test/resources/SampleTestData1.json"));
        return json.get(s).toString();
    }
}
