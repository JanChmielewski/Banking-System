package pl.janchmielewski;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteJSON {

    public void createJSONFile() {
        JSONObject obj = new JSONObject();
        obj.put("name", "Chmielewski Jan");
        obj.put("account number", "453768076019");
        obj.put("e-mail", "janjerzychmielewski@gmail.com");
        obj.put("phone number", "432267821");
        obj.put("password", "432455478");
        obj.put("account balance", "0.00");

        try(FileWriter file = new FileWriter("jsonDataBase.json")) {
            file.write(obj.toString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
