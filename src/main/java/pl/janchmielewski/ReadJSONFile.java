package pl.janchmielewski;

import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class ReadJSONFile {

    public void readJSONFile() {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("jsonDataBase.json"));
            JSONObject jsonObject = (JSONObject) obj;
            String name = (String) jsonObject.get("name");
            System.out.println("The name of the owner of the account is: " + name );
        }
        catch (FileNotFoundException e) { e.printStackTrace(); }
        catch (IOException e) { e.printStackTrace(); }
        catch (ParseException e) { e.printStackTrace(); }
        catch (Exception e) { e.printStackTrace(); }

    }
}
