package pl.janchmielewski;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteJSON {

    public void createJSONFile() {

        Scanner in = new Scanner(System.in);
        AccountNumberGenerator generate = new AccountNumberGenerator();

        JSONObject obj = new JSONObject();
        obj.put("name", in.nextLine());
        obj.put("account number", generate.generateAccountNumber());
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
