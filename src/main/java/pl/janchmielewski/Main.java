package pl.janchmielewski;

public class Main {
    public static void main(String[] args) {

        FileWriteJSON fileWrite = new FileWriteJSON();
        ReadJSONFile readFile = new ReadJSONFile();

        fileWrite.createJSONFile();
        readFile.readJSONFile();
    }
}
