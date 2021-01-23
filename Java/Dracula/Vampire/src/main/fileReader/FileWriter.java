package main.fileReader;

import java.io.FileWriter;

public class FileWriter {
    
    private void fileWriter() {
        try {
            FileWriter myWriter = new FileWriter("src/main/resuorces/Dracula.txt", true);
            myWriter.write("Testing solution for text editing");
            myWriter.close();
        } catch (Exception e) {
            
        }
    }
    
}
