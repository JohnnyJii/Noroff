package main.fileManipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileReader {
    
    private void fileRdr() {
        try {
            File myFile = new File("src/main/resuorces/Dracula.txt");
            Scanner myReader = new Scanner(myFile);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    private void fileWriter() {
        try {
            FileWriter myWriter = new FileWriter("src/main/resuorces/Dracula.txt", true);
            myWriter.write("Testing solution for text editing");
            myWriter.close();
        } catch (Exception e) {
            
        }
    }
}
